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
public class Method4 {
    public static int hitung(int a, int b){
       
        System.out.println("Kecepatan: " + (a/b) + "km/jam");
        return 0;
    
    }
        public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Jarak: ");
        int bill = input.nextInt();
        
        System.out.println("Masukkan Waktu: ");
        int bil2 = input.nextInt();
        
        hitung(bill,bil2);
       
    }
}
