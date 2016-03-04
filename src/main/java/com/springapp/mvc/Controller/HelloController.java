package com.springapp.mvc.Controller;

import com.springapp.mvc.model.student3;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

@Controller
@RequestMapping(value = "/")
public class HelloController
{
    @RequestMapping(value="hello",method=RequestMethod.GET)
    public String hello(){
        return "test";
    }

    @RequestMapping(value="/admissionForm.html",method=RequestMethod.GET)
             public ModelAndView getAdmissionForm(){
        return new ModelAndView("Admissionform");
    }
    @ModelAttribute
    public void addCommonObject(Model model1)
    {
        model1.addAttribute("commonMsg", "this is common msg");
    }
    @RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
   /* public ModelAndView SubmitAdmissionForm(@RequestParam ("StudentName") String name, @RequestParam ("StudentHobby") String hob){
       student3 st=new student3();
        st.setStudentHobby(hob);
        st.setStudentName(name);     */

            public ModelAndView SubmitAdmissionForm(@ModelAttribute ("st") student3 student)
    {
        ModelAndView model1;
        model1 = new ModelAndView("AdmissionSucess");
    //  model.addObject("message1","details :name =  "+ name +", hobby = "+ hob);
        model1.addObject("initialMsg", "details are");
        model1.addObject("st",student);
        return model1;
    }
    @RequestMapping(method = RequestMethod.GET,value = "/user")
    public @ResponseBody
    String printWelcome(ModelMap model, HttpServletRequest request) throws SQLException
    {
        //model.addAttribute("message", "Hello world!");
        jdbc.addEmployee(request.getParameter("a"), request.getParameter("b"), request.getParameter("c"));
        return "hellow";
    }
}