package com.kunbetter.midas;

import com.google.inject.Singleton;

/**
 * @author xinxi.li
 * date 2019/10/11
 * time 11:26
 */
@Singleton
public class SimpleHelloPrinter implements IHelloPrinter {
    public void print() {
        System.out.println("Hello, Simple World");
    }
}
