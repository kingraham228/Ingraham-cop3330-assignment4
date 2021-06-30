package ucf.assignments;

import org.junit.jupiter.api.Test;

class ListDisplayTest {

    @Test
    void displayItems_allItems_default_completed() {
        //create a new ListDisplay
        //create a new Lists map
        //set a string value to key value of map item completed
        //set boolean property mCheckedCompleted to false
        //set boolean property mCheckedUncompleted to false
        //call displayItems()
        //get matching displayArray item for String
        //assert that it equals the value of string in the original map
    }

    @Test
    void displayItems_allItems_default_uncompleted() {
        //create a new ListDisplay
        //create a new Lists map
        //set a string value to key value of map item uncompleted
        //set boolean property mCheckedCompleted to false
        //set boolean property mCheckedUncompleted to false
        //call displayItems()
        //get matching displayArray item for String
        //assert that it equals the value of string in the original map
    }

    @Test
    void displayItems_allItems_both_uncompleted() {
        //create a new ListDisplay
        //create a new Lists map
        //set a string value to key value of map item uncompleted
        //set boolean property mCheckedCompleted to true
        //set boolean property mCheckedUncompleted to true
        //call displayItems()
        //get matching displayArray item for String
        //assert that it equals the value of string in the original map
    }

    @Test
    void displayItems_allItems_both_completed() {
        //create a new ListDisplay
        //create a new Lists map
        //set a string value to key value of map item uncompleted
        //set boolean property mCheckedCompleted to true
        //set boolean property mCheckedUncompleted to true
        //call displayItems()
        //get matching displayArray item for String
        //assert that it equals the value of string in the original map
    }

    @Test
    void displayItems_uncompleted_uncompleted() {
        //create a new ListDisplay
        //create a new Lists map
        //set a string value to key value of map item uncompleted
        //set boolean property mCheckedCompleted to false
        //set boolean property mCheckedCompleted to true
        //call displayItems()
        //get matching displayArray item for String
        //assert that it equals the value of string in the original map
    }

    @Test
    void displayItems_uncompleted_completed() {
        //create a new ListDisplay
        //create a new Lists map
        //set a string value to key value of map item completed
        //set boolean property mCheckedCompleted to false
        //set boolean property mCheckedCompleted to true
        //call displayItems()
        //get matching displayArray item for String
        //assert that it is null
    }

    @Test
    void displayItems_completed_completed() {
        //create a new ListDisplay
        //create a new Lists map
        //set a string value to key value of map item completed
        //set boolean property mCheckedCompleted to true
        //set boolean property mCheckedCompleted to false
        //call displayItems()
        //get matching displayArray item for String
        //assert that it equals the value of string in the original map
    }

    @Test
    void displayItems_completed_uncompleted() {
        //create a new ListDisplay
        //create a new Lists map
        //set a string value to key value of map item uncompleted
        //set boolean property mCheckedCompleted to false
        //set boolean property mCheckedCompleted to true
        //call displayItems()
        //get matching displayArray item for String
        //assert that it is null
    }

    @Test
    void sortDisplayArray_first_element() {
        //create a new ListDisplay
        //set displayArray equal to an unsorted list of items
        //call sortDisplayArray()
        //set expected string to the expected first sorted element of the displayArray
        //set the actual string to the value of displayArray[0]
        //assert that expected matches actual
    }

    @Test
    void sortDisplayArray_last_element() {
        //create a new ListDisplay
        //set displayArray equal to an unsorted list of items
        //call sortDisplayArray()
        //set expected string to the expected last sorted element of the displayArray
        //set the actual string to the value of displayArray[arraysize-1]
        //assert that expected matches actual
    }
}