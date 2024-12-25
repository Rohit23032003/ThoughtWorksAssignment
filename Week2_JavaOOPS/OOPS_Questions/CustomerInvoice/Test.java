
package CustomerInvoice;
class Test {

    public static void main(String[] args) {

        Customer customer1 = new Customer(101, "Alice Johnson", 15);
        System.out.println(customer1);


        customer1.setDiscountPercentage(20);
        System.out.println("Updated Customer Details:");
        System.out.println(customer1);


        Invoice invoice1 = new Invoice(5001, customer1, 1200.0);
        System.out.println(invoice1);


        invoice1.setInvoiceAmount(1500.0);
        System.out.println("Updated Invoice Details:");
        System.out.println(invoice1);


        System.out.println("InvoiceID: " + invoice1.getInvoiceID());
        System.out.println("CustomerID: " + invoice1.getCustomerID());
        System.out.println("CustomerName: " + invoice1.getCustomerName());
        System.out.println("CustomerDiscount: " + invoice1.getCustomerDiscount() + "%");
        System.out.printf("Final Amount After Discount: $%.2f%n", invoice1.calculateFinalAmount());
    }
}
