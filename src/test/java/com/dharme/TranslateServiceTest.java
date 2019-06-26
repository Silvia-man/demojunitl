package com.dharme;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnitPlatform.class)
public class TranslateServiceTest {
    private TranslateService translator;
    @BeforeEach
    public void setup() {
        translator = new TranslateService();
    }

    @Test
    public void testTranslateHello() {
        assertEquals("Bonjour", translator.translate("hello"));
        assertEquals("Bonjour", translator.translate("HeLlo"));
    //    assertEquals("Bonjour", translator.translate("heilo"));
    }

    @Test
    public void testTranslateNo() {
        assertTrue(translator.translate("no").equals("Non"));
    }

    @Test
    public void testTranslateError() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> translator.translate("")
        );

        assertEquals(exception.getMessage(), "Text must be not empty");
    }


}
