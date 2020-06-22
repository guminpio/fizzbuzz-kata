package tdd.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author guminpio
 */
public class MultiNaturalNumberMapperTest {

    MultiNaturalNumberMapper naturalNumberMapper;

    @BeforeEach
    public void init() {
        naturalNumberMapper = new MultiNaturalNumberMapper();
    }

    @Test
    public void normalTest() {

        assertThat(naturalNumberMapper.multiMap(15)).isEqualTo("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz");
    }
}
