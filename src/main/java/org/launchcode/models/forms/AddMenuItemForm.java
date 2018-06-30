package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;

public class AddMenuItemForm {

    @NotNull
    private int menuId;

    @NotNull
    private int cheeseId;
    private Menu menu;

    public AddMenuItemForm(){}


    private Iterable<Cheese> cheeses;

    public AddMenuItemForm(Iterable<Cheese> cheeses, Menu menu){
        this.menu = menu;
        this.cheeses = cheeses;
    }

    public int getMenuId(){return menuId;}

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getCheeseId() {return cheeseId;}

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public Iterable<Cheese> getCheeses(){return cheeses;}

    public Menu getMenu() {
        return menu;
    }

}