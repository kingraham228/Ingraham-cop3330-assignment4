package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.Date;


public class Item {
    private String description;
    private Date dueDate;
    private boolean completeStatus;

    public void Item (){
        //construct description to the user description
        //construct due date to the user due date
        //construct completeStatus to default false
    }
    public void editDescription(){
        //set description to a new description
    }

    public void editDueDate(){
        //set due date to a new due date
    }

    public void markComplete(){
        //set completeStatus to true
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public boolean isCompleteStatus() {
        return completeStatus;
    }
}
