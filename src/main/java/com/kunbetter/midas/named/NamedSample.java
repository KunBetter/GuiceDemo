package com.kunbetter.midas.named;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.kunbetter.midas.IHelloPrinter;

/**
 * @author xinxi.li
 * date 2019/10/11
 * time 15:07
 */
@Singleton
public class NamedSample {

    @Inject
    @Named("simple")
    private IHelloPrinter simplePrinter;

    @Inject
    @Named("complex")
    private IHelloPrinter complexPrinter;

    public void hello() {
        simplePrinter.print();
        complexPrinter.print();
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new NamedSampleModule());
        NamedSample namedSample = injector.getInstance(NamedSample.class);
        namedSample.hello();
    }
}
