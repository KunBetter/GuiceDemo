package com.kunbetter.midas.container;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import com.kunbetter.midas.ComplexHelloPrinter;
import com.kunbetter.midas.IHelloPrinter;
import com.kunbetter.midas.SimpleHelloPrinter;

/**
 * @author xinxi.li
 * date 2019/10/11
 * time 15:23
 */
public class MapSampleModule extends AbstractModule {

    @Override
    protected void configure() {
        MapBinder<String, IHelloPrinter> printers = MapBinder.newMapBinder(binder(), String.class, IHelloPrinter.class);
        printers.addBinding("simple").to(SimpleHelloPrinter.class);
        printers.addBinding("complex").to(ComplexHelloPrinter.class);
    }
}
