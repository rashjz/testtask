import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Mobby on 2/28/2017.
 */
public class WriteToFile {

    //output file is located at root folder
    //each time we append string new to line with System.getProperty("line.separator")
    //after write to output file writer must be close
    public static void writeToOutputFile(List<Result> results) {
        File file = new File("output.txt");
        System.out.printf("File is located at %s%n", file.getAbsolutePath());
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            for (Result result : results) {
                System.out.println(result.toString());
                writer.write(result.toString() + System.getProperty("line.separator"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) try {
                writer.close();
            } catch (IOException ignore) {
            }
        }


    }

}
