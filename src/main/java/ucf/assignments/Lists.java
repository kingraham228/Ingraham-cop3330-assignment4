package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Lists {
    private Map<String, ArrayList<Item>> toDoLists = new HashMap<>();

    public void addList(String listName){
        //Create a new ToDoList
        //Add it to the map
    }

    public void removeList(String listName){
        //Match map key by list name
        //remove the ToDoList from the map
    }

    public Map<String, ArrayList<Item>> getToDoLists() {
        return toDoLists;
    }
}
