package ie.gmit.labexam;

import java.util.TimerTask;

public class Employee
{
    private String Title;
    private String Name;
    private String PPS;
    private Integer Phone;
    private String EmploymentType;
    private Integer Age;

    public Employee(String Title, String Name, String PPS, Integer Phone, String EmploymentType, Integer Age)
    {
        setTitle(Title);
        setName(Name);
        setPPS(PPS);
        setPhone(Phone);
        setEmploymentType(EmploymentType);
        setAge(Age);
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

    private void setName(String Name)
    {
        if(Name.length() > 2 && Name.length() < 25)
        {
            this.Name = Name;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Name");
        }
    }
    public String getName()
    {
        return Name;
    }

    private void setPPS(String PPS)
    {
        if(PPS.length() == 8)
        {
            this.PPS = PPS;
        }
        else
        {
            throw new IllegalArgumentException("Invalid PPS");
        }
    }
    public String getPPS()
    {
        return PPS;
    }

    private void setPhone(Integer Phone)
    {
        int PhoneLength = String.valueOf(Phone).length();

        if(PhoneLength == 9)
        {
            this.Phone = Phone;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Phone");
        }
    }
    public Integer getPhone()
    {
        return Phone;
    }

    private void setEmploymentType(String EmploymentType)
    {
        if(EmploymentType == "Full-time" || EmploymentType == "Part-time" || EmploymentType == "Contract")
        {
            this.EmploymentType = EmploymentType;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Employment Type");
        }
    }
    public String getEmploymentType()
    {
        return EmploymentType;
    }

    private void setAge(Integer Age)
    {
        if(Age > 16)
        {
            this.Age = Age;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Age, Too Young");
        }
    }
    public Integer getAge()
    {
        return Age;
    }
}
