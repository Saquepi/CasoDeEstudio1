/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso1;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class Caso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cycle= 0;
        int repeat = 1;
        int question;
        int randomTemp;
        String clientName = JOptionPane.showInputDialog("Introduzca el nombre del Cliente");
        String clientID = JOptionPane.showInputDialog("Introduzca la cédula del cliente");
        int year = 2023;
        
        Factura [] facturas = new Factura[150000];
        
        while (repeat==1){
            
            facturas[cycle] = new Factura();
            
            facturas[cycle].setClient(clientName);
            facturas[cycle].setId(clientID);
            facturas[cycle].setFacAmount(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el monto de la factura")));
            facturas[cycle].setMonth(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el mes de la factura 1-6")));
            facturas[cycle].setYear(year);
            facturas[cycle].setPending(Integer.parseInt(JOptionPane.showInputDialog("Introduzca si la factura está paga(1=SI/2=NO)")));
            
            if (cycle==0){
                randomTemp= 1+(int)(Math.random()*5000);
                facturas[cycle].setFacNum(randomTemp);
                
            }else{
                while(repeat==1){
                    repeat = 0;
                    randomTemp= 1+(int)(Math.random()*5000);
                    for (int i = 0; i < cycle; i++) {
                        if (facturas[i].getFacNum()==randomTemp || randomTemp==0){
                            repeat = 1;
                        }
                    }
                    facturas[cycle].setFacNum(randomTemp);
                    
                }
                repeat = 1;
                
            }
            
            question = Integer.parseInt(JOptionPane.showInputDialog("Desea continuar? (1=Si/2=No)"));
            
           if (question==2){
               repeat = 0;
           }
            cycle = cycle+1;
            
            
            
        }
        
        int check = 1;
        while (check != 7){
            
            for (int i = 0; i < cycle; i++){
                if(facturas[i].getMonth() == check){
                   System.out.println("Cedula: "+facturas[i].getId()+" Cliente: "+facturas[i].getClient()+" Número de factura: "+facturas[i].getFacNum()+" Mes: "+facturas[i].getMonth()+ " Ano: "+facturas[i].getYear()+" Monto Factura: "+facturas[i].getFacAmount()+" Estado Factura: "+facturas[i].getPending()); 
                }
            }
            check =check+1;
            
        }

        double pagarTotal = 0;
        
        for (int i = 0; i < cycle; i++) {
            if(facturas[i].getPending() == 2){
                pagarTotal = pagarTotal + facturas[i].getFacAmount();
            }
            
        }
        
        double finalTotal = ((pagarTotal*0.05)+pagarTotal)/6;
        
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
        }
        JOptionPane.showMessageDialog(null, "Resultados en consola");
        System.out.println("Cuota 1 "+finalTotal+" Fecha de pago Julio 2023 ");
        System.out.println("Cuota 2 "+finalTotal+" Fecha de pago Agosto 2023 ");
        System.out.println("Cuota 3 "+finalTotal+" Fecha de pago Setiembre 2023 ");
        System.out.println("Cuota 4 "+finalTotal+" Fecha de pago Octubre 2023 ");
        System.out.println("Cuota 5 "+finalTotal+" Fecha de pago Noviembre 2023 ");
        System.out.println("Cuota 6 "+finalTotal+" Fecha de pago Diciembre 2023 ");
        
    }
    
}
