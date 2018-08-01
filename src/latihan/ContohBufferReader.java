/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class ContohBufferReader {
    public static void main (String[] args) throws IOException{
        String nama;
        
        InputStreamReader ist = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(ist);
        System.out.print("Inputkan nama: ");
        nama = br.readLine();
        System.out.println("Nama Kamu Adalah " +nama);
        
        
    }
    
}
