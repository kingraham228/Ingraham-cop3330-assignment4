package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kate Ingraham
 */
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class FXController implements Initializable {
//This class handles user actions (ua) from the GUI

    public void uaAddList(){
        //Textfield and button
            //Take in user text
            //call addList()
            //refresh list display
    }

    public void uaRemoveList(){
        //Edit menu - Delete List
        //Read current selected list from list view
        //call removeList()
        //refresh list display
    }

    public void uaEditTitle(){
        //Edit menu - Edit List Title
        //Read selected list from list view
        //Open dialog
        //Take in user text
        //call editTitle()
        //refresh list display
        //close dialogue
    }

    public void uaAddItem(){
        //Text Fields and button
        //Take in description text field
        //take in due date text field
        //call checkDate() to validate format
        //call addItem()
        //refresh table display
    }

    public void uaRemoveItem(){
        //Edit menu - Delete item
        //Read selected item from tableview
        //call removeItem()
        //refresh table display
    }

    public void uaEditItem(){
        //Edit menu - Edit item
        //read selected item from tableview
        //Open dialogue
        //Collect user description text
        //Collect user due date
        //call checkDate() to validate date format
        //call editDescription()
        //call editDueDate()
        //refresh table display
        //close dialogue
    }

    public void uaMarkComplete(){
        //Mark Done button
        //read selected item from table view
        //call markComplete()
        //refresh display
    }

    public void setItemView(){
        //Filter menu
        //If nothing is selected or Both uncompleted and completed are selected
            //call display AllItems()
        //if uncompleted is selected
            //call displayUncompleted()
        //if completed is selected
            // call displayCompleted()
    }

    public void uaSaveList(){
        //File menu - save list
        //Open dialogue
        //Collect user filename input
        //call checkFileName() to validate filename
        //call saveOneList()
        //close dialogue
    }

    public void uaSaveAll(){
        //File menu - save all lists
        //Open dialogue
        //Collect user filename input
        //call checkFileName() to validate filename
        //call saveAll()
        //close dialogue
    }

    public void uaImportList(){
        //File menu - Import a list
        //Open dialogue
        //Collect user filename input
        //call checkFileName() to validate filename
        //call openOneList()
        //refresh display
        //close dialogue
    }

    public void uaImportAll(){
        //File menu - Import Multiple Lists
        //Open dialogue
        //Collect user filename input
        //call checkFileName() to validate filename
        //call openAll()
        //refresh display
        //close dialogue
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
