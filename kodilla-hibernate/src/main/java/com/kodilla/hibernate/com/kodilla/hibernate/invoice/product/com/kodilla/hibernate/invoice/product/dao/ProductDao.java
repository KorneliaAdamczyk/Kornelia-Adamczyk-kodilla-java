package com.kodilla.hibernate.com.kodilla.hibernate.invoice.product.com.kodilla.hibernate.invoice.product.dao;

import com.kodilla.hibernate.com.kodilla.hibernate.invoice.product.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {
}
