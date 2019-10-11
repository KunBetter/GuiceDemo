package com.kunbetter.midas;

import com.google.inject.Singleton;

/**
 * @author xinxi.li
 * date 2019/10/11
 * time 11:27
 */
@Singleton
public class ComplexHelloPrinter implements IHelloPrinter {
    public void print() {
        System.out.println("Hello, Complex World");
    }
}
