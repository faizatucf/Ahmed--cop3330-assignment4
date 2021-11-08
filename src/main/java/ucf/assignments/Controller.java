package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.TextFieldTableCell;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    //assign @FXML variables here...


    public Controller() {
        //initializer
    }

    public void Add_task_button()
    {
        ///function to create a new task when the add task button is clicked.
        //check if text field and date field are not empty
        //create a new list object with the textfield string and date value and assign completed false
        //clear the text fields and date picker
    }

    public void check_button()
    {
        //Check if item is selected
        //If selected then
        //make new list object and assign selected object
        //if checkbox value is true then change to false
        //else checkbox value is set to true
    }

    public void delete_button()
    {
        //Check if item is selected
        //If selected then
        //make new list object and assign selected object
        //delete object
        //refresh tableview
    }

    public void initialize(URL url, ResourceBundle rb) {
        //function to initialize tableview...
        //Set table view to be editable using tableView.setEditable(true);
        //Set property value factory using set cell value factory for every column
        //Create checkboxs for the completed column
        //Create handlers to make editable cell possible
        //Call check_date_format to check if the edited date is in the correct format
        //if date is not in the correct format then throw an error...
    }

    public LocalDate check_date_format(String date)
    {
        LocalDate newDate = null;
        //function to check if the date format is YYYY-MM-DD
        //if it is then return convert the value into a localdate object and store it in the object...
        return newDate;
    }

    public void export(String filename)
    {
        //If filter is true then reset filter by calling showall();
        //If table items size is greater than 0 and file name is not null then
            //make new array list
            //Iterate through tableview items and store in array list
            //try and catch
            //try to write array list using fileoutstream and objectoutputsteam to file location.
            //catch exceptions.
        //end..
    }

    public void resume(String filename)
    {
        //If filter is true then reset filter by calling showall();
        //If file name is not null then
        //make new array list
        //try and catch
        //try to read array list using FileInputStream and ObjectInputStream to file location.
        //assign to arraylist
        //catch exceptions.
        //Add arraylist to tableview....
    }

    public void load()
    {
        //Function for Filechooser
        //Make new FileChooser object
        //Set getExtensionFilters to only *.dat
        //If file is not null then pass file directory to resume()
        //end
    }

    public void menu_save()
    {
        //Function for Filechooser
        //Make new FileChooser object
        //Set getExtensionFilters to only *.dat
        //If file is not null then pass file directory to export()
        //end
    }

    public void Show_only_completed()
    {
        //Function to show only completed tasks
        //if this.filter is false then save main list to global list.
        //else call resettable();
        //set this.filter to true
        //make new array list
        //get all items that are not marked as completed
        //remove all items that are not maked as completed from tableview. (tableView.getItems().removeAll(tmplist);)
    }

    public void hide_completed()
    {
        //Function to show only completed tasks
        //if this.filter is false then save main list to global list.
        //else call resettable();
        //set this.filter to true
        //make new array list
        //get all items that are marked as completed
        //remove all items that are not marked as completed from tableview. (tableView.getItems().removeAll(tmplist);)
    }

    public void show_all()
    {
        //function to reset the filters
        //check if this.filter is set to true
            //call resettable()
            //clear the global arraylist
            //set this.filter to false..
    }

    public void resettable()
    {
        //function to clear tableview and set it back to its original state
        //clear all items in table view...
        //add items from global array list to tableview
        //refresh tableview...
    }
}
