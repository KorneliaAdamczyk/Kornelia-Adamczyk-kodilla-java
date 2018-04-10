package com.kodilla.hibernate.com.kodilla.hibernate.invoice.invoice.com.kodilla.hibernate.invoice.invoice.dao;

import com.kodilla.hibernate.com.kodilla.hibernate.invoice.invoice.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface InvoiceDao extends CrudRepository<Invoice, Integer>{
}
