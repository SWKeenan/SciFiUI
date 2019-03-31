package ie.tudublin;

import processing.core.PApplet;

public class Button
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;
    private int color1,color2,color3;

    public Button(UI ui, float x, float y, float width, float height, String text, int color1, int color2, int color3)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;        
    }

    public void render()
    {
        ui.noFill();
        ui.stroke(0);
        ui.fill(color1, color2, color3);
        ui.rect(x, y, width, height, 10);
        ui.fill(0);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text, x + width * 0.5f, y + height * 0.5f);
    }
}