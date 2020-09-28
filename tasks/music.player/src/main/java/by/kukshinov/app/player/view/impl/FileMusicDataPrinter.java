package by.kukshinov.app.player.view.impl;

import by.kukshinov.app.player.constants.FilePath;
import by.kukshinov.app.player.entity.storage.api.DataStorage;
import by.kukshinov.app.player.view.api.MusicDataPrinter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileMusicDataPrinter implements MusicDataPrinter {
    private final String FILE_OUTPUT_PATH;

    public FileMusicDataPrinter(String FILE_OUTPUT_PATH) {
	   this.FILE_OUTPUT_PATH = FILE_OUTPUT_PATH;
    }

    @Override
    public void printLength(DataStorage disk) {
	   try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_OUTPUT_PATH))){
		  writer.write("Total playlist length is " + disk.getTotalLength());
	   } catch (IOException e) {
		  throw new RuntimeException(e);
	   }
    }

    @Override
    public void printSongsData(DataStorage disk) {
	   try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_OUTPUT_PATH))){
		  writer.write("The playlist is " + disk.getFakeSongsStorage());
	   } catch (IOException e) {
	       throw new RuntimeException(e);
	   }
    }

}
