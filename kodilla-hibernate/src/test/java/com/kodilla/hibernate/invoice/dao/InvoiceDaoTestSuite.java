package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
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
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSava() {
        //Given
        Product product1 = new Product("Product_1");
        Product product2 = new Product("Product_2");
        Product product3 = new Product("Product_3");
        Product product4 = new Product("Product_4");
        Item item1 = new Item(product1, new BigDecimal(1), 1);
        Item item2 = new Item(product2, new BigDecimal(2), 2);
        Item item3 = new Item(product3, new BigDecimal(3), 3);
        Item item4 = new Item(product4, new BigDecimal(4), 4);
        Invoice invoice = new Invoice("PL/2020/12/01", item1, item2, item3, item4);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
