package com.orangemako.spring.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Basic MVC Controller.
 *
 * @author Kevin Leong
 */
@Controller
@RequestMapping
public class MvcControllerTemplate {

    @RequestMapping(value = "mvc", method = RequestMethod.GET)
    public String displayWelcomeMessage(ModelMap modelMap) {
        modelMap.addAttribute("message", "Welcome message from the Spring MVC Controller");

        int numOne = 1;
        int numTwo = 2;

        StringBuilder calculationMessage = new StringBuilder();
        calculationMessage.append(numOne)
                .append(" + ")
                .append(numTwo)
                .append(" = ")
                .append(sum(numOne, numTwo));

        modelMap.addAttribute("calculation", calculationMessage.toString());

        return "welcome";
    }

    /**
     * Returns the sum of two numbers.
     *
     * @param numOne
     * @param numTwo
     * @return
     */
    public int sum(int numOne, int numTwo) {
        return numOne + numTwo;
    }
}