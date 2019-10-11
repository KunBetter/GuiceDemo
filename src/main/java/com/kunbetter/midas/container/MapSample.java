package com.kunbetter.midas.container;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.kunbetter.midas.IHelloPrinter;

import java.util.Map;

/**
 * @author xinxi.li
 * date 2019/10/11
 * time 15:24
 */
public class MapSample {

    @Inject
    private Map<String, IHelloPrinter> printers;

    public void hello() {
        for (String name : printers.keySet()) {
            printers.get(name).print();
        }
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MapSampleModule());
        MapSample mapSample = injector.getInstance(MapSample.class);
        mapSample.hello();
    }
}
