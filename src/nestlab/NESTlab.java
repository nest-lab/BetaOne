/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestlab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DEJI
 */
public class NESTlab {
    static String letContents, magContents;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        readFiles();
    }
    //end of method to write into Magazine's text document
    public static void readFiles(){
        String magName = "Magazine.txt";
        String letName = "letter.txt";
        try {
            Scanner readMag = new Scanner(new FileReader(magName));
            Scanner readLet = new Scanner(new FileReader(letName));
            while(readLet.hasNextLine()){
                letContents = readLet.nextLine();
            }
            while(readMag.hasNextLine()){
                magContents = readMag.nextLine();
                
            }
            if(magContents.contains(letContents)){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            readMag.close();
            readLet.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NESTlab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
