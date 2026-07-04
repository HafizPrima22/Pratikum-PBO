/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum27022026;

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;
public class inputVariabel {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String huruf, nama;
        int umur;
        float angka;
        
        System.out.print("masukan sebuah bilangan huruf : ");
        huruf = in.nextLine();
        
        System.out.print("masukan sebuah bilangan pecahan : ");
        angka = in.nextFloat();
        
        System.out.println("angka = " + angka);
        in.nextLine();
        
        System.out.print("masuka nama anda : ");
        nama = in.nextLine();
        
        System.out.print("masukan umur anda : ");
        umur = in.nextInt();
    }
    
}
