package application;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controll
{

	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
    @FXML
    private Label checkRegister;

    @FXML
    private Button butt2;

    @FXML
    private Button clearButtonLog;

    @FXML
    private PasswordField logPass;

    @FXML
    private CheckBox showPassReg;

    @FXML
    private Label logInfo;

    @FXML
    private TextField regName;

    @FXML
    private PasswordField regPassConf;

    @FXML
    private TextField regSurname;

    @FXML
    private TextField regLogin;

    @FXML
    private PasswordField regPass;

    @FXML
    private TextField regEmail;

    @FXML
    private Button clearButtonReg;

    @FXML
    private Button loginButton;

    @FXML
    private CheckBox showPassLog;

    @FXML
    private TextField logLogin;
    
    @FXML
    private Label mailInfo;

    @FXML
    private Label infoReg;
    
    String permission= "user";    
    Database db =  new Database();
  
    @FXML
    void showPassLog(ActionEvent event) {
   	 if (showPassLog.isSelected())
   	 {
   		 logPass.setPromptText(logPass.getText());
   		 logPass.setText(""); 
   		 logPass.setDisable(true);
   	 }
   	 else
   	 {
   		 logPass.setPromptText(logPass.getText());
   		 logPass.setText(""); 
   	     logPass.setDisable(false);
   	 }
    }


    @FXML
    void showPassReg(ActionEvent event) {
    	if (showPassReg.isSelected())
   	 {
   		 regPass.setPromptText(regPass.getText());
   		 regPass.setText(""); 
   		 regPass.setDisable(true);
   		 regPassConf.setPromptText(regPassConf.getText());
   		 regPassConf.setText(""); 
   		 regPassConf.setDisable(true);
   	 }
   	 else
   	 {
   		 regPass.setPromptText(regPass.getText());
   		 regPass.setText(""); 
   	     regPass.setDisable(false);
   	     regPassConf.setPromptText(regPassConf.getText());
   		 regPassConf.setText(""); 
   		 regPassConf.setDisable(false);
   	 }
    }

    @FXML
    void clearFieldLog(ActionEvent event) {
    	logLogin.setText("");
    	logPass.setText("");
    	logInfo.setText("");
    }

    @FXML
    void clearFieldReg(ActionEvent event) {
		regName.setText("");
    	regSurname.setText("");
    	regLogin.setText("");
    	regEmail.setText("");
    	regPass.setText("");
    	regPassConf.setText("");
    	checkRegister.setText("");
    }

    @FXML
    void regSend(ActionEvent event) throws SQLException 
    {
    	db.Connector();
    	
			String imie = regName.getText();
	    	String nazwisko = regSurname.getText();
	    	String loginReg = regLogin.getText();
	    	String email = regEmail.getText();
	    	String passwordReg = regPass.getText();
	    	
	        String dateRegistration = dateFormat.format(date);
	        Pattern pemail = Pattern.compile("^[a-zA-Z0-9_]{2,48}@[a-zA-Z0-9]{2,16}.[a-zA-Z]{1,6}$");
	    	Matcher mmail = pemail.matcher(email);
	    	Pattern ppass = Pattern.compile("^.*(?=.{5,})(?=.*[a-zA-Z])(?=.*\\d)(?=.*[!#$%&? \"]).*$");
	    	Matcher mpass = ppass.matcher(passwordReg);
	    	if(regPass.getText().equals(regPassConf.getText()))
	    	{ 
	        if(mmail.find()) 
	        {
	        if(mpass.find())
	        {
	    	
	        	if(db.isInRegistration(loginReg , email )) 
	    	{
	    		checkRegister.setText("Login lub mail s¹ ju¿ u¿yte!!");
	    	}
	    	else
	    	{
	    		db.isRegistration(imie, nazwisko, loginReg, email, passwordReg, dateRegistration, permission);
	            checkRegister.setText("Pomyœlnie utworzono konto!!");
	    	}
	        }
	        else 
	        {
	        	infoReg.setText("has³o jest nie poprawne");
	        }
	        }
	        else
	        {
	        	infoReg.setText("mail jest nie poprawny");
	        }
	        
	        }
	        else
	        {
    		checkRegister.setText("Wprowadzone has³a nie s¹ takie same!!");
	        }
    
    }
    
    @FXML
    void logSend(ActionEvent event) throws SQLException {
    	 System.out.println("login: "+logLogin.getText());
    	 String login=logLogin.getText();
    	 System.out.println(login);
    	 System.out.println("has³o: "+logPass.getText());
    	 String password= logPass.getText();
    	 System.out.println(password);
    	 db.Connector();
    	
    	 
    	 try {
 			if(db.isLogin(login, password))
 			{
 				logInfo.setText("Uda³o siê zalogowaæ");
 				try {
 					if(db.permissionLog(login).equals("user"))
 					{
 						Parent root = FXMLLoader.load(getClass().getResource("/formatka/formatkaUser.fxml"));
 	 					Scene scene = new Scene(root,600,400);
 	 					Stage stage =new Stage();
 	 					stage.setScene(scene);
 	 					stage.show();
 					}
 					else
 					{
 						Parent root = FXMLLoader.load(getClass().getResource("/formatka/formatkaAdmin.fxml"));
 	 					Scene scene = new Scene(root,600,400);
 	 					Stage stage =new Stage();
 	 					stage.setScene(scene);
 	 					stage.show();
 					}
 				} catch(Exception e) {
 					e.printStackTrace();
 				}
 			}else
 			{
 				logInfo.setText("B³êdne dane");
 			}
 		} catch (SQLException e) {
 			e.printStackTrace();
 		}
    }
}
