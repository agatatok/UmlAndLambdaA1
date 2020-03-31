package excercises.al.lambda;

import java.io.File;
import java.io.IOException;

public class FileCopier {
    public static void startCopyingFile(FileCopy fileCopy, String fromFile, String toFile) throws IOException {
        File source = new File(fromFile);
        File target = new File(toFile);

        double copyTime = measureCopyingTime(fileCopy, source, target);
        System.out.println(copyTime);
    }

    private static double measureCopyingTime(FileCopy fileCopy, File source, File target) throws IOException {
        long startTime = System.currentTimeMillis();
        fileCopy.copy(source, target);
        return System.currentTimeMillis() - startTime;
    }
}
