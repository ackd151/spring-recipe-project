package com.ackermandr.springrecipeproject.repositories;

import com.ackermandr.springrecipeproject.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {



}
