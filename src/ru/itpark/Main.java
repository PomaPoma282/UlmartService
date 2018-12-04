package ru.itpark;

import ru.itpark.comparator.NameComparator;
import ru.itpark.domain.Product;
import ru.itpark.domain.Smartphone;
import ru.itpark.repository.ProductRepository;
import ru.itpark.service.ProductService;
import ru.itpark.service.SmartphoneService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService product = new ProductService(new ProductRepository());
        SmartphoneService smartphone = new SmartphoneService ( new ProductRepository());

        product.add(new Product(1,"fr", 1, "qw", "dw"));
        smartphone.add(new Product(1, "ds", 100, "dsd", "dsds"));



        product.sort(new NameComparator());
        System.out.println(product);
    }
}
