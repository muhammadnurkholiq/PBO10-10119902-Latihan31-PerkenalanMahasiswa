/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan31.perkenalanmahasiswa;

/**
 *
 * @author 
 * NAMA    : Muhammad Nurkholiq
 * KELAS   : PBO10K
 * NIM     : 10119902
 * Deskripsi Program : Program Ini Berisi Program Untuk Menampilkan perkenalan mahasiswa 
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nim="10110269";
        mahasiswa1.nama="Rizki Adam Kurniawan";
        mahasiswa1.perkenalkanDiri();
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nim="10110270";
        mahasiswa2.nama="Indra Tiola";
        mahasiswa2.perkenalkanDiri();
        
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nim="10110271";
        mahasiswa3.nama="Robi Tanzil Ganefi";
        mahasiswa3.perkenalkanDiri();
        
        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa4.nim="10110269";
        mahasiswa4.nama="Muhammad Nur Awaludin";
        mahasiswa4.perkenalkanDiri();
        
    }
}
