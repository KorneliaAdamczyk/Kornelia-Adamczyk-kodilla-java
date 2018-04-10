package com.kodilla.hibernate.com.kodilla.hibernate.invoice.invoice.dao;

import com.kodilla.hibernate.com.kodilla.hibernate.invoice.item.Item;
import com.kodilla.hibernate.com.kodilla.hibernate.invoice.invoice.Invoice;
import com.kodilla.hibernate.com.kodilla.hibernate.invoice.invoice.com.kodilla.hibernate.invoice.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.com.kodilla.hibernate.invoice.product.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;


    @Test
    public void testInvoiceDaoSave(){

        //Given
        Product product1 = new Product("Coffee");
        Product product2 = new Product ("Tea");

        Item item1 = new Item (new BigDecimal("17"),1,new BigDecimal("17") );
        Item item2 = new Item (new BigDecimal("19"),1,new BigDecimal("19") );
        Item item3 = new Item (new BigDecimal("19"),1,new BigDecimal("19") );
        Item item4 = new Item (new BigDecimal("19"),1,new BigDecimal("19") );

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product2);
        item4.setProduct(product2);

       product1.getItems().add(item1);
       product2.getItems().add(item2);
        product2.getItems().add(item3);
        product2.getItems().add(item4);

        Invoice invoice = new Invoice ("20180410");

        invoice.getItem().add(item1);
        invoice.getItem().add(item2);
        invoice.getItem().add(item3);
        invoice.getItem().add(item4);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        Long quantityOfInvoice = invoiceDao.count();
        Iterable<Invoice> readInvoiceList = invoiceDao.findAll();

        //Then
        Assert.assertNotNull(readInvoiceList);
        Assert.assertEquals(1, java.util.Optional.ofNullable(quantityOfInvoice));

        //CleanUp
        //taskListDao.delete(id);
    }





    }

