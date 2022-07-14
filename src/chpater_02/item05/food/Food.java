package chpater_02.item05.food;

import java.util.List;

public interface Food {
    boolean contains(String name);
    List<String> closeWordsTo(String typo);
}
