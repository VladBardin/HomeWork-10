package Task1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskOne {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Files.newInputStream(Paths.get("file.txt"));
        Scanner scanner = new Scanner(inputStream);
        String regexPattern = "^[0-9]{3}-[0-9]{3}-[0-9]{4}$|^\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}$";
        Pattern pattern = Pattern.compile(regexPattern);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}