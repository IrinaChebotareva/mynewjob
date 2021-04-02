package Utils;
import java.io.*;



    public class WriteInFiles {

    // создание файла
        public String fileCreate1() {
            try {
                File file;
                file = new File("C://Job/text335.txt");
                file.createNewFile();

            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        return "";
        }


        //запись переменной в файл
        public void fileWrite1 (String b) {

            try (FileWriter writer = new FileWriter("C://Job/text335.txt",false)) {

                // запись всей строки
                writer.write(b);
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }


}
