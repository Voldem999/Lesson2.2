public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Сара", 30, 112),
                new Person("Джон", 12, 113),
                new Person("Иван", 25, 114),
                new Person("Том", 35, 115),
                new Person("Джо", 23, 116),

        };

        Customer[] customers = {
                new Customer("Сара", 30, 112, 111321),
                new Customer("Иван", 25, 114, 111322),
                new Customer("Том", 35, 115, 111323),
        };

        Gamer[] gamers = {
                new Gamer("Джо", 23, 116, "PS"),
                new Gamer("Джон", 12, 113, "PC"),
        };

        PrintService printService = new PrintService();
        printService.print(people);
        printService.print(customers);
        printService.print(gamers);
    }
}