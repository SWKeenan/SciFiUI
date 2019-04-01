package ie.tudublin;

import processing.core.*;

public class Man {

    UI ui;
    int x;
    int y;
    int speed;
    PImage spriteSheet;
    PImage [][] movement;
    boolean[] keys = new boolean[128];

    public Man(UI ui, int x, int y, int speed){
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.speed = speed;
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
            ui.image(movement[1][0],x,y);
        }
        move();
    }

    public void update()
    {
        if(x<100){
            x = 600;
        }
        else if(x>650){
            x = 100;
        }
        else if(y>235){
            y = 50;
        }
        else if(y<50){
            y = 235;
        }
    }

    void move(){
        if(ui.key == 'a'){
            x-=speed;
        }
        if(ui.key == 'd'){
            x+=speed;
        }
        if(ui.key=='w'){
            y-=speed;
        }
        if(ui.key=='s'){
            y+=speed;
        }
    }

    public void keyPressed(){
        keys[ui.key] = true;
    }

    public void keyReleased(){
        keys[ui.key] = false;
    }
}