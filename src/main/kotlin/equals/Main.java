package equals;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Москва", "Зеленая", 150);
        Address address2 = new Address("Москва", "Зеленая", 150);
        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());

        if (address1.equals(address2)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
    }
}
