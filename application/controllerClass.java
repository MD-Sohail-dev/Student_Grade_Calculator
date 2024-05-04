package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

import javafx.fxml.Initializable;

public class controllerClass implements Initializable {
	
	 @FXML
	    private TextField AV3;

	    @FXML
	    private TextField AV5;

	    @FXML
	    private TextField AV6;

	    @FXML
	    private TextField G3;

	    @FXML
	    private TextField G5;

	    @FXML
	    private TextField G6;

	    @FXML
	    private TextField TM3;

	    @FXML
	    private TextField TM5;

	    @FXML
	    private TextField TM6;

	    @FXML
	    private Button calc3;

	    @FXML
	    private Button calc5;

	    @FXML
	    private Button calc6;

	    @FXML
	    private Button three;
	    
	    @FXML
	    private Button five;

	    @FXML
	    private Button six;


	    @FXML
	    private TextField subject3_s1;

	    @FXML
	    private TextField subject3_s2;

	    @FXML
	    private TextField subject3_s3;

	    @FXML
	    private TextField subject5_s1;

	    @FXML
	    private TextField subject5_s2;

	    @FXML
	    private TextField subject5_s3;

	    @FXML
	    private TextField subject5_s4;

	    @FXML
	    private TextField subject5_s5;

	    @FXML
	    private TextField subject6_s1;

	    @FXML
	    private TextField subject6_s2;

	    @FXML
	    private TextField subject6_s3;

	    @FXML
	    private TextField subject6_s4;

	    @FXML
	    private TextField subject6_s5;

	    @FXML
	    private TextField subject6_s6;

	    @FXML
	    private AnchorPane subject_3;

	    @FXML
	    private AnchorPane subject_5;

	    @FXML
	    private AnchorPane subject_6;
	    
	   
	    
	    public void switchForm(ActionEvent event)
	    {
	    	
	    
	    	if(event.getSource()==three)
	    	{
	    		subject_3.setVisible(true);
	    		subject_5.setVisible(false);
	    		subject_6.setVisible(false);
	    		
	    	}
	    	else if(event.getSource()==five)
	    	{
	    		subject_3.setVisible(false);
	    		subject_5.setVisible(true);
	    		subject_6.setVisible(false);
	    		
	    		
	    	}
	    	else if(event.getSource()==six)
	    	{
	    		subject_3.setVisible(false);
	    		subject_5.setVisible(false);
	    		subject_6.setVisible(true);	
	    		
	    	}
	    	
	    }
	        	    	
	    
	    public void calculate3() {
	        Alert alert;
	        
	        try {
	            if (subject3_s1.getText().isEmpty() || subject3_s2.getText().isEmpty() || subject3_s3.getText().isEmpty()) {
	                alert = new Alert(AlertType.ERROR);
	                alert.setTitle("Error");
	                alert.setContentText("Please fill all the blanks!");
	                alert.show(); // Display the alert
	                return; // Stop processing further
	            }

	            int a, b, c;
	            a = Integer.parseInt(subject3_s1.getText());
	            b = Integer.parseInt(subject3_s2.getText());
	            c = Integer.parseInt(subject3_s3.getText());

	            if (a > 100 || b > 100 || c > 100 || a < 0 || b < 0 || c < 0) {
	                alert = new Alert(AlertType.ERROR);
	                alert.setTitle("Error");
	                alert.setContentText("Please fill marks between 0 to 100!");
	                alert.show(); // Display the alert
	                // Clear TM3 and AV3 fields
	                TM3.setText("");
	                AV3.setText("");
	                return; // Stop processing further
	            }

	            // Calculate sum and average
	            float sum = a + b + c;
	            float avg = sum / 3;

	            // Set sum and average in text fields
	            TM3.setText(Float.toString(sum));
	            AV3.setText(Float.toString(avg));

	            // Grade calculation based on average
	            if (avg < 40) {
	                G3.setText("F (Fail)");
	            } else if (avg >= 40 && avg <= 49) {
	                G3.setText("D (Below Average)");
	            } else if (avg >= 50 && avg <= 59) {
	                G3.setText("C (Fair)");
	            } else if (avg >= 60 && avg <= 69) {
	                G3.setText("B (Good)");
	            } else if (avg >= 70 && avg <= 79) {
	                G3.setText("A (Very Good)");
	            } else if (avg >= 80 && avg <= 89) {
	                G3.setText("E (Excellent)");
	            } else if (avg >= 90 && avg <= 100) {
	                G3.setText("O (Outstanding)");
	            } else {
	                G3.setText("Invalid!");
	            }

	        } catch (NumberFormatException ex) {
	            alert = new Alert(AlertType.ERROR);
	            alert.setTitle("Error");
	            alert.setContentText("Please enter valid integer values!");
	            alert.show(); // Display the alert
	            // Clear TM3 and AV3 fields
	            TM3.setText("");
	            AV3.setText("");
	            return; // Stop processing further
	        }
	    }
	    
	
public void AlertShow(String title,String content) {
	Alert alert ;
	alert = new Alert(AlertType.ERROR);
	alert.setTitle(title);
	alert.setContentText(content);
	alert.showAndWait();
}
	    
