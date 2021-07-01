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
        //set listTitle to this listTitle
    }

    public ToDoList(String listTitle, ArrayList<Item> items) {
        //construct a ToDoList with existing items
        //set listTitle to this listTitle
        //set items to this items
    }

    public void addItem(String description, String dueDate){
        //create a new item, description, dueDate
        //add a new item to the items array list
    }

    public void removeItem(int index){
        //remove the item at index from the items array
    }

    public void editItem(String description, String dueDate, int index, boolean status){
        //set items[index] to value description, dueDate, status
    }

    public void markComplete(int index){
        //Create a new Item with value of items[index]
        //set new item status to true
        //set the value of items[index] to the new item
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
