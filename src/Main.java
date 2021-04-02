import Utils.ReadFiles;
import Utils.WriteInFiles;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        String a = "adsfasdfasdf";

        WriteInFiles newFile = new WriteInFiles();


        newFile.fileCreate1();
        newFile.fileWrite1(a);


        ReadFiles readFile2 = new ReadFiles();
        readFile2.readFile11("text335.txt");

    }
}
