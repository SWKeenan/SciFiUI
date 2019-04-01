package ie.tudublin;

import processing.core.*;

public class Man {

    UI ui;
    private float x;
    private float y;
    PImage spriteSheet;
    PImage [][] movement;
    boolean[] keys = new boolean[128];

    public Man(UI ui, float x, float y){
        this.ui = ui;
        this.x = x;
        this.y = y;

        setupSprites();
    }

    void setupSprites(){
        movement = new PImage[4][3];
        spriteSheet = ui.loadImage("sprite.png");
        for(int i=0;i<3;i++){
            movement[0][i] = spriteSheet.get(64*i,0,64,64);
            movement[1][i] = spriteSheet.get(64*i,64,64,64);
            movement[2][i] = spriteSheet.get(64*i,128,64,64);
            movement[3][i] = spriteSheet.get(64*i,192,64,64);
        }
    }

    public void draw()
    {
        for(int i=0;i<3;i++){
            ui.image(movement[0][i],i*64,0);
            ui.image(movement[1][i],i*64,70);
            ui.image(movement[2][i],i*64,140);
            ui.image(movement[3][i],i*64,210);
        }
        ui.fill(255);
        move();
        ui.ellipse(x,y,20,20);
    }

    void move(){
        if(ui.key == 'a'){
            x--;
        }
        if(ui.key == 'd'){
            x++;
        }
        if(ui.key=='w'){
            y--;
        }
        if(ui.key=='s'){
            y++;
        }
    }

    public void keyPressed(){
        keys[ui.key] = true;
    }

    public void keyReleased(){
        keys[ui.key] = false;
    }
}