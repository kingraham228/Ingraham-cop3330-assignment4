package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void addItem() {
        //create a new ToDoList
        //set String description
        //set Date dueDate
        //call addItem(), description, dueDate
        //set actual to string of ToDoList.getItems()
        //set expected to description, dueDate, false
        //assert that actual matches expected
    }

    @Test
    void editItem() {
        //create a new ToDoList
        //set String description
        //set Date dueDate
        //set boolean status
        //set int index
        //call editItem(), description, dueDate, index, status
        //set actual to string of ToDoList.getItems[index]
        //set expected to description, dueDate, status
        //assert that actual matches expected
    }

    @Test
    void removeItem() {
        //create a new ToDoList
        //set int index
        //call removeItem(), index
        //set actual to string of ToDoList.getItems
        //set expected to array without target index
        //assert that actual matches expected
    }

    @Test
    void markComplete() {
        //create a new ToDoList
        //set String description
        //set Date dueDate
        //set boolean status false
        //set int index
        //call markComplete(), index
        //set actual to string of ToDoList.getItems[index]
        //set expected to description, dueDate, true
        //assert that actual matches expected
    }
}