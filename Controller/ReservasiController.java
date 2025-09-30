/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Aspire5
 */
import Service.ReservasiService;
import View.ReservasiView;

public class ReservasiController {
    private ReservasiService service;


    public ReservasiController(ReservasiService service) {
        this.service = service;
    }

    public void menuUtama() {
        while (true) {
            ReservasiView.menuUtama();
            
            String pilih = ReservasiService.getInput();
            switch (pilih) {
                case "1": service.lihatReservasi(); break;
                case "2": service.tambahDineIn(); break;
                case "3": service.tambahTakeAway(); break;
                case "4": service.updateReservasi(); break;
                case "5": service.hapusReservasi(); break;
                case "6": System.exit(0);
                default: System.out.println("Pilihan salah!");
            }
        }
    }
}



