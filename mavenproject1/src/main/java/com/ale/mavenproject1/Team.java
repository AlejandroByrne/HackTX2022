/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ale.mavenproject1;

import java.util.*;
/**
 *
 * @author alebyrne
 */
public class Team {
    private String name;
    private Map<String, Player> players;
    private Map<String, Integer[]> winLosses;
    
    public Team(String name) {
        this.name = name;
        players = new TreeMap<>();
    }
    
    public void addPlayer(String name, int num) {
        if(!players.containsKey(name)) {
            players.put(name, new Player(name, num));
        }
    }
    
    public Player getPlayer(String name) {
        return players.get(name);
    }
    
    public Set<String> getPlayerNames() {
        return players.keySet();
    }
    
    public void removePlayer(String name) {
        if(players.containsKey(name)) {
            players.remove(name);
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int numPlayers() {
        return players.size();
    }
    
    
    public TreeSet<Integer> getPossibleNumbers() {
        TreeSet<Integer> nums = new TreeSet<>();
        for(int i = 1; i <= 40; i++) {
            nums.add(i);
        }
        for(String name : players.keySet())
            nums.remove(players.get(name).getNum());
        return nums;
    }
}
