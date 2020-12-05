package fr.jayrex.informations;

import net.md_5.bungee.api.plugin.Plugin;
import java.util.logging.Logger;

import fr.jayrex.informations.commands.Informations;

public class Main extends Plugin {
    public static Main plugin;
    public static boolean protocolize = false;

    public void onEnable() {
        plugin = this;
        Logger logger = this.getLogger();
        
        getProxy().getPluginManager().registerCommand(this, new Informations("informations", "informations.use"));

        protocolize = getProxy().getPluginManager().getPlugin("protocolize-plugin") != null;
    }

    @Override
    public void onDisable() {

    }

    public static Main getMain() {
        return plugin;
    }
}
