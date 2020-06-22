package tdd.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author guminpio
 */
public class InputDataParserTest {

    InputDataParser inputDataParser;

    @BeforeEach
    public void init() {

        inputDataParser = new InputDataParser();
    }

    @Test
    public void normalParse() {

        assertThat(inputDataParser.convert("99")).isEqualTo(99);
    }

    @Test
    public void outOfRangeException() {

        assertThat(inputDataParser.convert("0")).isEqualTo(0);
    }

    @Test
    public void outOfRangeException_1() {

        assertThat(inputDataParser.convert("101")).isEqualTo(0);
    }

//    @Test
//    public void nullException() {
//
//    }
//
//    @Test
//    public void emptyException() {
//
//    }
//
//    @Test
//    public void parseIntegerException() {
//
//    }
}
