package com.xworkz.add.runner;

import com.xworkz.add.dto.InvoiceDTO;
import java.time.LocalDate;
import java.util.*;

public class InvoiceRunner {
    public static void main(String[] args) {
        InvoiceDTO invoice1 = new InvoiceDTO(1, 101, 2500.50, LocalDate.of(2024, 2, 15), "Paid");
        InvoiceDTO invoice2 = new InvoiceDTO(2, 102, 1500.75, LocalDate.of(2024, 3, 20), "Pending");
        InvoiceDTO invoice3 = new InvoiceDTO(3, 103, 3200.00, LocalDate.of(2024, 4, 10), "Overdue");
        InvoiceDTO invoice4 = new InvoiceDTO(4, 104, 890.25, LocalDate.of(2024, 5, 5), "Paid");
        InvoiceDTO invoice5 = new InvoiceDTO(5, 105, 4500.00, LocalDate.of(2024, 6, 12), "Pending");

        Collection<InvoiceDTO> invoiceDTOS = new ArrayList<>(15);
        invoiceDTOS.add(invoice1);
        invoiceDTOS.add(invoice2);
        invoiceDTOS.add(invoice3);
        invoiceDTOS.add(invoice4);
        invoiceDTOS.add(invoice5);

        Collection<InvoiceDTO> invoiceDTOS1 = new LinkedList<>();
        invoiceDTOS1.add(invoice1);
        invoiceDTOS1.add(invoice2);
        invoiceDTOS1.add(invoice3);
        invoiceDTOS1.add(invoice4);
        invoiceDTOS1.add(invoice5);

        Collection<InvoiceDTO> invoiceDTOS2 = new HashSet<>(12);
        invoiceDTOS2.add(invoice1);
        invoiceDTOS2.add(invoice2);

        Collection<InvoiceDTO> invoiceDTOS3=new TreeSet<>();
        invoiceDTOS3.add(invoice1);
        invoiceDTOS3.add(invoice5);

        System.out.println("Total invoices in ArrayList:"+ invoiceDTOS.size());
        System.out.println("Total invoices in LinkedList:"+ invoiceDTOS1.size());
        System.out.println("Total invoices in HashSet:"+ invoiceDTOS2.size());
        System.out.println("Total invoices in TreeSet:"+ invoiceDTOS3.size());
    }
}
