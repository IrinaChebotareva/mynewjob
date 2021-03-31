package Utils;
import java.io.*;
import Utils.WriteInFiles;


public class WriteInFiles {

    // создание файла
public static void fileCreate1 () throws Exception{
        File file = new File("C:\\Job", "text.txt");

    }


// запись переменной в файл
public static void fileWrite1 (String b) {

    try(FileWriter writer = new FileWriter("file", false))
    {
        // запись всей строки

        writer.write(b);
        // запись по символам
        writer.append('\n');
        writer.append('E');

        writer.flush();
    }
    catch(IOException ex){

        System.out.println(ex.getMessage());
    }




//       try (FileOutputStream fos = new FileOutputStream("file")) {
//           // перевод строки в байты
//           byte[] buffer = b.getBytes();
//
//           fos.write(buffer, 0, buffer.length);
//       } catch (IOException ex) {
//
//           System.out.println(ex.getMessage());
//       }

   }

}
