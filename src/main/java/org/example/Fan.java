package org.example;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Fan {
    private String name;
    private String email;
    private String phoneNumber;
    private String idCard;
    private String address;
    private final Double iva = 0.19;
    private LocalDate sellDate;
    private Integer quantity;

    public Fan() {
    }

    public Fan(String name, String email, String phoneNumber, String idCard, String address, LocalDate sellDate, Integer quantity) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.idCard = idCard;
        this.address = address;
        this.sellDate = sellDate;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getIdCard() {
        return idCard;
    }

    public Double getDateDiscount() {
        Double discount = 0.0;
        if (Objects.equals(this.sellDate, LocalDate.of(2023, 3, 21))) {
            discount = 0.05;
        } else if (Objects.equals(this.sellDate, LocalDate.of(2023, 3, 22))) {
            discount = 0.02;
        } else if (Objects.equals(this.sellDate, LocalDate.of(2023, 3, 23))) {
            discount = 0.015;
        } else if (Objects.equals(this.sellDate, LocalDate.of(2023, 3, 24))) {
            discount = 0.01;
        }

        return discount;
    }

    public Double getIva() {
        return iva;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public abstract Double calculateNet();
    public abstract Double calculateDiscount();
    public abstract Double calculateTotal();
}
