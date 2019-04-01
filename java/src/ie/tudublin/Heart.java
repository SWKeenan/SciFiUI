package ie.tudublin;

import processing.core.PApplet;

public class Heart
{
    UI ui;

    public Heart(UI ui)
    {
        this.ui = ui;
    }

    public void render()
    {
        ui.fill(255, 0, 0);
        ui.stroke(210,0,0);
        ui.beginShape();
        ui.curveVertex(400, 600);
        ui.curveVertex(400, 270);
        ui.curveVertex(280, 150);
        ui.curveVertex(325, 75);
        ui.curveVertex(400, 100);
        ui.curveVertex(400, 300);
        ui.endShape();
        ui.beginShape();
        ui.curveVertex(400, 300);
        ui.curveVertex(400, 100);
        ui.curveVertex(475, 75);
        ui.curveVertex(520, 150);
        ui.curveVertex(400, 270);
        ui.curveVertex(400, 600);
        ui.endShape();
        ui.fill(0);
        ui.textSize(30);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text("I LOVE YOU", 400, 150);
        ui.textSize(12);
    }

}
