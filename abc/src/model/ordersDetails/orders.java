package model.ordersDetails;

import model.order.Customer;

public class orders {
    public static int getOrder(Customer customer)
    {
        String name = customer.getName();
        int i = 0;
        switch (name)
        {
            case "rithika":
                i = 1;
                break;
            case "sruthi":
            case "ajay":
                i = 2;
                break;
            case "priya":
                i = 3;
                break;
            case "anjali":
                i = 0;
                break;
        }
        return i;
    }
}
