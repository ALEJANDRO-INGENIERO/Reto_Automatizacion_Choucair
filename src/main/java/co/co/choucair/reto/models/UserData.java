package co.co.choucair.reto.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserData {

    @JsonProperty("fullname")
    private String fullname;

    @JsonProperty("middle")
    private String middle;

    @JsonProperty("lastname")
    private String lastName;

    @JsonProperty("vacancy")
    private String vacancy;

    @JsonProperty("email")
    private String email;

    @JsonProperty("contactnumber")
    private String contactNumber;

    @JsonProperty("keywords")
    private String keywords;

    @JsonProperty("notes")
    private String notes;

    @JsonProperty("date")
    private String date;

    @JsonProperty("check")
    private String check;

    public static List<UserData> setData(DataTable table) {
        List<UserData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, UserData.class));
        }
        return data;
    }

    // Getters and setters
    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullname) {
        this.fullname = fullname;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getVacancy() {
        return vacancy;
    }

    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }
}