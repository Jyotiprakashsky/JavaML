/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvutil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author kiit1  "C:\\Users\\kiit1\\Desktop\\Churn_Modelling.csv"
 */
public class CsvUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       ArrayList CSVObje = (ArrayList) csvRead.readCSV("C:\\Users\\kiit1\\Desktop\\Churn_Modelling.csv");
        System.out.println(CSVObje.toString());
}
    
}
