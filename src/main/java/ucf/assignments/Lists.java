package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Lists {
    private Map<String, ArrayList<Item>> listMap = new HashMap<>();

    public void addList(String listName){
        //Create a new empty ToDoList with listName
        //Add it to the map
    }

    public void addList(String listName, ToDoList userList){
        //add userList to the map with key listName
    }

    public void removeList(String listName){
        //Match map key by list name
        //remove the ToDoList from the map
    }

    public void editList(String oldName, String newListName){
        //call addList() newListName, value of oldName
        //call removeList() oldName map entry
    }

    public void mergeLists(Map<String,ArrayList<Item>> fileMap){
        //use Map.merge() to combine filemap and toDoLists
        //https://www.baeldung.com/java-merge-maps
    }

    public Map<String, ArrayList<Item>> getListMap() {
        return listMap;
    }
}
