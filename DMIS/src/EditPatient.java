
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class EditPatient extends AddPatient{
    
    private TextField tfSearchPatientID = new TextField();
    private Button btBack = new Button("Back");
    private Button btSearch = new Button("Search");
    public EditPatient ()    {
        
    }
    public void editPatientSearch(Stage primaryStage){
        Menu m = new Menu();
        GridPane root = new GridPane();
        
        
        root.setHgap(5);
        root.setVgap(5);
        root.add(new Label(""), 0, 0);
        root.add(new Label("Enter PatientID:"), 0, 2);
        root.add(tfSearchPatientID, 1, 2);
        root.add(btSearch, 1, 4);
        root.add(btBack, 1, 6);
        
        root.setAlignment(Pos.CENTER);
        tfSearchPatientID.setAlignment(Pos.BOTTOM_LEFT);
        GridPane.setHalignment(btSearch, HPos.LEFT);
        
        btBack.setOnAction(e -> m.MainMenu(primaryStage));
        
        btSearch.setOnAction(e -> {
            try {
                SearchPatientForEdit(primaryStage);
            } catch (IOException ex) {
                Logger.getLogger(AddPatient.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Scene scene = new Scene(root, 1000, 550);
        primaryStage.setTitle("Diagnostic Medical Test Information System \n - Add Patient ");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }
    
    private void SearchPatientForEdit (Stage primaryStage)throws IOException{
        
        int searchID = Integer.parseInt(tfSearchPatientID.getText());
        EditPatientInformation(searchID,  primaryStage);
    }
    public void EditPatientInformation(int searchID, Stage primaryStage){
        super.EditPatientInformation(searchID,primaryStage);
    }

}
