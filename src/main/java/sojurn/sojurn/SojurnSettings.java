package sojurn.sojurn;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.TranslatableText;
import org.jetbrains.annotations.Nullable;

public class SojurnSettings extends Screen {
    protected SojurnSettings(@Nullable Screen parent) {
        super(new TranslatableText("sojurn.menu.title"));

    }
}
