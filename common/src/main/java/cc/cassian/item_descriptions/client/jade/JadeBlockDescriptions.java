package cc.cassian.item_descriptions.client.jade;

import cc.cassian.item_descriptions.client.ModClient;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;
import snownee.jade.api.ui.IElement;
import snownee.jade.impl.ui.TextElement;

import java.util.List;

import static cc.cassian.item_descriptions.client.helpers.ModHelpers.*;

public enum JadeBlockDescriptions implements IBlockComponentProvider {
    INSTANCE;

    @Override
    public void appendTooltip(ITooltip lines, BlockAccessor blockAccessor, IPluginConfig iPluginConfig) {
        //Check if block descriptions are enabled in mod config.
        if (showBlockDescriptions()) {
            //Create and add tooltip.
            int subjectLength = 0;
            for (int i = 0; i < lines.size(); i++) {
                for (IElement element : lines.get(i, IElement.Align.LEFT)) {
                    if (element instanceof TextElement text) {
                        subjectLength = Math.max(subjectLength, MinecraftClient.getInstance().textRenderer.getWidth(text.text));
                    }
                }
            }
            List<Text> tooltip = createTooltip(subjectLength, getBlockAccessorLoreKey(blockAccessor.getBlock(), blockAccessor.getLevel(), blockAccessor.getPosition(), blockAccessor.getBlockState(), blockAccessor.getBlockEntity()), true);
            for (Text text : tooltip) {
                lines.add(text);
            }
        }
    }

    @Override
    public Identifier getUid() {
        return ModClient.BLOCK_DESCRIPTIONS;
    }
}
