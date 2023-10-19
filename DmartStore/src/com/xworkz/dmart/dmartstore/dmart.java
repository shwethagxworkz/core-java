package com.xworkz.dmart.dmartstore;
import com.xworkz.dmart.products;

import java.util.ArrayList;
import java.util.Scanner;
public class dmart{

private static void addProduct(Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.next();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();

        products product = new products(nextproductId++, name, price, quantity);
        products.add(product);
        System.out.println("Product added successfully.");
        }

private static void viewProduct(Scanner scanner) {
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();

        for (products product :product) {
        if (product.id == id) {
        System.out.println("Product ID: " + product.id);
        System.out.println("Name: " + product.name);
        System.out.println("Price: $" + product.price);
        System.out.println("Quantity: " + product.quantity);
        return;
        }
        }
        System.out.println("Product not found.");
        }

private static void updateProduct(Scanner scanner) {
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();

        for (product  product : products) {
        if (product.id == id) {
        System.out.print("Enter new name: ");
        String name = scanner.next();
        System.out.print("Enter new price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter new quantity: ");
        int quantity = scanner.nextInt();

        product.name = name;
        product.price = price;
        product.quantity = quantity;
        System.out.println("Product updated successfully.");
        return;
        }
        }
        System.out.println("Product not found.");
        }
private static void deleteProduct(Scanner scanner) {
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();

        for (product product : products) {
        if (product.id == id) {
        products.remove(product);
        System.out.println("Product deleted successfully.");
        return;
        }
        }
        System.out.println("Product not found.");
        }
        }
