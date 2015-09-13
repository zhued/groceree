package model;

import com.example.groceree.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joshfermin on 9/12/15.
 */
public class GroceryListItem {
    String name;
    String age;

    GroceryListItem(String name, String age) {
        this.name = name;
        this.age = age;
    }


    private List<GroceryListItem> persons;

    // This method creates an ArrayList that has three Person objects
    // Checkout the project associated with this tutorial on Github if
    // you want to use the same images.
    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new GroceryListItem("Emma Wilson", "23 years old"));
        persons.add(new GroceryListItem("Lavery Maiss", "25 years old"));
        persons.add(new GroceryListItem("Lillie Watts", "35 years old"));
    }
}
