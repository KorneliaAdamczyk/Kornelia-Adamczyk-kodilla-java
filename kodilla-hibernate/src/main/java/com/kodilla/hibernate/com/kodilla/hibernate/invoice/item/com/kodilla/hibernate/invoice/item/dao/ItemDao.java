package com.kodilla.hibernate.com.kodilla.hibernate.invoice.item.com.kodilla.hibernate.invoice.item.dao;


import com.kodilla.hibernate.com.kodilla.hibernate.invoice.item.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface ItemDao extends CrudRepository<Item, Integer> {
}
