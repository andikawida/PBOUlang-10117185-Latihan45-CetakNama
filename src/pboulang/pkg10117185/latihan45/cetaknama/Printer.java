/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan45.cetaknama;

/**
 *
 * @author user
 * Nama  : Andhyka Widariyanto
 * NIM   : 10117185
 * Kelas : PBO - Ulang
 * Tugas : Latihan 45 - Cetak Nama
 */
public class Printer {
  //Atributte
    int jmlCetak;
    String nama;

  //Function
    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void cetak (String nama){
        System.out.println("Nama Anda : "+nama);
    }
    public void cetak (int jmlCetak, String nama){
        System.out.println("Hasil Cetak : ");
        for(int i = 1; i<= jmlCetak;i++){
            System.out.println(i+". "+nama);
        }
    }
    
}
