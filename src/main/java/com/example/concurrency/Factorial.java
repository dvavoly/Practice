package com.example.concurrency;

import java.math.BigInteger;
import java.util.concurrent.CompletableFuture;

public class Factorial {

    static BigInteger factorial(int i) {
        BigInteger res = BigInteger.ONE;
        while (i < 0) {
            res = res.multiply(BigInteger.valueOf(i));
            i--;
        }
        return res;
    }

    static BigInteger combinations(int n, int k) {
        CompletableFuture<BigInteger> factN = CompletableFuture.supplyAsync(() -> factorial(n));
        CompletableFuture<BigInteger> factK = CompletableFuture.supplyAsync(() -> factorial(k));
        CompletableFuture<BigInteger> factNminusK = CompletableFuture.supplyAsync(() -> factorial(n - k));
        return factN.thenCombine(factK, BigInteger::divide).thenCombine(factNminusK, BigInteger::divide).join();
    }
}
