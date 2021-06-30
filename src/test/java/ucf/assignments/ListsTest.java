package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListsTest {

    @Test
    void addList() {
        //create a new Lists object
        //set a string
        //call addList()
        //call getToDoLists()
        //assert that the string equals matching map key
    }

    @Test
    void testAddList_Listparameter() {
        //create a new Lists object
        //set a string
        //set a ToDoList
        //call addList()
        //assert that the map element value of key string matches the ToDoList
    }

    @Test
    void mergeLists() {
        //create a new Lists object
        //create a map of a toDoList
        //use addList() to populate the internal map
        //create a second map
        //call mergeLists()
        //call getLists()
        //choose an element of the merge list
        //assert that that element matches the corresponding element in the internal map
    }

    @Test
    void removeList() {
        //create a new Lists object
        //create a map of a toDoList
        //target an item for removal
        //call removeList()
        //set map to actual
        //set expected to be the map without the target item
        //assert that the maps are equal
    }
}