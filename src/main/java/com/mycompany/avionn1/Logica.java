/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avionn1;

import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author gabrielccgg
 */
public class Logica {
    int totalventas = 0;
    int n;
    int val=0;
    int size1=10;
    int size11=6;
    int size2=8;
    int size21=4;
    int size3=5;
    int size31=2;
    char avion1 [][] = new char [size1][size11];
    char avion2 [][] = new char [size2][size21];
    char avion3 [][] = new char [size3][size31];
    String vuelo1 ="Avion Grande mixto";
    String vuelo2 ="Avion Mediano comercial";
    String vuelo3 ="Avioneta VIP";
    int costoComercial = 200000;
    int costoVIP = 1000000;
    String txt_Cad;
    String txtRecibo;
    String cadena;
    
    Map<String, Persona>personas = new HashMap<>();
    
    public static Logica archivador = new Logica();
    int cedula;
    int totalPagar;
    String avion;
    String cantidad; 
        
    public void txt_vuelo1(){
        FileWriter avion = null;
        try{
            avion = new FileWriter("archivos//avion1.txt");
            
            
            avion.write(txt_Cad + "\n");
            avion.close();
            
        } catch (Exception ex) {
            System.out.println("se produjo un error" + ex.getMessage());
        }
    }
    
    public void txt_vuelo2(){
        FileWriter avion = null;
        try{
            avion = new FileWriter("archivos//avion2.txt");
            
            
            avion.write(txt_Cad + "\n");
            avion.close();
            
        } catch (Exception ex) {
            System.out.println("se produjo un error" + ex.getMessage());
        }
    }
    
    
    public void txt_vuelo3(){
        FileWriter avion = null;
        try{
            avion = new FileWriter("archivos//avion3.txt");
            
            
            avion.write(txt_Cad + "\n");
            avion.close();
            
        } catch (Exception ex) {
            System.out.println("se produjo un error" + ex.getMessage());
        }
    }
    
    
    
    public void txt_imprimirecibovuelo1(){
        FileWriter avion = null;
        try{
            avion = new FileWriter("archivos//imprimirecibovuelo1.txt");
            
            
            avion.write(txtRecibo + "\n");
            avion.close();
            
        } catch (Exception ex) {
            System.out.println("se produjo un error" + ex.getMessage());
        }
    }
    
    
    public void txt_imprimirecibovuelo2(){
        FileWriter avion = null;
        try{
            avion = new FileWriter("archivos//imprimirecibovuelo2.txt");
            
            
            avion.write(txtRecibo + "\n");
            avion.close();
            
        } catch (Exception ex) {
            System.out.println("se produjo un error" + ex.getMessage());
        }
    }
    
    
    
    public void txt_imprimirecibovuelo3(){
        FileWriter avion = null;
        try{
            avion = new FileWriter("archivos//imprimirecibovuelo3.txt");
            avion.write(txtRecibo + "\n");
            avion.close();
            
        } catch (Exception ex) {
            System.out.println("se produjo un error" + ex.getMessage());
        }
    }
    
