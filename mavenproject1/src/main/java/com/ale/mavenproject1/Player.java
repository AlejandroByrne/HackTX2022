/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ale.mavenproject1;

/**
 *
 * @author alebyrne
 */
public class Player {
    
    private String name;
    private int num;
    private int points;
    private int blocks;
    private int steals;
    private int fouls;
    private int rebounds;
    
    public Player(String name, int num) {
        this.name = name;
        this.num = num;
    }
    
    private void addPoints(int num) {
        points += num;
    }
    
    public void twoPointer() {
        this.addPoints(2);
    }
    
    public void threePointer() {
        this.addPoints(3);
    }
    
    public void freeThrow() {
        this.addPoints(1);
    }
    
    public void addFoul() {
        fouls += 1;
    }
    
    public void addRebound() {
        rebounds += 1;
    }
    
    public int getNum() {
        return num;
    }
    
}
