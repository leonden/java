package ch.coop.hocl1.serviceunit.dao;

import ch.coop.hocl1.serviceunit.model.Cat;
import ch.coop.hocl1.serviceunit.model.CatResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalReaderDao {

    private static final Gson GSON = new Gson();

    public List<Cat> readCatsFromResources() {
        try (InputStream fileInputStream = getClass().getClassLoader().getResourceAsStream("cats.json")) {
            String jsonString = new String(fileInputStream.readAllBytes(), StandardCharsets.UTF_8);

            CatResponse catResponse = GSON.fromJson(jsonString, TypeToken.get(CatResponse.class));


            return catResponse.getCats();
        } catch (IOException e) {
            // doe something. mazbe log
        }

        return new ArrayList<>();
    }

}
