package mainpackage;

import java.util.Scanner;

public class CititorTastatura {

    private String message;
    private String source;

    public CititorTastatura(String message, String source) {
        this.message = message;
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public void citesteTastatura() {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        this.message = message;
        scanner.close();
    }

}
