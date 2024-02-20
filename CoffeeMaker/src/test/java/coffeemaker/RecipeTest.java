package coffeemaker;

import coffeemaker.exceptions.RecipeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {

    @Test
    void testSetPrice() throws RecipeException {
        Recipe recipe = new Recipe();
        recipe.setPrice("3.99");
        assertEquals(3.99, recipe.getPrice());
    }

    @Test
    void testSetPriceRecipeException() throws RecipeException {
        Recipe recipe = new Recipe();
        // I really don't know what to do here.
        RecipeException e = assertThrows(RecipeException.class, () -> {recipe.setPrice("3..0");});
        RecipeException e2 = assertThrows(RecipeException.class, () -> {recipe.setPrice("-3.0");});
    }

    @Test
    void testSetChocolateRecipeException() throws RecipeException {
        Recipe recipe = new Recipe();
        // I really don't know what to do here.
        RecipeException e = assertThrows(RecipeException.class, () -> {recipe.setAmtChocolate("3..0");});
        RecipeException e2 = assertThrows(RecipeException.class, () -> {recipe.setAmtChocolate("-3");});
    }

    @Test
    void testSetMilkRecipeException() throws RecipeException {
        Recipe recipe = new Recipe();
        // I really don't know what to do here.
        RecipeException e = assertThrows(RecipeException.class, () -> {recipe.setAmtMilk("3..0");});
        RecipeException e2 = assertThrows(RecipeException.class, () -> {recipe.setAmtMilk("-3");});
    }

    @Test
    void testSetCoffeeRecipeException() throws RecipeException {
        Recipe recipe = new Recipe();
        // I really don't know what to do here.
        RecipeException e = assertThrows(RecipeException.class, () -> {recipe.setAmtCoffee("3..0");});
        RecipeException e2 = assertThrows(RecipeException.class, () -> {recipe.setAmtCoffee("-3");});
    }

    @Test
    void testSetMilkSugarException() throws RecipeException {
        Recipe recipe = new Recipe();
        // I really don't know what to do here.
        RecipeException e = assertThrows(RecipeException.class, () -> {recipe.setAmtSugar("3..0");});
        RecipeException e2 = assertThrows(RecipeException.class, () -> {recipe.setAmtSugar("-3");});
    }

    @Test
    void testGetPrice() throws RecipeException {
        Recipe recipe = new Recipe();
        recipe.setPrice("3.99");
        assertEquals(3.99, recipe.getPrice());
    }

    @Test
    void testGetAmtChocolate() throws RecipeException {
        Recipe recipe = new Recipe();
        recipe.setAmtChocolate("15");
        assertEquals(15, recipe.getAmtChocolate());
    }

    @Test
    void testSetAmtChocolate() throws RecipeException {
        Recipe recipe = new Recipe();
        recipe.setAmtChocolate("15");
        assertEquals(15, recipe.getAmtChocolate());
    }

    @Test
    void testSetCoffee() throws RecipeException {
        Recipe recipe = new Recipe();
        recipe.setAmtCoffee("15");
        assertEquals(15, recipe.getAmtCoffee());
    }

    @Test
    void testGetCoffee() throws RecipeException {
        Recipe recipe = new Recipe();
        recipe.setAmtCoffee("15");
        assertEquals(15, recipe.getAmtCoffee());
    }

    @Test
    void testSetMilk() throws RecipeException {
        Recipe recipe = new Recipe();
        recipe.setAmtMilk("15");
        assertEquals(15, recipe.getAmtMilk());
    }

    @Test
    void testGetMilk() throws RecipeException {
        Recipe recipe = new Recipe();
        recipe.setAmtMilk("15");
        assertEquals(15, recipe.getAmtMilk());
    }

    @Test
    void testSetSugar() throws RecipeException {
        Recipe recipe = new Recipe();
        recipe.setAmtSugar("15");
        assertEquals(15, recipe.getAmtSugar());
    }

    @Test
    void testGetSugar() throws RecipeException {
        Recipe recipe = new Recipe();
        recipe.setAmtSugar("15");
        assertEquals(15, recipe.getAmtSugar());
    }

    @Test
    void testSetName() {
        Recipe recipe = new Recipe();
        recipe.setName("Chicken Alfredo");
        assertEquals("Chicken Alfredo", recipe.getName());
    }

    @Test
    void testGetName() {
        Recipe recipe = new Recipe();
        recipe.setName("Chicken Alfredo");
        assertEquals("Chicken Alfredo", recipe.getName());
    }

    @Test
    void testToString() {
        Recipe recipe = new Recipe();
        recipe.setName("Cheese Sandwich");
        assertEquals("Cheese Sandwich", recipe.toString());
    }

    @Test
    void testEqualsTrue() throws RecipeException {
        Recipe recipe1 = new Recipe();
        recipe1.setAmtMilk("15");
        recipe1.setAmtSugar("15");
        recipe1.setAmtCoffee("15");
        recipe1.setAmtSugar("15");
        recipe1.setName("The Hulk");
        recipe1.setPrice("2.99");

        Recipe recipe2 = new Recipe();
        recipe2.setAmtMilk("15");
        recipe2.setAmtSugar("15");
        recipe2.setAmtCoffee("15");
        recipe2.setAmtSugar("15");
        recipe2.setName("The Hulk");
        recipe2.setPrice("2.99");
        assertTrue(recipe1.equals(recipe2));

        Recipe recipe3 = new Recipe();
        recipe3.setName(null);
        assertFalse(recipe3.equals(recipe1));
    }

    @Test
    void testEqualsFalse() throws RecipeException {
        Recipe recipe1 = new Recipe();
        recipe1.setAmtMilk("15");
        recipe1.setAmtSugar("15");
        recipe1.setAmtCoffee("15");
        recipe1.setAmtSugar("15");
        recipe1.setName("The Fireball");
        recipe1.setPrice("2.99");

        Recipe recipe2 = new Recipe();
        recipe2.setAmtMilk("15");
        recipe2.setAmtSugar("15");
        recipe2.setAmtCoffee("15");
        recipe2.setAmtSugar("15");
        recipe2.setName("The Hulk");
        recipe2.setPrice("2.99");
        assertFalse(recipe1.equals(recipe2));
    }

    @Test
    void testHashCode() throws RecipeException {
        Recipe recipe = new Recipe();
        recipe.setAmtMilk("15");
        recipe.setAmtSugar("15");
        recipe.setAmtCoffee("15");
        recipe.setAmtSugar("15");
        recipe.setName("The Fireball");
        recipe.setPrice("2.99");
        assertEquals(recipe.hashCode(), -822036381);
    }

}
