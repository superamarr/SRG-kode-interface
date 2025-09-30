/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Aspire5
 */
public class DineIn extends Reservasi {
    private int jumlahOrang;
    
    public DineIn(String nama, String waktu, String meja, String preOrder, String namaMenu, int harga, int jumlahOrang){
        super(nama,waktu,meja,preOrder, namaMenu,harga);
        this.jumlahOrang = jumlahOrang;
    }
    
    public int getJumlahOrang() {
        return jumlahOrang; 
    }
    
    public void setJumlahOrang(int jumlahOrang) {
        this.jumlahOrang = jumlahOrang; 
    }
    
    @Override
    public String getDetail() {
        return "Reservasi Dine-In untuk " + jumlahOrang + " orang di meja " + getMeja();
    }

        
        
}
