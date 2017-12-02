package lesson5.labs.prob3;

final public class CustOrderFactory {
  private CustOrderFactory() {}

  public static CustAndOrder createCustAndOrder(String name, LocalDate orderDate) {
    Customer c = new Customer(name);
    Order o = new Order(orderDate);
    c.setOrder(o);
    o.setCustomer(c);
    return new CustOrderImpl(c, o);
  }
}
