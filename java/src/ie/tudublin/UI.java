package ie.tudublin;

import processing.core.*;
import ddf.minim.*;

public class UI extends PApplet
{
    Minim minim;
    AudioPlayer click, ping, love, startup, bubbling, bouncy, morse, noise, scan, meow, space, clank, jolly, fly;
    Computer keyboard, computer;
    Button b,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    MovingCircle mc,mc2,mc3,mc4;
    Radar r,r2,r3,r4;
    AnimatedBar bar,bar2,bar3,bar4,bar5,bar6,bar7,bar8,bar9,bar10,bar11,bar12,bar13,bar14,bar15,
    bar16,bar17,bar18,bar19,bar20,bar21,bar22,bar23,bar24,bar25,bar26,bar27,bar28;
    int d = day();
    int m = month();
    int y = year();
    String d1 = String.valueOf(d);
    String m1 = String.valueOf(m);
    String y1 = String.valueOf(y);
    Heart heart;
    boolean[] buttonPressed = new boolean[10];
    Star[] stars = new Star[50];
    Triangle[] triangles = new Triangle[7];
    int fade = 153;
    Man man1;
    Fly[] flies = new Fly[100];
    boolean welcomeOn = true;
    Cat cat1;
    boolean tapOn = true;

    boolean[] keys = new boolean[70000];

    public void keyPressed()
    {
        keys[key] = true;
    }
    
    public void keyReleased()
    {
        keys[key] = false;
    }

  
    public void settings()
    {
        size(800, 600);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
    }

    public void setup()
    {
        minim = new Minim(this);
        startup = minim.loadFile("startup.wav");
        clank = minim.loadFile("clank.mp3");
        click = minim.loadFile("click.wav");
        ping = minim.loadFile("ping.wav");
        meow = minim.loadFile("meow.wav");
        love = minim.loadFile("love.wav");
        fly = minim.loadFile("fly.wav");
        scan = minim.loadFile("scan.wav");
        noise = minim.loadFile("noise.wav");
        bubbling = minim.loadFile("bubbling.wav");
        space = minim.loadFile("space.wav");
        jolly = minim.loadFile("jolly.wav");
        morse = minim.loadFile("morse.wav");
        bouncy = minim.loadFile("bouncyBounce.wav");
        keyboard = new Computer(this, 0, 350, width, height, 50);
        computer = new Computer(this, 100, 50, 600, 250, 0);
        b = new Button(this,  360, height-200, 100, 50, "BALLS", 255, 255, 0);
        b2 = new Button(this, 465, height-200, 100,50, "BARS", 128, 255, 0);
        b3 = new Button(this, 260, height-90, 100, 50, "FLY", 255, 0, 255);
        b4 = new Button(this, 365, height-90, 100, 50, "TIGER", 255, 0, 127);
        b5 = new Button(this, 470, height-90, 100, 50, "LOVE", 255, 0, 0);
        b6 = new Button(this, 415, height-145, 100, 50, "TRIANGLES", 0, 128, 255);
        b7 = new Button(this, 520, height-145, 100, 50, "MAN", 128, 0, 255);
        b8 = new Button(this, 255, height-200, 100, 50, "DATE", 255, 128, 0);
        b9 = new Button(this, 205, height-145, 100, 50, "STARS", 0, 255, 128);
        b10 = new Button(this, 310, height-145, 100, 50, "WORDS", 0, 255, 255);
        mc = new MovingCircle(this, 200, 145, 50, 7);
        mc2 = new MovingCircle(this, 285, 90, 50, 5);
        mc3 = new MovingCircle(this, 350, 200, 50, 3);
        mc4 = new MovingCircle(this, 460, 255, 50, 6);
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
        bar26 = new AnimatedBar(this,620,50,20,110);
        bar27 = new AnimatedBar(this,640,50,20,130);
        bar28 = new AnimatedBar(this,660,50,20,10);
        for(int i=0;i<stars.length;i++){
            stars[i] = new Star(this,random(695),random(55,295));
        }
        r = new Radar(this, 100, height-50, 100, 0.1f);
        r2 = new Radar(this, 100, height-175, 100, 0.3f);
        r3 = new Radar(this, width-100, height-50, 100, 0.01f);
        r4 = new Radar(this, width-100, height-175, 100, 0.2f);
        heart = new Heart(this);
        for(int i=0;i<triangles.length;i++){
            triangles[i] = new Triangle(this,random(200,400),295,400,random(95,295),random(400,600),295,5);
        }
        man1 = new Man(this,width/2,150,4);
        for(int i=0;i<flies.length;i++){
            flies[i] = new Fly(this,random(250,600),random(150,200),random(100));
        }
        cat1 = new Cat(this);
    }

