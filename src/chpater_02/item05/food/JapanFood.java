package chpater_02.item05.food;

import java.util.List;

public class JapanFood implements Food{
    @Override
    public boolean contains(String name) {
        return false;
    }

    @Override
    public List<String> closeWordsTo(String typo) {
        return null;
    }
}
