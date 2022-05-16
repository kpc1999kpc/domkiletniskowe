package pl.bykowski.kolo5;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route
public class EmployeeGUI extends VerticalLayout {

    @Autowired
    private EmployeeService employeeService;

    private TextField textFieldDdrType = new TextField("DDR Type");
    private TextField textFieldMhz = new TextField("Mhz");
    private TextField textFieldMemorySize = new TextField("Memory size");
    private Button button = new Button("Add");

    public EmployeeGUI() {
        add(textFieldDdrType);
        add(textFieldMhz);
        add(textFieldMemorySize);
        add(button);

        button.addClickListener(clickEvent-> {
            /*
            Employee employee = new Employee();
            computer.setDdrType(textFieldDdrType.getValue());
            computer.setMhz(Long.parseLong(textFieldMhz.getValue()));
            computer.setMemorySize(Integer.parseInt(textFieldMemorySize.getValue()));
            */

            employeeService.save(employeeService.generate());
        });
    }
}
