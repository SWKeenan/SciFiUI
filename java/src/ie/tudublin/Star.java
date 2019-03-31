package ie.tudublin;

import processing.core.*;

public class Star{

    UI ui;
    private float x;
    private float y;
    private float z;

    public Star(UI ui, float x, float y, float z){
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void update()
    {

    }
    
    public void show()
    {
        ui.fill(255);
        ui.noStroke();
        ui.ellipse(x,y,8,8);
    }
}