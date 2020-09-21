package by.kukshinov.app.password_comparer.view.impl;

import by.kukshinov.app.password_comparer.factories.PasswordEncoderFactory;
import by.kukshinov.app.password_comparer.view.DataPrinter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

import static by.kukshinov.app.password_comparer.factory_enums.Encoders.*;

public class FilePrinter implements DataPrinter {
    private final String FILE_PATH;

    public FilePrinter(String FILE_PATH) {
        this.FILE_PATH = FILE_PATH;
    }

    public void printData(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            String result = PasswordEncoderFactory.createEncoder(DUMP).encode(data);
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilePrinter that = (FilePrinter) o;
        return Objects.equals(FILE_PATH, that.FILE_PATH);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FILE_PATH);
    }
}
