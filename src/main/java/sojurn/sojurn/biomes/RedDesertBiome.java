package sojurn.sojurn.biomes;

import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.ConfiguredStructureFeatures;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilders;
import sojurn.sojurn.BiomeUtils;

public class RedDesertBiome extends BaseBiome {
    public static Biome create(float depth, float scale, boolean bl, boolean bl2, boolean bl3) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addDesertMobs(builder);
        GenerationSettings.Builder builder2 = (new GenerationSettings.Builder()).surfaceBuilder(BiomeUtils.RED_SURFACE_BUILDER);
        if (bl) {
            builder2.structureFeature(ConfiguredStructureFeatures.VILLAGE_DESERT);
            builder2.structureFeature(ConfiguredStructureFeatures.PILLAGER_OUTPOST);
        }

        if (bl2) {
            builder2.structureFeature(ConfiguredStructureFeatures.DESERT_PYRAMID);
        }

        if (bl3) {
            DefaultBiomeFeatures.addFossils(builder2);
        }

        DefaultBiomeFeatures.addDefaultUndergroundStructures(builder2);
        builder2.structureFeature(ConfiguredStructureFeatures.RUINED_PORTAL_DESERT);
        DefaultBiomeFeatures.addLandCarvers(builder2);
        DefaultBiomeFeatures.addDesertLakes(builder2);
        DefaultBiomeFeatures.addDungeons(builder2);
        DefaultBiomeFeatures.addMineables(builder2);
        DefaultBiomeFeatures.addDefaultOres(builder2);
        DefaultBiomeFeatures.addDefaultDisks(builder2);
        DefaultBiomeFeatures.addDefaultFlowers(builder2);
        DefaultBiomeFeatures.addDefaultGrass(builder2);
        DefaultBiomeFeatures.addDesertDeadBushes(builder2);
        DefaultBiomeFeatures.addDefaultMushrooms(builder2);
        DefaultBiomeFeatures.addDesertVegetation(builder2);
        DefaultBiomeFeatures.addSprings(builder2);
        DefaultBiomeFeatures.addDesertFeatures(builder2);
        DefaultBiomeFeatures.addFrozenTopLayer(builder2);
        return (new Biome.Builder()).precipitation(Biome.Precipitation.NONE).category(Biome.Category.DESERT).depth(depth).scale(scale).temperature(2.0F).downfall(0.0F).effects((new BiomeEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(BiomeUtils.getSkyColor(2.0F)).moodSound(BiomeMoodSound.CAVE).build()).spawnSettings(builder.build()).generationSettings(builder2.build()).build();
    }
}
