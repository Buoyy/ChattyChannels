package com.github.buoyy.chatty;

import org.bukkit.plugin.java.JavaPlugin;
import com.github.buoyy.chatty.CommandCreate;

public class Chatty extends JavaPlugin {
    @Override 
    public void onEnable() {
        getLogger().info("Enabled!");
        this.getCommand("ccreate").setExecutor(new CommandCreate());
    }
    @Override
    public void onDisable() {
        getLogger().info ("Disabled!");
    }
}