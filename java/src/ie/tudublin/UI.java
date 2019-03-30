package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Computer keyboard, computer;
    Button b,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    MovingCircle mc,mc2,mc3;
    Radar r,r2,r3,r4;
    AnimatedBar bar,bar2,bar3,bar4,bar5,bar6,bar7,bar8,bar9,bar10,bar11,bar12,bar13,bar14,bar15,
    bar16,bar17,bar18,bar19,bar20,bar21,bar22,bar23,bar24,bar25;
    int d = day();
    int m = month();
    int y = year();
    String d1 = String.valueOf(d);
    String m1 = String.valueOf(m);
    String y1 = String.valueOf(y);
    boolean[] buttonPressed = new boolean[10];

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
        b = new Button(this,  360, height-200, 100, 50, "BALLS");
        b2 = new Button(this, 465, height-200, 100,50, "BARS");
        b3 = new Button(this, 260, height-90, 100, 50, "H");
        b4 = new Button(this, 365, height-90, 100, 50, "I");
        b5 = new Button(this, 470, height-90, 100, 50, "J");
        b6 = new Button(this, 415, height-145, 100, 50, "F");
        b7 = new Button(this, 520, height-145, 100, 50, "G");
        b8 = new Button(this, 255, height-200, 100, 50, "Date");
        b9 = new Button(this, 205, height-145, 100, 50, "D");
        b10 = new Button(this, 310, height-145, 100, 50, "E");
        mc = new MovingCircle(this, 200, 135, 50, 7);
        mc2 = new MovingCircle(this, 285, 80, 50, 5);
        mc3 = new MovingCircle(this, 350, 190, 50, 3);
        bar = new AnimatedBar(this, 360, 50, 20, 100);
        bar2 = new AnimatedBar(this, 380, 50, 20, 120);
        bar3 = new AnimatedBar(this, 400, 50, 20, 80);
        bar4 = new AnimatedBar(this, 420, 50, 20, 40);
        bar5 = new AnimatedBar(this, 440, 50, 20, 0);
        bar6 = new AnimatedBar(this, 460, 50, 20, 20);
        bar7 = new AnimatedBar(this, 280, 50, 20, 10);
        bar8 = new AnimatedBar(this, 300, 50, 20, 190);
        bar9 = new AnimatedBar(this, 340, 50, 20, 110);
        bar10 = new AnimatedBar(this, 320, 50, 20, 130);
        bar11 = new AnimatedBar(this,480,50,20,100);
        bar12 = new AnimatedBar(this,260,50,20,0);
        bar13 = new AnimatedBar(this,240,50,20,110);
        bar14 = new AnimatedBar(this,220,50,20,190);
        bar15 = new AnimatedBar(this,200,50,20,40);
        bar16 = new AnimatedBar(this,500,50,20,170);
        bar17 = new AnimatedBar(this,520,50,20,150);
        bar18 = new AnimatedBar(this,540,50,20,130);
        bar19 = new AnimatedBar(this,560,50,20,10);
        bar20 = new AnimatedBar(this,580,50,20,160);
        bar21 = new AnimatedBar(this,600,50,20,80);
        bar22 = new AnimatedBar(this,180,50,20,170);
        bar23 = new AnimatedBar(this,160,50,20,90);
        bar24 = new AnimatedBar(this,140,50,20,20);
        bar25 = new AnimatedBar(this,120,50,20,180);

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
        if(buttonPressed[0]==true){
            mc.update();
            mc.render();
            mc2.update();
            mc2.render();
            mc3.update();
            mc3.render();
        }
        if(buttonPressed[1]==true){
            for(int i=0;i<100;i++){
                fill(0,random(255),random(255));
                textSize(i+2);
                text(d1+"/"+m1+"/"+y1, 300+i, 65+i);
            }
            textSize(12);
        }
        r.update();
        r.render();
        r2.update();
        r2.render();
        r3.update();
        r3.render();
        r4.update();
        r4.render();
        if(buttonPressed[2]==true){
            bar.render();
            bar2.render();
            bar3.render();
            bar4.render();
            bar5.render();
            bar6.render();
            bar7.render();
            bar8.render();
            bar9.render();
            bar10.render();
            bar11.render();
            bar12.render();
            bar13.render();
            bar14.render();
            bar15.render();
            bar16.render();
            bar17.render();
            bar18.render();
            bar19.render();
            bar20.render();
            bar21.render();
            bar22.render();
            bar23.render();
            bar24.render();
            bar25.render();
        }
        

        if(mousePressed){
            if(mouseX>360 && mouseX <460 && mouseY>height-200 && mouseY <height-150){
                if(buttonPressed[0]==true){
                    for(int i=0;i<10;i++){
                        buttonPressed[i] = false;
                    }
                } else if(buttonPressed[0]==false){
                    buttonPressed[0] = true;
                }
                fill(255);
                text("YOU PRESSED BALLS", width/2, 60);
            }
        
            else if(mouseX>255 && mouseX <355 && mouseY>height-200 && mouseY <height-150){
                if(buttonPressed[1]==true){
                    for(int i=0;i<10;i++){
                        buttonPressed[i] = false;
                    }
                } else if(buttonPressed[1]==false){
                    buttonPressed[1] = true;
                }
                fill(255);
                text("YOU PRESSED DATE", width/2, 60);
            }
        
            else if(mouseX>465 && mouseX <565 && mouseY>height-200 && mouseY <height-150){
                if(buttonPressed[2]==true){
                    for(int i=0;i<10;i++){
                        buttonPressed[i] = false;
                    }
                } else if(buttonPressed[2]==false){
                    buttonPressed[2] = true;
                }
                fill(255);
                text("YOU PRESSED BARS", width/2, 60);
            }
        
            else if(mouseX>205 && mouseX <305 && mouseY>height-145 && mouseY <height-95){
                fill(255);
                text("YOU PRESSED D", width/2, 60);
            }
        
            else if(mouseX>310 && mouseX <410 && mouseY>height-145 && mouseY <height-95){
                fill(255);
                text("YOU PRESSED E", width/2, 60);
            }
        
            else if(mouseX>415 && mouseX <515 && mouseY>height-145 && mouseY <height-95){
                fill(255);
                text("YOU PRESSED F", width/2, 60);
            }
        
            else if(mouseX>520 && mouseX <620 && mouseY>height-145 && mouseY <height-95){
                fill(255);
                text("YOU PRESSED G", width/2, 60);
            }
        
            else if(mouseX>260 && mouseX <360 && mouseY>height-90 && mouseY <height-40){
                fill(255);
                text("YOU PRESSED H", width/2, 60);
            }
     
            else if(mouseX>365 && mouseX <465 && mouseY>height-90 && mouseY <height-40){
                fill(255);
                text("YOU PRESSED I", width/2, 60);
            }
  
            else if(mouseX>470 && mouseX <570 && mouseY>height-90 && mouseY <height-40){
                fill(255);
                text("YOU PRESSED J", width/2, 60);
            }
        }
    }

}

