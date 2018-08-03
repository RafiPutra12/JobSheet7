/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saranbahan2resep;

import java.util.Scanner;

/**
 *
 * @author M. RAFI PUTRA
 */
public class SaranBahan2Resep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String identitas = "Nama lengkap / kelas / no";
        System.out.println("Identitas: " + identitas);
        System.out.print("\nSaran resep dari bahan milik anda\n");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bahan Pertama: ");
        System.out.println("1. pisang");
        System.out.println("2. telur");
        System.out.print("Masukkan no pilihan anda:");
        int bahan1 = scanner.nextInt();
        
        if(bahan1 == 1 || bahan1 == 2);
        {
        System.out.println("Bahan kedua :");
        if(bahan1 == 1) {
            System.out.println("1. susu");
            System.out.println("2. minyak goreng");
            System.out.println("3. tidak ada");
        }  else{
            System.out.println("1. minyak goreng");
            System.out.println("2. rotu");
            System.out.println("3. tidak ada");
        }
        System.out.print("masukkan no pilihan anda:");
        int bahan2 = scanner.nextInt();
        } 
        System.out.println("Mohon maaf, pilihan tidak ditemukan, " + "Tidak dapat memberikan saran resep");
        int bahan2 = scanner.nextInt();
        
        if(bahan2 >= 1 && bahan2 <= 3)
        {
            if(bahan1==1)
                switch(bahan2)
                {
                    case 1: System.out.println("Anda dapat membuat milkshkae banana"); break;
                    case 2: System.out.println("Anda dapat membuat pisang goreng"); break;
                    case 3: System.out.println("Anda dapat membuat pisang rebus"); 
                }
            else
                switch(bahan2)
                {
                    case 1: System.out.println("Anda dapat membuat telur mata sapi"); break;
                    case 2: System.out.println("Anda dapat membuat sandwitch telut"); break;
                    case 3: System.out.println("Anda dapat membuat telur rebus");
                    
                }
        }else
            System.out.println("Mohon maaf, pilihan tidak ditemuukan" + "tidak dapat memberikan saran resep");
        
        
        
        
        
        
    }
    
    
}
