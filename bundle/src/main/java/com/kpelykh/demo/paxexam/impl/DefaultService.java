package com.kpelykh.demo.paxexam.impl;

import com.kpelykh.demo.paxexam.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: kpelykh
 * Date: 12/11/13
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultService implements Service {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultService.class);

    private String hello;

    public DefaultService() {
        Thread.currentThread();
    }

    public String sayHello(String name) {
        LOG.info("Saying hello to [{}].  Hello value is [{}].", name, hello);
        return hello + " " + name + ".";
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
