package tdd.fizzbuzz;

/**
 *
 * @author guminpio
 */
public class InputDataParser {

    public Integer convert(String inputData) {

        Integer result = Integer.parseInt(inputData);

        if (result < 1 || result > 100) {
            return 0;
        }

        return result;
    }
}
