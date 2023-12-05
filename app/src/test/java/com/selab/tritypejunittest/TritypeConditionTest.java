package com.selab.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeConditionTest {

    @Test
    public void testTriang() {
        //两边之和是否小于等于第三边
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
        assertEquals(1, tri.Triang(2, 3, 4));
    }

}