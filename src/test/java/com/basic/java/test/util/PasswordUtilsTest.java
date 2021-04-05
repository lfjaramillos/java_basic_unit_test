package com.basic.java.test.util;

import org.junit.Test;

import static com.basic.java.test.util.PasswordUtils.*;
import static org.junit.Assert.*;

public class PasswordUtilsTest {

    @Test
    public  void weak_when_has_less_than_8_letters(){
        assertEquals(SecurityLevel.WEAK, assessPassword("12345") );
    }

    @Test
    public  void weak_when_has_only_letters(){
        assertEquals(SecurityLevel.WEAK, assessPassword("sdfcsdfsd") );
    }

    @Test
    public  void medium_when_has_only_letters_and_numbers(){
        assertEquals(SecurityLevel.MEDIUM, assessPassword("abcd1234") );
    }
    @Test
    public  void strong_when_has_only_letters_and_numbers_and_symbols(){
        assertEquals(SecurityLevel.STRONG, assessPassword("abcd1234*****!!") );
    }
}