	    public void calculate5() {
	        Alert alert;
	        
	        try {
	            if (subject5_s1.getText().isEmpty() || subject5_s2.getText().isEmpty() || subject5_s3.getText().isEmpty()) {
	                AlertShow("Error","Please fill all the blanks!");
	                return; // Stop processing further
	            }

	            int a, b, c,d,e;
	            a = Integer.parseInt(subject5_s1.getText());
	            b = Integer.parseInt(subject5_s2.getText());
	            c = Integer.parseInt(subject5_s3.getText());
	            d = Integer.parseInt(subject5_s4.getText());
	            e = Integer.parseInt(subject5_s5.getText());

	            if (a>100 || b>100 ||c>100|| d>100||e>100|| a < 0 || b < 0 || c < 0||d<0||e<0) {
	               
	            	AlertShow("Error","Please fill marks between 0 to 100!");
	                // Clear TM3 and AV3 fields
	                TM5.setText("");
	                AV5.setText("");
	                return; // Stop processing further
	            }

	            // Calculate sum and average
	            float sum = a + b + c+d+e;
	            float avg = sum / 5;

	            // Set sum and average in text fields
	            TM5.setText(Float.toString(sum));
	            AV5.setText(Float.toString(avg));

	            // Grade calculation based on average
	            if (avg < 40) {
	                G5.setText("F (Fail)");
	            } else if (avg >= 40 && avg <= 49) {
	                G5.setText("D (Below Average)");
	            } else if (avg >= 50 && avg <= 59) {
	                G5.setText("C (Fair)");
	            } else if (avg >= 60 && avg <= 69) {
	                G5.setText("B (Good)");
	            } else if (avg >= 70 && avg <= 79) {
	                G5.setText("A (Very Good)");
	            } else if (avg >= 80 && avg <= 89) {
	                G5.setText("E (Excellent)");
	            } else if (avg >= 90 && avg <= 100) {
	                G5.setText("O (Outstanding)");
	            } else {
	                G5.setText("Invalid!");
	            }

	        } catch (NumberFormatException e) {
	            AlertShow("Error","Please enter valid integer values!");
	           
	            TM5.setText("");
	            AV5.setText("");
	            return; // Stop processing further
	        }
	    }
	    	    
	
	    public void calculate6() {
	        Alert alert;
	        
	        try {
	            if (subject6_s1.getText().isEmpty() || subject6_s2.getText().isEmpty() || subject6_s3.getText().isEmpty()) {
	                AlertShow("Error","Please fill all the blanks!");
	                return; // Stop processing further
	            }

	            int a, b, c,d,e,f;
	            a = Integer.parseInt(subject6_s1.getText());
	            b = Integer.parseInt(subject6_s2.getText());
	            c = Integer.parseInt(subject6_s3.getText());
	            d = Integer.parseInt(subject6_s4.getText());
	            e = Integer.parseInt(subject6_s5.getText());
	            f = Integer.parseInt(subject6_s6.getText());

	            if (a>100 || b>100 ||c>100|| d>100||e>100||f>100|| a < 0 || b < 0 || c < 0||d<0||e<0||f<0) {
	               
	            	AlertShow("Error","Please fill marks between 0 to 100!");
	                // Clear TM3 and AV3 fields
	                TM5.setText("");
	                AV5.setText("");
	                return; // Stop processing further
	            }

	            // Calculate sum and average
	            float sum = a + b + c+d+e+f;
	            float avg = sum / 6;

	            // Set sum and average in text fields
	            TM6.setText(Float.toString(sum));
	            AV6.setText(Float.toString(avg));

	            // Grade calculation based on average
	            if (avg < 40) {
	                G6.setText("F (Fail)");
	            } else if (avg >= 40 && avg <= 49) {
	                G6.setText("D (Below Average)");
	            } else if (avg >= 50 && avg <= 59) {
	                G6.setText("C (Fair)");
	            } else if (avg >= 60 && avg <= 69) {
	                G6.setText("B (Good)");
	            } else if (avg >= 70 && avg <= 79) {
	                G6.setText("A (Very Good)");
	            } else if (avg >= 80 && avg <= 89) {
	                G6.setText("E (Excellent)");
	            } else if (avg >= 90 && avg <= 100) {
	                G6.setText("O (Outstanding)");
	            } else {
	                G6.setText("Invalid!");
	            }

	        } catch (NumberFormatException e) {
	            AlertShow("Error","Please enter valid integer values!");
	           
	            TM6.setText("");
	            AV6.setText("");
	            return; // Stop processing further
	        }
	    }
	    	    
	    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
	}

	
}
