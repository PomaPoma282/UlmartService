package ru.itpark.service;

import ru.itpark.domain.Smartphone;
import ru.itpark.repository.SmartphoneRepository;

import java.util.Comparator;
import java.util.List;

public class SmartphoneService {
    private SmartphoneRepository repository;

    public SmartphoneService(SmartphoneRepository repository) {
        this.repository = repository;
    }

    public void add(Smartphone smartphone) {
        repository.add(smartphone);
    }

    public List<Smartphone> getAll() {
        return repository.getAll();
    }

    public List<Smartphone> getSorted(Comparator<Smartphone> comparator) {
        List<Smartphone> result = repository.getAll();
        result.sort(comparator);
        return result;
    }

}
