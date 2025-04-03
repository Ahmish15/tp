package seedu.healthbud.command.input;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import seedu.healthbud.exception.HealthBudException;
import seedu.healthbud.exception.InvalidBMIException;
import seedu.healthbud.parser.BMIParser;


public class BMICommandTest {

    private String executeAndCaptureOutput(BMICommand command) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        command.execute();
        System.setOut(originalOut);
        return outContent.toString().trim();
    }


    @Test
    void parse_validInput_expectSuccess() throws HealthBudException, InvalidBMIException {
        String input = "bmi /w 70 /h 1.75";
        BMICommand command = BMIParser.parse(input);
        String output = executeAndCaptureOutput(command);
        String expected = "Your BMI is: 22.86, you are of normal weight.";
        assertEquals(expected , output);
    }

    @Test
    void parse_missingParameters_expectInvalidBmiException() {
        String input = "bmi 70";
        assertThrows(InvalidBMIException.class, () -> BMIParser.parse(input),
                "Expected InvalidBmiException when missing '/h' or height.");
    }

    @Test
    void parse_nonNumericValues_expectHealthBudException() {
        String input = "bmi /w seventy /h onepointsevenfive";
        assertThrows(HealthBudException.class, () -> BMIParser.parse(input),
                "Invalid number format for weight or height.");
    }

    @Test
    void parse_zeroOrNegativeValues_expectHealthBudException() {
        // Zero weight
        String zeroWeightInput = "bmi /w 0 /h 1.75";
        assertThrows(HealthBudException.class, () -> BMIParser.parse(zeroWeightInput));

        // Negative height
        String negativeHeightInput = "bmi /w 70 /h -1.75";
        assertThrows(HealthBudException.class, () -> BMIParser.parse(negativeHeightInput),
                "Expected HealthBudException for negative height.");
    }
}


