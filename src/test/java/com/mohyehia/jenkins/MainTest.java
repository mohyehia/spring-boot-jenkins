package com.mohyehia.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    Main main = new Main();

    @Test
    void sum() {
        Assertions.assertEquals(6, main.sum(2, 4));
    }
}