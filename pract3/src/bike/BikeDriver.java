package bike;

public class BikeDriver {
    public static void main(String[] args) {
        MountainBike bike1 = new MountainBike("MB100", 6, 25.5, "Front", "Hardtail");
        RoadBike bike2 = new RoadBike("RB200", 8, 35.2, "23mm", "18");

        System.out.println(bike1);
        System.out.println(bike2);

        // Тестируем методы
        bike1.setSuspension("Full");
        bike1.setType("Full-suspension");
        bike2.setTyreWidth("25mm");

        System.out.println(bike1);
        System.out.println(bike2);

        // Обновляем высоту столба (RoadBike)
        bike2.setPostHeight("20");

        System.out.println(bike2);

        // Тестируем геттеры
        System.out.println("\n=== Testing getters ===");
        System.out.println("Bike1 suspension: " + bike1.getSuspension());
        System.out.println("Bike2 tyre width: " + bike2.getTyreWidth());
        System.out.println("Bike2 post height: " + bike2.getPostHeight());
        System.out.println("Company: " + BikeParts.COMPANY);
    }
}