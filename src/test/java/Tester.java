import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void JustATest() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1));
    }

}
