import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        List<Integer> howMany = new ArrayList<>();
        for (String nameIngredient : recipe.keySet()) {
            if (available.get(nameIngredient) == null) return 0;
            howMany.add(available.get(nameIngredient) / recipe.get(nameIngredient));
        }

        return howMany.stream().min((a, b) -> a-b).orElse(0);
    }
}