package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    MovingCircle mc;
    AnimatedBar bar;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
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
        b = new Button(this,  360, height-210, 100, 50, "B");
        b2 = new Button(this, 465, height-210, 100,50, "C");
        b3 = new Button(this, 260, height-100, 100, 50, "H");
        b4 = new Button(this, 365, height-100, 100, 50, "I");
        b5 = new Button(this, 470, height-100, 100, 50, "J");
        b6 = new Button(this, 415, height-155, 100, 50, "F");
        b7 = new Button(this, 520, height-155, 100, 50, "G");
        b8 = new Button(this, 255, height-210, 100, 50, "A");
        b9 = new Button(this, 205, height-155, 100, 50, "D");
        b10 = new Button(this, 310, height-155, 100, 50, "E");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        bar = new AnimatedBar(this, 20, 10, 20, 100);
    }

    public void draw()
    {
        background(0);
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

        bar.render();
        
        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }

}

