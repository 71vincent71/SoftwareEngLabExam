package ie.gmit.labexam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest
{
    private Employee myEmp;

    @Test
    void testConstructorTitle()
    {
        myEmp = new Employee("Mr", "Vincent", "01234567", 876543210, "Full-time", 20);
        assertEquals("Mr", myEmp.getTitle());
    }

    @Test
    void testConstructorInvalidTitle()
    {
        final String invalid = "Invalid Title";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Employee("Miss", "Vincent", "01234567", 876543210, "Full-time", 20));
        assertEquals(invalid,exceptionThrown.getMessage());
    }

    @Test
    void testConstructorName()
    {
        myEmp = new Employee("Mr", "Vincent", "01234567", 876543210, "Full-time", 20);
        assertEquals("Vincent", myEmp.getName());
    }

    @Test
    void testConstructorInvalidName()
    {
        final String invalid = "Invalid Name";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Employee("Mr", "Ty", "01234567", 876543210, "Full-time", 20));
        assertEquals(invalid,exceptionThrown.getMessage());
    }

    @Test
    void testConstructorPPS()
    {
        myEmp = new Employee("Mr", "Vincent", "01234567", 876543210, "Full-time", 20);
        assertEquals("01234567", myEmp.getPPS());
    }

    @Test
    void testConstructorInvalidPPS()
    {
        final String invalid = "Invalid PPS";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Employee("Mr", "Vincent", "0", 876543210, "Full-time", 20));
        assertEquals(invalid,exceptionThrown.getMessage());
    }

    @Test
    void testConstructorPhone()
    {
        myEmp = new Employee("Mr", "Vincent", "01234567", 876543210, "Full-time", 20);
        assertEquals(876543210, myEmp.getPhone());
    }

    @Test
    void testConstructorInvalidPhone()
    {
        final String invalid = "Invalid Phone";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Employee("Mr", "Vincent", "01234567", 0, "Full-time", 20));
        assertEquals(invalid,exceptionThrown.getMessage());
    }

    @Test
    void testConstructorEmploymentType()
    {
        myEmp = new Employee("Mr", "Vincent", "01234567", 876543210, "Full-time", 20);
        assertEquals("Full-time", myEmp.getEmploymentType());
    }

    @Test
    void testConstructorInvalidEmploymentType()
    {
        final String invalid = "Invalid Employment Type";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Employee("Mr", "Vincent", "01234567", 876543210, "Time", 20));
        assertEquals(invalid,exceptionThrown.getMessage());
    }
}
