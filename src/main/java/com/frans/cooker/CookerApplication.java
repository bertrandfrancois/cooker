package com.frans.cooker;

import com.frans.cooker.repository.IngredientRepository;
import com.frans.cooker.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication
public class CookerApplication implements CommandLineRunner {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private RecipeRepository recipeRepository;

    public static void main(String[] args) {
        SpringApplication.run(CookerApplication.class, args);
    }


    @Override
    @Transactional
    public void run(String... args) throws Exception {
//        Recipe recipe = new Recipe();
//        Ingredient ingredient = new Ingredient("viande");
//        Ingredient ingredient2 = new Ingredient("tomate");
//
//        RecipeIngredient recipeIngredient = new RecipeIngredient();
//        RecipeIngredient recipeIngredient2 = new RecipeIngredient();
//
//        recipe.setDescription("sauce bolognaise");
//
//        recipeIngredient.setRecipe(recipe);
//        recipeIngredient.setQuantity(new BigDecimal("1.0"));
//        recipeIngredient.setUnit(Unit.CL);
//        recipeIngredient.setIngredient(ingredient);
//
//        recipeIngredient2.setRecipe(recipe);
//        recipeIngredient2.setQuantity(new BigDecimal("1.0"));
//        recipeIngredient2.setUnit(Unit.CL);
//        recipeIngredient2.setIngredient(ingredient2);
//
//        recipe.addRecipeIngredient(recipeIngredient);
//        recipe.addRecipeIngredient(recipeIngredient2);
//
//        ingredientRepository.save(ingredient);
//        ingredientRepository.save(ingredient2);
//        recipeRepository.save(recipe);
//
//        Recipe result = recipeRepository.findAll().get(0);
//        result.getRecipeIngredients().remove(recipeIngredient);
//        recipeRepository.save(result);
//        result = recipeRepository.findAll().get(0);


    }
}
