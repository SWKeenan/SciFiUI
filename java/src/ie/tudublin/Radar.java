package ie.tudublin;

import processing.core.*;

public class Radar{

    UI ui;
    private float x;
    private float y;
    private float diameter;
    private float radius;
    private float smallerCircle;
    private float biggerCircle;
    private float rotation;
    private float rotationSpeed;

    public Radar(UI ui, float x, float y, float diameter, float rotationSpeed){
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.radius = diameter/2f;
        this.smallerCircle = radius/2f;
        this.biggerCircle = diameter/1.3f;
        this.rotationSpeed = rotationSpeed;

    }

    public void render()
    {
        ui.strokeWeight(3);
        ui.stroke(250);
        ui.noFill();

        ui.pushMatrix();
        ui.translate(x, y);
        ui.rotate(rotation);
        ui.ellipse(0,0,biggerCircle, biggerCircle);
        ui.ellipse(0,0,smallerCircle,smallerCircle);
        ui.ellipse(0, 0, radius, radius);
        ui.ellipse(0,0,diameter,diameter);
        ui.line(0,0,radius,0);
        ui.popMatrix();
    }

    public void update()
    {
        rotation += rotationSpeed;
    }
}