package com.kunbetter.midas.container;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import com.kunbetter.midas.ComplexHelloPrinter;
import com.kunbetter.midas.IHelloPrinter;
import com.kunbetter.midas.SimpleHelloPrinter;

/**
 * @author xinxi.li
 * date 2019/10/11
 * time 15:20
 */
public class SetSampleModule extends AbstractModule {

    @Override
    protected void configure() {
        Multibinder<IHelloPrinter> printers = Multibinder.newSetBinder(binder(), IHelloPrinter.class);
        printers.addBinding().to(SimpleHelloPrinter.class);
        printers.addBinding().to(ComplexHelloPrinter.class);
    }
}
