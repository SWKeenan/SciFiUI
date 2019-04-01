package ie.tudublin;

public class Star{

    UI ui;
    private float x;
    private float y;

    public Star(UI ui, float x, float y){
        this.ui = ui;
        this.x = x;
        this.y = y;
    }

    public void update()
    {
        x = x - 10;
        if(x < 105){
            x = 695;
            y = ui.random(55,295);
        }
    }
    
    public void show()
    {
        ui.fill(255);
        ui.noStroke();
        ui.ellipse(x,y,8,8);
    }
}