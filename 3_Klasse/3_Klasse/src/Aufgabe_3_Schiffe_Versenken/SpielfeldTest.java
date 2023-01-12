package Aufgabe_3_Schiffe_Versenken;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SpielfeldTest {
    int anzahl = 0;
    int testSchiff = 2;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void test() {
        SpielFeld s = new SpielFeld(); 
        s.init();
    int[][] x = s.Spielfeld;
    testSchiffe(x);

    }

    private void testSchiffe(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if(x[i][j] == testSchiff) {
                    anzahl++;
                }

            }
        }
        assertEquals(anzahl, 8);
    }


}