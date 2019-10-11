package com.kunbetter.midas.container;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.kunbetter.midas.IHelloPrinter;

import java.util.Set;

/**
 * @author xinxi.li
 * date 2019/10/11
 * time 15:20
 */
public class SetSample {

    @Inject
    private Set<IHelloPrinter> printers;

    public void hello() {
        for (IHelloPrinter printer : printers) {
            printer.print();
        }
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new SetSampleModule());
        SetSample setSample = injector.getInstance(SetSample.class);
        setSample.hello();
    }
}
