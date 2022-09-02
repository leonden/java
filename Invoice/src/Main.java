public class Main {
    public static void main(String[] args) {

        Invoice invoice = new Invoice();

        Item item1 = new Item("Mobile Contract", 35.0);
        Item item2 = new Item("Keyboard", 95.0);
        Item item3 = new Item("Lens", 896.60);

        invoice.addItem(item1);
        invoice.addItem(item2);
        invoice.addItem(item3);

        Invoice.printInvoice();

    }
}
