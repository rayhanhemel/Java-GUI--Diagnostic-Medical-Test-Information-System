
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Menu {
    
    
    
    public void MainMenu(Stage primaryStage) {
        GridPane root = new GridPane();
        Label lb = new Label("\n                                        ########## Main Menu ##########\n");
        lb.setPadding(new Insets(10));
         
        Button b1 = new Button("  1. Add Patient ");
        GridPane.setConstraints(b1,0,1);
        b1.setOnAction(event->{
            primaryStage.setTitle("Add Patient");
            primaryStage.setScene(new Scene(VBoxBuilder.create().children(new Text()).build())); 
            AddPatient AP = new AddPatient();
            AP.setPatientInformation(primaryStage);
            
            
        });
        
        Button b2 = new Button("  2. Add Medical Test ");
        GridPane.setConstraints(b2,0,2);
        b2.setOnAction(event->{
            primaryStage.setTitle("Add Medical Test");
            primaryStage.setScene(new Scene(VBoxBuilder.create().children(new Text()).build())); 
            AddMedicalTest AM = new AddMedicalTest();
            AM.MedicalMenu(primaryStage);
            
            
        });
        
        Button b3 = new Button("  3. View Patient ");
        GridPane.setConstraints(b3,0,3);
        b3.setOnAction(event->{
            primaryStage.setTitle("View Patient");
            primaryStage.setScene(new Scene(VBoxBuilder.create().children(new Text()).build())); 
            ViewPatients EP = new ViewPatients();
            EP.displayPatientInfo(EP, primaryStage);
            
            
        });
        
        Button b4 = new Button("  4. View Medical Test ");
        GridPane.setConstraints(b4,0,4);
        b4.setOnAction(event->{
            primaryStage.setTitle("View Medical Test Patient");
            primaryStage.setScene(new Scene(VBoxBuilder.create().children(new Text()).build())); 
            Menu vew = new Menu();
            vew.ViewMedicalTestMenu(primaryStage);
            //ViewMedicalTest VM = new ViewMedicalTest();
            //VM.displayMedicalInfo(primaryStage);
            //VM.displayMedicalInfo(VM, primaryStage);
            
            
        });
        
        Button b5 = new Button("  5. Search Patient ");
        GridPane.setConstraints(b5,0,5);
        Button b6 = new Button("  6. Search Medical Test ");
        GridPane.setConstraints(b6,0,6);
        
        Button b7 = new Button("  7. Edit Patient ");
        GridPane.setConstraints(b7,0,7);
        b7.setOnAction(event->{
            primaryStage.setTitle("Add Patient");
            primaryStage.setScene(new Scene(VBoxBuilder.create().children(new Text()).build())); 
            EditPatient EP = new EditPatient();
            EP.editPatientSearch(primaryStage);
            
            
        });
        
        Button b8 = new Button("  8. Edit Medical Test ");
        GridPane.setConstraints(b8,0,8);
        Button b9 = new Button("  9. Delete Option ");
        GridPane.setConstraints(b9,0,9);
        Button b10 = new Button(" 10.Exit");
        GridPane.setConstraints(b10,0,10);
         
         
         //Button b12 = new Button(" Give Input Number For Your Choise");
         
        root.getChildren().addAll(lb,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10);
        
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setTitle("Diagnostic Medical Test Information System");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }
    
    public void MedicalMenu(Stage primaryStage){
        GridPane root = new GridPane();
        Label lb = new Label("\n                           ##########  Add Medical Test ##########\n");
        lb.setPadding(new Insets(10));
        
        Button b1 = new Button("  1. Blood Test ");
        GridPane.setConstraints(b1,0,2);
        b1.setOnAction(event->{
            primaryStage.setTitle("Add Blood Test");
            primaryStage.setScene(new Scene(VBoxBuilder.create().children(new Text()).build())); 
            addBloodTest aBT = new addBloodTest();
            aBT.setBloodTestInformation(primaryStage);
            
            
        });
        
        Button b2 = new Button("  2. Ultrasonogram ");
        GridPane.setConstraints(b2,0,4);
        
        Button b3 = new Button("  3. X Ray ");
        GridPane.setConstraints(b3,0,6);
        
        Button b4 = new Button("  Back ");
        GridPane.setConstraints(b4,0,7);
        b4.setOnAction(event->{
            primaryStage.setTitle("Add Blood Test");
            primaryStage.setScene(new Scene(VBoxBuilder.create().children(new Text()).build())); 
            Menu m = new Menu();
            m.MainMenu(primaryStage);
            
            
        });
        
        root.getChildren().addAll(lb,b1,b2,b3,b4);
        
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Diagnostic Medical Test Information System ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void ViewMedicalTestMenu(Stage primaryStage){
        GridPane root = new GridPane();
        Label lb = new Label("\n                           ##########  View Medical Test ##########\n");
        lb.setPadding(new Insets(10));
        
        Button b1 = new Button("  1. View Blood Test ");
        GridPane.setConstraints(b1,0,2);
        b1.setOnAction(event->{
            primaryStage.setTitle("View Blood Test");
            primaryStage.setScene(new Scene(VBoxBuilder.create().children(new Text()).build())); 
            viewBloodTest vBT = new viewBloodTest();
            vBT.viewBloodTestInformation(vBT, primaryStage);
            
            
        });
        
        Button b2 = new Button("  2. View Ultrasonogram ");
        GridPane.setConstraints(b2,0,4);
        
        Button b3 = new Button("  3. View X Ray ");
        GridPane.setConstraints(b3,0,6);
        
        Button b4 = new Button("  Back ");
        GridPane.setConstraints(b4,0,7);
        b4.setOnAction(event->{
            primaryStage.setTitle("Add Blood Test");
            primaryStage.setScene(new Scene(VBoxBuilder.create().children(new Text()).build())); 
            Menu m = new Menu();
            m.MainMenu(primaryStage);
            
            
        });
        
        root.getChildren().addAll(lb,b1,b2,b3,b4);
        
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Diagnostic Medical Test Information System ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    

    
}
