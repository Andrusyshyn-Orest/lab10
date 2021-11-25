package example;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3};
//        ArrProcessor arrObj1 = new ArrProcessor(arr);
//        ArrProcessor arrObj2 = new ArrProcessor(arr);
//        arrObj1.square();
//        arrObj2.square();
//        System.out.println(arrObj1);
//        System.out.println(arrObj2);
        Day day = Day.MONDAY;
        System.out.println(day.toString());
        Planet planet = Planet.EARTH;
        System.out.println(planet.surfaceGravity());
    }
}
