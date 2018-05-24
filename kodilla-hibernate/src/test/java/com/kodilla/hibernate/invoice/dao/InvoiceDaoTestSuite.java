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
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //given
        Product product1 = new Product("Telewizor");
        Product product2 = new Product("Deskorolka");
        Product product3 = new Product("Komputer");

        BigDecimal priceForProduct1 = new BigDecimal("2500.00");
        BigDecimal priceForProduct2 = new BigDecimal("1250.25");
        BigDecimal priceForProduct3 = new BigDecimal("1300.55");

        Item item1 = new Item(product1, priceForProduct1, 4);
        Item item2 = new Item(product2, priceForProduct2, 1);
        Item item3 = new Item(product3, priceForProduct3, 8);

        Invoice invoice1 = new Invoice("fv123/33");
        invoice1.setItems(Arrays.asList(item1, item2, item3));

        //when
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();

        //then
        Assert.assertEquals(3, productDao.count());
        Assert.assertEquals(3, itemDao.count());
        Assert.assertEquals(1, invoiceDao.count());
        Assert.assertNotEquals(0, invoice1Id);

        //cleanup
        try {
            productDao.deleteAll();
            itemDao.deleteAll();
            invoiceDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }
}