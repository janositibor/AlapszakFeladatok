package o13_lambdastreams.baseoperations;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Operations {
    private List<Integer> numbers;

    public Operations(List<Integer> numbers) {
        this.numbers = numbers;
    }
    public Optional<Integer> min(){
        return numbers.stream()
                .min((i, j) -> i.compareTo(j));

    }
    public int sum(){
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public boolean isAllPositive(){
        return numbers.stream()
                .allMatch(number -> number>=0);
    }
    public Set<Integer> getDistinctElements(){
        return numbers.stream()
                .distinct()
                .collect(Collectors.toSet());
    }
}
