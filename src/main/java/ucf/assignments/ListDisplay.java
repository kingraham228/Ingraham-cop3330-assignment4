package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.ArrayList;


public class ListDisplay {
    private ArrayList<Item> displayArray = new ArrayList<>();

    public void displayAllItems(Lists userLists, String listName){
        //call emptyDisplayArray()
        //set listName as the key value in userLists
        //Set displayArray equal to the value of listName
        //show displayArray in the tableview of the GUI
    }

    public void displayUncompleted(Lists userLists, String listName){
        //call emptyDisplayArray()
        //set listName as the key value in userLists
        //set value of lisName as the Item arraylist
        //for each item, if the status is uncompleted, add it to the display array
        //show displayArray in the tableview of the GUI
    }

    public void displayCompleted(Lists userLists, String listName){
        //call emptyDisplayArray()
        //set listName as the key value in userLists
        //set value of lisName as the Item arraylist
        //for each item, if the status is completed, add it to the display array
        //show displayArray in the tableview of the GUI
    }

    private void emptyDisplayArray(){
        //if there is stuff in the displayArray, empty it.
    }
}
