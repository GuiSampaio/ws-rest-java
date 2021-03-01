import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] results = { "*--", "**-", "", "---", "", "---", "*--", "*--", "**-" };
        String[] hours = { "11:00", "13:13", "10:00", "15:50" };

        printOneToHundred();
        angryMarvinBirds(results);
        creepyHours(hours);

    }

    // Questão 1 - Fizzing 'n buzzing
    static void printOneToHundred() {

        int ini;
        int end;

        ini = 1;
        end = 100;

        while (ini <= end) {

            if (ini % 15 == 0) {
                System.out.println("FizzBuzz" + " ");
            } else if (ini % 5 == 0) {
                System.out.println("Buzz" + " ");
            } else if (ini % 3 == 0) {
                System.out.println("Fizz" + " ");
            } else {
                System.out.println(ini + " ");
            }

            ini++;
        }
    }

    // Questão 2 - Angry Marvin Birds
    static void angryMarvinBirds(String[] results) {
        System.out.println(Arrays.toString(results));
        int total = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i].equals("---")) {
                total += 0;
            } else if (results[i].equals("*--")) {
                total += 1;
            } else if (results[i].equals("**-")) {
                total += 2;
            } else if (results[i].equals("***")) {
                total += 3;
            }

        }
        System.out.println("Total is: " + total);
    }

    // Questão 3 - Creepy hours
    static void creepyHours(String[] hours) {
        List<String> validFormats = Arrays.asList("AB:AB", "AA:BB", "AB:BA", "AA:AA");
        int result = 0;
        for (int i = 0; i < hours.length; i++) {

            String hora[] = hours[i].split(":");
            String hh = hora[0];
            String mm = hora[1];

            String patternA = "";
            String patternB = "";

            if (hh.substring(0, 1).equals(hh.substring(1))) {
                patternA = "AA";
            } else if (!hh.substring(0, 1).equals(hh.substring(1))) {
                patternA = "AB";
            }

            if (mm.substring(0, 1).equals(mm.substring(1))) {
                patternB = "AA";
            } else if (hh.substring(1).equals(mm.substring(0, 1))) {
                patternB = "BA";
            } else if (!mm.substring(0, 1).equals(mm.substring(1))) {
                patternB = "AB";
            }
            String pattern = patternA.concat(":" + patternB);

            if (validFormats.contains(pattern)) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}