package Utils;
import java.io.FileReader;
import java.util.Scanner;


public class ReadFiles {

    // вывод содержимого файла на консоль

    public static String readFile11 (String file1) throws Exception{
        FileReader in = new FileReader("C://Job/text335.txt");
        Scanner scan = new Scanner(in);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
            i++;
        }
        in.close();
        return "";
    }
}
