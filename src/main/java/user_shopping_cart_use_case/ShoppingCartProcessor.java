package user_shopping_cart_use_case;

import java.util.HashMap;

public class ShoppingCartProcessor implements ShoppingCartPresenter {

    ShoppingCartPanelInterface screen;

    public ShoppingCartProcessor(ShoppingCartPanelInterface screen) {
        this.screen = screen;
    }

    @Override
    public void displayShoppingCart(String restaurantName, HashMap<String, HashMap<String, Object>> shoppingCartDisplay) {
        screen.displayShoppingCart(restaurantName, shoppingCartDisplay);
    }

    public void setScreen(ShoppingCartPanelInterface screen) {
        this.screen = screen;
    }
}