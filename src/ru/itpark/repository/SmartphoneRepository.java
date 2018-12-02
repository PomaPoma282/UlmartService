package ru.itpark.repository;

import ru.itpark.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneRepository {
    private List<Smartphone> smartphones = new ArrayList<>();

    public void add(Smartphone smartphone) {
        smartphones.add(smartphone);
    }
    public List<Smartphone> getAll() {
        return smartphones;
    }
}
