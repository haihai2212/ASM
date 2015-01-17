/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AsmEvenListener;

import java.io.IOException;

import org.asteriskjava.manager.AuthenticationFailedException;
import org.asteriskjava.manager.ManagerConnection;
import org.asteriskjava.manager.ManagerConnectionFactory;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.TimeoutException;
import org.asteriskjava.manager.action.StatusAction;
import org.asteriskjava.manager.event.ManagerEvent;
/**
 *
 * @author haipt
 */
public class serverlistener implements ManagerEventListener {

    private ManagerConnection managerConnection;

    public serverlistener() throws IOException {
        ManagerConnectionFactory factory = new ManagerConnectionFactory(
                "192.168.1.200", "admin", "phanhai2212");

        this.managerConnection = factory.createManagerConnection();
    }

    public void run() throws IOException, AuthenticationFailedException,
            TimeoutException, InterruptedException {
        // register for events
        managerConnection.addEventListener(this);

        // connect to Asterisk and log in
        managerConnection.login();

        // request channel state
        managerConnection.sendAction(new StatusAction());

        // wait 10 seconds for events to come in
        Thread.sleep(10000);

        // and finally log off and disconnect
        managerConnection.logoff();
    }

    public void onManagerEvent(ManagerEvent event) {
        // just print received events
        System.out.println(event);
    }

    public static void main(String[] args) throws Exception {
        serverlistener server;

        server = new serverlistener();
        server.run();
    }
}
