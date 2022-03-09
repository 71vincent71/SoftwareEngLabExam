package ie.gmit.labexam;

import java.util.TimerTask;

public class Employee
{
    private String Title;
    private String Name;
    private String PPS;
    private String Phone;
    private String EmploymentType;
    private Integer Age;

    public Employee(String Title, String Name, String PPS, String Phone, String EmploymentType, Integer Age)
    {
        setTitle(Title);
    }
    private void setTitle(String Title)
    {
        if(Title == "Mr" || Title == "Mrs" || Title == "Ms")
        {
            this.Title = Title;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Title");
        }
    }
    public String getTitle()
    {
        return Title;
    }

}
