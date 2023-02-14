package work13;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Work13 {

    public static void Work13() throws IOException {

        String adress = "c://Users//yana//Desktop//Java//";
        String from = "from";
        String to = from + "_копия";
        File file_from = new File(adress + from + ".txt");
        File file_to = new File(adress + to + ".txt");
        File file_log = new File(adress + "log.txt");

        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        String formatedDateTime = current.format(format);

        FileWriter writer = new FileWriter(file_from);
        writer.write("Hogwarts, Hogwarts, Hoggy Warty Hogwarts,\n" + "Teach us something please,\n" +
                "Whether we be old and bald\n" +  "Or young with scabby knees,\n" +
                "Our heads could do with filling\n" + "With some interesting stuff,\n" +
                "For now they’re bare and full of air,\n" + "Dead flies and bits of fluff,\n" +
                "So teach us things worth knowing,\n" + "Bring back what we’ve forgot,\n" +
                "just do your best, we’ll do the rest,\n" + "And learn until our brains all rot.");
        writer.close();

        try(FileInputStream input = new FileInputStream(file_from);
            FileOutputStream output = new FileOutputStream(file_to);
            FileWriter writer_logs = new FileWriter(file_log, true))
        {
            byte[] buffer = input.readAllBytes();
            output.write(buffer);

            writer_logs.write(formatedDateTime  + " был скопирован файл " + from + " → " + to);
        }

    }
}
