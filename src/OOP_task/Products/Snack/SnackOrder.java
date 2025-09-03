package OOP_task.Products.Snack;

import OOP_task.People.Customer;

import java.util.ArrayList;
import java.util.List;

public class SnackOrder {
    private Customer customer;
    private List<Snack> snacks = new ArrayList<>();

    public SnackOrder(Customer customer) {
        this.customer = customer;
    }

    public void addSnack(Snack snack) {
        snacks.add(snack);
    }

    public double calculateTotal() {
        double total = 0;
        for (Snack s : snacks) {
            total += s.getPrice();
        }
        return total;
    }
}
