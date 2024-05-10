package org.cneko.strange.api;

import org.cneko.strange.util.ConfigUtil;

public class NSFWAPI {
    private static boolean nsfw = false;

    public static boolean isNSFW() {
        return nsfw;
    }
    public static void setNSFW(boolean nsfw) {
        NSFWAPI.nsfw = nsfw;
    }
}
