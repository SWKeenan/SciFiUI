package ie.tudublin;

import processing.core.*;

public class Cat {

    UI ui;
    PImage cat1;
    int currentFrame;
    PImage [][] movement;
    boolean[] keys = new boolean[128];

    public Cat(UI ui){
        this.ui = ui;
        setup();
    }

    void setup(){
        cat1 = ui.loadImage("tiger.png");
    }

    public void draw()
    {
        ui.scale(ui.mouseX / (float)100);
        ui.translate(ui.mouseX--,150);
        if(ui.mouseX > 600){
            ui.scale(ui.mouseX / (float)100);
        }
        ui.image(cat1,0,0);
    }

    public void update()
    {
       if(ui.mouseX > 700){
       }
    }
}