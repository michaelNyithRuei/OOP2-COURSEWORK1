/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grading.system;

import java.util.Scanner;

/**
 *
 * @author mc nyith
 */
public class GradingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mark[] = new int[6];
        int i;
        String grd;
        float sum=0, avg;
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first course unit");	
        String a = scan.next();
        System.out.println("Hve entered " + a);	
        
        System.out.println("Enter the second course unit");	
        String b = scan.next();
        System.out.println("Hve entered " + b);	
        
        System.out.println("Enter the third course unit");	
        String c = scan.next();
        System.out.println("Hve entered " + c);
        
        System.out.println("Enter fourth course unit");	
        String d = scan.next();
        System.out.println("Hve entered " + d);	
        
        System.out.println("Enter the fifth course unit");	
        String e = scan.next();
        System.out.println("Hve entered " + e);
        
        System.out.println("Enter the sixth course unit");	
        String f = scan.next();
        System.out.println("Hve entered " + f);	
        
        System.out.print("Enter Marks Obtained in above 6 course units : ");
        for(i=0; i<6; i++)
        {
            mark[i] = scan.nextInt();
            sum = sum + mark[i];
        }
		
        avg = sum/6;
		
        System.out.print("Your Grade is " + avg);
        
         if(avg>=80 && avg<=100){
            
            grd= "A"; 
            System.out.println("A");
        }
        else if(avg>=70 &&avg<80){
          grd= "B";  
          System.out.println("B");
        }else if(avg>=60&&avg<70){
            grd= "C";
            System.out.println("C");
        }else if(avg>=50&&avg<60){
            grd= "D";
            System.out.println("D");
        }
        else if (avg>40&&avg<50)
        {
            System.out.println("F");
        }else{
            System.out.println("invalid");
    }
    }
}
    
    

