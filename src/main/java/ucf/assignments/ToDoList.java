package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.ArrayList;
import java.util.Date;


public class ToDoList {
    private String listTitle;
    private ArrayList<Item> items = new ArrayList<>();

    public ToDoList(String listTitle) {
        //construct an empty ToDoList with List title
    }

    public void editTitle(String listTitle){
        //set listTitle to a new title
    }

    public void addItem(String description, Date dueDate){
        //create a new item
        //add a new item to the items array list
    }

    public void removeItem(Item targetItem){
        //get the index of the targetItem
        //remove an item from the items list
    }

    public String getListTitle() {
        return listTitle;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
