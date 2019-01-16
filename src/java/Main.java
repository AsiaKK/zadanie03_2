public class Main {

    public static void main(String[] args) {
        Fridge fridge1 = new Fridge();
        fridge1.colour = "black";
        fridge1.height = 2.2;
        fridge1.width = 6.7;
        fridge1.numberOfDoors = 2;

        Fridge fridge2 = new Fridge();
        fridge2.colour = "white";
        fridge2.height = 2.0;
        fridge2.width = 5.0;
        fridge2.numberOfDoors = 1;

        System.out.println("Data for Fridge1: ");
        System.out.println("Colour:" + fridge1.colour);
        System.out.println("Height and width: " + fridge1.height + ", " + fridge1.width);
        System.out.println("Number of doors: " + fridge1.numberOfDoors);

        System.out.println("Data for Fridge2: ");
        System.out.println("Colour:" + fridge2.colour);
        System.out.println("Height and width: " + fridge2.height + ", " + fridge2.width);
        System.out.println("Number of doors: " + fridge2.numberOfDoors);

    }

}
