/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.java.pkgelse.pkgif;
import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class CalculatorJavaElseIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		double num1,num2,ans;
                boolean a = true;
		char sign, q;  
                
                System.out.print("this is a calculator, +,-,/,*,^ accepted. press q to quit program.\nenter the first digit: "); 
              
		
		num2=input.nextInt(); 
                
                System.out.print("enter an operation: "); 
		sign=input.next().charAt(0); 
		
		System.out.print("enter the second digit: ");
		num1=input.nextInt();
                
       while (a) {
                System.out.print("quit program? ");
		q=input.next().charAt(0);	
           
		System.out.print("enter the first digit: "); 
		
		num2=input.nextInt(); 
                
                System.out.print("enter an operation: "); 
		sign=input.next().charAt(0); 
		
		System.out.print("enter the second digit: ");
		num1=input.nextInt();
		
                
		
		
		if (sign == '+' ) {
			ans=num1 + num2;
			System.out.println(num1 +" "+sign +" "+num2 +"= "+" "+ ans );
		}
		else if(sign == '-')
		{
			ans=num1-num2;
			System.out.println(num1 +" "+sign +" "+num2 +"= "+" "+ ans );
		}
		else if(sign == '/'){
				ans=num1/num2;
				System.out.println(num1 +" "+sign +" "+num2 +"= "+" "+ ans );
	    }
		else if(sign == '*'){
					ans=num1*num2;
					System.out.println(num1 +" "+sign +" "+num2 +"= "+" "+ ans );
		}
                else if (sign == '^') {
                                ans=Math.pow(num1,num2);
                                System.out.println(num1 + " "+sign +" "+num2 +"= "+" "+ ans );
                                
                }
                else if (q == 'n') {
                               
                
                }
                else if (q == 'y') {
                                System.out.println();
                break;
       }
                else 
                    
		System.out.println("your input is incorrect, please try again.");
       }
                    
                
       }
    }
    

