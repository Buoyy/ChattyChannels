package com.github.buoyy.chatty;

import java.util.ArrayList;
import org.bukkit.entity.Player;

public class Channel {
    //UUID id;
    ArrayList<Player> players;
    
    // This constructor is for when a player runs the command
    // i.e., it automatically sets the player as channel OP
    // TODO: Add more useful constructors
    public Channel(/*UUID id*/) {
        // Create some random ID and assign it for this channel
        // The 0th player *must* be the OP
        // this is a temp. soln
        // TODO: add an OPs list for multi operator channel (useful for keeping mods and stuff)
    }
    
    public Player getOP() {
        return players.get(0);
    }
    public void setOP(Player player) {
        players.set(0, player);
    }
    public addPlayer(Player player) {
        players.add(player);
    }
    public ArrayList getPlayers() {
        return players;
    }
}