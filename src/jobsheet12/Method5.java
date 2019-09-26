/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet12;
import java.util.Scanner;
/**
 *
 * @author HP 242
 */
public class Method5 {
    public static int hitung(int a, int b,int c){
        
    int nilaiterbesar;
    if(a>b && a>c){
        nilaiterbesar = a;
    }else{
        if(b>c){
            nilaiterbesar = b;
        }else{
                nilaiterbesar = c;
            }
        }
    
        return nilaiterbesar;
    }
     public static void main(String[]args){
  
       Scanner input = new Scanner(System.in);

       System.out.println("Masukkan bilangan I: ");
       int bill = input.nextInt();
   
       System.out.println("Masukkan bilangan II: ");
       int bil2  = input.nextInt();
       
       System.out.println("Masukkan bilangan III: ");
       int bil3  = input.nextInt();
       
       int x = hitung(bill, bil2, bil3);
       System.out.println(" Nilai terbesar: " + x);
      
       
       
       
       
               
     }
}
