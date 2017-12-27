/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg2;
import java.util.Scanner;
/**
 *
 * @author lenovo-win10
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
   
        Scanner sc=new Scanner(System.in);
        int num,i,score,max=0;
        String name = null; 
        System.out.println("enter the num");
      num =sc.nextInt();
      for(i=0;i<num;i++)
      {
          System.out.println("enter the name and score");
          name=sc.next();
          score=sc.nextInt();
          
          if(score>max)
          {
              max=score;
               
           }
      }
      System.out.println("the max score is"+max+"the student name is"+name);
    }
}

    }
}






