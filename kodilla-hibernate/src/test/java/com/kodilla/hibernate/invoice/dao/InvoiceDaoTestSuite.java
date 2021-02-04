package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Smartphone");
        Product product2 = new Product("Book");
        Product product3 = new Product("Radio");
        Item position1 = new Item(product1, new BigDecimal(1500), 1, new BigDecimal(1500));
        Item position2 = new Item(product2, new BigDecimal(50), 2, new BigDecimal(100));
        Item position3 = new Item(product3, new BigDecimal(230), 3, new BigDecimal(690));
        Invoice invoice1 = new Invoice("0001/2021");
        Invoice invoice2 = new Invoice("0002/2021");
        invoice1.getItems().add(position1);
        invoice1.getItems().add(position2);
        invoice2.getItems().add(position2);
        invoice2.getItems().add(position3);
        int inId = invoice1.getId();
        int inId2 = invoice2.getId();
        //When
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        //Then
        Assertions.assertNotEquals(0,inId);
        Assertions.assertNotEquals(0,inId2);
        //Cleanup
        invoiceDao.deleteById(inId);
        invoiceDao.deleteById(inId2);
    }
}
