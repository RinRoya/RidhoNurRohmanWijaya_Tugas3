/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author OWNER
 */
public class Kendaraan {

    private int idKendaraan;
    protected float jarakTempuhAwal;
    protected float jarakTempuh;
    private String namaKendaraan;
    private String tipeKendaraan;
    private int kapasitasMesin;
    private float bahanBakar;

    public int getId() {
        return idKendaraan;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public float getJarakTempuhAwal() {
        return jarakTempuhAwal;
    }

    public void setJarakTempuhAwal(float jarakTempuhAwal) {
        this.jarakTempuhAwal = jarakTempuhAwal;
    }

    public float getJarakTempuh() {
        return jarakTempuh;
    }

    public void setJarakTempuh(float jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getTipe() {
        return tipeKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public float totalJarak() {
        float total;
        total = getJarakTempuhAwal() + getJarakTempuh();
        return total;
    }

    public float efektifitas() {
        float E, x, y;
        x = getJarakTempuh();
        y = (float) Math.floor(getBahanBakar());
        E = (float) Math.exp(x / y) * (float) Math.log10(2);
        return E;
    }

    public String getEfektifitas() {
        String Efektifitas;
        if (efektifitas() > 0 && efektifitas() <= 0.5) {
            Efektifitas = "Efektif";
        } else {
            Efektifitas = "Tidak Efektif";
        }
        return Efektifitas;
    }

    public void infoKendaraan() {
        System.out.println("ID Kendaraan\t\t: " + getId());
        System.out.println("Jarak Tempuh Awal\t: " + getJarakTempuhAwal());
        System.out.println("Jarak Tempuh\t\t: " + getJarakTempuh());
        System.out.println("Total Jarak\t\t: " + totalJarak());
        System.out.println("Keefektifitasan Mesin\t: " + getEfektifitas());
    }
}
