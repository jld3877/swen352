package coffeemaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class RecipeBookTest {
    @Test
    void createRecipeBook() {
        RecipeBook rb = new RecipeBook();
        assertNotNull(rb);
    }

    @Test
    void getRecipeArray() {
        RecipeBook rb = new RecipeBook();
        Recipe[] actual = rb.getRecipes();
        Recipe[] expected = new Recipe[4];
        assertArrayEquals(expected, actual);
    }

    @Test
    void addRecipeToEmptyRecipeBook() {
        RecipeBook rb = new RecipeBook();
        Recipe r = new Recipe();
        rb.addRecipe(r);
        assertArrayEquals(rb.getRecipes(), new Recipe[] {r, null, null, null});
    }

    @Test
    void addRecipeToRecipeBookWithEntrySucceed() {
        RecipeBook rb = new RecipeBook();
        Recipe r1 = new Recipe();
        r1.setName("r1");
        Recipe r2 = new Recipe();
        r2.setName("r2");
        rb.addRecipe(r1);
        rb.addRecipe(r2);
        Recipe[] expected = new Recipe[] {r1, r2, null, null};
        Recipe[] actual = rb.getRecipes();
        assertArrayEquals(expected, actual);
    }

    @Test
    void addRecipeToRecipeBookWithEntryFail() {
        RecipeBook rb = new RecipeBook();
        Recipe r1 = new Recipe();
        r1.setName("r1");
        Recipe r2 = new Recipe();
        r2.setName("r1");
        rb.addRecipe(r1);
        rb.addRecipe(r2);
        Recipe[] expected = new Recipe[] {r1, null, null, null};
        Recipe[] actual = rb.getRecipes();
        assertArrayEquals(expected, actual);
    }

    @Test
    void addRecipeToFullRecipeBook() {
        RecipeBook rb = new RecipeBook();
        Recipe r1 = new Recipe();
        r1.setName("r1");
        Recipe r2 = new Recipe();
        r2.setName("r2");
        Recipe r3 = new Recipe();
        r3.setName("r3");
        Recipe r4 = new Recipe();
        r4.setName("r4");
        Recipe r5 = new Recipe();
        r5.setName("r5");

        rb.addRecipe(r1);
        rb.addRecipe(r2);
        rb.addRecipe(r3);  
        rb.addRecipe(r4);
        rb.addRecipe(r5);

        Recipe[] expected = new Recipe[] {r1, r2, r3, r4};
        Recipe[] actual = rb.getRecipes();
        assertArrayEquals(expected, actual);
    }

    @Test
    void deleteRecipeSuccess() {
        RecipeBook rb = new RecipeBook();
        Recipe r = new Recipe();
        r.setName("r1");
        rb.addRecipe(r);
        String actual = rb.deleteRecipe(0);
        String expected = "r1";
        assertEquals(expected, actual);
    }

    @Test
    void deleteRecipeFail() {
        RecipeBook rb = new RecipeBook();
        String actual = rb.deleteRecipe(0);
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    void editRecipeSuccess() {
        RecipeBook rb = new RecipeBook();
        Recipe r1 = new Recipe();
        Recipe r2 = new Recipe();
        r1.setName("r1");
        rb.addRecipe(r1);
        r2.setName("r2");
        rb.editRecipe(0, r2);


        Recipe[] actual = rb.getRecipes();
        Recipe[] expected = new Recipe[] {r2, null, null, null};
        assertArrayEquals(expected, actual);
    }

    @Test
    void editRecipeFail() {
        RecipeBook rb = new RecipeBook();
        assertEquals(null, rb.editRecipe(0, null));
    }

    @Test
    void deleteRecipeOutOfBounds() {
            RecipeBook rb = new RecipeBook();
            rb.deleteRecipe(5);
            Recipe[] actual = rb.getRecipes();
            Recipe[] expected = new Recipe[] {null, null, null, null};
            assertArrayEquals(actual, expected);
    }

    @Test
    void editRecipeOutOfBounds() {
        RecipeBook rb = new RecipeBook();
        rb.editRecipe(5, new Recipe());
        Recipe[] actual = rb.getRecipes();
        Recipe[] expected = new Recipe[] {null, null, null, null};
        assertArrayEquals(actual, expected);
    }
}
