package com.company.motorDepot.dao;

import com.company.motorDepot.model.Truck;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsonIO {
    private static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();

    public static String readJson(String path) {
        String json = "";
        try (FileReader fr = new FileReader(path)) {
            int c;
            while ((c = fr.read()) != -1) {
                json += (char) c;
            }
            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return json;
    }

    public static List<Truck> getTrucks() {
        Map<String, List<Truck>> moviesMap = GSON.fromJson(readJson("trucks.json"),
                new TypeToken<Map<String, List<Truck>>>() {
                }.getType());

        List<Truck> list = new ArrayList<>();

        for (Map.Entry<String, List<Truck>> t : moviesMap.entrySet()) {
            list.addAll(t.getValue());
        }
        return list;
    }

}

