import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase("MyBirdDatabase");

        Bird bird1 = new Bird("Martinet", "Martinus Martinus", 0);
        Bird bird2 = new Bird("Colom", "Palominus Palominus", 0);
        Bird bird3 = new Bird("Gavina", "Gavius Gavius", 0);
        db.addBirdToDatabase(bird1);
        db.addBirdToDatabase(bird2);
        db.addBirdToDatabase(bird3);

        while (true) {
            String command = ask(scanner, "Option?");
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add(scanner,db);
            } else if (command.equals("Observation")) {
                observation(scanner,db);
            } else if (command.equals("Show")) {
                show(scanner,db);
            } else if (command.equals("Statistics")) {
                statistics(scanner,db);
            } else {
                System.out.println("Unknown command!");
            }
        }
    }

    public static String ask(Scanner input, String option) {
        System.out.println(option);
        String data = input.nextLine();
        return data;
    }

    public static void add(Scanner input, BirdDatabase db) {

    }

    public static void observation(Scanner input, BirdDatabase db) {
        String birdName = ask(input, "Give the seen bird's name: ");
        Bird bird = db.getBirdsDatabase().get(birdName);
        bird.addObservation();
        System.out.println("Current observations for " + birdName + " are " + bird.getObservations());
    }

    public static void show(Scanner input, BirdDatabase db) {
        String birdname = ask(input, "Give the bird's name to show: ");
        Bird bird = db.getBirdsDatabase().get(birdname);
        System.out.println(bird.toString());
    }

    public static void statistics(Scanner input, BirdDatabase db) {
        String birdName = ask(input, "Give the bird's name to display observations: ");
        Bird bird = db.getBirdsDatabase().get(birdName);
        System.out.println("Current observations for " + birdName + " are " + bird.getObservations());
    }

}
