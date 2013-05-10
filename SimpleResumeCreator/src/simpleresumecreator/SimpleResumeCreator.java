/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleresumecreator;

import java.io.FileOutputStream;
 
import com.itextpdf.text.Document;
 
import com.itextpdf.text.Paragraph;
 
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JLabel;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class SimpleResumeCreator {

    public static void main(String args[]) {
     

        
try {
    
    String first_name;
    String last_name;
    String address;
    String landline;
    String mobile;
    String email;
    String undergrad_univ;
    String undergrad_year;
    String grad_univ;
    String grad_year;
    String work_exp1;
    String work_exp2;
    String work_exp3;
    String acad_proj1;
    String acad_proj2;
    String acad_paper1;
    String acad_paper2;
    String work_proj1;
    String work_proj2;
    String achievement1;
    String achievement2;
    String undergrad_gpa;
    String grad_gpa;
    
    Scanner user_input = new Scanner( System.in );
    
    System.out.println("Enter your first name");
    first_name=user_input.next();
    
    System.out.println("Enter your last name");
    last_name=user_input.next();
    
    System.out.println("Enter your address");
    address=user_input.next();
    
    System.out.println("Enter your landline");
    landline=user_input.next();
    
    System.out.println("Enter your mobile");
    mobile=user_input.next();
    
    System.out.println("Enter your email");
    email=user_input.next();
    
    System.out.println("Enter your undergrad university");
    undergrad_univ=user_input.next();
    
    System.out.println("Enter your undergrad years");
    undergrad_year=user_input.next();
    
    System.out.println("Enter your grad university"); 
    grad_univ=user_input.next();
    
    System.out.println("Enter your grad year");
    grad_year=user_input.next();
    
    System.out.println("Enter your first work experience");
    work_exp1=user_input.next();
    
    
    System.out.println("Enter your second work experience");
    work_exp2=user_input.next();
    
    
    System.out.println("Enter your third work experience");
    work_exp3=user_input.next();
    
    
    
    System.out.println("Enter your first academic project");
    acad_proj1=user_input.next();
    
    System.out.println("Enter your second academic project");
    acad_proj2=user_input.next();
    
    System.out.println("Enter your first work project");
    work_proj1=user_input.next();
    
    System.out.println("Enter your second work project");
    work_proj2=user_input.next();
    
    System.out.println("Enter your first achievement if any");
    achievement1=user_input.next();
    
    System.out.println("Enter your second achievement if any");
    achievement2=user_input.next();
    
    System.out.println("Enter your undergrad gpa");
    undergrad_gpa=user_input.next();
    
    System.out.println("Enter your grad gpa");
    grad_gpa=user_input.next();
    
    
    
    
    
    
    
   
 
Document document = new Document();
 
PdfWriter.getInstance(document, new FileOutputStream("Resume.pdf"));
 
document.open();
 
document.add(new Paragraph("RESUME"));

document.add(new Paragraph(""));

document.add(new Paragraph("First name             :"+first_name));

document.add(new Paragraph(""));

document.add(new Paragraph("Last name              :"+last_name));

document.add(new Paragraph(""));

document.add(new Paragraph("Address                :"+address));

document.add(new Paragraph(""));

document.add(new Paragraph("Landline               :"+landline));

document.add(new Paragraph(""));

document.add(new Paragraph("Mobile                 :"+mobile));

document.add(new Paragraph(""));

document.add(new Paragraph("E-mail                 :"+email));

document.add(new Paragraph(""));

document.add(new Paragraph("Undergrad University   :"+undergrad_univ));

document.add(new Paragraph(""));

document.add(new Paragraph("Undergrad Year         :"+undergrad_year));

document.add(new Paragraph(""));

document.add(new Paragraph("Grad University        :"+grad_univ));

document.add(new Paragraph(""));

document.add(new Paragraph("Grad Year              :"+grad_year));

document.add(new Paragraph(""));

document.add(new Paragraph("First Workexperience   :"+work_exp1));

document.add(new Paragraph(""));

document.add(new Paragraph("Second Workexperience  :"+work_exp2));

document.add(new Paragraph(""));

document.add(new Paragraph("Third Workexperience   :"+work_exp3));

document.add(new Paragraph(""));

document.add(new Paragraph("First Academic Project :"+acad_proj1));

document.add(new Paragraph(""));

document.add(new Paragraph("Second Academic Project:"+acad_proj2));

document.add(new Paragraph(""));

document.add(new Paragraph("First Work Project     :"+work_proj1));

document.add(new Paragraph(""));

document.add(new Paragraph("Second Work Project    :"+work_proj2));

document.add(new Paragraph(""));

document.add(new Paragraph("First Achievement      :"+achievement1));

document.add(new Paragraph(""));

document.add(new Paragraph("Second Achievement     :"+achievement2));

document.add(new Paragraph(""));

document.add(new Paragraph("Undergrad GPA          :"+undergrad_gpa));

document.add(new Paragraph(""));

document.add(new Paragraph("Grad GPA               :"+grad_gpa));

document.add(new Paragraph(""));

//document.add(new Paragraph("This is my first PDF generated by iText"));
 
document.close();
 
} catch (Exception e) {
 
System.out.println(e);
 
}
 

    }
}


