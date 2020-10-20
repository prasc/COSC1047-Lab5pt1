package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowImage extendsd Application {
    public void start(Stage primaryStage) {
        // Create a pane to hold image views
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));

        Image image = new Image("image/us.gif");
        pane.getChildren().add(new ImageView(image))

        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(100);
        imageiew2.setFitWidth(100);
        pane.getChildren().add(imageView2);

        ImageView imageView3 = new ImageView(image);
        imageView3.setRotate(90);
        pane.getChildren().add(imageView3);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}