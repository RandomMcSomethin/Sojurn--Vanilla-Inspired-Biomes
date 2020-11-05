package sojurn.sojurn;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.DefaultBiomeCreator;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilders;
import sojurn.sojurn.biomes.*;

public class Sojurn implements ModInitializer {

    //Biomes
    private static final Biome MIXED_FOREST = MixedForestBiome.create(0.1F, 0.2F, false);
    private static final Biome MIXED_FOREST_HILLS = MixedForestBiome.create(0.45F, 0.3F, false);
    private static final Biome GREAT_MOUNTAINS = DefaultBiomeCreator.createMountains(4.0F, 2.0F, ConfiguredSurfaceBuilders.GRAVELLY_MOUNTAIN, true);
    private static final Biome COLD_RIVER = ColdRiverBiome.create(-0.5F, 0.0F, 0.0F, 0x4422FF, true);
    private static final Biome SUNKEN_GROVE = BasinBiome.create(-0.2F, 0.1F);
    private static final Biome SUNKEN_GROVE_HILLS = BasinBiome.create(-0.4F, 0.4F);
    private static final Biome RED_DESERT = RedDesertBiome.create(0.125F, 0.05F, false, false, true);
    private static final Biome RED_DESERT_HILLS = RedDesertBiome.create(0.45F, 0.3F, false, false, true);
    private static final Biome RED_PLATEAU = RedDesertBiome.create(2.0F, 0.01F, false, false, true);
    private static final Biome COLD_FOREST = ColdForestBiome.create(0.1F, 0.2F);
    private static final Biome COLD_FOREST_HILLS = ColdForestBiome.create(0.45F, 0.3F);
    private static final Biome RAINFOREST = RainforestBiome.create(0.1F, 0.3F, false);
    private static final Biome RAINFOREST_HILLS = RainforestBiome.create(0.45F, 0.4F, false);
    private static final Biome SHRUBLAND = ShrublandBiome.create(0.25F, 0.2F);
    private static final Biome GRASSLAND = GrasslandBiome.create();

