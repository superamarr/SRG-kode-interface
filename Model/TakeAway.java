/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Aspire5
 */
public class TakeAway extends Reservasi {
    private boolean sudahAmbil;
    
    public TakeAway(String nama, String waktu, String preOrder, String namaMenu, int harga, boolean sudahDiambil) {
        super(nama, waktu, "-", preOrder, namaMenu, harga);
        this.sudahAmbil = sudahAmbil;
    }
    
    public TakeAway(String nama, String waktu) {
        super(nama, waktu, "-", "n", "-", 0);
        this.sudahAmbil = false;
    }
        
    public boolean issudahAmbil(){
        return sudahAmbil;
    }
    
    public void setsudahAmbil (boolean sudahAmbil){
        this.sudahAmbil = sudahAmbil;
    }
    
    @Override
    public String getDetail() {
        return "Reservasi Take-Away, status: " + (sudahAmbil ? "Sudah diambil" : "Belum diambil");
    }
}
