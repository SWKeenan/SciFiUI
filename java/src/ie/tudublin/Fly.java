package ie.tudublin;

import processing.core.PApplet;

public class Fly
{
    UI ui;
    float movement;
    float position1;
    float position2;

    public Fly(UI ui, float position1, float position2, float movement)
    {
        this.ui = ui;
        this.position1 = position1;
        this.position2 = position2;
        this.movement = movement;
    }

    public void draw()
    {
        ui.stroke(0);
        ui.point(position1+x(movement),position2+y(movement));
        movement++;
    }

    public void update()
    {
        if(position1<100){
            position1 = 600;
        }
        else if(position1>650){
            position1 = 100;
        }
        else if(position2>235){
            position2 = 50;
        }
        else if(position2<50){
            position2 = 235;
        }
    }

    float x (float movement){
        return ui.sin(movement/10)*50 + ui.cos(movement/15)*50;
    }

    float y (float movement){
        return ui.cos(movement/10)*50;
    }

}
