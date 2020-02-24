package com.dv.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;
import java.util.List;

@Controller
@EnableAutoConfiguration
public class SampleController {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    LinkedList<Object> holder = new LinkedList<Object>();

    @RequestMapping("/oom")
    @ResponseBody
    public String consumeAvailableMemory()  throws Exception
    {
        while (true)
        {
            try
            {
                this.holder.add(new byte[128 * 1024]);
            }
            catch (OutOfMemoryError ex)
            {
                return "";
            }
        }
    }
}
