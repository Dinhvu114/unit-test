package com.vu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;

public class StudentAnalyzerTest {

    @Test
    void testCountExcellentStudents() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(2, analyzer.countExcellentStudents(
                Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));

        assertEquals(0, analyzer.countExcellentStudents(
                Collections.emptyList()));
    }

    @Test
    void testCalculateValidAverage() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(8.17,
                analyzer.calculateValidAverage(
                        Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)),
                0.01);
    }
}