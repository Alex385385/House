import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Rectangle bigRec = new Rectangle();
        Circle window1 = new Circle();
        Circle window2 = new Circle();
        Polygon roof = new Polygon();
        Rectangle door = new Rectangle();

        VBox vbox1 = new VBox();

        Scene scene = new Scene(vbox1, 550, 500);
        primaryStage.setTitle("Skateboard Designer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
