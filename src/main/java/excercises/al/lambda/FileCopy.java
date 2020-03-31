package excercises.al.lambda;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

@FunctionalInterface
public interface FileCopy {
    FileCopy useInputOutputStream = (source, target) -> {
        try (FileInputStream in = new FileInputStream(source);
             FileOutputStream out = new FileOutputStream(target)) {
            int anotherByte;

            while (((anotherByte = in.read()) != -1)) {
                out.write(anotherByte);
            }
        }
    };

    FileCopy useChannels = ((source, target) -> {
        try (FileChannel sourceChannel = new FileInputStream(source).getChannel();
             FileChannel targetChannel = new FileOutputStream(target).getChannel()) {
            targetChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        }
    });

    FileCopy useApacheCommonsIO = FileUtils::copyFile;

    void copy(File source, File target) throws IOException;
}
