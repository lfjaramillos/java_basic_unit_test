package com.basic.java.test.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {


    @Test
    public void repeat_zero_times(){
        assertEquals("",StringUtils.repeat("Hi!", 0));
    }


    @Test
    public void repeat_3_times(){
        assertEquals("",StringUtils.repeat("Hi!", 0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void repeat_negative_times(){
        StringUtils.repeat("Hi!", -1);
    }

}