import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class EmployeeTest {

    @Test
    void it_has_a_correct_salary_bonus() {
        Employee employee = new Employee();
        employee.setSalary(1000);

        assertEquals(100, employee.getBonus());
    }
}