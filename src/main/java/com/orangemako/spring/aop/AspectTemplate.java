package com.orangemako.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * A template for Aspects
 *
 * @author Kevin Leong
 */
@Component
@Aspect
public class AspectTemplate {
    private static final Logger LOG = LoggerFactory.getLogger(AspectTemplate.class);

    @Before("execution(* com.orangemako.spring.controller.mvc.MvcControllerTemplate.displayWelcomeMessage(..))")
    public void beforeWelcomeMessageAdviceTemplate() {
        LOG.info("@Before calling displayWelcomeMessage()");
    }

    @Before("execution(* com.orangemako.spring.controller.mvc.MvcControllerTemplate.sum(..)) && " +
            "args(numOne, numTwo)")
    public void beforeSumAdviceTemplate(int numOne, int numTwo) {
        LOG.info("@Before calling sum() on: " + numOne + " + " + numTwo);
    }

}