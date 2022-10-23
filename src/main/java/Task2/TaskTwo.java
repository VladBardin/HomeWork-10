package Task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) throws IOException {
        InputStream file = Files.newInputStream(Paths.get("file2.txt"));
        Scanner scanner = new Scanner(file);

        String titleline = scanner.nextLine();
        String[] titledata = titleline.split(" ");

        ArrayList<Object> list = new ArrayList<>();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] data = line.split(" ");

            String name = data[0];
            Integer age = Integer.parseInt(data[1]);

            User user = new User();
            user.setUserName(name);
            user.setUserAge(age);
            list.add(user);
        }
        scanner.close();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String s = gson.toJson(list);

        OutputStream fos = Files.newOutputStream(Paths.get("user.json"));
        fos.write(s.getBytes());

        Writer fw = new FileWriter("user.json");
        gson.toJson(list, fw);

        fw.flush();
        fw.close();
    }

}



