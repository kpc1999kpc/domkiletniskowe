package project.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    //create
    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }
    //read
    /*
    public Employee getById(Long id) {
        return employeeRepository.getById(id);
    }*/
    //edit

    //delete
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
    //
    public Employee generate() {
        return new Employee("name", "surname", "id_card_number", LocalDate.of(2022,04,04), "phone_number",
                "email", "address", "account_number", "employment_status", "comment");
    }

    //list
    public List<Employee> getAll() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }
}

