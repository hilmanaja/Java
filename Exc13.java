/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Exc13 {
    public static void main (String[] args){
        byte[] b = new byte[5];
        System.out.println("Input bilangan bulat : ");
        try{
            System.in.read(b);
        } catch(java.io.IOException e){
            int N = Integer.value(b).intvalue();
            System.out.println("Hasil : "+(N+2));
        }
   }
    
}
