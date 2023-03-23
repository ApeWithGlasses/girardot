package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Cliente 1
        Group1 fan1 = new Group1 ("Juan", "juan@example.com", "555-555", "CC0000000", "Calle Alegria 123", LocalDate.of(2023, 3, 21), 1);
        System.out.println("---------------------------------------------------------");
        System.out.println("|                    RESUMEN DE COMPRA");
        System.out.println("|   Nombre : " + fan1.getName() + " | Email: " + fan1.getEmail());
        System.out.println("|   Telefono: " + fan1.getPhoneNumber() + " | CC: " + fan1.getIdCard());
        System.out.println("|   Costo neto: " + fan1.calculateNet());
        System.out.println("|   Costo total despues de dcto (IVA): " + fan1.calculateTotal());
        System.out.println("---------------------------------------------------------");

        //Cliente 2
        Group2 fan2 = new Group2 ("Rodrigo", "rodrigo@example.com", "444-444", "CC0000000", "Calle Perez 123", LocalDate.of(2023, 3, 21), 1);
        System.out.println("---------------------------------------------------------");
        System.out.println("|                    RESUMEN DE COMPRA");
        System.out.println("|   Nombre : " + fan2.getName() + " | Email: " + fan2.getEmail());
        System.out.println("|   Telefono: " + fan2.getPhoneNumber() + " | CC: " + fan2.getIdCard());
        System.out.println("|   Costo neto: " + fan2.calculateNet());
        System.out.println("|   Costo total despues de dcto (IVA): " + fan2.calculateTotal());
        System.out.println("---------------------------------------------------------");

        //Cliente grupo 4 (location: Ubicacion de las gradas 1- Popular, 2- Oriental, 3- Occidental)
        Group4 fan4 = new Group4("Maria", "maria@example.com", "666-666", "CC000000", "Calle Siempre 123", LocalDate.of(2023, 3, 21), 1, 3);
        System.out.println("---------------------------------------------------------");
        System.out.println("|                    RESUMEN DE COMPRA");
        System.out.println("|   Nombre : " + fan4.getName() + " | Email: " + fan4.getEmail());
        System.out.println("|   Telefono: " + fan4.getPhoneNumber() + " | CC: " + fan4.getIdCard());
        System.out.println("|   Costo neto: " + fan4.calculateNet());
        System.out.println("|   Costo total despues de dcto (IVA): " + fan4.calculateTotal());
        System.out.println("---------------------------------------------------------");

    }
}