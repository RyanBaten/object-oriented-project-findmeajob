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
public class MessageFactoryBase {
    private static MessageFactoryBase messageFB=null;

    public MessageFactoryBase() {
    }
    
    public static MessageFactoryBase getInstance()
    {
        if (messageFB == null)
            messageFB = new MessageFactoryBase();
        return messageFB;
    }
    
    public Message createMessage()
    {
        
    }
    
}

