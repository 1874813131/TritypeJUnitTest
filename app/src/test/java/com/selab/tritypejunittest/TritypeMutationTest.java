package com.selab.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutationTest {

    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        TritypeMutantOne tri1 = new TritypeMutantOne();
        TritypeMutantTwo tri2 = new TritypeMutantTwo();
        assertEquals(4, tri.Triang(1, 1, 2));
        assertEquals(2, tri1.Triang(2, 2, 3));
        assertEquals(2, tri2.Triang(2, 2, 3));
    }

}