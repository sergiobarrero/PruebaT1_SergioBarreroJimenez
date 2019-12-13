package application;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlRocket {
	
	@FXML
	private AnchorPane aPane;
	
	@FXML
	private ImageView profilePhoto;
	
	public void initialize() {

		transiccion();

	}
	
	private void transiccion() {
		FadeTransition ft = new FadeTransition(Duration.seconds(9), profilePhoto);
		ft.setFromValue(0);
		ft.setToValue(1);
		ft.play();
	}
	
	
	
	@FXML
	private void openStage() {
	
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Urano.fxml"));
			aPane = (AnchorPane) loader.load();
			Scene scene = new Scene(aPane);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
