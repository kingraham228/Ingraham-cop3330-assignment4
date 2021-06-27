package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kate Ingraham
 */



public class FileManager {

    public void saveOneList(){
        //Save a ToDolist and items to a txt file
    }

    public void saveAll(){
        //Save all ToDolists and items to a txt file
    }

    public ToDoList openOneList(){
       ToDoList fileToDoList = new ToDoList();
        //open a ToDoList from a txt file
        //read in file information
        //parse file information into a new ToDoList
        //return the ToDoList item
        return fileToDoList;
    }

    public Lists openAll(){
        Lists fileLists = new Lists();
        //open a formatted txt file
        //read in file information
        //parse file information into a new map of todolists
        //append these lists to any existing lists
        //return the new lists
        return fileLists;
    }

}
