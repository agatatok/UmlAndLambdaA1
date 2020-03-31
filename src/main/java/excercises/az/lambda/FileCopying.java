package excercises.az.lambda;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public interface FileCopying {
    void copy(File sources, File target) throws IOException;

    //dowolnie wybrane sposoby (stream, NIO, etc)

    //użycie lambd
     FileCopying useIOStream = (source, target) -> {
        try(FileInputStream in = new FileInputStream(source);
            FileOutputStream out = new FileOutputStream(target)){
            int i;
            while(((i = in.read()) != -1)) {
                out.write(i);
            }
        }
    };
}
