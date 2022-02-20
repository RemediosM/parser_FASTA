package com.jfzo.parser_FASTA.file;

import java.util.ArrayList;
import java.util.List;

public class FileStatistics {

    public int sequenceCounter(String path) {
        FileReader fileReader = new FileReader();
        List<String> file = fileReader.readFile(path);
        int count = 0;

        List<String> names = new ArrayList<>();
        List<Integer> lineNumbers = new ArrayList<>();

        for (int i = 0; i < file.size(); i++) {
            if (">".equals(String.valueOf(file.get(i).charAt(0)))) {
                names.add(file.get(i).substring(1));
                lineNumbers.add(i);
                count++;
            }
        }


        System.out.println("Liczba sekwencji w pliku: " + count);
        for(int i = 0; i< names.size(); i++){
            System.out.println("Nazwa " + (i + 1) + ". sekwencji: " + names.get(i) );
        }

        System.out.println(lineNumbers);

        return count;

    }
}