package threads;

import model.food.Item;
import model.order.Customer;
import model.order.OrderInfo;

import java.util.List;

public class RunnableInterface implements Runnable {
    List<Customer> customerList;
    List<Item> pizzaItems;
    static int orderNumber = 0;

    public RunnableInterface(List<Customer> customerList, List<Item> pizzaItems) {
        this.customerList = customerList;
        this.pizzaItems = pizzaItems;
    }

    synchronized int IncreaseOrderNumber() {
        orderNumber++;
        return orderNumber;
    }

    @Override
    public void run() {
        for (Customer customer : customerList) {
            System.out.println("------------------------Next Order-----------------------------");
            System.out.println("Taking order for customer - " + customer.getName() + " at Counter - " + Thread.currentThread().getName());
            OrderInfo order = OrderOperation.takeOrder(customer, pizzaItems, IncreaseOrderNumber());
            OrderOperation.prepareOrder(customer, order);
            OrderOperation.deliverOrder(customer, order);
            System.out.println("----------------------------Completed Order-------------------------");
        }
    }
}