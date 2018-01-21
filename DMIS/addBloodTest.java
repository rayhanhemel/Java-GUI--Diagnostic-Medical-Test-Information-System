
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class addBloodTest extends AddPatient{
    
    private int MachID;
    
    private int BloodPatient;// interface 
    private static int BloodTestpatienNo;
    private static  int[] BloodpatientID = new int[1000];   
    
    private static float[] sugerFasting = new float[1000];
    private static float[] sugarRandom = new float[1000];
    private static float[] bloodUrea = new float[1000];
    private static float[] bloodProtin = new float[1000];
    private static float[] bloodCholestrol = new float[1000];
    private static float[] bloodBilirubin = new float[1000];
    
    private static String[] bloodGroup = new String[1000];
    private static String[] bloodHBsAG = new String[1000];
    
    private TextField tfBTPatientID = new TextField();
    private TextField tfBloodGropup = new TextField();
    private TextField tfSugerFasting = new TextField();
    private TextField tfSugerRandom = new TextField();
    private TextField tfBloodUrea = new TextField();
    private TextField tfSProtin = new TextField();
    private TextField tfSCholestrol = new TextField();
    private TextField tfSBilirubin = new TextField();
    private TextField tfHBsag = new TextField();
    private Button btSave = new Button("Save");
    private Button btBack = new Button("Back");
    private Button btMenu = new Button("Manin Menu");
    
    public addBloodTest ()    {
        //this.patien[this.patientID]= this.Patient( PatientName, PatientAge, Sex, PatientMedicalTest);
    }
    public addBloodTest (int BloodPatientID)    {
        this.BloodPatient = BloodPatientID;
    }
    
    public void setBloodTestInformation(Stage primaryStage){
        
        AddMedicalTest m = new AddMedicalTest();
        GridPane root = new GridPane();
        
        
        root.setHgap(5);
        root.setVgap(5);
        root.add(new Label(""), 0, 0);
        
        root.add(new Label("PatientID:"), 0, 2);
        root.add(tfBTPatientID, 1, 2);
        
        root.add(new Label("Blood Group:"), 0, 3);
        root.add(tfBloodGropup, 1, 3);
        
        root.add(new Label("Sger Fasting:"), 0, 4);
        root.add(tfSugerFasting, 1, 4);
        root.add(new Label("mmol/l."), 2, 4);
        
        root.add(new Label("Sger Random:"), 0, 5);
        root.add(tfSugerRandom, 1, 5);
        root.add(new Label("mmol/l."), 2, 5);
        
        root.add(new Label("Blood Uria:"), 0, 6);
        root.add(tfBloodUrea, 1, 6);
        root.add(new Label("mg/dl."), 2, 6);
        
        root.add(new Label("S. Protin:"), 0, 7);
        root.add(tfSProtin, 1, 7);
        root.add(new Label("gm/l."), 2, 7);
        
        root.add(new Label("S. Colestrol:"), 0, 8);
        root.add(tfSCholestrol, 1, 8);
        root.add(new Label("mg/dl."), 2, 8);
        
        root.add(new Label("S. Bilirubin:"), 0, 9);
        root.add(tfSBilirubin, 1, 9);
        root.add(new Label("mg/dl."), 2, 9);
        
        root.add(new Label("HBsAG"), 0, 10);
        root.add(tfHBsag, 1, 10);
        root.add(new Label("Positive/Negetive"), 2, 10);
        
        root.add(btSave, 1, 11);
        root.add(btBack, 1, 12);
        
        root.setAlignment(Pos.CENTER);
        tfBTPatientID.setAlignment(Pos.BOTTOM_RIGHT);
        tfBloodGropup.setAlignment(Pos.BOTTOM_RIGHT);
        tfSugerFasting.setAlignment(Pos.BOTTOM_RIGHT);
        tfSugerRandom.setAlignment(Pos.BOTTOM_RIGHT);
        tfBloodUrea.setAlignment(Pos.BOTTOM_RIGHT);
        tfSProtin.setAlignment(Pos.BOTTOM_RIGHT);
        tfSCholestrol.setAlignment(Pos.BOTTOM_RIGHT);
        tfSBilirubin.setAlignment(Pos.BOTTOM_RIGHT);
        tfHBsag.setAlignment(Pos.BOTTOM_RIGHT);
        
        //tfPatientMedicalTest.setAlignment(Pos.BOTTOM_RIGHT);
        
        GridPane.setHalignment(btSave, HPos.RIGHT);
        btSave.setOnAction(e -> {
            try {
                SaveBloodTestInfo(primaryStage);
            } catch (IOException ex) {
                Logger.getLogger(AddPatient.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        GridPane.setHalignment(btSave, HPos.LEFT);
        
        btBack.setOnAction(e -> m.MedicalMenu(primaryStage));
        
        Scene scene = new Scene(root, 1000, 550);
        primaryStage.setTitle("Diagnostic Medical Test Information System \n - Add Patient ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void SaveBloodTestInfo (Stage primaryStage)throws IOException {
        
        
        int patientId = Integer.parseInt(tfBTPatientID.getText()); 
        addBloodTest addBloodTestIDinfo = new addBloodTest( patientId);
        int BloodpatientIds = patientId;
        addBloodTestIDinfo.setBloodTestPatientID(BloodpatientIds);
        addBloodTestIDinfo.setBloodTestPatient(BloodpatientIds);
        
        String BloodGroup = tfBloodGropup.getText();
        addBloodTestIDinfo.setBloodGroup(BloodGroup);
        
        float SugerFasting = Float.parseFloat(tfSugerFasting.getText());
        addBloodTestIDinfo.setSugerFasting(SugerFasting);
        
        float SugarRandom = Float.parseFloat(tfSugerRandom.getText());
        addBloodTestIDinfo.setSugarRandom(SugarRandom);
        
        float BloodUrea  = Float.parseFloat(tfBloodUrea.getText());
        addBloodTestIDinfo.setBloodUrea(BloodUrea);
        
        float BloodProtin = Float.parseFloat(tfSProtin.getText());
        addBloodTestIDinfo.setBloodProtin(BloodProtin);
        
        float BloodCholestrol = Float.parseFloat(tfSCholestrol.getText());
        addBloodTestIDinfo.setBloodCholestrol(BloodCholestrol);
        
        float BloodBilirubin =  Float.parseFloat(tfSBilirubin.getText());
        addBloodTestIDinfo.setBloodBilirubin(BloodBilirubin);
        
        String BloodHBsAG = tfHBsag.getText();
        addBloodTestIDinfo.setBloodHBsAG(BloodHBsAG);
        System.out.println("\n\tThe Record is Succesfully Saved");
        
        FileWriter fw=new FileWriter("C:\\Users\\User Rayhan\\Desktop\\CodeTest\\DMIS\\src\\file\\BloodTestInfo.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Patient Info:");
                bw.write(" Patient ID:"+patientId);
                bw.write("   Blood Group"+BloodGroup);
                bw.write("   Suger Fasting"+SugerFasting);
                bw.write("   Blood Urea"+BloodUrea);
                bw.write("   S. Protin"+BloodProtin);
                bw.write("   Cholestrol"+BloodCholestrol);
                bw.write("   Bilirubin"+BloodBilirubin);
                bw.write("   HBsAG"+BloodHBsAG);
                
		bw.newLine();
		bw.close();
       
        AddPatient SaveInfo = new AddPatient();
        SaveInfo.SaveMessage(primaryStage);
    }
    protected void SaveMessage(Stage primaryStage){
        super.SaveMessage(primaryStage);
    }
    
    
    public void setBloodTestPatientID (int patientId)    {
        BloodpatientID[BloodTestpatienNo] = patientId;  
        BloodTestpatienNo++;
    }
    public void setBloodTestPatient(int patientId){
         BloodPatient = patientId;
    }
    public void setBloodGroup(String BloodGroup){
        bloodGroup[BloodTestpatienNo] = BloodGroup;
    }
    public void setSugerFasting(float SugerFasting){
        sugerFasting[BloodTestpatienNo] = SugerFasting;
    }
    public void setSugarRandom(float SugarRandom){
        sugarRandom[BloodTestpatienNo] = SugarRandom;
    }
    public void setBloodUrea(float BloodUrea){
        bloodUrea[BloodTestpatienNo] = BloodUrea;
    }
    public void setBloodProtin(float BloodProtin){
        bloodProtin[BloodTestpatienNo] = BloodProtin;
    }
    public void setBloodCholestrol(float BloodCholestrol){
        bloodCholestrol[BloodTestpatienNo] = BloodCholestrol;
    }
    public void setBloodBilirubin(float BloodBilirubin){
        bloodBilirubin[BloodTestpatienNo] = BloodBilirubin;
    }
    public void setBloodHBsAG(String BloodHBsAG){
        bloodHBsAG[BloodTestpatienNo] = BloodHBsAG;
    }
    public int getBloodTestPatientNo(){
        return BloodTestpatienNo;
    }
    public  int[] getBloodTestPatientID(){
        return BloodpatientID;
    }
    public String[] getBloodGroup(){
        return bloodGroup;
    }
    public float[] getSugerFasting(){
        return sugerFasting;
    }
    public float[] getSugarRandom(){
        return sugarRandom;
    }
    public float[] getBloodUrea(){
        return bloodUrea;
    }
    public float[] getBloodProtin(){
        return bloodProtin;
    }
    public float[] getBloodCholestrol(){
        return bloodCholestrol;
    }
    public float[] getBloodBilirubin(){
        return bloodBilirubin;
    }
    public String[] getBloodHBsAG(){
        return bloodHBsAG;
    }
    
    
    public void BloodTestInformation (Stage primaryStage){
        addBloodTest addPatientID = new addBloodTest();
        
        int[] PatientsID = addPatientID.getBloodTestPatientID();
        String[] BloodGroup = addPatientID.getBloodGroup();
        float[] SugerFasting = addPatientID.getSugerFasting();
        float[] SugerRandom = addPatientID.getSugarRandom();
        float[] BloodUria = addPatientID.getBloodUrea();
        float[] BloodProtin = addPatientID.getBloodProtin();
        float[] BloodCholestrol = addPatientID.getBloodCholestrol();
        float[] BloodBilirubin = addPatientID.getBloodBilirubin();
        String[] BloodHBsAG = addPatientID.getBloodHBsAG();
        
        Menu m = new Menu();
        GridPane root = new GridPane();
        root.setHgap(4);
        root.setVgap(4);
        root.add(btBack, 2, 15);
        root.add(new Label("PatientID"), 2, 1);
        root.add(new Label(" BloodGroup"), 3, 1);
        root.add(new Label(" SugerFasting"), 4, 1);
        root.add(new Label(" SugerRandom"), 5, 1);
        root.add(new Label(" Uria"), 6, 1);
        root.add(new Label(" Protin"), 7, 1);
        root.add(new Label(" Cholestrol"), 8, 1);
        root.add(new Label(" Bilurubin"), 9, 1);
        root.add(new Label(" HBsG"), 10, 1);
        int k = 2;
        int l = 2;
        for(int i = 0; i < addPatientID.getBloodTestPatientNo(); i++)  {
            l = 2;
            root.add(new Label(""+PatientsID[i]), l, k);
            root.add(new Label("  "+BloodGroup[i+1]), ++l, k);
            root.add(new Label("  "+SugerFasting[i+1]), ++l, k);
            
            root.add(new Label("  "+BloodUria[i+1]), ++l, k);
            
            root.add(new Label("  "+BloodProtin[i+1]), ++l, k); 
            root.add(new Label("  "+BloodCholestrol[i+1]), ++l, k);
            root.add(new Label("  "+BloodBilirubin[i+1]), ++l, k);
            root.add(new Label("  "+BloodHBsAG[i+1]), ++l, k); 
            k++;
            
        }
        GridPane.setHalignment(btSave, HPos.RIGHT);
        
        btBack.setOnAction(e -> m.MainMenu(primaryStage));
        
        Scene scene = new Scene(root, 800, 400);
        primaryStage.setTitle("Diagnostic Medical Test Information System \n - view Patient ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
