package com.jfzo.parser_FASTA.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReader {

    public List<String> readFile(String file) {
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(Paths.get(file));
            result.removeAll(Arrays.asList("", null));
        }catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nZawartość pliku: \n");
        for(String s : result){
            System.out.println(s);
        }

        System.out.println("_______________________________________________________");
        return result;
    }
}
