package com.ackermandr.springrecipeproject.services;

import com.ackermandr.springrecipeproject.commands.RecipeCommand;
import com.ackermandr.springrecipeproject.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long id);
    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
    RecipeCommand findCommandById(Long id);
    void deleteById(Long id);
}
