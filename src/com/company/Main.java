package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {

        Game newGame = new Game('g');
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(!newGame.success){
                char charFromConsole;
                charFromConsole = Character.toLowerCase(reader.readLine().charAt(0));
                System.out.println(newGame.guess(charFromConsole));
            }
        } catch(IOException e){}
    }
}