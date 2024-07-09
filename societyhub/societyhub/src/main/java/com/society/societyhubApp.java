package com.society;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class societyhubApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Image setup
        ImageView imageView = new ImageView(new Image("/image/background.jpg")); // Update the path to your image
        imageView.setFitWidth(1100);
        imageView.setPreserveRatio(true);

        // Login Form
        VBox loginForm = createLoginForm();
        // Registration Form
        VBox registerForm = createRegisterForm();

        // TabPane for Login and Register
        TabPane tabPane = new TabPane();
        Tab loginTab = new Tab("Login", loginForm);
        loginTab.setClosable(false); // Make the login tab non-closable
        Tab registerTab = new Tab("Register", registerForm);
        registerTab.setClosable(false); // Make the register tab non-closable
        tabPane.getTabs().addAll(loginTab, registerTab);

        // HBox for image and form
        HBox formContainer = new HBox(40, imageView, tabPane);
        formContainer.setAlignment(Pos.CENTER);
        formContainer.setPadding(new Insets(40));

        // Admin Login Button
        Button adminLoginButton = new Button("Admin Login");
        adminLoginButton.setStyle(
            "-fx-font-size: 16px;" + 
            "-fx-font-weight: bold;" + 
            "-fx-background-color: #FFA500;" + // Orange background
            "-fx-text-fill: white;" + // White text
            "-fx-padding: 10px 20px;" + // Padding
            "-fx-border-radius: 5px;" + // Border radius
            "-fx-background-radius: 5px;" // Background radius
        );

        HBox adminButtonContainer = new HBox(adminLoginButton);
        adminButtonContainer.setAlignment(Pos.TOP_RIGHT);
        adminButtonContainer.setPadding(new Insets(50));

        // Title and logo for top left corner
        ImageView logo = new ImageView(new Image("/image/logo.png")); // Update the path to your logo
        logo.setFitWidth(100);
        logo.setFitHeight(100);

        Label titleLabel = new Label("SOCIETY HUB");
        titleLabel.setStyle("-fx-font-size: 50px; -fx-font-weight: bold;");

        HBox topLeftContainer = new HBox(logo, titleLabel);
        topLeftContainer.setAlignment(Pos.TOP_LEFT);
        topLeftContainer.setPadding(new Insets(10));
        topLeftContainer.setSpacing(20);

        // Top container combining title/logo and admin button
        BorderPane topContainer = new BorderPane();
        topContainer.setLeft(topLeftContainer);
        topContainer.setRight(adminButtonContainer);

        // BorderPane for overall layout
        BorderPane root = new BorderPane();
        root.setTop(topContainer);
        root.setCenter(formContainer);
        root.setStyle("-fx-background-color: #E0E0F8;"); // Set background color for the root

        // Scene setup
        Scene scene = new Scene(root, 1500, 1500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("SocietyHub App");
        primaryStage.show();
    }

    private VBox createLoginForm() {
        Label usernameLabel = new Label("Username:");
        usernameLabel.setFont(Font.font("Arial",FontWeight.BOLD,16));
        TextField usernameField = new TextField();
        
        Label emailLabel = new Label("E-mail:");
        emailLabel.setFont(Font.font("Arial",FontWeight.BOLD,16));
        TextField emailField = new TextField();
        
        Label flatNoLabel = new Label("Flat No.:");
        flatNoLabel.setFont(Font.font("Arial",FontWeight.BOLD,16));
        TextField flatNoField = new TextField();

        Label passwordLabel = new Label("Password:");
        passwordLabel.setFont(Font.font("Arial",FontWeight.BOLD,16));
        TextField passwordField = new TextField();
        
        Button loginButton = new Button("Login");
        loginButton.setFont(Font.font("Arial",FontWeight.BOLD,18));
        
        VBox loginForm = new VBox(10, usernameLabel, usernameField, emailLabel, emailField, flatNoLabel, flatNoField, passwordLabel, passwordField, loginButton);
        loginForm.setAlignment(Pos.CENTER);
        loginForm.setPadding(new Insets(40));
        loginForm.setStyle("-fx-background-color: white; -fx-border-radius: 2; -fx-background-radius: 3;");
        
        return loginForm;
    }

    private VBox createRegisterForm() {
        Label usernameLabel = new Label("Username:");
        usernameLabel.setFont(Font.font("Arial",FontWeight.BOLD,16));
        TextField usernameField = new TextField();
        
        Label emailLabel = new Label("E-mail:");
        emailLabel.setFont(Font.font("Arial",FontWeight.BOLD,16));
        TextField emailField = new TextField();
        
        Label flatNoLabel = new Label("Flat No.:");
        flatNoLabel.setFont(Font.font("Arial",FontWeight.BOLD,16));
        TextField flatNoField = new TextField();
        
        Label mobileNoLabel = new Label("Mobile Number:");
        mobileNoLabel.setFont(Font.font("Arial",FontWeight.BOLD,16));
        TextField mobileNoField = new TextField();
        
        Label FamilymembersLabel = new Label("Total Family members");
        FamilymembersLabel.setFont(Font.font("Arial",FontWeight.BOLD,16));
        TextField FamilymembersField = new TextField();
        
        Label passwordLabel = new Label("Password:");
        passwordLabel.setFont(Font.font("Arial",FontWeight.BOLD,16));
        TextField passwordField = new TextField();
        
        Button registerButton = new Button("Register Now");
        registerButton.setFont(Font.font("Arial",FontWeight.BOLD,18));
        
        VBox registerForm = new VBox(10, usernameLabel, usernameField, emailLabel, emailField, flatNoLabel, flatNoField, mobileNoLabel, mobileNoField, FamilymembersLabel,FamilymembersField, passwordLabel, passwordField, registerButton);
        registerForm.setAlignment(Pos.CENTER);
        registerForm.setPadding(new Insets(20));
        registerForm.setStyle("-fx-background-color: white; -fx-border-radius: 3; -fx-background-radius: 3;");
        
        return registerForm;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
