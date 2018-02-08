import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * Created by aditya.nehra on 08/02/18.
 * This is the entry point of our application.
 */
public class LaunchClient extends Application {

    public static void main(String s[]) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        primaryStage.setX(bounds.getMinX());
        primaryStage.setY(bounds.getMinY());
        primaryStage.setWidth(bounds.getWidth());
        primaryStage.setHeight(bounds.getHeight());
        VBox vBox = new VBox();
        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FxReportEngine");
        primaryStage.show();

    }

}
