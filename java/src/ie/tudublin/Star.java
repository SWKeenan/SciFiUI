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
        z = z - 10;
        if(z < 1){
            z = 695;
        }
    }
    
    public void show()
    {
        ui.fill(255);
        ui.noStroke();
        float sx = ui.map(x/z,0,1,0,695);
        float sy = ui.map(y/z,0,1,0,295);
        ui.ellipse(sx,sy,8,8);
    }
}