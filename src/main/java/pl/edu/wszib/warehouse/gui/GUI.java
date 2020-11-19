package pl.edu.wszib.warehouse.gui;


import pl.edu.wszib.warehouse.database.IDataBase;
import pl.edu.wszib.warehouse.model.Product;

import java.util.Scanner;


public class GUI implements IGUI {

    private Scanner scanner = new Scanner(System.in);


    public IDataBase dataBase;

    public GUI() {
    }

    public void showMainMenu() {
        System.out.println("--------------------");
        System.out.println("1. Add products");
        System.out.println("2. Take products");
        System.out.println("3. Show all products");
        System.out.println("4. Exit");
        System.out.println("--------------------");


        System.out.println("Chose:");

        switch (scanner.next()) {
            case "1":
                addProducts();
                showMainMenu();

                break;
            case "2":
                takeProducts();
                showMainMenu();
                break;
            case "3":
                showAllProducts();
                showMainMenu();
                break;
            case "4":
                System.exit(0);
            default:
                System.out.println("Wrong choose !!!");
                showMainMenu();
                break;
        }
    }


    private void addProducts() {
        System.out.println("Enter the product code:");
        String code = scanner.next();

        System.out.println("Enter the quantity of the product");
        int quantity = scanner.nextInt();

        if (this.dataBase.addProducts(code, quantity)) {
            System.out.println(quantity + " items added\n");
        } else {
            System.out.println("Wrong product code !!!");
        }


    }

    private void takeProducts() {
        System.out.println("Enter the product code:");
        String code = scanner.next();

        System.out.println("Enter the quantity of the product");
        int quantity = scanner.nextInt();

        if (this.dataBase.takeProducts(code, quantity)) {
            System.out.println(quantity + " items removed\n");
        } else {
            System.out.println("Wrong product code or not enough quantity of products !!!");
        }
    }

    private void showAllProducts() {
        for (Product currentProduct : this.dataBase.getAllProducts()) {
            System.out.println(currentProduct);
        }
    }
}
