/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Exc11 {
    public static void main(String[] args){
        int n =0;
        try{
        n = System.in.read();
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }
        System.out.println("Hasil : "+(char) n);
    }
    
}
