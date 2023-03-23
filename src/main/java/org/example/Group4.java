package org.example;

import java.time.LocalDate;

public class Group4 extends Fan{
    private Integer location;
    private Double ticketPrice;
    private Double discount = 0.0;
    private Double net;
    private Double total;

    public Group4() {
    }

    public Group4(String name, String email, String phoneNumber, String idCard, String address, LocalDate sellDate, Integer quantity, Integer location) {
        super(name, email, phoneNumber, idCard, address, sellDate, quantity);
        this.location = location;
    }

    @Override
    public Double calculateNet() {
        if (location == 1) {
            this.ticketPrice = 40000.0;
        } else if (location == 2) {
            this.ticketPrice = 80000.0;
        } else if (location == 3) {
            this.ticketPrice = 150000.0;
        }

        if (this.getQuantity() > 5) {
            System.out.println("El numero de boletas excede el limite permitido.");
        } else {
            this.net = this.ticketPrice * this.getQuantity();
        }
        return net;
    }

    @Override
    public Double calculateDiscount() {
        Double discountPrice = this.ticketPrice * this.discount;;
        return discountPrice;
    }

    public Double calculateDateDiscount() {
        Double dateDiscount = this.ticketPrice * this.getDateDiscount();
        return dateDiscount;
    }

    public Double calculateIva() {
        Double iva = this.net * this.getIva();
        return iva;
    }

    @Override
    public Double calculateTotal() {
        this.total = this.net + this.calculateIva() - this.calculateDiscount() - this.calculateDateDiscount();
        return total;
    }
}
