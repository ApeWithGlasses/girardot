package org.example;

import java.time.LocalDate;

public class Group3 extends Fan{
    private Double ticketPrice = 150000.0;
    private Double discount = 0.15;
    private Double net;
    private Double total;

    public Group3() {
    }

    public Group3(String name, String email, String phoneNumber, String idCard, String address, LocalDate sellDate, Integer quantity) {
        super(name, email, phoneNumber, idCard, address, sellDate, quantity);
    }

    @Override
    public Double calculateNet() {
        if (this.getQuantity() > 3) {
            System.out.println("El numero de boletas excede el limite permitido.");
        } else {
            this.net = this.ticketPrice * this.getQuantity();
        }
        return net;
    }

    @Override
    public Double calculateDiscount() {
        Double discountPrice = this.net * this.discount;;
        return discountPrice;
    }

    public Double calculateDateDiscount() {
        Double dateDiscount = this.net * this.getDateDiscount();
        return dateDiscount;
    }

    public Double calculateIva() {
        Double iva = this.net * this.getIva();
        return iva;
    }

    @Override
    public Double calculateTotal() {
        this.total = (this.net + this.calculateIva() - this.calculateDiscount() - this.calculateDateDiscount()) * this.getQuantity();
        return total;
    }
}
