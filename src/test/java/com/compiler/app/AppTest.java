package com.compiler.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testAddValues() {
        App app = new App();
        assertEquals(5, app.addValues(2, 3));
    }
}
