package View;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Hexagon extends ImageView {
    private int xPos;
    private int yPos;
    public final Image hex;

    public Hexagon(int x, int y, String s){
        this.xPos = x;
        this.yPos = y;
        setX(xPos);
        setY(yPos);
        hex = new Image(new File(s).toURI().toString(),60,60,true,true);
        setImage(hex);
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
}