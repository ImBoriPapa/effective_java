package chpater_02.item05;

import java.util.ArrayList;
import java.util.List;

//public class SpellChecker {
//    private static final Lexicon dictionary = new Lexicon();
//
//    private SpellChecker() {}
//
//    public static boolean isValid(String word){return true;};
//    public static List<String> suggestions(String typo){return new ArrayList<>();}
//
//
//}

//public class SpellChecker {
//    private  final Lexicon dictionary = new Lexicon();
//
//    private SpellChecker() {}
//    public static SpellChecker INSTANCE = new SpellChecker();
//
//    public static boolean isValid(String word){return true;};
//    public static List<String> suggestions(String typo){return new ArrayList<>();}
//}

public class SpellChecker {
    private  final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = dictionary;
    }

    public static boolean isValid(String word){return true;};
    public static List<String> suggestions(String typo){return new ArrayList<>();}
}



class Lexicon{}