package com.example.svcchaosguide;

public class Character {

    private int name;
    private int portrait;
    private int card_background;

    public Character(int name, int portrait, int card_background) {
        this.name = name;
        this.portrait = portrait;
        this.card_background = card_background;
    }

    public int getName() {
        return name;
    }

    public int getPortrait() {
        return portrait;
    }

    public int getCardBackground() {
        return card_background;
    }
}
