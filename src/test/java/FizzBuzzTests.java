import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTests {
    /*
    Print the numbers
    multiples of number
     */
    FizzBuzzSolver fizzB = new FizzBuzzSolver();

    @Test
    public void divisibleByTest(){
        assertTrue(fizzB.divisibleBy(3,3));
        assertFalse(fizzB.divisibleBy(3,4));
    }

    @Test
    public void fizzBuzzSolutionTests(){
        ArrayList<String> minTestList = new ArrayList<>(
                List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"));
        assertEquals(minTestList, fizzB.fizzBuzzSolution(1, 16));

    }
}
