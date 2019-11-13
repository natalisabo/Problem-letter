package com.company;

public class Game {
    private int inc;
    private char character;
    public boolean success;
    public Game(char character){
        this.character = Character.toLowerCase(character);
        this.inc = 0;
        this.success = false;
    }

    public String guess(char charFromConsole) {
        this.inc++;
        success = character == charFromConsole;
        if(this.success){
            return "Congrats, Count: " + inc;
        }
        return (int)this.character > (int)charFromConsole ? "Too low" : "Too hight";
    }
}
