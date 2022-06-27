package threads;

import model.food.Item;
import model.order.Customer;
import model.order.OrderInfo;
import model.ordersDetails.orders;

import java.util.List;

public class OrderOperation {
    public static OrderInfo takeOrder(Customer customer, List<Item> pizzaItem, int order) {
        OrderInfo info = new OrderInfo();
        info.setOrderId(order);
        info.setItems(pizzaItem.get(orders.getOrder(customer)));
        info.setCustomer(customer);
        return info;
    }

    public static void prepareOrder(Customer customer, OrderInfo order) {

        System.out.println ("Order for customer - " + customer.getName() + " " + order);
    }

    public static void deliverOrder(Customer customer, OrderInfo order) {

        System.out.println("Order Id - " + order.getOrderId());
        System.out.println("Order preparation time - " + order.getItems().getPreparationTime());
        System.out.println("Order ready for - " + customer.getName());
        System.out.println("Delivering for customer - " + customer.getName() + ". Enjoy Delicious " + order.getItems().getItemName());
    }
}
