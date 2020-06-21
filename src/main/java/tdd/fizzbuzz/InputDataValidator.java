package tdd.fizzbuzz;

import java.io.IOException;

/**
 *
 * @author guminpio
 */
public class InputDataValidator {

    public void validate(String inputData) throws IOException {
        InputDataParser inputDataParser = new InputDataParser();
        Integer number = inputDataParser.convert(inputData);
        if (number == 0) {
            System.err.println("Tego numeru nie obsługujemy.");
            InputDataReader.readFromConsole();
        }

        MultiNaturalNumberMapper multiNaturalNumberMapper
                = new MultiNaturalNumberMapper();
        multiNaturalNumberMapper.multiMap(number);
    }

}
