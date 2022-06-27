package com.company.MainThread;

import model.food.*;
import model.order.*;
import threads.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        runRunnableInterface();

    }

    public static void runRunnableInterface() throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();
        List<Customer> customers = getCustomers();
        List<Item> pizzaItems = getPizzaItems();
        List<Customer> customerQueue1 = customers.subList(0, 2);
        List<Customer> customerQueue2 = customers.subList(2, 4);
        List<Customer> customerQueue3 = customers.subList(4, 6);
        RunnableInterface process1 = new RunnableInterface(customerQueue1, pizzaItems);
        RunnableInterface process2 = new RunnableInterface(customerQueue2, pizzaItems);
        RunnableInterface process3 = new RunnableInterface(customerQueue3, pizzaItems);

        Thread t1 = new Thread(process1);
        Thread t2 = new Thread(process2);
        Thread t3 = new Thread(process3);
        t1.setName("1");
        t2.setName("2");
        t3.setName("3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Total time taken - " + (System.currentTimeMillis() - startTime));
    }

    public static List<Item> getPizzaItems() {
        List<Item> items = new ArrayList<>();
        items.add(new CheesePizza());
        items.add(new MargerithaPizza());
        items.add(new PeppyPaneer());
        items.add(new VeggyPizza());
        return items;
    }

    public static List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Anisha"));
        customers.add(new Customer("Anusha"));
        customers.add(new Customer("Akanksha"));
        customers.add(new Customer("Suman"));
        customers.add(new Customer("Vaibhavee"));
        customers.add(new Customer("anjali"));
        return customers;
    }

}