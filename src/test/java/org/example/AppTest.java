package org.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.Main.parseXML;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void parseCSV_Positive() {
        // given:
        String fileName = "data.xml";
        String expected = "[Employee{id=1, firstName='John', lastName='Smith', country='USA', age=25}, " +
                "Employee{id=2, firstName='Ivan', lastName='Petrov', country='RU', age=23}]";
        // when:
        String result = String.valueOf(parseXML(fileName));
        // then:
        assertEquals(expected, result);
    }

    @Test
    public void parseXML_Positive() {
        // given:
        String document = "data.xml";
        String expected = "[Employee{id=1, firstName='John', lastName='Smith', country='USA', age=25}, " +
                "Employee{id=2, firstName='Ivan', lastName='Petrov', country='RU', age=23}]";
        // when:
        String result = String.valueOf(parseXML(document));
        // then:
        assertEquals(expected, result);

    }

    @Test
    public void getEvenNumbers() {
        // given:
        List<Integer> intNumbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 15, 8, 23, 4);
        List<Integer> expected = Arrays.asList(2, 16, 32, 8, 4);
        // when:
        List<Integer> result = StreamNumbers.getEvenNumbers(intNumbers);
        // then:
        assertEquals(expected, result);
    }

    @Test
    public void getPositiveNumbers() {
        // given:
        List<Integer> intNumbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 15, 8, 23, 4);
        List<Integer> expected = Arrays.asList(1, 2, 5, 16, 32, 3, 15, 8, 23, 4);
        // when:
        List<Integer> result = StreamNumbers.getPositiveNumbers(intNumbers);
        // then:
        assertEquals(expected, result);

    }
}