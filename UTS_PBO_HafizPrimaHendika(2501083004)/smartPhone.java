/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

/**
 *
 * @author LAB-SI-PC
 */
public class smartPhone extends Elektronik {
    private int kapasitasBatrai;
    private int jumlahkamera;

    public smartPhone(String merek, int tahunProduksi, int garansi) {
        super(merek, tahunProduksi, garansi);
    }
    
    public int getKapasitasBatrai(){
        return kapasitasBatrai;
    }
    
    public void setKapasitasBatrai(int kapasitasBatrai){
         this.kapasitasBatrai = kapasitasBatrai;
    }
    
    public int getJumlahkamera(){
        return jumlahkamera;
    }

    public void setJumlahkamera(int jumlahkamera){
        this.jumlahkamera = jumlahkamera;
    }
    
    
}
