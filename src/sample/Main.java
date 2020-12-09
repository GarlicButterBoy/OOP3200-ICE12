package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    public static int WIDTH = 640;
    public static int HEIGHT = 480;


    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Hello World");
        //Step 1 - Create a Control
        Label helloLabel = new Label("Hello Worlds!");
        Label goodbyeLabel = new Label("Goodbye...For now!");
        Button clickMeButton = new Button("Click Me!");
        Font font = Font.font("Verdana", FontWeight.BOLD, 40.0);

        //Step 1.5 - Configure newly created Controls
        clickMeButton.setFont(font);

        //Step 1.9 - Event Type Controls!
        clickMeButton.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {

                System.out.println("ClickmeButton was compressed! Thats pretty cool!");
                helloLabel.setText(goodbyeLabel.getText());
                goodbyeLabel.setText(helloLabel.getText());
            }
        });

        //Step 2 - Create a Container
        //HBox hbox = new HBox(helloLabel, clickMeButton);
        //var children = hbox.getChildren();
        //VBox vbox = new VBox(helloLabel, clickMeButton);
        GridPane grid = new GridPane();
        grid.add(helloLabel, 1, 1);
        grid.add(clickMeButton, 2,2);
       // grid.add(goodbyeLabel, 3, 3);

        //Step 3 - Create a Scene
        Scene primaryScene = new Scene(grid, WIDTH, HEIGHT);

        //Step 4 - Add Scene to the Stage
        primaryStage.setScene(primaryScene);

        //Step 5 - Show the Stage
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
