package org.cneko.strange.util;

import org.cneko.ctlib.common.file.Resources;
import org.cneko.ctlib.common.file.YamlConfiguration;
import org.cneko.strange.StrangeCreatures;
import org.cneko.strange.StrangeMeta;
import org.cneko.strange.api.NSFWAPI;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;
import java.util.logging.Level;

import static org.cneko.strange.StrangeCreatures.MODID;
public class ConfigUtil {
    public static final String CONFIG_PATH = "config/strange_creatures.yml";
    public static final String CONFIG_DEFAULT = "assets/"+MODID+"/config.yml";
    public static YamlConfiguration getConfig(){
        // 判断是否存在配置文件
        File configFile = new File(CONFIG_PATH);
        if(configFile.exists()){
            try {
                return YamlConfiguration.fromFile(configFile);
            } catch (IOException ignored) {
            }
        }
        try {
            // 从jar中读取配置文件
            Resources resources = new Resources(StrangeCreatures.class);
            String content = resources.readFileFromJar(CONFIG_DEFAULT);
            return new YamlConfiguration(content);
        }catch (IOException | URISyntaxException e){
            StrangeMeta.INSTANCE.getLogger().log(Level.SEVERE, "Failed to load config file:", e);
            return null;
        }
    }

    public static boolean getNSFW(){
        try {
            return getConfig().getBoolean("nsfw", false);
        }catch (Exception e){
            return false;
        }
    }

    public static void load(){
        NSFWAPI.setNSFW(getNSFW());
    }
}
