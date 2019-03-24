package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Computer keyboard, computer;
    Button b,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    MovingCircle mc;
    Radar r,r2,r3,r4;
    AnimatedBar bar;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[LEFT] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
  
    public void settings()
    {
        size(800, 600);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
    }

    public void setup()
    {
        keyboard = new Computer(this, 0, 350, width, height);
        computer = new Computer(this, 100, 50, 600, 250);
        b = new Button(this,  360, height-200, 100, 50, "B");
        b2 = new Button(this, 465, height-200, 100,50, "C");
        b3 = new Button(this, 260, height-90, 100, 50, "H");
        b4 = new Button(this, 365, height-90, 100, 50, "I");
        b5 = new Button(this, 470, height-90, 100, 50, "J");
        b6 = new Button(this, 415, height-145, 100, 50, "F");
        b7 = new Button(this, 520, height-145, 100, 50, "G");
        b8 = new Button(this, 255, height-200, 100, 50, "A");
        b9 = new Button(this, 205, height-145, 100, 50, "D");
        b10 = new Button(this, 310, height-145, 100, 50, "E");
        mc = new MovingCircle(this, width / 2, 175, 50);
        bar = new AnimatedBar(this, 20, 10, 20, 100);
        r = new Radar(this, 100, height-50, 100, 0.1f);
        r2 = new Radar(this, 100, height-175, 100, 0.3f);
        r3 = new Radar(this, width-100, height-50, 100, 0.01f);
        r4 = new Radar(this, width-100, height-175, 100, 0.2f);
    }

    public void draw()
    {
        background(0, 0, 100);
        keyboard.render();
        computer.render();

        b.render();
        b2.render();
        b3.render();
        b4.render();
        b5.render();
        b6.render();
        b7.render();
        b8.render();
        b9.render();
        b10.render();

        mc.update();
        mc.render();

        r.update();
        r.render();
        r2.update();
        r2.render();
        r3.update();
        r3.render();
        r4.update();
        r4.render();

        bar.render();
        
        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }

        if(mousePressed){
            if(mouseX>360 && mouseX <460 && mouseY>height-200 && mouseY <height-150){
                fill(255);
                text("YOU PRESSED B", width/2, 175);
            }
        }
        if(mousePressed){
            if(mouseX>255 && mouseX <355 && mouseY>height-200 && mouseY <height-150){
                fill(255);
                text("YOU PRESSED A", width/2, 175);
            }
        }
        if(mousePressed){
            if(mouseX>465 && mouseX <565 && mouseY>height-200 && mouseY <height-150){
                fill(255);
                text("YOU PRESSED C", width/2, 175);
            }
        }
        if(mousePressed){
            if(mouseX>205 && mouseX <305 && mouseY>height-145 && mouseY <height-95){
                fill(255);
                text("YOU PRESSED D", width/2, 175);
            }
        }
        if(mousePressed){
            if(mouseX>310 && mouseX <410 && mouseY>height-145 && mouseY <height-95){
                fill(255);
                text("YOU PRESSED E", width/2, 175);
            }
        }
        if(mousePressed){
            if(mouseX>415 && mouseX <515 && mouseY>height-145 && mouseY <height-95){
                fill(255);
                text("YOU PRESSED F", width/2, 175);
            }
        }
        if(mousePressed){
            if(mouseX>520 && mouseX <620 && mouseY>height-145 && mouseY <height-95){
                fill(255);
                text("YOU PRESSED G", width/2, 175);
            }
        }
        if(mousePressed){
            if(mouseX>260 && mouseX <360 && mouseY>height-90 && mouseY <height-40){
                fill(255);
                text("YOU PRESSED H", width/2, 175);
            }
        }
        if(mousePressed){
            if(mouseX>365 && mouseX <465 && mouseY>height-90 && mouseY <height-40){
                fill(255);
                text("YOU PRESSED I", width/2, 175);
            }
        }
        if(mousePressed){
            if(mouseX>470 && mouseX <570 && mouseY>height-90 && mouseY <height-40){
                fill(255);
                text("YOU PRESSED J", width/2, 175);
            }
        }
    }

}

