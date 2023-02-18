/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testfecha;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author apioriente
 */
public class Testfecha {

    public static void main(String[] args) throws ParseException {
       
            //guardar la fecha en string en la base
           String fechaString = "2022-12-27T21:26:31-06:00";
            // formato que viene de formato fecha yyyy-MM-dd'T'HH:mm:ss'-06:00
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'-06:00'", Locale.getDefault());
           // se pasa a zona horaria UTC-6 por el tema geografico de Guatemala
           sdf.setTimeZone(TimeZone.getTimeZone("UTC -6"));
           // se realiza el parsea para asegurar que viene en el formato de fecha que necesita infile
           Date fecha = sdf.parse(fechaString); 
           // luego se formatea para garantizar que el proceso es exitoso.
          System.out.println(sdf.format(fecha));
          
           
           
            
            
            

        
        
    }
}
