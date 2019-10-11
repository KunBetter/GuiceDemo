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
 * time 15:13
 */
@Singleton
public class ConstructedSample {

    @Named("simple")
    private IHelloPrinter simplePrinter;

    @Named("complex")
    private IHelloPrinter complexPrinter;

    @Inject
    public ConstructedSample(@Named("simple") IHelloPrinter simplePrinter, @Named("complex") IHelloPrinter complexPrinter) {
        this.simplePrinter = simplePrinter;
        this.complexPrinter = complexPrinter;
    }

    public void hello() {
        simplePrinter.print();
        complexPrinter.print();
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new NamedSampleModule());
        ConstructedSample constructedSample = injector.getInstance(ConstructedSample.class);
        constructedSample.hello();
    }
}
