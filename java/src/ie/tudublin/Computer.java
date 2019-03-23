package ie.tudublin;

import processing.core.PApplet;

public class Computer
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;

    public Computer(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
        
    }

    public void render()
    {
        ui.noFill();
        ui.stroke(255);
        ui.fill(50);
        ui.rect(x, y, width, height, 10);
        ui.fill(255);
    }
}