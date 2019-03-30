package ie.tudublin;

import processing.core.PApplet;

public class MovingCircle
{
    private float x;
    private float dx;
    private float y;
    private float diameter;
    UI ui;

    public MovingCircle(UI ui, float x, float y, float diameter, float dx)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.diameter = diameter;
    }
    
    public void render()
    {
        ui.stroke(255);
        ui.fill(ui.random(255),0,ui.random(255));
        ui.ellipse(x, y, diameter, diameter);
        ui.fill(255);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text("Circle", x, y);

    }

    public void update()
    {
        x += dx;
        if ((x > 675) || (x < 125))
        {
            dx *= -1;
        }
    }
}
