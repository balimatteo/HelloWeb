/*
package com.example.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static final String FILE_PATH = "src/main/resources/data.json";
    private static final Gson gson = new Gson();

    // Metodo per caricare i dati dal file JSON
    public static List<String> caricaDati() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return new ArrayList<>();  // Se il file non esiste, restituisco una lista vuota
        }

        try (Reader reader = new FileReader(FILE_PATH)) {
            Type listType = new TypeToken<List<String>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // Metodo per salvare i dati nel file JSON
    public static void salvaDati(List<String> dati) {
        try (Writer writer = new FileWriter(FILE_PATH)) {
            gson.toJson(dati, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/