/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet12;

/**
 *
 * @author HP 242
 */
public class Method1 {
    public static int hitung(int a, int b)
    {
        int c = a + b;
        return c;
        
    }
    public static void main(String[]args){
        int x;
        int bill = 2, bil2 = 3;
        
        x = hitung(bill, bil2);
        System.out.println("Hasil : " + x);
        
    }
}
