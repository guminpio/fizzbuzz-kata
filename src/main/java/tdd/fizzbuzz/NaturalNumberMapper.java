package tdd.fizzbuzz;

/**
 *
 * @author guminpio
 */
public class NaturalNumberMapper {

    public String map(Integer naturalNumber) {

        if (naturalNumber < 1) {
            throw new NotNaturalNumberInputException();
        }

        Integer moduloBy3 = naturalNumber % 3;
        Integer moduloBy5 = naturalNumber % 5;

        if (moduloBy3 + moduloBy5 == 0) {
            return "FizzBuzz";
        }

        if (moduloBy3 == 0) {
            return "Fizz";
        }

        if (moduloBy5 == 0) {
            return "Buzz";
        }

        return naturalNumber.toString();
    }

}
