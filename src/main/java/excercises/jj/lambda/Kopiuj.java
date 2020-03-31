package excercises.jj.lambda;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import static excercises.jj.lambda.ForCopy.*;

public class Kopiuj {

    public static void main(String[] args) {
        String path = "";
        try {
             path = new File(".").getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File source = new File(path + "/src/main/java/excercises/jj/lambda/source.txt");
        File target = new File(path + "/src/main/java/excercises/jj/lambda/target.txt");

        double fileUtils = 0.0;
        double NIO = 0.0;
        double IOS = 0.0;

        try {
           fileUtils =  testCopyMethodTime(copyByFileUtils, source , target);
           NIO = testCopyMethodTime(copyByNIO, source , target);
           IOS = testCopyMethodTime(copyByIOS, source , target);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("FILE UTILS : "+ fileUtils + "\nNIO : "+NIO+ "\nIOS : "+IOS);

    }



    public static double testCopyMethodTime(ForCopy method, File source, File target) throws IOException {
        long start = System.currentTimeMillis();

        method.copy(source, target);

        long  end = System.currentTimeMillis();
        return end - start;
    }
}
