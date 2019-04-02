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
        ui.image(cat1,0,0);
    }

    public void update()
    {
       if(ui.mouseX > 700){
           ui.scale((float)0.5);
       }
    }
}