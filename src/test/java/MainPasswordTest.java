import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainPasswordTest {

    /*
    @Test
    void continueWhenUserEntersY_whenY_shouldTrue() {
        assertTrue(MainPassword.continueWhenUserEntersY("y"));
    }

    @Test
    void continueWhenUserEntersY_whenOtherThanY_shouldFalse() {
        assertFalse(MainPassword.continueWhenUserEntersY(" "));
    }
    */



    @Test
    void checkIfPasswordIsTooShort_caseTrue(){
        assertTrue(MainPassword.checkIfPasswordIsTooShort(5, 6));
    }

    @Test
    void checkIfPasswordIsTooShort_caseFalse(){
        assertFalse(MainPassword.checkIfPasswordIsTooShort(7, 6));
    }

    @Test
    void checkIfPasswordIsTooShort_caseEqual(){
        assertFalse(MainPassword.checkIfPasswordIsTooShort(6, 6));
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
    void checkIfNumberIsMissing_whenOneNumberIsContained_shouldFalse(){
        assertFalse(MainPassword.checkIfNumberIsMissing("ser4"));
    }

    @Test
    void checkIfNumberIsMissing_whenSeveralNumbersAreContained_shouldFalse(){
        assertFalse(MainPassword.checkIfNumberIsMissing("ser444"));
    }

    @Test
    void checkIfNumberIsMissing_shouldTrue(){
        assertTrue(MainPassword.checkIfNumberIsMissing("ser"));
    }

    @Test
    void checkIfUppercaseIsMissing_whenOneUppercaseContained_shouldFalse(){
        assertFalse(MainPassword.checkIfUppercaseIsMissing("eSr"));
    }

    @Test
    void checkIfUppercaseIsMissing_whenSeveralUppercaseContained_shouldFalse(){
        assertFalse(MainPassword.checkIfUppercaseIsMissing("SeSEr"));
    }

    @Test
    void checkIfUppercaseIsMissing_shouldTrue(){
        assertTrue(MainPassword.checkIfUppercaseIsMissing("ser"));
    }

    @Test
    void checkIfLowercaseIsMissing_whenOneLowercaseContained_shouldFalse(){
        assertFalse(MainPassword.checkIfLowercaseIsMissing("ESr"));
    }

    @Test
    void checkIfLowercaseIsMissing_whenSeveralLowercaseContained_shouldFalse(){
        assertFalse(MainPassword.checkIfLowercaseIsMissing("SeSEr"));
    }

    @Test
    void checkIfLowercaseIsMissing_shouldTrue(){
        assertTrue(MainPassword.checkIfLowercaseIsMissing("DER"));
    }




}