    public void imprimir (String ar[], String Vuelo){
        mostrarTexto(String.valueOf(n), Vuelo);
    }
    public void imprimir2 (String ar[], String Vuelo){
        mostrarTexto2(String.valueOf(n), Vuelo);
    }
    public void pedirDatos(String ar[]){
        boolean ban=true;
        int numero;
        JOptionPane.showMessageDialog(null,"Bienvenido a avianca");
        String cedula = JOptionPane.showInputDialog("\n Digite cedula \n");
        try { 
            numero = Integer.parseInt(cedula); 
        }catch(NumberFormatException e){ 
            numero=-1; 
            JOptionPane.showMessageDialog (null, "El dato digitado no es un número", "Error", JOptionPane.ERROR_MESSAGE); 
            pedirDatos(ar); 
        } 
        String nombrePersona = JOptionPane.showInputDialog("\n Digite nombre \n");
        String apellidoPersona = JOptionPane.showInputDialog("\n Digite apellido \n");
        
        int añoPersona = (int) Integer.parseInt(JOptionPane.showInputDialog("\n Digite año de nacimiento \n"));
        if(añoPersona>2001){
            JOptionPane.showMessageDialog(null,"error año invalido", "Error", JOptionPane.ERROR_MESSAGE);
            pedirDatos(ar); 
        }
        String mesPersona = JOptionPane.showInputDialog("\n Digite mes de nacimiento, digite: \n" 
                + "    enero         febrero \n"
                + "    marzo         abril \n"
                + "    mayo          junio"
                + "    julio         agosto \n"
                + "    septiembre    octubre \n"
                + "    noviembre     diciembre \n");
        
        if(!"enero".equals(mesPersona) && !"febrero".equals(mesPersona) && !"marzo".equals(mesPersona) && !"abril".equals(mesPersona) && !"mayo".equals(mesPersona) && !"junio".equals(mesPersona) && !"julio".equals(mesPersona) && !"agosto".equals(mesPersona) && !"septiembre".equals(mesPersona) && !"octubre".equals(mesPersona) && !"noviembre".equals(mesPersona) && !"diciembre".equals(mesPersona)){
            JOptionPane.showMessageDialog(null,"error mes invalido invalido", "Error", JOptionPane.ERROR_MESSAGE);
            pedirDatos(ar); 
        }
        int diaPersona = (int) Integer.parseInt(JOptionPane.showInputDialog("\n Digite dia de nacimiento \n"));
        if(diaPersona > 31){
            JOptionPane.showMessageDialog(null,"error dia invalido", "Error", JOptionPane.ERROR_MESSAGE);
            pedirDatos(ar); 
        }
        personas.put(cedula, new Persona(cedula, nombrePersona, apellidoPersona, diaPersona, mesPersona, añoPersona));

        
        int opcion = (int) Integer.parseInt(JOptionPane.showInputDialog("\n Seleccione avion \n" 
                + "1. Avion grande mixto \n"
                + "2. Avion Comercial \n"
                + "3. Avion VIP \n"));
        if((opcion != 1 && opcion != 2)&& opcion != 3){
            JOptionPane.showMessageDialog(null,"error");
            pedirDatos(ar);    
            
        }else{
            n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos boletos desea"));
            if (n > 5 ){
                JOptionPane.showMessageDialog(null, "Solo puede comprar un minimo de 5 boletos a la vez", "Error", JOptionPane.ERROR_MESSAGE); 
                pedirDatos(ar);
            }
            else{
                int a=n;
                switch (opcion){
                    case 1:{
                        do{
                            int opcion1 = (int) Integer.parseInt(JOptionPane.showInputDialog("\n Menú \n"
                                    + "1. Ver estado del avion \n"
                                    + "2. Seleccionar lugar \n"
                                    + "3. Otro cliente \n"
                                    + "4. imprimir boleto \n"
                                    + "5. Salir \n"));

                            switch (opcion1){
                                case 1:
                                    displayavionn(avion1);
                                    archivador.txt_vuelo1();
                                    break; 
                                case 2:
                                    if (a != 0 ){
                                        JOptionPane.showMessageDialog(null, "las primeras 3 filas son VIP");
                                        escogerlugar2(avion1);
                                        archivador.txt_vuelo1();
                                        a = a-1;
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Ya selecciono la cantidad de boletos ingresada"); 
                                    }
                                    break; 
                                case 3:
                                    pedirDatos(ar);
                                    break; 
                                case 4:
                                    if(val==0){
                                        imprimir(ar, vuelo1);
                                        archivador.txt_imprimirecibovuelo1();
                                    }else{
                                        imprimir2(ar, vuelo1);
                                        archivador.txt_imprimirecibovuelo1();
                                    }                                    
                                    break; 
                                case 5:
                                    System.out.println("totalventas: " + totalventas);
                                    System.exit(0);
                                default:
                                    ban=false;

                            }
                        }while(ban);

                    }
                    case 2:{
                        do{
                            int opcion1 = (int) Integer.parseInt(JOptionPane.showInputDialog("\n Menú \n"
                                    + "1. Ver estado del avion \n"
                                    + "2. Seleccionar lugar \n"
                                    + "3. Otro cliente \n"
                                    + "4. imprimir boleto \n"
                                    + "5. Salir \n"));

                            switch (opcion1){
                                case 1:
                                    displayavionn(avion2);
                                    archivador.txt_vuelo2();
                                    break; 
                                case 2:
                                    if (a != 0 ){
                                        escogerlugar1(avion2);
                                        archivador.txt_vuelo2();
                                        a = a-1;
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Ya selecciono la cantidad de boletos ingresada"); 
                                    }
                                    break;
                                case 3:
                                    pedirDatos(ar);
                                    break; 
                                case 4:
                                    imprimir(ar, vuelo2);
                                    archivador.txt_imprimirecibovuelo2();
                                    break; 
                                case 5:
                                    System.out.println("totalventas: " + totalventas);
                                    System.exit(0);
                                default:
                                    ban=false;

                            }
                        }while(ban);

                    }  
                    case 3:{
                        do{
                            int opcion1 = (int) Integer.parseInt(JOptionPane.showInputDialog("\n Menú \n"
                                    + "1. Ver estado del avion \n"
                                    + "2. Seleccionar lugar \n"
                                    + "3. Otro cliente \n"
                                    + "4. imprimir boleto \n"
                                    + "5. Salir \n"));

                            switch (opcion1){
                                case 1:
                                    displayavionn(avion3);
                                    archivador.txt_vuelo3();
                                    break; 
                                case 2:
                                    if (a != 0 ){
                                        escogerlugar1(avion3);
                                        archivador.txt_vuelo3();
                                        a = a-1;
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Ya selecciono la cantidad de boletos ingresada"); 
                                    }
                                    break;
                                case 3:
                                    pedirDatos(ar);
                                    break; 
                                case 4:
                                    imprimir2(ar, vuelo3);
                                    archivador.txt_imprimirecibovuelo3();
                                    break; 
                                case 5:
                                    System.out.println("totalventas: " + totalventas);
                                    System.exit(0);
                                    
                                default:
                                    ban=false;

                            }
                        }while(ban);
                    }
                }    
            }while(opcion != 5);
        }while(opcion != 5);
    }    
                
                
    public char[][] create(int sizee, int zis) {
        char matriz[][]=new char [sizee][zis];
        for (int i = 0; i < sizee; i++) {
            for (int j = 0; j < zis; j++) {
                matriz[i][j]= 'O';
            }
        }
        return matriz;
    }
    
