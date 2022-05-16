package project.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// GET - pobieranie danych (nigdy nie zmienia stanu)
// Zwracaj tylko JSNON
// /posts?user_id=7
// /users?page=1&page_size=30
// /users?activated=true

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public void add(@RequestBody Employee employee){ employeeService.save(employee); }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("employee_id") long employee_id) {
        employeeService.deleteById(employee_id);
    }


    /*
    public Iterable<Computer> getAll() {
        return computerRepo.findAll();
    }
    */
    @GetMapping("/getAll")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
    /*
    @GetMapping("/find")
    public Iterable<Employee> findComputerWhereMemorySizeMoreThan(@RequestParam("guests_number") int guests_number) {
        return employeeService.find(guests_number);
    }
    */

}

