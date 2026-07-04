/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

/**
 *
 * @author LAB-SI-PC
 */
public class laptop extends Elektronik{
    private int ukuranLayar;
    private int kapasitasRAM;

    public laptop(String merek, int tahunProduksi, int garansi) {
        super(merek, tahunProduksi, garansi);
    }

    public int getUkuranLayar(){
        return ukuranLayar;
    }
    
    public void setUkuranLayar(int ukuranLayar){
         this.ukuranLayar = ukuranLayar;
    }
    
    public int getKapasitasRAM(){
        return kapasitasRAM;
    }

    public void setKapasitasRAM(int kapasitasRAM){
        this.kapasitasRAM = kapasitasRAM;
    }
}
