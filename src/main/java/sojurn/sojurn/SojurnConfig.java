package sojurn.sojurn;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;

@Config(name = "sojurn")
public class SojurnConfig implements ConfigData {

    @ConfigEntry.Gui.Tooltip
    public boolean enableColdForest = true;

    @ConfigEntry.Gui.Tooltip
    public boolean enableColdRiver = true;

    @ConfigEntry.Gui.Tooltip
    public boolean enableGrassland = true;

    @ConfigEntry.Gui.Tooltip
    public boolean enableGreatMountains = true;

    @ConfigEntry.Gui.Tooltip
    public boolean enableMixedForest = true;

    @ConfigEntry.Gui.Tooltip
    public boolean enableRainforest = true;

    @ConfigEntry.Gui.Tooltip
    public boolean enableRedDesert = true;

    @ConfigEntry.Gui.Tooltip
    public boolean enableRedPlateau = true;

    @ConfigEntry.Gui.Tooltip
    public boolean enableShrubland = true;

    @ConfigEntry.Gui.Tooltip
    public boolean enableSunkenGrove = true;
}
