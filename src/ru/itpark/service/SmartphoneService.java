package ru.itpark.service;

import ru.itpark.domain.Product;
import ru.itpark.domain.Smartphone;
import ru.itpark.repository.ProductRepository;

import java.util.Comparator;
import java.util.List;

public class SmartphoneService {
    private ProductRepository repository;

    public SmartphoneService(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(Product product) {
        repository.add(product);
    }

    public List<Product> getAll() {
        return repository.getAll();
    }

    public List<Product> getSorted(Comparator<Product> comparator) {
        List<Product> result = repository.getAll();
        result.sort(comparator);
        return result;
    }

}
