package main.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    private List<String> lines;

    public FileHandler() {
        this.lines = new ArrayList<>();
    }

    public List<String> load(String path) throws FileNotFoundException {
        BufferedReader input = new BufferedReader(new FileReader(path));
        return null;
    }
}
