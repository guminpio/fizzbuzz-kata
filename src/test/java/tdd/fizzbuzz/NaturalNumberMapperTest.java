package tdd.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 *
 * @author guminpio
 */
public class NaturalNumberMapperTest {

    @Test
    public void whenNaturalNumber_thenAssertionSucceeds() {

        NaturalNumberMapper nnm = new NaturalNumberMapper();

        assertThat(nnm.map(1)).isEqualTo("1");
    }

    @Test
    void whenNotNaturalNumber_thenAssertionSucceeds() {

        NaturalNumberMapper nnm = new NaturalNumberMapper();
        assertThrows(NotNaturalNumberInputException.class, () -> {
            nnm.map(0);
        });
    }

    @Test
    void whenNotNaturalNumber1_thenAssertionSucceeds() {

        NaturalNumberMapper nnm = new NaturalNumberMapper();
        assertThrows(NotNaturalNumberInputException.class, () -> {
            nnm.map(-1);
        });
    }

    @Test
    public void specific1NaturalNumber() {

        NaturalNumberMapper nnm = new NaturalNumberMapper();

        assertThat(nnm.map(3)).isEqualTo("Fizz");
    }

    @Test
    public void specific2NaturalNumber() {

        NaturalNumberMapper nnm = new NaturalNumberMapper();

        assertThat(nnm.map(5)).isEqualTo("Buzz");
    }

    @Test
    public void specific3NaturalNumber() {

        NaturalNumberMapper nnm = new NaturalNumberMapper();

        assertThat(nnm.map(15)).isEqualTo("FizzBuzz");
    }

}
