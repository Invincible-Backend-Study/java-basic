package C05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryManagerTest {
    private SalaryManager salaryManager;

    @BeforeEach
    void before() {
        salaryManager = new SalaryManager();
    }

    @Test
    void getMonthSalary() {
        double salary = salaryManager.getMonthSalary(20000000);
        assertEquals(salary, 1098333.3333333335);
    }
}