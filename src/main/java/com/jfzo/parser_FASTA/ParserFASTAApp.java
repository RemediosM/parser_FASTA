package com.jfzo.parser_FASTA;

import com.jfzo.parser_FASTA.file.FileReader;
import com.jfzo.parser_FASTA.file.FileStatistics;

import java.util.List;

public class ParserFASTAApp {
    public static void main(String[] args) {

        String path = "fasta.txt";

        FileStatistics fileStatistics = new FileStatistics();
        fileStatistics.sequenceCounter(path);

    }
}
