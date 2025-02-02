package application.controller;

import java.io.IOException;
import java.util.Properties;
import java.io.File;
import java.io.FileOutputStream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

	@FXML
	private AnchorPane mainPane;
	
	
	@FXML
	public void initialize(){
		
	}
	
	@FXML
	public void gameScreen(ActionEvent event) throws IOException{
		mainPane = FXMLLoader.load(getClass().getResource("../view/gameScreen.fxml"));
		Scene scene = new Scene(mainPane);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	
}
