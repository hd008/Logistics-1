package com.logistics.test;

import com.logistics.action.TestAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/spring-config.xml");
        TestAction ta = (TestAction) ac.getBean("testAction");
        System.out.println(ta.toString());
        ta.test();

    }
}
