package tdd.fizzbuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author guminpio
 */
public class Counter {

    public static void main(String[] args) throws IOException {
        //Enter data using BufferReader 
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj liczbę naturalną <1, 100>");
        String number = reader.readLine();
        System.out.println("Podałeś " + number);

    }
}
