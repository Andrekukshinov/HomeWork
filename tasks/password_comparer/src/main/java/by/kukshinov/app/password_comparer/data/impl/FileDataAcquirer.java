package by.kukshinov.app.password_comparer.data.impl;

import by.kukshinov.app.password_comparer.data.DataAcquirer;
import by.kukshinov.app.password_comparer.util.impl.DumpPasswordEncoder;

import java.io.*;

import static by.kukshinov.app.password_comparer.util.paths.FilePaths.TEST_RESOURCE_PASSWORDS;

public class FileDataAcquirer implements DataAcquirer {
    private final String filePath;

    public FileDataAcquirer(String filePath) {
        this.filePath = filePath;
    }

    public String getPassword() {
        String stringFromFile = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));) {
            stringFromFile = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringFromFile;
    }
}
