import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Rectangle house = new Rectangle(120, 200, 510, 280);
        house.setFill(Color.web("#F7C18E"));

        Circle window1 = new Circle(230, 350, 40);
        window1.setFill(Color.WHITE);

        Circle window2 = new Circle(530, 350, 40);
        window2.setFill(Color.WHITE);

        Polygon roof = new Polygon(375, 50,
                                    100, 200,
                                    650, 200);
        roof.setFill(Color.web("#653608"));

        Rectangle door = new Rectangle(340, 330, 80, 150);
        door.setFill(Color.web("#910F00"));

        roof.setOnMouseEntered(event -> {
            roof.setFill(Color.web("#830000"));
        });

        door.setOnMouseExited(event -> {
            door.setScaleX(0.1);
        });

        window1.setOnMouseClicked(event -> {
            window1.setTranslateX(150);
            window1.setTranslateY(-80);
        });


        Pane pane = new Pane(roof, house, door, window1, window2);

        pane.setStyle("-fx-background-color: #F8FEFF");

        Scene scene = new Scene(pane, 750, 600);
        primaryStage.setTitle("House");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
