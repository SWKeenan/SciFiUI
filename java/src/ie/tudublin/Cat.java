package ie.tudublin;

import processing.core.*;

public class Cat {

    UI ui;
    PImage cat1;
    int currentFrame;
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
        ui.translate(350,150);

        if(ui.mouseX < 600){
            ui.scale((float)0.10);
            ui.image(cat1,0,0);
        }
        else{

        }
    }
}