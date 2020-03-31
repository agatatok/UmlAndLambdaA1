package excercises.jj.lambda;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public interface ForCopy {
    void copy(File source, File target) throws IOException;

    ForCopy copyByIOS = (src, target) -> {
        try (FileInputStream in = new FileInputStream(src);
             FileOutputStream out = new FileOutputStream(target)) {
            int anotherByte;

            while ((anotherByte = in.read()) != -1) {
                out.write(anotherByte);
            }
        }
    };

    ForCopy copyByFileUtils = FileUtils::copyFile;
    ForCopy copyByNIO = (source, target) ->
            Files.copy(Path.of(source.getPath()), Path.of(source.getPath()),
                    StandardCopyOption.REPLACE_EXISTING);

}


