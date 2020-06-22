package tdd.fizzbuzz;

/**
 *
 * @author guminpio
 */
public class MultiNaturalNumberMapper {

    public String multiMap(Integer number) {

        NaturalNumberMapper naturalNumberMapper = new NaturalNumberMapper();

        Integer n = 1;
        String result;
        String resultInc = "";
        System.out.println("");
        while (n < number) {
            result = naturalNumberMapper.map(n);
            resultInc = resultInc + result + ",";
            n++;
        }
        resultInc = resultInc + naturalNumberMapper.map(number);
        System.out.print(resultInc);
        return resultInc;
    }
}
