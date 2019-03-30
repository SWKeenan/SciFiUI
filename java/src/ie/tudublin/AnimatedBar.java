package ie.tudublin;

import processing.core.PApplet;

public class AnimatedBar{
    UI ui;
    private float x;
    private float y;
    private float changeY = 3;
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
        ui.fill(ui.random(255),ui.random(255),0);
        ui.rect(x, y, width, height);
        height += changeY;
        x++;
        if ((height > 250) || (height < 0))
        {
            changeY *= -1;
        }
        if (x > 680)
        {
            x = 100;
        }
        
    }

    public void update()
    {
        
    }
}