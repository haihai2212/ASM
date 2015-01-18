/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AsmEvenListener;

import java.beans.PropertyChangeListener;
import org.asteriskjava.live.AsteriskQueue;
import org.asteriskjava.live.AsteriskQueueMember;
import org.asteriskjava.live.AsteriskServer;
import org.asteriskjava.live.AsteriskServerListener;
import org.asteriskjava.live.DefaultAsteriskServer;
import org.asteriskjava.live.ManagerCommunicationException;
import org.asteriskjava.live.AsteriskServerListener;
import org.asteriskjava.live.DefaultAsteriskServer;
import org.asteriskjava.live.ManagerCommunicationException;

/**
 *
 * @author haipt
 */
public class AsmGetQueueMemember implements AsteriskServerListener, PropertyChangeListener {

    private AsteriskServer _asteriskServer;

    public AsmGetQueueMemember(String host, String username, String password) {
        _asteriskServer = new DefaultAsteriskServer(host, username, password);
    }

    public String GetQueueName() throws ManagerCommunicationException {
        String queueName = "";
        for (AsteriskQueue queues : _asteriskServer.getQueues()) {
            queueName += "-" + queues.getName();
        }
        return queueName;
    }
}
