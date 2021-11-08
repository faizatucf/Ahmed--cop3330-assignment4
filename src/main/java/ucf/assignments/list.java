package ucf.assignments;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableBooleanValue;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class list implements Serializable{
    private String task;
    private String date;
    private Boolean status;

    public list(String task, LocalDate date, boolean status)
    {
        this.task = task;
        this.status = status;
        this.date = date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }

    //getters
    public String getTask()
    {
        return task;//return task from list object
    }

    public String getDate()
    {
        return date;//return date from list object
    }

    public boolean getstatus()//return status from list object
    {

        return status;
    }

    public ObservableBooleanValue isChecked() {
        return new SimpleBooleanProperty(status); //return status as a ObservableBooleanValue
    }

    //setters
    public void setTask(String task)
    {
        this.task = task;//Get task and set task
    }

    public void setDate(String date)
    {
        this.date = date;//Get date and set date
    }

    public void setstatus(boolean status)
    {
        this.status =status; //get status and set status...
    }

    public ObservableValue<Boolean> selectedProperty() {
        return new SimpleBooleanProperty(status);
    }


}
