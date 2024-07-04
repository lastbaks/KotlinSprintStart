package org.example.lesson_11

class Dish(
    val id: Int,
    var name: String,
    var image: String,
    val ingredients: MutableMap<Ingredient, Int>,
    var inFavorites: Boolean = false,
) {
    fun addToFavorites() {
        inFavorites = true
    }

    fun removeFromFavorites() {
        inFavorites = false
    }

    fun changeDishName() {
        name = readln()
    }

    fun changeDishImage() {
        image = readln()
    }

    fun addIngredient(ingredient: Ingredient, amount: Int) {
        ingredients.put(ingredient, amount)
    }

    fun removeIngredient(ingredient: Ingredient) {
        ingredients.remove(ingredient)
    }
}

class Ingredient(
    val id: Int,
    val name: String,
    val unit: String,
) {
    fun addNewIngredient() {
        val ingredientName = readln()
        println("новый ингридиент $ingredientName добавлен")
    }
}

class Category(
    val id: Int,
    val name: String,
    val image: String,
    val dishesInCategory: MutableList<Dish>
) {
    fun addNewCategory() {
        val categoryName = readln()
        println("новая категория $categoryName добавлена")
    }
}