package ie.tudublin;

import processing.core.PApplet;

public class Triangle
{
    private float x1;
    private float x2;
    private float y1;
    private float y2;
    private float z1;
    private float z2;
    UI ui;

    public Triangle(UI ui, float x1, float x2, float y1, float y2, float z1, float z2)
    {
        this.ui = ui;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.z1 = z1;
        this.z2 = z2;
    }
    
    public void render()
    {
        ui.triangle(x1,x2,y1,y2,z1,z2);
    }

    public void update()
    {
        x1++;
        y2++;
        z1--;
        if(x1>400){
            x1=200;
        }
        else if(y2>295){
            y2=95;
        }
        else if(z1<400){
            z1=600;
        }
      //200,295,400,55,600,295
    }
}
