/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.logging.Level;



/**
 *
 * @author Nicholas
 */
public class Logger {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Inserire nome, cognome ed età: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        String cognome = sc.next();
        int età = sc.nextInt();
        System.out.print("Scrivere una nota: ");
        Scanner sn = new Scanner(System.in);
        String nota = sn.nextLine();
        try {
            FileWriter fw = new FileWriter("data/log.txt");
            fw.write("NOME: " + nome);
            fw.write("\n");
            fw.write("COGNOME: " + cognome);
            fw.write("\n");
            fw.write("ETA': " + età);
            fw.write("\n");
            fw.write("-" + nota + "-");
            fw.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
