/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dasar;

/**
 *
 * @author Rafli
 */
public class Resep {
    String makanan="",resep="",langkah="";
    
    public void display(){
        System.out.println("----"+"Resep "+makanan+"----");
        
        System.out.println("Bahan:");
        String reg = "-";
        String[] ambilLangkah=langkah.split(reg);
        String[] ambilResep=resep.split(reg);
        for(int i=0;i<ambilResep.length;i++){
        System.out.println((i+1)+". "+ambilResep[i]);
        }
        System.out.println();
        
        System.out.println("Langkah:");
        if("-".equals(langkah)){
                System.out.println("Tidak Ada Langkah");}
        for(int i=0;i<ambilLangkah.length;i++){
        System.out.println((i+1)+". "+ambilLangkah[i]);
        }
    }
    
}
