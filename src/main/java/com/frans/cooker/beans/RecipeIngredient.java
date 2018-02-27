package com.frans.cooker.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity(name = "RECIPES_INGREDIENTS")
public class RecipeIngredient implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "INGREDIENT_ID")
    private Ingredient ingredient;

    @Id
    @ManyToOne
    @JoinColumn(name = "RECIPE_ID")
    private Recipe recipe;

    @Column(name = "QUANTITY")
    private BigDecimal quantity;

    @Column(name = "UNIT")
    @Enumerated(EnumType.STRING)
    private Unit unit;

}
