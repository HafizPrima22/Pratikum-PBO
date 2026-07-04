/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

/**
 *
 * @author LAB-SI-PC
 */
public class smartWatch extends smartPhone {
    private int ukuranLayar;
    private boolean tahanAir;
    
    public smartWatch(String merek, int tahunProduksi, int garansi) {
        super(merek, tahunProduksi, garansi);
    }
    
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    
    public void setUkuranLayar(int ukuranLayar){
         this.ukuranLayar = ukuranLayar;
    }
    
    public boolean isTahanAir(){
        return tahanAir;
    }

    public void setTahanAir(boolean tahanAir){
        this.tahanAir = tahanAir;
    }
    
}
