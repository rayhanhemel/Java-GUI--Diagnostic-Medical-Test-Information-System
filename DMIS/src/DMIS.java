import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.lang.String;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

import javafx.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;/////////////
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;





public class DMIS extends Application {
    
    @Override // Override the start method in the Application class
    public void start (Stage primaryStage) throws Exception {
        
        ////////////////////
        
        
        ////////////////////
        
        GridPane root = new GridPane();
        
        Label lb = new Label("Password :");
        lb.setPadding(new Insets(10));
        
        PasswordField pass = new PasswordField();
        pass.setPromptText("Enter your password");       
        GridPane.setConstraints(pass, 0, 10);
        
        Label label = new Label();        
        GridPane.setConstraints(label, 0, 30);
        
        Button btn = new Button("Sign In");       
        GridPane.setConstraints(btn,0,20);
        btn.setOnAction(event->{
            System.out.println(pass.getText());
            if( !pass.getText().equals("project")){
                label.setText("Your password is incorrect");
                label.setTextFill(Color.RED);
            }
            else {
                
                label.setText("Your password has been Confirmed");
                label.setTextFill(Color.GREEN);
                
                
            }
            pass.clear();
        });
        pass.setOnAction(event -> { 
            if( !pass.getText().equals("project")){
                label.setText("Your password is incorrect");
                label.setTextFill(Color.RED);
            }
            else {
                label.setText("Your password has been Confirmed");
                label.setTextFill(Color.GREEN);
                
                //primaryStage.setScene(new Scene(VBoxBuilder.create().children(new Text("text")).build()));
                Menu MM = new Menu();
                
                primaryStage.setTitle("Main Menu");
                primaryStage.setScene(new Scene(VBoxBuilder.create().children(new Text()).build())); 
                MM.MainMenu(primaryStage);
                
            }
            pass.clear();
        });
        
        
        
        
        root.getChildren().addAll(pass,btn,label,lb);
        
        Scene scene = new Scene(root, 700, 500);
        
        primaryStage.setTitle("Diagnostic Medical Test Information System");
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }
    
    public static void main(String[] args){
        Application.launch(args);
    }  
    
    public static void dispaly(){
        
    }
    
     
    
}


/*
GridPane pane = new GridPane();
        //pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));///////////////////
        pane.setHgap(10);
        pane.setVgap(10);
        
        //pane.getChildren().addAll(new Label("    \n\n                                              ################# Life Diagnostic Center LTD. ################"));

        pane.add(new Label("    \n\n                                              ################# Life Diagnostic Center LTD. ################"),0 , 0);
        pane.add(new Label("\nPlease Enter Password for go to Main menu\n\n"), 0, 1);
        //pane.add(new TextField(), 0, 2);
*/