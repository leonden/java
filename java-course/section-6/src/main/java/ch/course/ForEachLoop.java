package ch.course;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] names = {"Leon", "Leonardo", null, "Leo"};

        for (String name : names) {
            System.out.println(name);
        }

        int counter = 1;
        for (String name : names) {
            if (name == null)
                break; // or "continue"
            System.out.println(counter + ". " + name);
            counter++;
        }

    }
}
