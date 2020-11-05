package sojurn.sojurn;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class BiomeUtils {
    //Sky color method
    public static int getSkyColor(float temperature) {
        float f = temperature / 3.0F;
        f = MathHelper.clamp(f, -1.0F, 1.0F);
        return MathHelper.hsvToRgb(0.62222224F - f * 0.05F, 0.5F + f * 0.1F, 1.0F);
    }

    //Surface builder
    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> createSurfaceBuilder(Block topBlock, Block fillerBlock, Block shoreBlock) {
        return SurfaceBuilder.DEFAULT
                .withConfig(new TernarySurfaceConfig(
                        topBlock.getDefaultState(),
                        fillerBlock.getDefaultState(),
                        shoreBlock.getDefaultState()
                ));
    }

    //Surface builders
    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> STANDARD_SURFACE_BUILDER =
            createSurfaceBuilder(Blocks.GRASS, Blocks.DIRT, Blocks.GRAVEL);
    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> SNOWY_SURFACE_BUILDER =
            createSurfaceBuilder(Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT, Blocks.GRAVEL);
    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> RED_SURFACE_BUILDER =
            createSurfaceBuilder(Blocks.RED_SAND, Blocks.RED_SANDSTONE, Blocks.RED_TERRACOTTA);
}
