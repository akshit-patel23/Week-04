package basictest.eventest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static junittestproblems.basic.permetrizedtesting.EvenNumber.isEven;

public class EvenTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9}) // Multiple test values
    public void Tester(int numbers) {
        boolean ans = (numbers % 2 == 0);
        Assertions.assertEquals(ans, isEven(numbers), "Failed for number: " + numbers);

    }
}
