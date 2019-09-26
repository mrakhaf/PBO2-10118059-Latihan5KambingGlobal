/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan5kambingglobal;

/**
 *
 * @author 
 * Nama  : Muhammad Rakha Firdaus
 * NIM   : 10118059
 * Kelas : IF-2
 * 
 */
public class PBO210118059Latihan5KambingGlobal {
    //variabel jumlahkambing menjadi variabel instance
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing 
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing : " + jumlahKambing);
    }
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBO210118059Latihan5KambingGlobal kambingSusu = new PBO210118059Latihan5KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama kali berjalan 
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing 
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
