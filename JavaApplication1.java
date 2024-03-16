
package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows and coloumns of matrix");
     int r= in.nextInt();
     int c = in.nextInt();
     int first_matrix[][]=new int[r][c];
     int second_matrix[][]=new int[r][c];
     int sum[][]=new int [r][c];
     for (int i =0 ; i<r;i++){
         for (int k=0;k<c;k++){
             first_matrix[i][k]=in.nextInt();
         }
     }
        System.out.println("enter the elements of 2ed matrix");
      for (int i =0 ; i<r;i++){
         for (int k=0;k<c;k++){
            second_matrix[i][k]=in.nextInt();
         }
     }
       for (int i =0 ; i<r;i++){
         for (int k=0;k<c;k++){
             sum[i][k]=first_matrix[i][k]+second_matrix[i][k];
         }
     }
       System.out.println("the sum of 2 matrices equals to = ");
       for (int i =0 ; i<r;i++){
         for (int k=0;k<c;k++){
             System.out.print(sum[i][k]+"\t");
         }
           System.out.println();
     }
       
    }
    
}
