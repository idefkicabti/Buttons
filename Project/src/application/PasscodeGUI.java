package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;

public class PasscodeGUI extends Application {

    private TextField passcodeField;
    private Label messageLabel;
    private Button videoButton;
    private MediaPlayer mediaPlayer;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Passcode");

        VBox vbox = new VBox();

        passcodeField = new TextField();
        vbox.getChildren().add(passcodeField);

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            String passcode = passcodeField.getText();
            if (passcode.equals("26")) {
                messageLabel.setText("Correct!");
                videoButton.setVisible(true);

                // Get the path to the video file
                String videoPath = new File("C:/Users/63963/Videos/Captures/hehe.mov").toURI().toString();

                // Create a Media object
                Media media = new Media(videoPath);

                // Create a MediaPlayer object
                mediaPlayer = new MediaPlayer(media);
            } else {
                messageLabel.setText("Incorrect.");
            }
        });
        vbox.getChildren().add(submitButton);

        messageLabel = new Label("");
        vbox.getChildren().add(messageLabel);

        videoButton = new Button("Play video");
        videoButton.setVisible(false);
        videoButton.setOnAction(e -> mediaPlayer.play());
        vbox.getChildren().add(videoButton);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}