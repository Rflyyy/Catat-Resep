/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dasar;

import java.util.Scanner;

/**
 *
 * @author Rafli
 */
public class main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int jumlah =inp.nextInt();inp.nextLine();
        Resep masakan = new Resep();
        for(int i=0;i<jumlah;i++){  
        masakan.makanan=inp.nextLine();
        masakan.resep=inp.nextLine();
        masakan.langkah=inp.nextLine();
        masakan.display();
        }
    
    }
}
