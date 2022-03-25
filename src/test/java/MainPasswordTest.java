import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainPasswordTest {

    @Test
    void clearWhenPasswordIsLongEnough_caseLonger(){
        assertTrue(MainPassword.clearWhenPasswordIsLongEnough(7, 6));
    }

    @Test
    void clearWhenPasswordIsLongEnough_caseShorter(){
        assertFalse(MainPassword.clearWhenPasswordIsLongEnough(5, 6));
    }

    @Test
    void clearWhenPasswordIsLongEnough_caseEqual(){
        assertFalse(MainPassword.clearWhenPasswordIsLongEnough(6, 6));
    }

    @Test
    void clearWhenNumberIsContained_caseTrue(){
        assertTrue(MainPassword.clearWhenNumberIsContained(true));
    }

    @Test
    void clearWhenNumberIsContained_caseFalse(){
        assertFalse(MainPassword.clearWhenNumberIsContained(false));
    }


    @Test
    void getLength_length5() {
        assertEquals(5, MainPassword.getLength("ddddd"));
    }

    @Test
    void getLength_whenNoInput_should0() {
        assertEquals(0, MainPassword.getLength(""));
    }

    @Test
    void stringHasNumber_shouldTrue(){
        assertTrue(MainPassword.stringHasNumber("ser4"));
    }

    @Test
    void stringHasNumber_shouldFalse(){
        assertFalse(MainPassword.stringHasNumber("ser"));
    }



}