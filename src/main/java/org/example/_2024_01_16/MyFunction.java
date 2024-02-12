package org.example._2024_01_16;

@FunctionalInterface
public interface MyFunction<T,K,R> {
    R apply(T t, K k);
}
