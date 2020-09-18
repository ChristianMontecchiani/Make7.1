package View;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public final static String AUDIO_PATH= "Resources\\Audio\\";
    public final static String IMAGE_PATH= "Resources\\Image\\";

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("Jmake7");
        window.setScene(StartPanel.startPanel());
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
