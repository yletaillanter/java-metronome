package GUI;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        // définit la largeur et la hauteur de la fenêtre
        // en pixels, le (0, 0) se situe en haut à gauche de la fenêtre
        stage.setWidth(400);
        stage.setHeight(300);
        // met un titre dans la fenêtre
        stage.setTitle("Metronome");

        // la racine du sceneGraph est le root
        Group root = new Group();
        Scene scene = new Scene(root);
        scene.setFill(Color.valueOf("#303F9F"));

        // création d'un élément plus complexe, le panneau
        Group sign = new Group();
        sign.setTranslateX(75);
        sign.setTranslateY(100);
        // le repère utilisé est celui du panneau
        Rectangle panel = new Rectangle( 50, -25, 120, 50);

        panel.setFill(Color.valueOf("#3F51B5"));
        // composer l'élément plus complexe
        sign.getChildren().add(panel);

        Group buttonsGroup = new Group();
        buttonsGroup.setTranslateX(75);
        buttonsGroup.setTranslateY(200);
        Rectangle panel2 = new Rectangle(0,0,250,55);
        panel2.setFill(Color.valueOf("#4CAF50"));

        //Creation des boutons
        Button play = new Button("play");
        Button stop = new Button("stop");
        Button inc = new Button("inc");
        Button dec = new Button("dec");

        play.setTranslateX(10);
        play.setTranslateY(15);

        stop.setTranslateX(67.5);
        stop.setTranslateY(15);

        inc.setTranslateX(125);
        inc.setTranslateY(15);

        dec.setTranslateX(182.5);
        dec.setTranslateY(15);

        buttonsGroup.getChildren().add(panel2);
        buttonsGroup.getChildren().add(play);
        buttonsGroup.getChildren().add(stop);
        buttonsGroup.getChildren().add(inc);
        buttonsGroup.getChildren().add(dec);

        // ajout de tous les éléments de la scène
        root.getChildren().add(sign);
        root.getChildren().add(buttonsGroup);

        // ajout de la scène sur l'estrade
        stage.setScene(scene);
        // ouvrir le rideau
        stage.show();

        int i = 0;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
