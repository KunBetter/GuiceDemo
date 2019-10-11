package com.kunbetter.midas.named;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.kunbetter.midas.ComplexHelloPrinter;
import com.kunbetter.midas.IHelloPrinter;
import com.kunbetter.midas.SimpleHelloPrinter;

/**
 * @author xinxi.li
 * date 2019/10/11
 * time 15:04
 */
class NamedSampleModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(IHelloPrinter.class).annotatedWith(Names.named("simple")).to(SimpleHelloPrinter.class);
        bind(IHelloPrinter.class).annotatedWith(Names.named("complex")).to(ComplexHelloPrinter.class);
    }
}
