package cc.cassian.item_descriptions.client.helpers.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class ModHelpersImpl {
    public static boolean tooltipFixInstalled() {
        return FabricLoader.getInstance().isModLoaded("tooltipfix");
    }
}
