package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kate Ingraham
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckMenuItem;


public class ToDoListController {
    @FXML
    public CheckMenuItem mCheckUncompleted;
    @FXML
    public CheckMenuItem mCheckCompleted;

    //create a Lists object

    @FXML
    public void mLoadListClicked(ActionEvent actionEvent) {
        //open a text input dialogue
        //ask the user to input the file name
        //set String filename to user input
        //create a new ToDoList with the file name
        //call openOneList()
        //call addList()
        //call displayItems()
    }

    @FXML
    public void mLoadMultipleClicked(ActionEvent actionEvent) {
        //open a text input dialogue
        //ask the user to input the file name
        //set String filename to user input
        //create a new ToDoList with the file name
        //call openAll()
        //merge the returned map with the Lists object
        //call displayItems()
    }

    @FXML
    public void mSaveListClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void mSaveAllListsClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void mAddListClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void mEditListClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void mDeleteListClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void mDisplayUncompletedClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void mDisplayCompletedClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void mSortDescriptionClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void mSortDueDateClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void bAddItemClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void bEditItemClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void bDeleteItemClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void bCompleteItemClicked(ActionEvent actionEvent) {
    }
}
