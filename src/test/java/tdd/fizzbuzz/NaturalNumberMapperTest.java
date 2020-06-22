package tdd.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author guminpio
 */
public class NaturalNumberMapperTest {

    NaturalNumberMapper nnm;

    @BeforeEach
    public void init() {
        nnm = new NaturalNumberMapper();
    }

    @Test
    public void whenNaturalNumber_thenAssertionSucceeds() {

        assertThat(nnm.map(1)).isEqualTo("1");
    }

    @Test
    public void whenNotNaturalNumber_thenAssertionSucceeds() {

        assertThrows(NotNaturalNumberInputException.class, () -> {
            nnm.map(0);
        });
    }

    @Test
    public void whenNotNaturalNumber1_thenAssertionSucceeds() {

        assertThrows(NotNaturalNumberInputException.class, () -> {
            nnm.map(-1);
        });
    }

    @Test
    public void specific1NaturalNumber() {

        assertThat(nnm.map(3)).isEqualTo("Fizz");
    }

    @Test
    public void specific2NaturalNumber() {

        assertThat(nnm.map(5)).isEqualTo("Buzz");
    }

    @Test
    public void specific3NaturalNumber() {

        assertThat(nnm.map(15)).isEqualTo("FizzBuzz");
    }

}
