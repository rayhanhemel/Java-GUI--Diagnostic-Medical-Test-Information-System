import java.util.ArrayList;
import java.util.*;
import javafx.stage.Stage;

public class ViewPatients extends AddPatient {
    
    private int ViewPatientID;
    public ViewPatients ()    {
        
    }
    public ViewPatients (int patientID,String PatientName,int PatientAge,String Sex,String PatientMedicalTest)    {
        
    }
    
    public void displayPatientInfo(AddPatient object, Stage primaryStage){
        object.PatientInformation(primaryStage);
    }
}
