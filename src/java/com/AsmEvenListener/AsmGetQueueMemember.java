/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AsmEvenListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Collection;
import java.util.Collections;
import org.asteriskjava.live.AsteriskChannel;
import org.asteriskjava.live.AsteriskQueue;
import org.asteriskjava.live.AsteriskQueueEntry;
import org.asteriskjava.live.AsteriskQueueMember;
import org.asteriskjava.live.AsteriskServer;
import org.asteriskjava.live.AsteriskServerListener;
import org.asteriskjava.live.DefaultAsteriskServer;
import org.asteriskjava.live.ManagerCommunicationException;
import org.asteriskjava.live.AsteriskServerListener;
import org.asteriskjava.live.DefaultAsteriskServer;
import org.asteriskjava.live.ManagerCommunicationException;
import org.asteriskjava.live.MeetMeUser;
import org.asteriskjava.live.internal.AsteriskAgentImpl;

/**
 *
 * @author haipt
 */
public class AsmGetQueueMemember implements AsteriskServerListener, PropertyChangeListener {

    private AsteriskServer _asteriskServer;

    public AsmGetQueueMemember(String host, String username, String password) {
        _asteriskServer = new DefaultAsteriskServer(host, username, password);
    }

    public Collection<AsteriskQueue> GetAllQueues() throws ManagerCommunicationException {
        Collection<AsteriskQueue> allqueue = _asteriskServer.getQueues();
        for (AsteriskQueue queue : allqueue) {

        }
        return _asteriskServer.getQueues();
    }

    @Override
    public void onNewAsteriskChannel(AsteriskChannel channel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onNewMeetMeUser(MeetMeUser user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onNewAgent(AsteriskAgentImpl agent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onNewQueueEntry(AsteriskQueueEntry entry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
