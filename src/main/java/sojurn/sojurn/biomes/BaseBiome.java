package sojurn.sojurn.biomes;

import net.minecraft.world.biome.Biome;

public class BaseBiome {
    public static Biome create(float depth, float scale, boolean bl) {
        //Make sure to add all the necessary components to this!
        //If you don't vanilla will just die
        return new Biome.Builder().build();
    }
}
