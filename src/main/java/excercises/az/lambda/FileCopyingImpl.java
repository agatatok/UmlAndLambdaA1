package excercises.az.lambda;

import java.io.File;
import java.io.IOException;

public class FileCopyingImpl{
    //3 Przetestowanie czasu kopiowania pliku:
    public static double fileCopyingTime(FileCopying fileCopying, File src, File trgt) throws IOException {
        long start = System.currentTimeMillis();
        fileCopying.copy(src, trgt);
        long end = System.currentTimeMillis();
        long duration = end - start;
        return duration;
    }
}
