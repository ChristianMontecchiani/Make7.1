package View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Paint;
import javafx.scene.control.CheckBox;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public abstract class StartPanel implements EventHandler<ActionEvent> {

    public static final int X_SIZE = 600;
    public static final int Y_SIZE = 500;
    public static final int H_SEP_Y = 110;
    public static Text title = new Text("JMake7");
    public static Label user,color,score,best;
    public static TextField name;
    public static ChoiceBox<String> choiceColor;
    public static CheckBox audio;
    public static Button start,undo,change,help;
    public static Separator hSep = new Separator();
    public static Pane pane;
    public static int scores = 10;
    public static int bestScore = 0;
    public static HBox hBox;
    public static VBox vBox;

    //public static Media sound;
    //public static MediaPlayer mediaPlayer;


    public static Scene startPanel() {

        pane = new Pane();
        pane.setPrefSize(X_SIZE,Y_SIZE);
        hSep.setPrefWidth(X_SIZE);
        hSep.setLayoutY(H_SEP_Y);

        title.setFont(Font.font("Georgia", FontWeight.BOLD,60));
        title.setFill(Paint.valueOf("rgb(178,22,22)"));
        title.setY(50);
        title.setX(190);

        hBox = new HBox(20);
        hBox.setPadding(new Insets(0,20,0,10));
        user = new Label("Nickname :");
        user.setFont(Font.font("Georgia",FontWeight.MEDIUM,16));
        color = new Label("Color :");
        color.setFont(Font.font("Georgia",FontWeight.MEDIUM,16));
        name = new TextField("User");
        name.setFont(Font.font("Georgia",FontWeight.MEDIUM,16));
        choiceColor= new ChoiceBox<>();
        choiceColor.setStyle("-fx-font-size: 14");
        choiceColor.getItems().addAll("WHITE","GRAY","GREEN");
        choiceColor.setValue("WHITE");
        choiceColor.setPrefWidth(80);
        start = new Button("Start");
        start.setFont(Font.font("Georgia",FontWeight.MEDIUM,16));
        hBox.getChildren().addAll(user,name,color,choiceColor,start);
        hBox.setAlignment(Pos.CENTER);
        hBox.setLayoutX(0);
        hBox.setLayoutY(70);

        vBox = new VBox(60);
        vBox.setPadding(new Insets(20,50,0,0));
        score = new Label("Score :\n"+ scores);
        score.setFont(Font.font("Georgia",FontWeight.MEDIUM,18));
        best = new Label("Best Score :\n"+ bestScore);
        best.setFont(Font.font("Georgia",FontWeight.MEDIUM,18));
        undo = new Button("Undo");
        undo.setFont(Font.font("Georgia",FontWeight.MEDIUM,16));
        change = new Button("Change");
        undo.setFont(Font.font("Georgia",FontWeight.MEDIUM,16));
        change.setFont(Font.font("Georgia",FontWeight.MEDIUM,16));
        vBox.setLayoutY(110);
        vBox.setLayoutX(10);
        vBox.getChildren().addAll(score,best,undo,change);

        help = new Button("?");
        help.setLayoutY(20);
        help.setLayoutX(35);

        audio = new CheckBox("Audio ON\n");
        audio.setLayoutX(505);
        audio.setLayoutY(25);
        audio.setSelected(true);

        //sound = new Media(new File(musicFile).toURI().toString());
        //mediaPlayer = new MediaPlayer(sound);
      //  mediaPlayer.play();

     /*   EventHandler<ActionEvent> actionHandler = event -> {
            if (!audio.isSelected()) {
                mediaPlayer.pause();
                audio.setText("Audio OFF");
            } else {
                mediaPlayer.play();
                audio.setText("Audio ON");
            }
        };
        audio.addEventHandler(ActionEvent.ACTION, actionHandler);*/
        EventHandler<ActionEvent> actionHandler2 = event -> pane.setStyle("-fx-background-color: " + choiceColor.getValue());
        choiceColor.addEventHandler(ActionEvent.ACTION, actionHandler2);

        pane.getChildren().addAll(hSep,hBox,title,vBox,help,audio);
        pane.setStyle("-fx-background-color:"+choiceColor.getValue());



       /* String s =Main.IMAGE_PATH+"2.png";
        Hexagon hexagon = new Hexagon(400,425, s);
        pane.getChildren().add(hexagon);*/

        PlayGround.createPane();


        return new Scene(pane,X_SIZE,Y_SIZE);
    }
}