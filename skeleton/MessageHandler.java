/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author zaid
 */
public class MessageHandler {
    private static MessageHandler  messagehandler=null;
    private MessageHandler()
    {
        
    }
    
    public static  MessageHandler getInstance() //synchronized?
    {
        if (messagehandler == null)
            messagehandler= new MessageHandler();
        return messagehandler;
    }
    
    public void handleMsg(Message message)
    {
        
    }
    
    public bool sendMessage(Message message)
    {
        return false;
    }
}

