import leap_year.Leap;
import welcome.Header;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start("leap");


    }

    public static void start(String project) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Header.header(project));

        String res = "";
        var year = scan.nextInt();
        if (project.equals("leap")) {
            res = String.format("%d is a leap year", year);
        } else {
            res = String.format("%d is not a leap year", year);
        }
        System.out.println(res);
    }
}

