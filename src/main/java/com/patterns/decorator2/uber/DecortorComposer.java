package com.patterns.decorator2.uber;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class DecortorComposer {

    public static RideBookService compose(RideBookService base, List<DecoratoryFactory> factories){

        factories.sort(Comparator.comparingInt(DecoratoryFactory::prority));
        RideBookService current = base;
        ListIterator<DecoratoryFactory> decoratoryFactoryListIterator = factories.listIterator(factories.size());
        while (decoratoryFactoryListIterator.hasPrevious() ) {
            DecoratoryFactory previous = decoratoryFactoryListIterator.previous();
            current = previous.wrap(current);
        }
        return current;
    }
}
