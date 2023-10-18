package view;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Window extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Button bouton1 = new Button("1");
		Button bouton2 = new Button("2");
		Button bouton3 = new Button("3");
		Button bouton4 = new Button("4");
		Button bouton5 = new Button("5");
		Button bouton6 = new Button("6");
		Button bouton7 = new Button("7");
		Button bouton8 = new Button("8");
		Button bouton9 = new Button("9");
		
		Button boutonP = new Button("+");
		Button boutonM = new Button("-");
		Button boutonF = new Button("X");
		Button boutonD = new Button("/");
		Button bouton_Push = new Button("<>");
		
		
		StackPane root = new StackPane();
		
		Label label = new Label("Fenetre Calculatrice");
        root.getChildren().add(label);

        // Créer la scène
        Scene scene = new Scene(root, 300, 200);

        // Définir la scène pour la fenêtre
        arg0.setScene(scene);
	}

}
