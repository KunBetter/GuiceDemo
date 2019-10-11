package com.kunbetter.midas;

import com.google.inject.AbstractModule;

/**
 * @author xinxi.li
 * date 2019/10/11
 * time 11:27
 */
class SampleModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IHelloPrinter.class).to(ComplexHelloPrinter.class);
    }
}