    //Registry keys
    public static final RegistryKey<Biome> MF_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "mixed_forest"));
    public static final RegistryKey<Biome> MFH_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "mixed_forest_hills"));
    public static final RegistryKey<Biome> GM_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "great_mountains"));
    public static final RegistryKey<Biome> CR_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "cold_river"));
    public static final RegistryKey<Biome> BS_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "sunken_grove"));
    public static final RegistryKey<Biome> BSH_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "sunken_grove_hills"));
    public static final RegistryKey<Biome> RD_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "red_desert"));
    public static final RegistryKey<Biome> RDH_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "red_desert_hills"));
    public static final RegistryKey<Biome> RP_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "red_plateau"));
    public static final RegistryKey<Biome> CF_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "cold_forest"));
    public static final RegistryKey<Biome> CFH_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "cold_forest_hills"));
    public static final RegistryKey<Biome> RF_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "rainforest"));
    public static final RegistryKey<Biome> RFH_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "rainforest_hills"));
    public static final RegistryKey<Biome> SL_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "shrubland"));
    public static final RegistryKey<Biome> GL_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("sojurn", "grassland"));
    private SojurnConfig config;

    @Override
    public void onInitialize() {
        AutoConfig.register(SojurnConfig.class, GsonConfigSerializer::new);

        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier("sojurn", "default"), BiomeUtils.STANDARD_SURFACE_BUILDER);
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier("sojurn", "snowy"), BiomeUtils.SNOWY_SURFACE_BUILDER);

        Registry.register(BuiltinRegistries.BIOME, MF_KEY.getValue(), MIXED_FOREST);
        Registry.register(BuiltinRegistries.BIOME, MFH_KEY.getValue(), MIXED_FOREST_HILLS);
        Registry.register(BuiltinRegistries.BIOME, GM_KEY.getValue(), GREAT_MOUNTAINS);
        Registry.register(BuiltinRegistries.BIOME, CR_KEY.getValue(), COLD_RIVER);
        Registry.register(BuiltinRegistries.BIOME, BS_KEY.getValue(), SUNKEN_GROVE);
        Registry.register(BuiltinRegistries.BIOME, BSH_KEY.getValue(), SUNKEN_GROVE_HILLS);
        Registry.register(BuiltinRegistries.BIOME, RD_KEY.getValue(), RED_DESERT);
        Registry.register(BuiltinRegistries.BIOME, RDH_KEY.getValue(), RED_DESERT_HILLS);
        Registry.register(BuiltinRegistries.BIOME, RP_KEY.getValue(), RED_PLATEAU);
        Registry.register(BuiltinRegistries.BIOME, CF_KEY.getValue(), COLD_FOREST);
        Registry.register(BuiltinRegistries.BIOME, CFH_KEY.getValue(), COLD_FOREST_HILLS);
        Registry.register(BuiltinRegistries.BIOME, RF_KEY.getValue(), RAINFOREST);
        Registry.register(BuiltinRegistries.BIOME, RFH_KEY.getValue(), RAINFOREST_HILLS);
        Registry.register(BuiltinRegistries.BIOME, SL_KEY.getValue(), SHRUBLAND);
        Registry.register(BuiltinRegistries.BIOME, GL_KEY.getValue(), GRASSLAND);

        config = AutoConfig.getConfigHolder(SojurnConfig.class).getConfig();

        //Yes, this is deprecated.  Too bad!
        if (config.enableMixedForest) {
            OverworldBiomes.addContinentalBiome(MF_KEY, OverworldClimate.TEMPERATE, 0.75);
            OverworldBiomes.addContinentalBiome(MF_KEY, OverworldClimate.COOL, 0.25);
            OverworldBiomes.addHillsBiome(MF_KEY, MFH_KEY, 1);
        }

        if (config.enableGreatMountains) {
            OverworldBiomes.addContinentalBiome(GM_KEY, OverworldClimate.COOL, 0.1);
            OverworldBiomes.addContinentalBiome(GM_KEY, OverworldClimate.SNOWY, 0.1);
        }

        if (config.enableColdRiver) {
            OverworldBiomes.setRiverBiome(BiomeKeys.SNOWY_MOUNTAINS, CR_KEY);
            OverworldBiomes.setRiverBiome(BiomeKeys.SNOWY_TAIGA, CR_KEY);
            OverworldBiomes.setRiverBiome(BiomeKeys.SNOWY_TAIGA_HILLS, CR_KEY);
            OverworldBiomes.setRiverBiome(BiomeKeys.SNOWY_TAIGA_MOUNTAINS, CR_KEY);
            OverworldBiomes.setRiverBiome(BiomeKeys.SNOWY_TUNDRA, CR_KEY);
            OverworldBiomes.setRiverBiome(BiomeKeys.ICE_SPIKES, CR_KEY);
            OverworldBiomes.setRiverBiome(GM_KEY, CR_KEY);
            OverworldBiomes.setRiverBiome(CF_KEY, CR_KEY);
            OverworldBiomes.setRiverBiome(CFH_KEY, CR_KEY);
        }

        if (config.enableSunkenGrove) {
            OverworldBiomes.addContinentalBiome(BS_KEY, OverworldClimate.TEMPERATE, 0.2);
            OverworldBiomes.addHillsBiome(BS_KEY, BSH_KEY, 1);
        }

        if (config.enableRedDesert) {
            OverworldBiomes.addContinentalBiome(RD_KEY, OverworldClimate.DRY, 0.5);
            OverworldBiomes.addHillsBiome(RD_KEY, RDH_KEY, 1);
        }

        if (config.enableRedPlateau)
        OverworldBiomes.addContinentalBiome(RP_KEY, OverworldClimate.DRY, 0.1);

        if (config.enableColdForest) {
            OverworldBiomes.addContinentalBiome(CF_KEY, OverworldClimate.COOL, 1);
            OverworldBiomes.addHillsBiome(CF_KEY, CFH_KEY, 1);
        }

        if (config.enableRainforest) {
            OverworldBiomes.addContinentalBiome(RF_KEY, OverworldClimate.TEMPERATE, 0.2);
            OverworldBiomes.addHillsBiome(RF_KEY, RFH_KEY, 1);
        }

        if (config.enableShrubland)
        OverworldBiomes.addContinentalBiome(SL_KEY, OverworldClimate.DRY, 0.75);

        if (config.enableGrassland)
        OverworldBiomes.addContinentalBiome(GL_KEY, OverworldClimate.TEMPERATE, 0.75);
    }
}
