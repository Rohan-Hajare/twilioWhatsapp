package com.twilioWhatapp.Controller;

import com.twilioWhatapp.SendWhatsAppRequest;
import com.twilioWhatapp.Service.TwilioWhatsAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WhatsAppController {

    private final TwilioWhatsAppService twilioWhatsAppService;

    @Autowired
    public WhatsAppController(TwilioWhatsAppService twilioWhatsAppService) {
        this.twilioWhatsAppService = twilioWhatsAppService;
    }

    @PostMapping("/send-whatsapp")
    public String sendWhatsApp(@RequestBody SendWhatsAppRequest request) {
        twilioWhatsAppService.sendWhatsAppMessage(request.getTo(), request.getMessage());
        return "WhatsApp message sent!";
    }
}

