package com.cabInvoiceGenerator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CabServiceTest {

   

    @Test

    public void InvoiceGenratorShowIdReturnTotalFare() {
        CabService cabService = new CabService();
        double distance = 10;
        int time = 15;
        double totalFare = cabService.invoiceGenrator(distance, time);
        assertEquals(115.0, totalFare, 0.0);

    }

}
