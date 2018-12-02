package ru.itpark.comparator;

import ru.itpark.domain.HomePhone;
import ru.itpark.domain.Smartphone;

import java.util.Comparator;

public class PriceComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
