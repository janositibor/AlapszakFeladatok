package o14_lambdaintermediate;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongWords {
    private List<String> wordsList;

    public LongWords(List<String> wordsList) {
        this.wordsList = wordsList;
    }

    public Optional<String> getShortestWordContainingGivenCharacter(char character){
        return wordsList.stream()
                .filter(word -> word.indexOf(character)>=0)
                .sorted(Comparator.comparing(String::length))
                .findFirst();
    }
    public String getShortestWordAsStringContainingGivenCharacter(char character){
        return wordsList.stream()
                .filter(word -> word.indexOf(character)>=0)
                .sorted(Comparator.comparing(String::length))
                .findFirst()
                .get();
    }

    public List<String> getLongerWords(int number){
        return wordsList.stream()
                .filter(word -> word.length()>number)
                .collect(Collectors.toList());
    }

    public long getNumberOfWordsStartWith(String keyWord){
        return wordsList.stream()
                .filter(word -> word.startsWith(keyWord))
                .count();
    }

    public List<String> getWordsList() {
        return wordsList;
    }
}
