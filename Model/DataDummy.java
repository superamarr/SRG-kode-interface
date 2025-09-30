/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Aspire5
 */

import java.util.ArrayList;

public class DataDummy {
    public static ArrayList<Reservasi> getDummyData() {
        ArrayList<Reservasi> data = new ArrayList<>();
        data.add(new DineIn("Sadikin", "15:30", "Meja 5", "Ya", "Mie Gacoan Lv 3, Udang Keju", 27000, 3));
        return data;
    }
}

