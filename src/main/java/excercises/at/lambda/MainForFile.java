package excercises.at.lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class MainForFile {
    public static void main(String[] args) throws IOException {

        File source = new File("src/main/java/excercises/at/lambda/source.txt");
        File target = new File("src/main/java/excercises/at/lambda/target.txt");
        double copyTimeIOStream = calculateFileCopyTime(CopyFileInterface.useIOStream, source, target);
        double copyTimeApacheCommonsIO = calculateFileCopyTime(CopyFileInterface.useApacheCommonsIO, source, target);
        target.delete();
        double copyTimeJavaFile = calculateFileCopyTime(CopyFileInterface.useJavaFiles, source, target);
        System.out.println("Copy time using IO Stream: " + copyTimeIOStream);
        System.out.println("Copy time using Apache Commons IO: "+ copyTimeApacheCommonsIO);
        System.out.println("Copy time using Java Files: "+ copyTimeJavaFile);
    }

    public static double calculateFileCopyTime(CopyFileInterface copyFile, File source, File target) throws IOException{
        long startTime = System.currentTimeMillis();
        copyFile.copy(source, target);
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

}
