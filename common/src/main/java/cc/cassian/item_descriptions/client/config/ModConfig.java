package cc.cassian.item_descriptions.client.config;

import dev.architectury.injectables.annotations.ExpectPlatform;
import folk.sisby.kaleido.api.WrappedConfig;
import folk.sisby.kaleido.lib.quiltconfig.api.annotations.Comment;

import java.nio.file.Path;

public class ModConfig extends WrappedConfig {
    @Comment("Whether to show descriptions in item tooltips.")
    public boolean itemDescriptions = true;
    @Comment("Whether to ignore keybind state when showing item descriptions.")
    public boolean displayAlways = false;
    @Comment("Whether to show descriptions for blocks in WTHIT or Jade.")
    public boolean blockDescriptions = true;
    @Comment("Whether to ignore keybind state when showing block descriptions.")
    public boolean displayBlockDescriptionsAlways = false;
    @Comment("Whether to show descriptions for entities in WTHIT or Jade.")
    public boolean entityDescriptions = true;
    @Comment("Whether to ignore keybind state when showing entity descriptions.")
    public boolean displayEntityDescriptionsAlways = false;

    @Comment("What color to use for description text, by formatting code or name.")
    public String style_color = "Gray";
    @Comment("Whether description text should be displayed in italics.")
    public boolean style_italics = false;
    @Comment("Whether description text should be displayed in bold.")
    public boolean style_bold = false;
    @Comment("What length to attempt to wrap tooltips at.")
    @Comment("0 to disable")
    public int style_length = 0;

    @Comment("Whether to show descriptions when Ctrl is held.")
    public boolean keybind_displayWhenControlIsHeld = true;
    @Comment("Whether to show descriptions when Shift is held.")
    public boolean keybind_displayWhenShiftIsHeld = false;
    @Comment("Whether to show descriptions when Alt is held.")
    public boolean keybind_displayWhenAltIsHeld = false;
    @Comment("Whether keys should hide descriptions, instead of show them.")
    public boolean keybind_invert = false;

    @Comment("Whether to show descriptions even when no translation is available.")
    public boolean developer_showUntranslated = false;
    @Comment("Whether to display descriptions purely as translation keys.")
    public boolean developer_dontTranslate = false;
    @Comment("Whether to disable hardcoded ID contains matching for common item types.")
    public boolean developer_disableGenericStringDescriptions = true;
    @Comment("Whether to disable using tags to provide generic item descriptions.")
    public boolean developer_disableGenericTagDescriptions = false;

    @ExpectPlatform
    public static Path configPath() {
        throw new AssertionError();
    }
}