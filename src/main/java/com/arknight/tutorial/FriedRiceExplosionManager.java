package com.arknight.tutorial;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FriedRiceExplosionManager {

    private static final List<ExplosionTask> TASKS = new ArrayList<>();

    public static void init() {
        ServerTickEvents.END_SERVER_TICK.register(server -> {

            Iterator<ExplosionTask> iterator = TASKS.iterator();

            while (iterator.hasNext()) {
                ExplosionTask task = iterator.next();

                task.tick();

                if (task.isFinished()) {
                    iterator.remove();
                }
            }
        });
    }

    public static void start(ServerWorld world, double x, double y, double z) {
        TASKS.add(new ExplosionTask(world, x, y, z));
    }

    private static class ExplosionTask {

        private final ServerWorld world;
        private final double x;
        private final double y;
        private final double z;

        private int tickCounter = 0;
        private int stage = 0;

        private final float[] radii = {1.0f, 1.5f, 2.2f, 3.0f};

        public ExplosionTask(ServerWorld world, double x, double y, double z) {
            this.world = world;
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public void tick() {

            tickCounter++;

            if (tickCounter % 10 == 0 && stage < radii.length) {

                float radius = radii[stage];

                world.createExplosion(
                        null,
                        x, y, z,
                        radius,
                        false,
                        World.ExplosionSourceType.NONE
                );

                world.spawnParticles(
                        ParticleTypes.FLAME,
                        x, y, z,
                        150,
                        1.5, 1.0, 1.5,
                        0.2
                );

                world.spawnParticles(
                        ParticleTypes.LARGE_SMOKE,
                        x, y, z,
                        100,
                        1.2, 1.0, 1.2,
                        0.05
                );

                world.spawnParticles(
                        ParticleTypes.LAVA,
                        x, y, z,
                        50,
                        1.0, 0.5, 1.0,
                        0.1
                );

                world.playSound(
                        null,
                        x, y, z,
                        SoundEvents.ENTITY_GENERIC_EXPLODE,
                        SoundCategory.PLAYERS,
                        1.3f,
                        0.8f
                );

                stage++;
            }

            // 最后一段后生成火焰环
            if (stage == radii.length && tickCounter == radii.length * 10 + 5) {
                createFireRing(world, x, y, z, 4.0);
            }
        }

        public boolean isFinished() {
            return stage >= radii.length && tickCounter > radii.length * 10 + 20;
        }

        private void createFireRing(ServerWorld world, double x, double y, double z, double radius) {

            int points = 80;

            for (int i = 0; i < points; i++) {

                double angle = 2 * Math.PI * i / points;
                double offsetX = radius * Math.cos(angle);
                double offsetZ = radius * Math.sin(angle);

                world.spawnParticles(
                        ParticleTypes.FLAME,
                        x + offsetX,
                        y,
                        z + offsetZ,
                        6,
                        0.1, 0.1, 0.1,
                        0.01
                );

                world.spawnParticles(
                        ParticleTypes.LAVA,
                        x + offsetX,
                        y,
                        z + offsetZ,
                        3,
                        0.05, 0.05, 0.05,
                        0.02
                );
            }
        }
    }
}