    public void displayavionn(char mat[][]) {
        String cad = "    Cabeza avión \n";
        for (int i = 0; i < mat.length ; i++)  {
            for (int j = 0; j < mat[i].length; j++) {
                cad +=  mat[i][j] + "     ";
            }
            cad += "\n";
            txt_Cad = cad;
        }
        
        JOptionPane.showMessageDialog(null, cad);
    }
    public char [][] escogerlugar1(char mat[][]){
        
        char matriz [][]=mat;
        do{
            int filaa =(int) Integer.parseInt(JOptionPane.showInputDialog("Seleccionar fila"));
            int columnaa =(int) Integer.parseInt(JOptionPane.showInputDialog("Seleccionar columna"));
            if(matriz [filaa - 1][columnaa-1]== 'X'){
                JOptionPane.showMessageDialog(null, "Vuelve a seleccionar, ese lugar ya se encuentra ocupado");
            }else{
                JOptionPane.showMessageDialog(null, "Lugar asignado a la fila: "+filaa+" y columna: "+columnaa);
                matriz [filaa - 1][columnaa - 1]= 'X';
                break;
            }
        }while(1==1);
        
        return matriz;
    }
    public char [][] escogerlugar2(char mat[][]){
        val=0;
        char matriz [][]=mat;
        do{
            int filaa =(int) Integer.parseInt(JOptionPane.showInputDialog("Seleccionar fila"));
            int columnaa =(int) Integer.parseInt(JOptionPane.showInputDialog("Seleccionar columna"));
            if(matriz [filaa - 1][columnaa-1]== 'X'){
                JOptionPane.showMessageDialog(null, "Vuelve a seleccionar, ese lugar ya se encuentra ocupado");
            }else{
                JOptionPane.showMessageDialog(null, "Lugar asignado a la fila: "+filaa+" y columna: "+columnaa);
                if(filaa < 4){
                    val=1;
                }
                matriz [filaa - 1][columnaa - 1]= 'X';
                break;
            }
        }while(1==1);
        
        return matriz;
    }
    
    public void mostrarTexto(String cad, String Vuelo) {
        JOptionPane.showMessageDialog(null,"Avion: "+Vuelo+"\n Boletos: "+cad+"\n Total:"+costoComercial*n);
        cantidad =cad;
        vuelo1 =Vuelo;
        totalPagar =costoComercial*n;
        txtRecibo =cantidad +","+Vuelo+","+totalPagar;
        totalventas = totalventas + totalPagar; 
    }
    public void mostrarTexto2(String cad, String Vuelo) {
        JOptionPane.showMessageDialog(null,"Avion: "+Vuelo+"\n Boletos: "+cad+"\n Total:"+costoVIP*n);
        cantidad =cad;
        vuelo1 =Vuelo;
        totalPagar =costoVIP*n;
        txtRecibo =cantidad +","+Vuelo+","+totalPagar;
        totalventas = totalventas + totalPagar; 
        
        
    }
}
