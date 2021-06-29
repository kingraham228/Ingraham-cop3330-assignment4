package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kate Ingraham
 */



public class FileManager {

    public void saveOneList(){
        //Save a ToDolist and items to a JSON file
    }

    public void saveAll(){
        //Save all ToDolists and items to a JSON file
    }

    public ToDoList openOneList(String filename){
       ToDoList fileToDoList = new ToDoList("");
        //get the path of the filename
        //try to open the file
            //if there is an exception, alert the user that the file isn't found
        //read in file information
            //create new Gson
            //create a new reader with the file path
            //parse file information into a new ToDoList using Gson
        //return the ToDoList item
        return fileToDoList;
    }

    public Lists openAll(String filename){
        Lists fileLists = new Lists();
        //get the path of the filename
        //try to open the file
            //if there is an exception, alert the user that the file isn't found
        //read in file information
            //create new Gson
            //create a new reader with the file path
            //parse file information into a new Lists using Gson
        //parse file information into a new map of todolists using Gson
        //append these lists to any existing lists
        //return the new lists
        return fileLists;
    }

}
