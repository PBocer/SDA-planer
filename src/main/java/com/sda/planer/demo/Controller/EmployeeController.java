package com.sda.planer.demo.Controller;


import com.sda.planer.demo.model.Employee;
import com.sda.planer.demo.sercive.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employees")
public class EmployeeController {


    private EmployeeService employeeService;


    @GetMapping
    public ModelAndView allEmployye(){
        ModelAndView modelAndView= new ModelAndView("allEmployee");
        modelAndView.addObject("message", "Hello world");
        modelAndView.addObject("employees",employeeService.getAll());
        return modelAndView;





    }

    @GetMapping("/(id)")
    public ModelAndView getEmployee(@PathVariable("id")Long id){
        ModelAndView modelAndView= new ModelAndView("employee");
        modelAndView.addObject("employee", employeeService.get(id));
        return modelAndView;
    }

    @PostMapping
    public String addEmployee(@ModelAttribute Employee employee){
        employeeService.addEmployee(employee);
        return "rediret:/employees";
    }

}
