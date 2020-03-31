package excercises.jj.lambda;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import static excercises.jj.lambda.ForCopy.*;

public class Kopiuj {

    public static void runTestCopy() {
        System.out.println("---------------------TEST KOPIOWANIA-------------------");
        double fileUtils = 0.0;
        double NIO = 0.0;
        double IOS = 0.0;

        try {
            String path = new File(".").getCanonicalPath();
            File source = new File(path + "/src/main/java/excercises/jj/lambda/source.txt");
            File target = new File(path + "/src/main/java/excercises/jj/lambda/target.txt");

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
