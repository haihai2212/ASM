/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AsmEvenListener;

import org.asteriskjava.live.AsteriskChannel;
import org.asteriskjava.live.AsteriskQueueEntry;
import org.asteriskjava.live.AsteriskServer;
import org.asteriskjava.live.AsteriskServerListener;
import org.asteriskjava.live.DefaultAsteriskServer;
import org.asteriskjava.live.ManagerCommunicationException;
import org.asteriskjava.live.MeetMeUser;
import org.asteriskjava.live.internal.AsteriskAgentImpl;

/**
 *
 * @author haipt
 */
public class serverLiveEvents implements AsteriskServerListener {

    private AsteriskServer asteriskServer;

    public serverLiveEvents() {
        asteriskServer = new DefaultAsteriskServer("192.168.1.200", "admin", "phanhai2212");
    }
// test ass
    public void run() throws ManagerCommunicationException {
        asteriskServer.addAsteriskServerListener(this);
    }

    public void onNewAsteriskChannel(AsteriskChannel channel) {
        System.out.println(channel);
    }

    public void onNewMeetMeUser(MeetMeUser user) {
        System.out.println(user);
    }

    public static void main(String[] args) throws Exception {
        serverLiveEvents helloLiveEvents = new serverLiveEvents();
        helloLiveEvents.run();
    }

    @Override
    public void onNewAgent(AsteriskAgentImpl agent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onNewQueueEntry(AsteriskQueueEntry entry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
