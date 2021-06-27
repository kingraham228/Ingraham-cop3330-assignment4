package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.ArrayList;



public class ToDoList {
    private String listTitle;
    private ArrayList<Item> items = new ArrayList<>();

    public ToDoList() {
        //construct ToDoList with List title
    }

    public void editTitle(){
        //set listTitle to a new title
    }

    public void addItem(){
        //create a new item
        //add a new item to the items array list
    }

    public void removeItem(){
        //remove an item from the items list
    }

    public String getListTitle() {
        return listTitle;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
