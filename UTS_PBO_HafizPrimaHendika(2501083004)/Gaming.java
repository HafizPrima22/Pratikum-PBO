/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

/**
 *
 * @author LAB-SI-PC
 */
public class Gaming extends laptop{
    private String kartuGravis;
    private int refreshRate;
    
    public Gaming(String merek, int tahunProduksi, int garansi) {
        super(merek, tahunProduksi, garansi);
    }
    
    public String getKartuGravis(){
        return kartuGravis;
    }
    
    public void setKartuGravis(String kartuGravis){
         this.kartuGravis = kartuGravis;
    }
    
    public int getRefreshRate(){
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate){
        this.refreshRate = refreshRate;
    }
    
}
