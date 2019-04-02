package ie.tudublin;

import processing.core.*;

public class Man {

    UI ui;
    int x;
    int y;
    int speed;
    boolean inMotion;
    PImage spriteSheet;
    int currentFrame;
    PImage [][] movement;
    boolean[] keys = new boolean[128];

    public Man(UI ui, int x, int y, int speed){
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.speed = speed;
        setup();
    }

    void setup(){
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
        
        if(inMotion==false){
            ui.image(movement[0][1],x,y);
        }
        move();
    }

    public void update()
    {
        if(x<100){
            x = 600;
            currentFrame = 0;
        }
        else if(x>650){
            x = 100;
            currentFrame = 0;
        }
        else if(y>235){
            y = 50;
            currentFrame = 0;
        }
        else if(y<50){
            y = 235;
            currentFrame = 0;
        }
        else if(y == 0 && x == 0){
            inMotion = false;
        }
        else if(currentFrame >= 3){
            currentFrame = 0;
        }
    }

    void move(){
        if(ui.key == 'a'){
            inMotion = true;
            x-=speed;
            ui.image(movement[1][currentFrame],x,y);
            currentFrame++;
        }
        if(ui.key == 'd'){
            inMotion = true;
            x+=speed;
            ui.image(movement[2][currentFrame],x,y);
            currentFrame++;
        }
        if(ui.key=='w'){
            inMotion = true;
            y-=speed;
            ui.image(movement[3][currentFrame],x,y);
            currentFrame++;
        }
        if(ui.key=='s'){
            inMotion = true;
            y+=speed;
            ui.image(movement[0][currentFrame],x,y);
            currentFrame++;
        }
        else{
            ui.image(movement[0][1],x,y); 
        }
    }

    public void keyPressed(){
        keys[ui.key] = true;
    }

    public void keyReleased(){
        keys[ui.key] = false;
    }
}