    public void draw()
    {
        startup.play();
        background(0,0,100);
        keyboard.render();
        computer.render();
        for(int i=0;i<4;i++){
            delay(3);
            fill(0,fade,0);
            fade--;
        }
        if(welcomeOn==true){
            textSize(40);
            text("WELCOME",width/2,175);
            textSize(12);
        }
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
            mc4.update();
            mc4.render();
        }
        if(buttonPressed[1]==true){
            for(int i=0;i<100;i++){
                fill(0,random(255),random(255));
                textSize(i+2);
                text(d1+"/"+m1+"/"+y1, 300+i, 65+i);
            }
            textSize(12);
        }
        if(buttonPressed[4]==true){
            fill(random(255),random(255),random(255));
            textSize(random(10,100));
            text("I", random(50,650), random(50,300));
            fill(random(255),random(255),random(255));
            textSize(random(10,100));
            text("SEE", random(50,650), random(50,300));
            fill(random(255),random(255),random(255));
            textSize(random(10,100));
            text("YOU", random(50,650), random(50,300));
            textSize(12);
            fill(255);
            text("It's true.",width/2,height/3);
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
            bar26.render();
            bar27.render();
            bar28.render();
        } 
        if(buttonPressed[3]==true){
            for(int i=0;i<stars.length;i++){
                stars[i].update();
                stars[i].show();
            }
        }
        if(buttonPressed[9]==true){
            heart.render();
        }
        if(buttonPressed[5]==true){
            for(int i=0;i<triangles.length;i++){
                fill(random(255));
                triangles[i].update();
                triangles[i].render();
            }
        }
        if(buttonPressed[6]==true){
            man1.update();
            man1.draw();
            stroke(255);
            fill(255);
            text("Press W/A/S/D to move",170,55);
        }
        if(buttonPressed[7]==true){
            for(int i=0;i<flies.length;i++){
                flies[i].update();
                flies[i].draw();
            }     
        }
        if(buttonPressed[8]==true){
            cat1.update();
            cat1.draw();
            if(mouseY <= 200){
                meow.play();
            }
            else if(mouseY >= 200){
                meow.pause();
                meow.rewind();
            }
        }
       
