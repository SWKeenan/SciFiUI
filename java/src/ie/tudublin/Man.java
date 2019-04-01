package ie.tudublin;

public class Man{

    UI ui;
    private int x;
    private int y;
    boolean[] keys = new boolean[128];

    public Man(UI ui, int x, int y){
        this.ui = ui;
        this.x = x;
        this.y = y;
    }

    
    public void draw()
    {
        ui.fill(255);
        move();
        ui.ellipse(x,y,20,20);
    }

    void move(){
        if(ui.key == 'a'){
            x--;
        }
        if(ui.key == 'd'){
            x++;
        }
        if(ui.key=='w'){
            y--;
        }
        if(ui.key=='s'){
            y++;
        }
    }

    public void keyPressed(){
        keys[ui.key] = true;
    }

    public void keyReleased(){
        keys[ui.key] = false;
    }
}