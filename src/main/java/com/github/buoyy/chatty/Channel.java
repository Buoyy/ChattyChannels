package com.github.buoyy.chatty;

import java.util.ArrayList;
import org.bukkit.entity.Player;

public class Channel {
    //UUID id;
    ArrayList<Player> players;
    ArrayList<Player> admins;
    String name;
    
    // This constructor is for when a player runs the command
    // i.e., it automatically sets the player as channel OP
    // TODO: Add more useful constructors
    public Channel(String name) {
        // String references are TEMPORARY.
        // The 0th player *must* be the OP
        // this is a temp. soln
        // TODO: add an OPs list for multi operator channel (useful for keeping mods and stuff)
        this.name = name;
        players = new ArrayList<>();
        admins = new ArrayList<>();
        admins.add(players.getFirst());
    }
    
    public ArrayList<Player> getAdmins() {
        return admins;
    }
    public void setOP(Player player) {
        players.set(0, player);
    }
    public void addPlayer(Player player) {
        players.add(player);
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }
}