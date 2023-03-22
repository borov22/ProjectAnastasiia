package com.ua.tsaran.homework20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class TranslateMap {
    private Map<String, String[]> map;

    public TranslateMap() {
        map = new HashMap<>();
        map.put("Кабан", new String[]{"Boar", "イノシシ", "Wildschwein"});
        map.put("Пістолет", new String[]{"Gun", "ピストル", "Pistole"});
        map.put("Квітка", new String[]{"Flower", "花", "Blume"});
        map.put("Жінка", new String[]{"Woman", "女性", "Frau"});
        map.put("Час", new String[]{"Time", "時間", "Zeit"});
        map.put("Іграшка", new String[]{"Toy", "おもちゃ", "Spielzeug"});
        map.put("Метелик", new String[]{"Butterfly", "バタフライ", "Schmetterling"});
        map.put("Холод", new String[]{"Cold", "コールド", "Kalt"});
        map.put("Вишня", new String[]{"Cherry", "チェリー", "Kirsche"});
        map.put("Свічка", new String[]{"Candle", "蝋燭", "Kerzen"});
    }

    public String[] getTranslations(String word) {
        return map.get(word);
    }


}



