/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasi;

import java.util.Scanner;

/**
 *
 * @author Danielrorrrrr
 */
public class TugasI {

    public static void main(String[] args) {
       Scanner inputan = new Scanner (System.in);
      Scanner masukkan = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int nilai;
        nilai = masukkan.nextInt();
        if (nilai % 2 == 0 ){
        System.out.println("bilangan genap");
       
        }else {
        System.out.println("bilangan ganjil");
        }
    
    }
    
}