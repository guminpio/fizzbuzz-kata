package tdd.fizzbuzz;

/**
 *
 * @author guminpio
 */
public class MultiNaturalNumberMapper {

    public void multiMap(Integer number) {

        NaturalNumberMapper naturalNumberMapper = new NaturalNumberMapper();

        Integer n = 1;
        System.out.println("");
        while (n < number) {
            String result = naturalNumberMapper.map(n);
            System.err.print(result + ",");
            n++;
        }

        System.out.print(naturalNumberMapper.map(number));
    }
}
