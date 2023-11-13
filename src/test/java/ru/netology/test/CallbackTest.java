package ru.netology.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CallbackTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {driver = new ChromeDriver(); }

    @AfterEach
    void tearDown () {
        driver.quit;
        driver = null;
    }

    @Test
    void shouldTestSomething() {
        throw new UpsupportedOperationExeption();
    }

}
