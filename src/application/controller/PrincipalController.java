package application.controller;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.event.ActionEvent;

public class PrincipalController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	public void cadastrar(ActionEvent event) {
		System.out.println("Clicou!!");
	}
	
	public void irParaLogin(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application/Principal.FXML"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void irParaCadastro(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/application/PrincipalCadastro.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void irParaCliente(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/application/Cliente.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
   
	@FXML
	public void irParaCadastroLojista(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/application/Lojista.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void irParaLoja(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/application/Loja.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void irParaProduto(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/application/Produto.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void irADM(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/application/DashbordADM.fxml"));
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void irparaDashboardLojista(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/application/DashboardLojista.fxml"));
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}

