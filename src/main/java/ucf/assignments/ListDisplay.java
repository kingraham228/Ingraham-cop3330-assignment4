package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.ArrayList;


public class ListDisplay {
    private ArrayList<Item> displayArray = new ArrayList<>();

    public void displayItems(Lists userLists, String listName){
        //call emptyDisplayArray()
        //If both view menu items are selected OR none are selected (default)
            //set listName as the key value in userLists
            //Set displayArray equal to the value of listName
            //show displayArray in the listview of the GUI
        //If only show uncompleted is selected
            //call displayUncompleted()
        //if only show completed is selected
            //call displayCompleted()
    }

    private void displayUncompleted(Lists userLists, String listName){
        //call emptyDisplayArray()
        //set listName as the key value in userLists
        //set value of lisName as the Item arraylist
        //for each item, if the status is uncompleted, add it to the display array
        //show displayArray in the listview of the GUI
    }

    private void displayCompleted(Lists userLists, String listName){
        //call emptyDisplayArray()
        //set listName as the key value in userLists
        //set value of lisName as the Item arraylist
        //for each item, if the status is completed, add it to the display array
        //show displayArray in the listview of the GUI
    }

    private void emptyDisplayArray(){
        //if there is stuff in the displayArray, empty it.
    }
}
