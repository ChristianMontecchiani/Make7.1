package View;


import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

public class PlayGround {

    public static Hexagon emptyHexagon;
    public static AnchorPane updatablePane;
    public static Hexagon hex;

    public static int index=0;
    public static int[] xEmptyHexPosition = new int[12];
    public static int[] yEmptyHexPosition = new int[]{0,50,100,150,200,270};



    private final static String HEXAGON_2 = Main.IMAGE_PATH+"2.png";


    public static void createPane(){
        updatablePane = new AnchorPane();
        updatablePane.maxHeight(200);
        updatablePane.maxWidth(250);
        updatablePane.setPrefSize(200,250);
        updatablePane.setLayoutY(130);
        updatablePane.setLayoutX(230);
        StartPanel.pane.getChildren().add(updatablePane);
        createPlayGround(updatablePane);
        addHexagon(updatablePane);
    }


    public static void createPlayGround(Pane pane){

        for(int i = 0; i<3; i++) {
            emptyHexagon = new Hexagon(100+ 58* i, 0, Main.IMAGE_PATH + "emptyHexagon.png");
            pane.getChildren().add(emptyHexagon);
            xEmptyHexPosition[index] = emptyHexagon.getxPos();
            index++;
        }

        for( int i=0;i<4;i++){
            emptyHexagon = new Hexagon(70+58*i,50,Main.IMAGE_PATH + "emptyHexagon.png" );
            pane.getChildren().add(emptyHexagon);
            xEmptyHexPosition[index] = emptyHexagon.getxPos();
            index++;

        }
        for( int i=0;i<5;i++){
            emptyHexagon = new Hexagon(40+58*i,100,Main.IMAGE_PATH + "emptyHexagon.png" );
            pane.getChildren().add(emptyHexagon);
            xEmptyHexPosition[index] = emptyHexagon.getxPos();
            index++;


        }
        for( int i=0;i<4;i++){
            emptyHexagon = new Hexagon(70+58*i,150,Main.IMAGE_PATH + "emptyHexagon.png" );
            pane.getChildren().add(emptyHexagon);

        }
        for( int i=0;i<3;i++){
            emptyHexagon = new Hexagon(100+ 58* i,200,Main.IMAGE_PATH + "emptyHexagon.png" );
            pane.getChildren().add(emptyHexagon);

        }
        for(int j=0; j<12;j++)
            System.out.println(xEmptyHexPosition[j]);

    }

    public static void addHexagon(Pane pane){
        hex= new Hexagon(158, 270, HEXAGON_2 );
        pane.getChildren().add(hex);

    }

    public static List<Hexagon> getHexagon(Class<Hexagon> cls){
        ArrayList<Hexagon> someArray = new ArrayList<>();
        for(Node n: updatablePane.getChildren())
            if(cls.isInstance(n)){
                someArray.add((Hexagon) n);
            }
        return someArray;
    }



}
