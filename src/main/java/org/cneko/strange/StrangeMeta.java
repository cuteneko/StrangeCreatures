package org.cneko.strange;

import org.cneko.ctlib.common.util.meta.PluginMeta;

import java.util.logging.Logger;

import static org.cneko.strange.StrangeCreatures.MODID;

public class StrangeMeta {
    public static final StrangeMeta INSTANCE = new StrangeMeta();
    private final Logger logger = Logger.getLogger(MODID);
    public Logger getLogger() {
        return this.logger;
    }
}
