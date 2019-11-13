package com.company;
import org.junit.Assert;

class GameTest {

    @org.junit.jupiter.api.Test
    void guess() {
        Game newGame = new Game('h');
        Assert.assertEquals("g is higher than h", "Too hight", newGame.guess('g') );
    }
}

class GameTest1 {

    @org.junit.jupiter.api.Test
    void guess() {
        Game newGame = new Game('a');
        Assert.assertEquals("g is lower than a", "Too hight", newGame.guess('g') );
    }
}

class GameTest2 {

    @org.junit.jupiter.api.Test
    void guess() {
        Game newGame = new Game('a');
        newGame.guess('j');
        Assert.assertEquals("a=a", "Congrats, Count: ", newGame.guess('a') );
    }
}