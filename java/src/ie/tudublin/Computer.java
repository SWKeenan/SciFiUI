package ie.tudublin;

import processing.core.PApplet;

public class Computer
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private int fillColor;

    public Computer(UI ui, float x, float y, float width, float height, int fillColor)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;        
    }

    public void render()
    {
        ui.stroke(255);
        ui.fill(fillColor);
        ui.rect(x, y, width, height, 10);
    }
}