/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Random x = new Random();
    
        int [] tablica = new int[100];
        for(int i=0; i<100; i++)
        {
            tablica[i] = x.nextInt(100);
        }
        Arrays.sort(tablica);
            for(int i=0; i<100; i++)
        {
        System.out.println(tablica[i]);
        }
    }
    
}
