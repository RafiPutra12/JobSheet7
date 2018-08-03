/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohpercabangan;

import java.util.Scanner;

/**
 *
 * @author M. RAFI PUTRA
 */
public class ContohPercabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
        System.out.println("Masukkan Pilihan: ");
        int A=a.nextInt();
                switch (A){
                    case 1:
                        System.out.println("Jalan kaki");
                        break;
                    case 2:
                        System.out.println("Naik sepeda pancal");
                        break;
                    case 3:
                        System.out.println("Naik bus");
                        break;
                    case 4:
                        System.out.println("Naik Taksi");
                        break;
                    case 5:
                        System.out.println("Mobil Pribadi");
                        break;
                    case 6:
                        System.out.println("Naik Motor");
                        break;
                    default: System.out.println("Anda salah memilih");                }    }}

    
    

    

    
    

