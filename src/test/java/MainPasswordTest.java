import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainPasswordTest {

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
    void checkIfNumberIsMissing_shouldTrue(){
        assertFalse(MainPassword.checkIfNumberIsMissing("ser4"));
    }

    @Test
    void checkIfNumberIsMissing_shouldFalse(){
        assertTrue(MainPassword.checkIfNumberIsMissing("ser"));
    }


}