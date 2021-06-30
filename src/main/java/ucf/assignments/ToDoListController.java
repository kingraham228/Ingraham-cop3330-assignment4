package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kate Ingraham
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;


public class ToDoListController {
    @FXML
    public CheckMenuItem mCheckUncompleted;
    @FXML
    public CheckMenuItem mCheckCompleted;
    @FXML
    public ListView listView;
    @FXML
    public ChoiceBox cbLists;


    //create a Lists object userLists
    //create a FileManager object
    //create a ListDisplay object
    //create a InputValidator object
    //create an observable list


    public void updateListView(ArrayList<Item> displayArray ){
        //make the observable list equal the display array
    }

    public void updateCBList(){
        //if there are existing CBList items
            // remove all CBList items
        //if userLists is not empty
            // add all userLists map keys as CBList items
    }


    @FXML
    public void mLoadListClicked(ActionEvent actionEvent) {
        //open a text input dialogue
        //ask the user to input the file name
        //set String filename to user input
        //create a new ToDoList with the file name
        //set ToDoList with call openOneList()
        //call addList() with String filename and ToDoList
        //call updateCBList()
        //call displayItems() with filename and value of filename
        //call updateListView() with getdisplayArray()
    }

    @FXML
    public void mLoadMultipleClicked(ActionEvent actionEvent) {
        //open a text input dialogue
        //ask the user to input the file name
        //set String filename to user input
        //create a new listMap called loadMap
        //set loadMap with call openAll() with filename
        //call mergeLists() with loadMap and userLists
        //call updateCBList()
    }

    @FXML
    public void mSaveListClicked(ActionEvent actionEvent) {
        //get the listView selectionModel
        //set String listname to the selection model
        //get the Lists value of listname
        //call saveOneList() with listname and value of listname
    }
    @FXML
    public void mSaveAllListsClicked(ActionEvent actionEvent) {
        //call saveAll() with userLists
    }
    @FXML
    public void mAddListClicked(ActionEvent actionEvent) {
        //open a text input dialogue
        //ask the user to input the new list name
        //set String listName to user input
        //call addList() with listName
        //call updateCBList()
        //call displayItems() with listName and value of listname
        //call updateListView() with getdisplayArray()
    }
    @FXML
    public void mEditListClicked(ActionEvent actionEvent) {
        //get the cbLists selection model
        //set String oldName to the existing listname
        //open a text input dialogue
            //existing list name in the textfield
        //set String newListName to new user input
        //call addList() newListName, value of oldName
        //call removeList() oldName map entry
        //call updateCBList()
        //call displayItems() newListName, value of newListName
        //call updateListView() with getDisplayArray()
    }
    @FXML
    public void mDeleteListClicked(ActionEvent actionEvent) {
        //get the cbLists selection model
        //call removeList() with selection model value
        //call updateCBList()
        //call emptyDisplayArray()
        //call updateListView() with getDisplayArray()
    }
    @FXML
    public void mDisplayUncompletedClicked(ActionEvent actionEvent) {
        //get the cbLists selection model
        //call displayItems() with the selection model and value of selection model
        //call updateListView() with getDisplayArray()
    }
    @FXML
    public void mDisplayCompletedClicked(ActionEvent actionEvent) {
        //get the cbLists selection model
        //call displayItems() with the selection model and value of selection model
        //call updateListView() with getDisplayArray()
    }
    @FXML
    public void mSortDescriptionClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void mSortDueDateClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void bAddItemClicked(ActionEvent actionEvent) {
        //get the cbLists selection model
        //set String targetlist with selection model
        //Create a new ToDoList adding with targetlist and value of targetlist
        //open a text input dialogue
        //ask the user to input the new description
        //ask the user to input the new due date
        //call checkDate() with due date
        //if true
            //call adding.addItem() with description, due date
            //set the value of userLists targetlist to the new ToDoList
        //call displayItems() targetlist, value of targetlist
        //call updateListView() with getDisplayArray()
    }
    @FXML
    public void bEditItemClicked(ActionEvent actionEvent) {
        //get the cbLists selection model
        //set String targetlist with selection model
        //Create new ToDoList with targetlist, value of targetlist
        //get the listView selection model
        //set int index to the index value of the listView selection model
        //open a text input dialogue
        //ask the user to input the new description
        //ask the user to input the new due date
        //ask the user to check completed or uncompleted
        //call checkDate() with due date
        //if true
            //call editItem() with description, dueDate, index, check
            //set the value of userLists targetlist to new ToDoList
        //call displayItems() targetlist, value of targetlist
        //call updateListView() with getDisplayArray()
    }
    @FXML
    public void bDeleteItemClicked(ActionEvent actionEvent) {
        //get the cbLists selection model
        //set String targetlist with selection model
        //Create new ToDoList with targetlist, value of targetlist
        //get the listView selection model
        //set int index to the index value of the listView selection model
        //call removeItem() index
        //set the value of userLists targetlist to new ToDoList
        //call displayItems() targetlist, value of targetlist
        //call updateListView() with getDisplayArray()
    }
    @FXML
    public void bCompleteItemClicked(ActionEvent actionEvent) {
        //get the cbLists selection model
        //set String targetlist with selection model
        //Create new ToDoList with targetlist, value of targetlist
        //get the listView selection model
        //set int index to the index value of the listView selection model
        //call markComplete(), index
        //set the value of userLists targetlist to new ToDoList
        //call displayItems() targetlist, value of targetlist
        //call updateListView() with getDisplayArray()
    }
    @FXML
    public void lvItemSelected(MouseEvent mouseEvent) {
    }
    @FXML
    public void cbListSelect(InputMethodEvent inputMethodEvent) {
    }
}
