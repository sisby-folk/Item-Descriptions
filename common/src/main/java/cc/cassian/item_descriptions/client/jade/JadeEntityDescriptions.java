package cc.cassian.item_descriptions.client.jade;

import cc.cassian.item_descriptions.client.ModClient;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import snownee.jade.api.EntityAccessor;
import snownee.jade.api.IEntityComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;
import snownee.jade.api.ui.IElement;
import snownee.jade.impl.ui.TextElement;

import java.util.List;

import static cc.cassian.item_descriptions.client.helpers.ModHelpers.*;

public enum JadeEntityDescriptions implements IEntityComponentProvider {
    INSTANCE;

    @Override
    public void appendTooltip(ITooltip lines, EntityAccessor entityAccessor, IPluginConfig iPluginConfig) {
        //Check if block descriptions are enabled in mod config.
        if (showEntityDescriptions()) {
            //Create and add tooltip.
            int subjectLength = 0;
            for (int i = 0; i < lines.size(); i++) {
                for (IElement element : lines.get(i, IElement.Align.LEFT)) {
                    if (element instanceof TextElement text) {
                        subjectLength = Math.max(subjectLength, MinecraftClient.getInstance().textRenderer.getWidth(text.text));
                    }
                }
            }
            List<Text> tooltip = createTooltip(subjectLength, findEntityLoreKey(entityAccessor.getEntity()), true);
            for (Text text : tooltip) {
                lines.add(text);
            }
        }
    }

    @Override
    public Identifier getUid() {
        return ModClient.ENTITY_DESCRIPTIONS;
    }

}
