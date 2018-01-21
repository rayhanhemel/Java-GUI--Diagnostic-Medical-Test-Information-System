import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.*;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AddPatient {
    private static  int[] patientID = new int[1000];
    private int patien ;// Instance variable
    private static String[] PatientName = new String[1000];
    private static int[] PatientAge = new int[1000];
    private static String[] Sex = new String[10000];
    private static String[] PatientMedicalTest = new String[1000];
    private static int patienNo;
    
    private TextField tfPatientID = new TextField();
    private TextField tfPatientName = new TextField();
    private TextField tfPatientAge = new TextField();
    private TextField tfSex = new TextField();
    private TextArea tfPatientMedicalTest = new TextArea();
    private Button btSave = new Button("Save");
    private Button btBack = new Button("Back");
    private Button btMenu = new Button("Manin Menu");
    private Button btYes = new Button("Yes");
    
    public AddPatient ()    {
        //this.patien[this.patientID]= this.Patient( PatientName, PatientAge, Sex, PatientMedicalTest);
    }
    
    public AddPatient (int patientId)    {
        this.patien = patientId;  
        
    }
    
    public  void setPatientInformation(Stage primaryStage){
        
        Menu m = new Menu();
        GridPane root = new GridPane();
        
        
        root.setHgap(5);
        root.setVgap(5);
        root.add(new Label(""), 0, 0);
        root.add(new Label("PatientID:"), 0, 2);
        root.add(tfPatientID, 1, 2);
        root.add(new Label("Patient Name:"), 0, 3);
        root.add(tfPatientName, 1, 3);
        root.add(new Label("Age:"), 0, 4);
        root.add(tfPatientAge, 1, 4);
        root.add(new Label("Sex:"), 0, 5);
        root.add(tfSex, 1, 5);
        root.add(new Label("Which medical test he or she do :"), 0, 6);
        root.add(tfPatientMedicalTest, 1, 6);
        root.add(btSave, 1, 8);
        root.add(btBack, 1, 9);
        
        root.setAlignment(Pos.CENTER);
        tfPatientID.setAlignment(Pos.BOTTOM_LEFT);
        tfPatientName.setAlignment(Pos.BOTTOM_LEFT);
        tfPatientAge.setAlignment(Pos.BOTTOM_LEFT);
        tfSex.setAlignment(Pos.BOTTOM_LEFT);
        tfPatientMedicalTest.setStyle("-fx-font-alignment: center");
        //tfPatientMedicalTest.setAlignment(Pos.BOTTOM_RIGHT);
        
        GridPane.setHalignment(btSave, HPos.RIGHT);
        btSave.setOnAction(e -> {
            try {
                SavePatientInfo(primaryStage);
            } catch (IOException ex) {
                Logger.getLogger(AddPatient.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        GridPane.setHalignment(btSave, HPos.LEFT);
        
        btBack.setOnAction(e -> m.MainMenu(primaryStage));
        
        Scene scene = new Scene(root, 1000, 550);
        primaryStage.setTitle("Diagnostic Medical Test Information System \n - Add Patient ");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }
    
    private void SavePatientInfo(Stage primaryStage)throws IOException{
        
        /*
        http://stackoverflow.com/questions/5907338/how-to-convert-jtextfield-to-string-and-string-to-jtextfield      
        */
        int patientId = Integer.parseInt(tfPatientID.getText()); 
        ///////////////////////////////
        //AddPatient machID = new AddPatient();
       // machID.MachPatientIDAxist(patientId, primaryStage);
        //////////////////////////////
        
        AddPatient addPatientIDinfo = new AddPatient( patientId);
        int patientIds = patientId;
        addPatientIDinfo.setPatientID(patientIds);
        addPatientIDinfo.setPatient(patientIds);
        
        
        
        String patientName = tfPatientName.getText();
        addPatientIDinfo.setPatientName(patientName);
        
        int patientAge = Integer.parseInt(tfPatientAge.getText()); 
        addPatientIDinfo.setPatientAge(patientAge);
        
        String sex = tfSex.getText();
        addPatientIDinfo.setPatientSex(sex);
        
        String patientMedicalTest = tfPatientMedicalTest.getText();
        addPatientIDinfo.setPatientMedicalTest(patientMedicalTest);
        
        System.out.println("\n\tThe Record is Succesfully Saved");
        
        
/////////-----------------------/---------------/---------------/-------------------/-------------------/////////////////////////
        FileWriter fw=new FileWriter("C:\\Users\\User Rayhan\\Desktop\\CodeTest\\DMIS\\src\\file\\PatientInfo.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Patient Info:");
                bw.write(" Patient ID:"+patientId);
                bw.write("   Name"+patientName);
                bw.write("   Age"+patientAge);
                bw.write("   Sex"+sex);
                bw.write("   Sex"+patientMedicalTest);
                
		bw.newLine();
		bw.close();
        
        AddPatient SaveInfo = new AddPatient();
        SaveInfo.SaveMessage(primaryStage);
        
        
        
    }
    public void DataAdd(){
       
    }
    /*
    private  void MachPatientIDAxist(int pID, Stage primaryStage){
        //Scanner input = new Scanner(System.in); 
        ArrayList<Integer> IDpatient = new ArrayList<>();
        
        IDpatient.add(pID);
            int a=0;
            while (a <= IDpatient.size()){
                if(this.patientID[a] == pID){
                    //System.out.print("");
                    System.out.println("Patient ID Is Already Axist");
                    AddPatient w = new AddPatient();
                    w.Wrning(primaryStage);
                                                           
                    break;
                }
                else {
                    
                }
                a++;
            }
            if(this.patientID[a] != pID){
                    //System.out.print("");                   
            }        
    }
*/
    public void setPatientID (int patientId)    {
        patientID[patienNo] = patientId;  
        patienNo++;
    }
    public void setPatient (int patientId)    {
        patien = patientId;  
    }
    public void setPatientName(String patientName){
        PatientName[patienNo] = patientName;
    }
    public void setPatientAge(int patientAge){
        PatientAge[patienNo] = patientAge;
    }
    public void setPatientSex(String sex){
        Sex[patienNo] = sex;
    }
    public void setPatientMedicalTest(String patientMedicalTest){
        PatientMedicalTest[patienNo] = patientMedicalTest;
    }
    public int getPatientNo(){
        return patienNo;
    }
    public  int[] getPatientID(){
        return patientID;
    }
    public String[] getPatientName(){
        return PatientName;
    }
    public int[] getPatientAge(){
        return PatientAge;
    }
    public String[] getPatientSex(){
        return Sex;
    }
    public String[] getPatientMedicalTest(){
        return PatientMedicalTest;
    }
    
    
    protected void SaveMessage(Stage primaryStage){
        Menu m = new Menu();
        AddPatient back = new AddPatient();
        GridPane root = new GridPane();
        
        
        root.setHgap(5);
        root.setVgap(5);
        root.add(new Label(""), 0, 0);
        root.add(new Label(" Information has been successfully saved. :) "), 0, 2);
        root.add(btBack, 0, 4);
        root.add(btMenu, 3, 4);
        root.setAlignment(Pos.CENTER);
        
        //btBack.setOnAction(e -> back.setPatientInformation(primaryStage));
        btMenu.setOnAction(e -> m.MainMenu(primaryStage));
        
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Save Successfully");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
   
    private int Wrning(Stage primaryStage){
        Menu m = new Menu();
        
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.add(new Label(""), 0, 0);
        root.add(new Label(" This Patient ID is worng :( "), 0, 2);
        root.add(btBack, 0, 4);
        root.setAlignment(Pos.CENTER);
        
        btBack.setOnAction(e -> m.MainMenu(primaryStage));
        
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Warning !!!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        return 0;
    }
    
    
    
    /////////////////// Eddit Patient/////////////////////
    
    public void EditPatientInformation(int searchID, Stage primaryStage){
        AddPatient A = new AddPatient();
        int a=0;
        while (a <= patientID.length){
            try {
                if(this.patientID[a] == searchID){
                    
                    Scanner input = new Scanner(System.in);
                    System.out.println("Patient ID is Valid");
                    
                    A.EditPatientInformationTwo(primaryStage);
                    
                    break;
                }
                else {
                    
                }
                a++;
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Patient ID is wrong");
                                                
                 A.Wrning(primaryStage);
            }
        }
    }
    public void EditPatientInformationTwo(Stage primaryStage){
        Menu m = new Menu();
        AddPatient back = new AddPatient();
        GridPane root = new GridPane();
        
        
        root.setHgap(5);
        root.setVgap(5);
        root.add(new Label(""), 0, 0);
        root.add(new Label(" Patient ID is Valied :) "), 0, 2);
        root.add(new Label(" Are You Edit :) "), 0, 3);
        root.add(btYes, 0, 4);
        root.add(btBack, 3, 4);
        root.setAlignment(Pos.CENTER);
        
        btYes.setOnAction(e -> back.setPatientInformation(primaryStage));
        btBack.setOnAction(e -> m.MainMenu(primaryStage));
        
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Save Successfully");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void PatientInformation (Stage primaryStage){
        AddPatient addPatientID = new AddPatient();
        
        int[] PatientsID = addPatientID.getPatientID();
        String[] PatientsName = addPatientID.getPatientName();
        int[] PatientsAge = addPatientID.getPatientAge();
        String[] PatientsSex = addPatientID.getPatientSex();
        String[] PatientsMedicalTest = addPatientID.getPatientMedicalTest();
        
        Menu m = new Menu();
        GridPane root = new GridPane();
        root.setHgap(4);
        root.setVgap(4);
        root.add(btBack, 2, 15);
        root.add(new Label("PatientID:"), 2, 1);
        root.add(new Label(" Patient Name:"), 3, 1);
        root.add(new Label(" Age:"), 4, 1);
        root.add(new Label(" Sex:"), 5, 1);
        root.add(new Label(" Which medical test he or she do :"), 6, 1);
        int k = 2;
        int l = 2;
        for(int i = 0; i < addPatientID.getPatientNo(); i++)  {
            l = 2;
            root.add(new Label(""+PatientsID[i]), l, k);
            root.add(new Label(" "+PatientsName[i+1]), ++l, k);
            root.add(new Label(" "+PatientsAge[i+1]), ++l, k);
            root.add(new Label(" "+PatientsSex[i+1]), ++l, k);
            root.add(new Label(" "+PatientsMedicalTest[i+1]), ++l, k); 
            k++;
        }
        //tfPatientMedicalTest.setAlignment(Pos.BOTTOM_RIGHT);
        
        GridPane.setHalignment(btSave, HPos.RIGHT);
        
        btBack.setOnAction(e -> m.MainMenu(primaryStage));
        
        Scene scene = new Scene(root, 800, 400);
        primaryStage.setTitle("Diagnostic Medical Test Information System \n - Add Patient ");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    
}
