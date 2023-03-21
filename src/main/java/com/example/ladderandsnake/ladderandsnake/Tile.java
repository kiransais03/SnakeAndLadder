package com.example.ladderandsnake.ladderandsnake;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {

    public Tile(int tileSize) {   //Constructor

        setWidth(tileSize);
        setHeight(tileSize);
        setFill(Color.AQUA);
        setStroke(Color.BLACK);

    }

}


