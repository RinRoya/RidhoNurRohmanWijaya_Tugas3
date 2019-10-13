/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class MainClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Kendaraan\t\t\t: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tipe Kendaraan\t\t\t: ");
        String tipe = input.next();

        System.out.print("Masukkan Kapasitas Kendaraan\t\t: ");
        int kapastitas = input.nextInt();

        System.out.print("Masukkan Bahan Bakar Kendaraan\t\t: ");
        float bahanbakar = input.nextFloat();
        double a = 13.42134;
        System.out.print("Masukkan ID Kendaraan\t\t\t: ");
        int id = input.nextInt();

        System.out.print("Masukkan Jarak Tempuh Awal Kendaraan\t: ");
        float awal = input.nextFloat();

        System.out.print("Masukkan Jarak Tempuh Kendaraan\t\t: ");
        float akhir = input.nextFloat();
        System.out.println();
        System.out.println("___________________________________");
        System.out.println();
        Kendaraan test;
        if (nama.length() > 5) {
            test = new SepedaMotor();

        } else {
            test = new Mobil();
        }
        test.setNamaKendaraan(nama);
        test.setTipeKendaraan(tipe);
        test.setKapasitasMesin(kapastitas);
        test.setBahanBakar(bahanbakar);
        test.setIdKendaraan(id);
        test.setJarakTempuhAwal(awal);
        test.setJarakTempuh(akhir);
        test.infoKendaraan();
    }
}
