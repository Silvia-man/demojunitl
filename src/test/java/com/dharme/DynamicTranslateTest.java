package com.dharme;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicTranslateTest {
    private TranslateService translator;
    @BeforeEach
    public void setup() {
        translator = new TranslateService();
    }


    @TestFactory
    public Stream<DynamicTest> translateDynamicTestsFromStream() {
        List<String> in = new ArrayList<>(Arrays.asList("Hello", "Yes", "Thank you"));
        List<String> out = new ArrayList<>(Arrays.asList("Bonjour", "Qui", "Merci"));

        return in.stream().map(word ->
                DynamicTest.dynamicTest("Test Translate" + word,() -> {   //??????????
                            int idx = in.indexOf(word);
                            assertEquals(out.get(idx), translator.translate(word));
                        }));
    }

    
}
