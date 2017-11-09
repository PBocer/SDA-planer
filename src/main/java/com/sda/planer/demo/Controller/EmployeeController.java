package com.sda.planer.demo.Controller;


import com.sda.planer.demo.sercive.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {


    private EmployeeService employeeService;


    @GetMapping
    public ModelAndView allEmployye(){
        ModelAndView modelAndView= new ModelAndView("allEmployee");
        modelAndView.addObject("message", "Hello world");
        modelAndView.addObject("employees",employeeService.getAll());
        return modelAndView;





    }

}
