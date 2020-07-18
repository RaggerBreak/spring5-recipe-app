package com.springframework.controllers;

import com.springframework.domain.Category;
import com.springframework.domain.UnitOfMeasure;
import com.springframework.repositories.CategoryRepository;
import com.springframework.repositories.UnitOfMeasureRepository;
import com.springframework.services.RecipeService;
import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}


