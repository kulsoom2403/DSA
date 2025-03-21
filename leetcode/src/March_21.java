import java.util.*;

public class March_21 {


    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, Integer> indegree = new HashMap<>();
        Map<String, List<String>> ingredientToRecipe = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        Set<String> available = new HashSet<>(Arrays.asList(supplies));
        List<String> result = new ArrayList<>();

        // Step 1: Build Graph
        for (int i = 0; i < recipes.length; i++) {
            String recipe = recipes[i];
            List<String> ingList = ingredients.get(i);
            indegree.put(recipe, ingList.size());  // Number of ingredients needed

            for (String ing : ingList) {
                ingredientToRecipe.computeIfAbsent(ing, k -> new ArrayList<>()).add(recipe);
            }
        }

        // Step 2: Initialize Queue with available supplies
        queue.addAll(available);

        // Step 3: Process queue
        while (!queue.isEmpty()) {
            String ingredient = queue.poll();

            // If the ingredient is a recipe itself, add to result
            if (indegree.containsKey(ingredient)) {
                result.add(ingredient);
            }

            // Check recipes that depend on this ingredient
            for (String recipe : ingredientToRecipe.getOrDefault(ingredient, new ArrayList<>())) {
                indegree.put(recipe, indegree.get(recipe) - 1);
                if (indegree.get(recipe) == 0) {  // Recipe can be made now
                    queue.add(recipe);
                    available.add(recipe);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        March_21 solver = new March_21();
        String[] recipes = {"bread", "sandwich", "burger"};
        List<List<String>> ingredients = Arrays.asList(
                Arrays.asList("flour", "water"),
                Arrays.asList("bread", "ham"),
                Arrays.asList("sandwich", "cheese")
        );
        String[] supplies = {"flour", "water", "ham", "cheese"};

        System.out.println(solver.findAllRecipes(recipes, ingredients, supplies));

    }
}
