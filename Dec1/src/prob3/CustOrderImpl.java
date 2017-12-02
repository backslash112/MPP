package lesson5.labs.prob3;

final class CustOrderImpl implements CustAndOrder {
  private Customer customer;
  private Order order;

  public CustOrderImpl(Customer c, Order o) {
    customer = c;
    order = o;
  }

  public Customer getCustomer() {
    return customer;
  }

  public Order getOrder() {
    return order;
  }
}
