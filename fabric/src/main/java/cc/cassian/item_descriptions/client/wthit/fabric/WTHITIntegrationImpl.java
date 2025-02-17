package cc.cassian.item_descriptions.client.wthit.fabric;

import mcp.mobius.waila.api.ITooltip;
import mcp.mobius.waila.gui.hud.Line;

public class WTHITIntegrationImpl {
    public static int getSubjectLength(ITooltip lines) {
        int subjectLength = 0;
        for (int i = 0; i < lines.getLineCount(); i++) {
            if (lines.getLine(i) instanceof Line line) {
                subjectLength = Math.max(subjectLength, line.getFixedWidth());
            }
        }
        return subjectLength;
    }
}
