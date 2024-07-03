package org.example.lesson_11

class Dish(
    val dishId: Int,
    var dishName: String,
    var dishImage: String,
    val category: Category,
    val ingredients: MutableList<Ingredient>,
    val countOfIngredient: MutableMap<MutableList<Ingredient>, Int>,
    var inFavorites: Boolean = false,
) {
    fun addToFavorites() {
        inFavorites = true
    }

    fun removeFromFavorites() {
        inFavorites = false
    }

    fun changeDishName() {
        dishName = readln()
    }

    fun changeDishImage() {
        dishImage = readln()
    }

    fun addIngredient(ingredient: Ingredient) {
        ingredients.add(ingredient)
    }

    fun removeIngredient(ingredient: Ingredient) {
        ingredients.remove(ingredient)
    }
}

class Ingredient(
    val ingredientId: Int,
    val ingredientName: String,
    val ingredientUnit: String,
) {
    fun addNewIngredient() {
        val ingredientName = readln()
        println("новый ингридиент $ingredientName добавлен")
    }
}

class Category(
    val categoryId: Int,
    val categoryName: String,
    val categoryImage: String,
) {
    fun addNewCategory() {
        val categoryName = readln()
        println("новая категория $categoryName добавлена")
    }
}