/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Notebook
 */

public class Fecha {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        LocalDate objFecha = LocalDate.of(2020,5,19);
        LocalDate objFecha2 = LocalDate.now();
        
        //Formato 20/11/1992
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormat = objFecha.format(myFormat);
        String fecha2Format = objFecha2.format(myFormat);
        
        System.out.println(fechaFormat);
        
        
        // Sumar dias
        String fechaplus10 = objFecha2.plusDays(25).format(myFormat);
        System.out.println("Le sumamos 10 dias " + fechaplus10);
        // Sumar Meses
        String fechaplusMes = objFecha2.plusMonths(5).format(myFormat);
        System.out.println("Le sumamos 1 mes " + fechaplusMes);
        
        
        // Restar dias
        String fechaMinus10 = objFecha2.minusDays(20).format(myFormat);
        System.out.println("Le restamos 20 dias " + fechaMinus10);
        
        // Sumar Meses
        String fechaminusMes = objFecha2.minusMonths(5).format(myFormat);
        System.out.println("Le restamos 5 mes " + fechaminusMes);
        
        
        if(objFecha.equals(objFecha2)){
            System.out.println("Las fechas son iguales");
        }else{      
            System.out.println("Las fechas no son iguales");
        }
        
        
        
        //Ayuda String (trim)
        
        String FechaString = "12/11/1980";
        String[] normalizar = FechaString.split("/");
        
        System.out.println("Dia " + normalizar[0]);
        System.out.println("Mes " + normalizar[1]);
        System.out.println("Año " + normalizar[2]);
        
        
        
        

        
        
    }
    
}
