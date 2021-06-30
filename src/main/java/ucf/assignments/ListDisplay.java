package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kate Ingraham
 */
import javafx.beans.property.BooleanProperty;

import java.util.ArrayList;


public class ListDisplay {
    private ArrayList<Item> displayArray = new ArrayList<>();

    public void displayItems(Lists userLists, String listName,
                             BooleanProperty mCheckCompleted, BooleanProperty mCheckUncompleted){
        //call emptyDisplayArray()
        //If both view menu items are selected OR none are selected (default)
            //set listName as the key value in userLists
            //Set displayArray equal to the value of listName
        //If only show uncompleted is selected
            //call displayUncompleted()
        //if only show completed is selected
            //call displayCompleted()
    }

    private void displayUncompleted(Lists userLists, String listName){
        //set listName as the key value in userLists
        //set value of lisName as the Item arraylist
        //for each item, if the status is uncompleted, add it to the display array

    }

    private void displayCompleted(Lists userLists, String listName){
        //set listName as the key value in userLists
        //set value of lisName as the Item arraylist
        //for each item, if the status is completed, add it to the display array
    }

    public void emptyDisplayArray(){
        //if there is stuff in the displayArray, empty it.
    }

    public ArrayList<Item> getDisplayArray() {
        return displayArray;
    }
}
