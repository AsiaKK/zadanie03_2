public class Main {

    public static void main(String[] args) {
        Fridge fridge1 = new Fridge("black", 2.2,6.7, 2);
        Fridge fridge2 = new Fridge("white", 2.0, 5.0, 1);

        System.out.println("Data for Fridge1:");
        System.out.println("Colour:" + fridge1.colour);
        System.out.println("Height and width: " + fridge1.height + ", " + fridge1.width);
        System.out.println("Number of doors: " + fridge1.numberOfDoors);

        System.out.println("Data for Fridge2: ");
        System.out.println("Colour:" + fridge2.colour);
        System.out.println("Height and width: " + fridge2.height + ", " + fridge2.width);
        System.out.println("Number of doors: " + fridge2.numberOfDoors);

    }

}
