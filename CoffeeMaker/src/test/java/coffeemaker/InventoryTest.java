package coffeemaker;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InventoryTest {
    @Test
    void testRemoveIngredients() {
        Recipe r = new Recipe();
        Inventory inventory = new Inventory();
        try{
            r.setAmtChocolate("5");
            r.setAmtCoffee("5");
            r.setAmtMilk("5");
            r.setAmtSugar("5");
        }
        catch(Exception e) {
            assert (false);
        }
        assert(inventory.useIngredients(r));
        assert(inventory.getChocolate() == 10);
        assert(inventory.getSugar() == 10);
        assert(inventory.getCoffee() == 10);
        assert(inventory.getMilk() == 10);
    }

}
