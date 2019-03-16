package ie.tudublin;

import processing.core.PApplet;

public class AnimatedBar{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;

    public AnimatedBar(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;        
    }

    public void render()
    {
        ui.noFill();
        ui.stroke(255);
        ui.fill(0, 0, 171);
        ui.rect(x, y, width, height);
    }

    public void update()
    {
        x++;
        if ((x > height) || (x < height))
        {
            x *= -1;
        }
    }
}