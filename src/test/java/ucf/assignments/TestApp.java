/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ucf.assignments;
import static org.junit.jupiter.api.Assertions.*;
import javafx.*;
import javafx.scene.control.CheckBox;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;


//Testing functionalities of Gui and functions... From #6 to #20 in assignment requirements.
class TestApp {

    @Test
    @DisplayName("Test if user is be able to add a new todo list")
    public void addnewtask() {
        //create new list object and add new task to it.
        //Add same task to tableview using Add_task_button...
        //Check assertion equals to the same list returned by tableview as the list object made...
    }

    @Test
    @DisplayName("Test if the user can mark items as complete or Incomplete successfully!")
    public void CheckmarkAsCompleteTest() {
        //Make new list object
        //
        //Add same task to tableview using Add_task_button..
        //Mark as completed...
        //return list from tableview and check assertion of status is true..
    }

    @Test
    @DisplayName("Test if the user can mark items as complete or Incomplete successfully!")
    public void CheckmarkAsCompleteTest2() {
        //Add same task to tableview using Add_task_button..
        //Mark as completed...
        //Call mark as completed again... (Will make it false)
        //return list from tableview and check assertion of status is false..
    }

    @Test
    @DisplayName("Test if the user shall be able to remove an existing todo list")
    public void deleteItem() {
        //Make new list object
        //Launch new instance of application
        //Add a new todo task
        //delete the task
        //check by comparing if the task has been deleted
    }

    @Test
    @DisplayName("Test if the user shall be able to display only the completed items in a todo list.")
    public void Show_completed_Elements() {
        //Make new list object
        //Launch new instance of application
        //Add few new todo tasks
        //Mark some of them completed
        //Call Show_only_completed()
        //Check by comparing the tableView list to see if all items are marked completed.
    }

    @Test
    @DisplayName("Test if the user shall be able to display only the incompleted items in a todo list")
    public void incompleteElements() {
        //Make new list object
        //Launch new instance of application
        //Add few new todo tasks
        //Mark some of them completed
        //call hide_completed()
        //Check by comparing the tableView list to see if all items are marked incompleted.
    }


    @Test
    @DisplayName("Test if the user shall be able to Show Incompleted tasks and then switch to see only Completed ... ")
    public void Filter() {
        //Make new list object
        //Launch new instance of application
        //Add few new todo tasks
        //Mark some of them completed
        //call hide_completed()
        //Check by comparing the tableView list to see if all items are marked incompleted.
        //call Show_only_completed()
        //Check by comparing the tableView list to see if all items are marked completed.
    }

    @Test
    @DisplayName("Test if the user shall be able to disable filter for completed and show all... ")
    public void Show_all_Filter() {
        //Make new list object
        //Launch new instance of application
        //Add few new todo tasks
        //Mark some of them completed
        //call hide_completed()
        //Check by comparing the tableView list to see if all items are marked incompleted.
        //call Show_only_completed()
        //Check by comparing the tableView list to see if all items are marked completed.
        //call show_all()
        //compare values to original arraylist and check if all values are present.
    }

    @Test
    @DisplayName("Test if items selected task and date can be edited...")
    public void editItem() {
        //Make new list object
        //Launch new instance of application
        //Add new todo tasks
        //Edit task for one of items
        //Compare to check if that item task is different than the one originally added...
        //Edit date for one of items
        //Compare to check if that item date is different than the one originally added...
    }

    @Test
    @DisplayName("Check if date is being formatted correctly...")
    public void formatDate(){
        //declare a date string with the format YYYY-mm-dd...
        //Assert true if check_date_format() is true

        //declare a date string with wrong format
        //Assert false if check_date_format() is true
    }

    @Test
    @DisplayName("Test if save to directory works")
    public void saveToDirectory() {
        //Make new list object
        //Launch new instance of application
        //Add new todo tasks
        //Call export(String filename)
        //check if the file directory exist...
    }

    @Test
    @DisplayName("Test if loading external file into application works")
    public void LoadToDoList() {
        //Launch new instance of application
        //Call resume(String filename)
        //Check to compare if tasks exist
    }

}