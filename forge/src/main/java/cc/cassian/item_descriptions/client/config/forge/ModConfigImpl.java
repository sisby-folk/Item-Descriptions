package cc.cassian.item_descriptions.client.config.forge;


import net.minecraftforge.fml.loading.FMLLoader;

import java.nio.file.Path;

public class ModConfigImpl {
    public static Path configPath() {
        return Path.of(FMLLoader.getGamePath() + "/config");
    }
}