        if(mousePressed){
            mousePressed=false;
            if(mouseX>360 && mouseX <460 && mouseY>height-200 && mouseY <height-150){
                if(buttonPressed[0]==true){
                    for(int i=0;i<10;i++){
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                        buttonPressed[i] = false;
                        b = new Button(this,  360, height-200, 100, 50, "BALLS", 255, 255, 0);
                    }
                } else if(buttonPressed[0]==false){
                    for(int i=0;i<10;i++){
                        buttonPressed[i] = false;
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                    }
                    bouncy.loop();
                    buttonPressed[0] = true;
                    b = new Button(this,  360, height-200, 100, 50, "BALLS", 130, 130, 0);
                }
                click.play();
                click.rewind();
                fill(255);
                text("YOU PRESSED BALLS", width/2, 60);
            }
        
            else if(mouseX>255 && mouseX <355 && mouseY>height-200 && mouseY <height-150){
                if(buttonPressed[1]==true){
                    for(int i=0;i<10;i++){
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                        buttonPressed[i] = false;
                        b8 = new Button(this, 255, height-200, 100, 50, "DATE", 255, 128, 0);
                    }
                    
                } else if(buttonPressed[1]==false){
                    for(int i=0;i<10;i++){
                        buttonPressed[i] = false;
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                    }
                    scan.loop();
                    buttonPressed[1] = true;
                    b8 = new Button(this, 255, height-200, 100, 50, "DATE", 130, 64, 0);                    
                }
                click.play();
                click.rewind();
                fill(255);
                text("YOU PRESSED DATE", width/2, 60);
            }
        
            else if(mouseX>465 && mouseX <565 && mouseY>height-200 && mouseY <height-150){
                if(buttonPressed[2]==true){
                    for(int i=0;i<10;i++){
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                        buttonPressed[i] = false;
                        b2 = new Button(this, 465, height-200, 100,50, "BARS", 128, 255, 0);
                    }
                } else if(buttonPressed[2]==false){
                    for(int i=0;i<10;i++){
                        buttonPressed[i] = false;
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                    }
                    morse.loop();
                    buttonPressed[2] = true;
                    b2 = new Button(this, 465, height-200, 100,50, "BARS", 64, 130, 0);
                }
                click.play();
                click.rewind();
                fill(255);
                text("YOU PRESSED BARS", width/2, 60);
            }
        
            else if(mouseX>205 && mouseX <305 && mouseY>height-145 && mouseY <height-95){
                if(buttonPressed[3]==true){
                    for(int i=0;i<10;i++){
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                        buttonPressed[i] = false;
                        b9 = new Button(this, 205, height-145, 100, 50, "STARS", 0, 255, 128);
                    }
                } else if(buttonPressed[3]==false){
                    for(int i=0;i<10;i++){
                        buttonPressed[i] = false;
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                    }
                    space.loop();
                    buttonPressed[3] = true;
                    b9 = new Button(this, 205, height-145, 100, 50, "STARS", 0, 130, 64);
                }
                click.play();
                click.rewind();
                fill(255);
                text("YOU PRESSED STARS", width/2, 60);
            }
        
            else if(mouseX>310 && mouseX <410 && mouseY>height-145 && mouseY <height-95){
                if(buttonPressed[4]==true){
                    for(int i=0;i<10;i++){
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                        buttonPressed[i] = false;
                        b10 = new Button(this, 310, height-145, 100, 50, "WORDS", 0, 255, 255);
                    }
                } else if(buttonPressed[4]==false){
                    for(int i=0;i<10;i++){
                        buttonPressed[i] = false;
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                    }
                    noise.loop();
                    buttonPressed[4] = true;
                    b10 = new Button(this, 310, height-145, 100, 50, "WORDS", 0, 130, 130);
                }
                click.play();
                click.rewind();
                fill(255);
                text("YOU PRESSED WORDS", width/2, 60);
            }
        
            else if(mouseX>415 && mouseX <515 && mouseY>height-145 && mouseY <height-95){
                if(buttonPressed[5]==true){
                    for(int i=0;i<10;i++){
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();                   
                        buttonPressed[i] = false;
                        b6 = new Button(this, 415, height-145, 100, 50, "TRIANGLES", 0, 128, 255);
                    }
                } else if(buttonPressed[5]==false){
                    for(int i=0;i<10;i++){
                        buttonPressed[i] = false;
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                    }
                    bubbling.loop();
                    buttonPressed[5] = true;
                    b6 = new Button(this, 415, height-145, 100, 50, "TRIANGLES", 0, 64, 130);
                }
                click.play();
                click.rewind();
                fill(255);
                text("YOU PRESSED TRIANGLES", width/2, 60);
            }
        
            else if(mouseX>520 && mouseX <620 && mouseY>height-145 && mouseY <height-95){
                if(buttonPressed[6]==true){
                    for(int i=0;i<10;i++){
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                        buttonPressed[i] = false;
                        b7 = new Button(this, 520, height-145, 100, 50, "MAN", 128, 0, 255);
                    }
                } else if(buttonPressed[6]==false){
                    for(int i=0;i<10;i++){
                        buttonPressed[i] = false;
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                    }
                    jolly.loop();
                    buttonPressed[6] = true;
                    b7 = new Button(this, 520, height-145, 100, 50, "MAN", 64, 0, 130);
                }
                click.play();
                click.rewind();
                fill(255);
                text("YOU PRESSED MAN", width/2, 60);
            }
        
            else if(mouseX>260 && mouseX <360 && mouseY>height-90 && mouseY <height-40){
                if(buttonPressed[7]==true){
                    for(int i=0;i<10;i++){
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                        buttonPressed[i] = false;
                        b3 = new Button(this, 260, height-90, 100, 50, "FLY", 255, 0, 255);
                        computer = new Computer(this, 100, 50, 600, 250, 0);
                        welcomeOn = false;
                    }
                } else if(buttonPressed[7]==false){
                    for(int i=0;i<10;i++){
                        buttonPressed[i] = false;
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                    }
                    fly.loop();
                    buttonPressed[7] = true;
                    b3 = new Button(this, 260, height-90, 100, 50, "FLY", 130, 0, 130);
                    computer = new Computer(this, 100, 50, 600, 250, 255);
                    welcomeOn = false;
                }
                click.play();
                click.rewind();
                fill(255);
                text("YOU PRESSED FLY", width/2, 60);
            }
     
            else if(mouseX>365 && mouseX <465 && mouseY>height-90 && mouseY <height-40){
                if(buttonPressed[8]==true){
                    for(int i=0;i<10;i++){
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                        buttonPressed[i] = false;
                        b4 = new Button(this, 365, height-90, 100, 50, "TIGER", 255, 0, 127);
                    }
                } else if(buttonPressed[8]==false){
                    for(int i=0;i<10;i++){
                        buttonPressed[i] = false;
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                    }
                    buttonPressed[8] = true;
                    b4 = new Button(this, 365, height-90, 100, 50, "TIGER", 130, 0, 60);                    
                }
                click.play();
                click.rewind();
                fill(255);
                text("YOU PRESSED TIGER", width/2, 60);
            }
  
            else if(mouseX>470 && mouseX <570 && mouseY>height-90 && mouseY <height-40){
                if(buttonPressed[9]==true){
                    for(int i=0;i<10;i++){
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                        buttonPressed[i] = false;
                        b5 = new Button(this, 470, height-90, 100, 50, "LOVE", 255, 0, 0);
                        tapOn = true;
                    }
                } else if(buttonPressed[9]==false){
                    for(int i=0;i<10;i++){
                        buttonPressed[i] = false;
                        meow.pause();
                        love.pause();
                        fly.pause();
                        scan.pause();
                        noise.pause();
                        bubbling.pause();
                        space.pause();
                        jolly.pause();
                        morse.pause();
                        bouncy.pause();
                    }
                    tapOn = false;
                    love.play();
                    love.rewind();
                    buttonPressed[9] = true;
                    b5 = new Button(this, 470, height-90, 100, 50, "LOVE", 130, 0, 0);
                }
                click.play();
                click.rewind();
                fill(255);
                text("YOU PRESSED LOVE", width/2, 60);
            }

            else if(mouseX>100 && mouseX<700 && mouseY>50 && mouseY<300){
                ping.play();
                ping.rewind();
                if(tapOn){
                    fill(255);
                    ellipse(mouseX,mouseY,10,10);
                }
            }

            else if(mouseX>0 && mouseX<width && mouseY>0 && mouseY < height){
                clank.play();
                clank.rewind();
                if(tapOn){
                    fill(255);
                    ellipse(mouseX,mouseY,10,10);
                }
            }
        }
    }

}

