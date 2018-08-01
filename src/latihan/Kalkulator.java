/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author ASUS
 */
import java .util.Scanner;
public class Kalkulator {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
       
        int pil;
        System.out.println("===Kalkulator===");
        System.out.println("Masukan pilihan operasi");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
                System.out.println("-----------------------");
                System.out.println("Pilih Angka: ");
        pil = input.nextInt();
        
        switch (pil){
            //penjumalahan
            case 1:
                int a,b,hasil;
                System.out.println("Masukan Angka");
                                System.out.print("Anngka 1 = ");
                    a = input.nextInt();
                                    System.out.print("");

                                    System.out.print("Angka 2 = ");
                    b = input.nextInt();
                    hasil = a+b;
                    System.out.print("Hasil Penjumlahan = " +hasil);
                                    System.out.println("");}
        switch (pil){
            //pengurangan
            case 2:
                int x,y,j;
                System.out.println("Masukan Angka");
                                System.out.print("Angka 1 = ");
                    x = input.nextInt();
                                    System.out.print("");

                                    System.out.print("Angka 2 = ");
                    y = input.nextInt();
                    j = x-y;
                    System.out.print("Hasil Pengurangan = " +j);
                                    System.out.println("");}
        switch (pil){
            //perkalian
            case 3:
                                    int q,r,s;
                System.out.println("Masukan Angka");
                                System.out.print("Angka 1 = ");
                    q = input.nextInt();
                                    System.out.print("");

                                    System.out.print("Angka 2 = ");
                    r = input.nextInt();
                    s = q*r;
                    System.out.print("Hasil Perkalian = " +s);
                                    System.out.println("");}
        switch (pil){
            //pembagian
            case 4:
                int w,c,v;
                System.out.println("Masukan Angka");
                                System.out.print("Angka 1 = ");
                    w = input.nextInt();
                                    System.out.print("");

                                    System.out.print("Angka 2 = ");
                    c = input.nextInt();
                    v = w/c;
                    System.out.print("Hasil Pembagian = " +w);
                   
               
                                    System.out.println("");}

        System.out.println("");
      
                                System.out.println("---Selesai---");     
                                System.out.println("=============");         
                                        
                                    }
                                        
                                    
                    
        
    }
    

