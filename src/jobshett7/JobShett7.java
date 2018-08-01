/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobshett7;

import java.util.Scanner;

/**
 *
 * @author M. RAFI PUTRA
 */
public class JobShett7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String identitas = "Muhammad Rafi Putra Satria, xrpl5, 26";
        System.out.println("Identitas : " + identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai a ?");
        int a =scanner.nextInt();
        
        System.out.println("/nIF.. 1");
        if (a < 5) System.out.println("Nilai kurang dari 5");
       
        System.out.println("/nIF.. 2");
        if (a == 5)
            System.out.println("Nilai a sama dengan 5");
        
        System.out.println("/nIF.. 3");
        if (a > 5) {
                System.out.println("Isi variabel a :" + a);
                System.out.println("Nilai a lebih dari 5");
        
                System.out.println("/nIF..else..");
                if (a < 5) {
                    System.out.println("Isi variabel a :" + a);
                    System.out.println("Nilai a kurang dari 5");
                }else System.out.println("Nilai a kurang dari atau sama dengan 5");
                
                
    }
    
}
