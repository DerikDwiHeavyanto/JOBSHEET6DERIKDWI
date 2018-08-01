/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.io.Console;

/**
 *
 * @author ASUS
 */
public class ContohInputConsole {
    public static void main (String[] srgs){
        String nama;
                int usia;
                String alamat;
                
                Console con = System.console();
                System.out.print("Inputkan alamat anda: ");
                nama = con.readLine();
                System.out.print("Iputkan usia: ");
                usia = Integer.parseInt(con.readLine());
                System.out.print("inputkan alamat anda: ");
                alamat= con.readLine();
                
                System.out.println("Nama Kamu Adalah: "+nama);
                System.out.println("Usia Kamu Adalah: "+usia);
                System.out.println("Alamat Kamu berada di: "+alamat);
                
    }
    
}
