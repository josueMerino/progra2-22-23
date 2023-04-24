package main.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private List<String> lines;

    public FileHandler() {
        this.lines = new ArrayList<>();
    }

    public List<String> read(String path) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(path));
        String line;
        while (input.readLine() != null)
        {
            line = input.readLine();
            this.lines.add(line);
        }
        return this.lines;
    }
}
