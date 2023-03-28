package org.example;

import org.example.RestService;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RestServiceTest {
    @Test
    public void shouldCalcExact() {
        RestService service = new RestService();
        int expected = 3;
        int actual = service.calculate(10_000, 3000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInexact() {
        RestService service = new RestService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
}
