package excercises.at.lambda;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;


public interface CopyFileInterface {
    void copy(File source, File target) throws IOException;

    CopyFileInterface useIOStream = (source, target) -> {
        try(FileInputStream in = new FileInputStream(source);
            FileOutputStream out = new FileOutputStream(target)) {
            int readByte;
            while(((readByte=in.read())!=-1)) {
                out.write(readByte);
            }
        }
    };

    CopyFileInterface useApacheCommonsIO = FileUtils::copyFile;

    CopyFileInterface useJavaFiles= (source, target) -> Files.copy(source.toPath(), target.toPath());
}
