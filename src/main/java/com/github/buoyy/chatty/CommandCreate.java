package com.github.buoyy.chatty;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class CommandCreate implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equals("ccreate")) {
            sender.sendMessage("Created channel!");
        }
        return true;
    }
}