package sojurn.sojurn.biomes;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.ConfiguredStructureFeatures;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilders;
import sojurn.sojurn.BiomeUtils;

public class BasinBiome extends BaseBiome {
    public static Biome create(float depth, float scale) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SLIME, 1, 1, 1));
        GenerationSettings.Builder builder2 = (new GenerationSettings.Builder()).surfaceBuilder(ConfiguredSurfaceBuilders.SWAMP);

        builder2.structureFeature(ConfiguredStructureFeatures.MINESHAFT);
        builder2.structureFeature(ConfiguredStructureFeatures.RUINED_PORTAL_SWAMP);
        builder2.structureFeature(ConfiguredStructureFeatures.NETHER_FOSSIL);
        builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.JUNGLE_BUSH);
        builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.FLOWER_PLAIN_DECORATED);
        DefaultBiomeFeatures.addLandCarvers(builder2);
        DefaultBiomeFeatures.addFossils(builder2);

        DefaultBiomeFeatures.addDefaultLakes(builder2);
        DefaultBiomeFeatures.addDungeons(builder2);
        DefaultBiomeFeatures.addMineables(builder2);
        DefaultBiomeFeatures.addDefaultOres(builder2);
        DefaultBiomeFeatures.addClay(builder2);
        DefaultBiomeFeatures.addDefaultMushrooms(builder2);
        DefaultBiomeFeatures.addSprings(builder2);
        DefaultBiomeFeatures.addLargeFerns(builder2);
        DefaultBiomeFeatures.addDefaultFlowers(builder2);
        DefaultBiomeFeatures.addExtraDefaultFlowers(builder2);
        DefaultBiomeFeatures.addSwampVegetation(builder2);
        DefaultBiomeFeatures.addJungleGrass(builder2);
        DefaultBiomeFeatures.addSavannaTallGrass(builder2);
        DefaultBiomeFeatures.addDefaultDisks(builder2);
        DefaultBiomeFeatures.addWaterBiomeOakTrees(builder2);
        DefaultBiomeFeatures.addTallBirchTrees(builder2);
        DefaultBiomeFeatures.addMossyRocks(builder2);
        DefaultBiomeFeatures.addSwampFeatures(builder2);
        builder2.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.SEAGRASS_SWAMP);

        DefaultBiomeFeatures.addFrozenTopLayer(builder2);
        return (new Biome.Builder()).precipitation(Biome.Precipitation.RAIN).category(Biome.Category.PLAINS).depth(depth).scale(scale).temperature(0.4F).downfall(0.9F).effects((new BiomeEffects.Builder()).waterColor(0x4422FF).waterFogColor(0xCCAAFF).fogColor(0xAACCFF).skyColor(BiomeUtils.getSkyColor(0.4F)).foliageColor(0x44AA00).grassColor(0x66AA22).moodSound(BiomeMoodSound.CAVE).build()).spawnSettings(builder.build()).generationSettings(builder2.build()).build();
    }
}
