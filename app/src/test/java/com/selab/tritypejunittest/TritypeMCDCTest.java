package com.selab.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMCDCTest {

    @Test
    public void testTriang() {
        //两边之和是否小于等于第三边
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(1, 1, 1));
        assertEquals(4, tri.Triang(0, 1, 1));
        assertEquals(4, tri.Triang(1, 0, 1));
        assertEquals(4, tri.Triang(1, 1, 0));
    }

}