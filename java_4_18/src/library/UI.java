package library;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.SQLException;

public class UI extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private TextField isbnTF;
    private TextField nameTF;
    private TextField totalTF;
    private TextField publishedAtTF;
    private Connection connection;

    @Override
    public void start(Stage primaryStage) throws Exception {
        connection = DatabaseUtil.getConnection();

        isbnTF = new TextField();
        nameTF = new TextField();
        totalTF = new TextField();
        publishedAtTF = new TextField();
        Button button = new Button("录入书籍");
        button.setOnAction(event -> {
            int isbn = Integer.parseInt(isbnTF.getText().trim());
            String name = nameTF.getText().trim();
            int total = Integer.parseInt(totalTF.getText().trim());
            String publishedAt = publishedAtTF.getText().trim();

            try {
                Main.addBook(connection, isbn, name, total, publishedAt);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });

        HBox hBox = new HBox();
        hBox.getChildren().addAll(isbnTF, nameTF, totalTF, publishedAtTF, button);
        Scene scene = new Scene(hBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

