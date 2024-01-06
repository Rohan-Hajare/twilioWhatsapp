package com.twilioWhatapp.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TwilioWhatsAppService {

    @Value("${twilio.account_sid}") // Make sure to define these values in your application.properties or application.yml
    private String ACCOUNT_SID;

    @Value("${twilio.auth_token}")
    private String AUTH_TOKEN;

    @Value("${twilio.whatsapp.number}")
    private String TWILIO_NUMBER; // Your Twilio phone number

    public void sendWhatsAppMessage(String to, String messageBody) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("whatsapp:" + to),
                        new com.twilio.type.PhoneNumber("whatsapp:" + TWILIO_NUMBER),
                        messageBody)
                .create();

        System.out.println("Message SID: " + message.getSid());
    }
}

