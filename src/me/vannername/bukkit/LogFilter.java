package me.vannername.bukkit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class LogFilter extends JavaPlugin {
    @Override
    public void onEnable() {
        Logger logger = (Logger) LogManager.getRootLogger();
        logger.addFilter(new FilterOverride());

    }
}
