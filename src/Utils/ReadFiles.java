package Utils;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFiles {

    // вывод содержимого файла на консоль

    public static String readFile1 (String file1) throws Exception{
        BufferedReader in = new BufferedReader(new FileReader("file1"));
        String line = in.readLine();
        while (line != null) {
            System.out.println(line);
            line = in.readLine();
        }
        in.close();
        return "";
    }
}
