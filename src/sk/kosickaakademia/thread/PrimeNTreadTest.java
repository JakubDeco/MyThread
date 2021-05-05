package sk.kosickaakademia.thread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNTreadTest {

    @org.junit.jupiter.api.Test
    void isPrime() {
        PrimeNTread object = new PrimeNTread("object",0);

        assertTrue(object.isPrime(5));
        assertTrue(object.isPrime(13));
        assertTrue(object.isPrime(7727));

        assertFalse(object.isPrime(7726));
        assertFalse(object.isPrime(10000));
    }

    @Test
    void findPrimeNumber() {
        PrimeNTread object = new PrimeNTread("object",0);

        assertEquals(2,object.findPrimeNumber(-200));
        assertEquals(191,object.findPrimeNumber(182));
        assertEquals(5,object.findPrimeNumber(4));
        assertEquals(7789,object.findPrimeNumber(7760));
    }
}