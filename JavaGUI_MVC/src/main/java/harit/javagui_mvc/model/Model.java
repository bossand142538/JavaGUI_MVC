/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harit.javagui_mvc.model;

import java.util.Scanner;

/**
 *
 * @author bossa
 */
public class Model {
    private String tmp;
    int[] reg = new int[16];
    int[] mem = new int[256];
    
    private static Scanner x;

    public String getTmp() {
        return tmp;
    }

    public void setTmp(String tmp) {
        this.tmp = tmp;
    }

    public void setReg(int[] reg) {
        this.reg = reg;
    }

    public void setMem(int[] mem) {
        this.mem = mem;
    }

    public int[] getReg() {
        return reg;
    }

    public int[] getMem() {
        return mem;
    }
    
    
    
    public int readFileAndCheck() {
        x = new Scanner(tmp);
        x.useDelimiter("[\n]");
        while(x.hasNext()) {
            String y = x.next();
            
            if(y.length() != 16) return -1;
            
            int command = Integer.parseInt(y.substring(0,2),2);
            if(command == 0){
                int error = Integer.parseInt(y.substring(15),2);
                if(error != 0) return -1;
                
                load(y);
            }
            else if(command == 1){
                int error = Integer.parseInt(y.substring(15),2);
                if(error != 0) return -1;
                
                store(y);
            }
            else if(command == 2){
                int error = Integer.parseInt(y.substring(11),2);
                if(error != 0) return -1;
                
                addReg(y);
            }
            else if(command == 3){
                addImmed(y);
            }
            
         }
        return 0;
    }
    
    public void load(String y){
        int i = Integer.parseInt(y.substring(2,6),2);  
        int j = Integer.parseInt(y.substring(6,14),2); 
        System.out.println("load i:"+i+" j:"+j);
        getReg()[i] = getMem()[j];
        
        System.out.println("reg["+i+"] :"+getReg()[i]);
        System.out.println();
    }
    
    public void store(String y) {
        int i = Integer.parseInt(y.substring(2,6),2);  
        int j = Integer.parseInt(y.substring(6,14),2); 
        System.out.println("store i:"+i+" j:"+j);
        getMem()[j] = getReg()[i];
        
        System.out.println("mem["+j+"] :"+getMem()[j]);
        System.out.println();
    }
    
    public void addReg(String y) {
        int i = Integer.parseInt(y.substring(2,6),2);  
        int j = Integer.parseInt(y.substring(6,10),2); 
        System.out.println("addReg i:"+i+" j:"+j);
        getReg()[0] = getReg()[i] + getReg()[j];
        System.out.println("reg[0] :"+getReg()[0]);
        System.out.println();
    }
    
    public void addImmed(String y) {
        int i = Integer.parseInt(y.substring(2,6),2);  
        int j = Integer.parseInt(y.substring(6),2); 
        System.out.println("addImmed i:"+i+" j:"+j);
        getReg()[i] = getReg()[i] + j;
        
        System.out.println("reg["+i+"] :"+getReg()[i]);
        System.out.println();
    }
    
    
}
