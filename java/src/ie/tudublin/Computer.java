package ie.tudublin;

import processing.core.PApplet;

public class Computer
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;

    public Computer(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;        
    }

    public void render()
    {
        ui.stroke(255);
        ui.fill(50);
        ui.rect(x, y, width, height, 10);
    }
}