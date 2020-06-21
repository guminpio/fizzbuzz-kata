package tdd.fizzbuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author guminpio
 */
public class InputDataReader {

    public static void readFromConsole() throws IOException {
        
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Podaj liczbę naturalną <1, 100>");
        String inputData = reader.readLine();
        System.out.println("Podałeś " + inputData);

        InputDataValidator inputDataValidator = new InputDataValidator();
        inputDataValidator.validate(inputData);
    }
}
