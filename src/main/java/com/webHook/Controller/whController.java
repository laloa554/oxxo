package com.webHook.Controller;
import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Objects;
import java.util.stream.Collectors;
import com.google.gson.Gson;

import com.webHook.order.Metadata;
import com.webHook.order.Object;
import com.webHook.order.Root;
import com.webHook.order.PaymentMethod;
import com.webHook.order.PreviousAttributes;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
@RequestMapping("/producto")
public class whController {

    
    @PostMapping("/webHookPrueba")
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	BufferedReader get_body = request.getReader(); 
    	String o = get_body.lines().collect(Collectors.joining());
    	ObjectMapper om = new ObjectMapper();
    	
    	Root root = om.readValue(o, Root.class);
    	root.getObject().getMetadata().setMonto(root.getObject().getAmount());
    	root.getObject().getMetadata().setFolioInterbancario(root.getObject().getCharges().getData().get(0).getPayment_method().getReference());
    	root.getObject().getMetadata().setFechaPago(root.getObject().getCreated_at());
    	root.getObject().getMetadata().setHoraPago(root.getObject().getUpdated_at());
    	System.out.println("Metadata: \n"
    			+ "No Pedido: "+ root.getObject().getMetadata().getNoPedido() + "\n"
    			+ "Monto: " + root.getObject().getMetadata().getMonto() + "\n"
    			+ "No Targeta: "+ root.getObject().getMetadata().getNotarjeta() + "\n"
    			+ "Folio InteB: " + root.getObject().getMetadata().getFolioInterbancario() + "\n"
    			+ "No Autoriza: " + root.getObject().getMetadata().getNoAutorizacion() + "\n"
    			+ "Fecha Pago: " + root.getObject().getMetadata().getFechaPago() + "\n"
    			+ "Hora Pago: " + root.getObject().getMetadata().getHoraPago() + "\n"
    			+ "Titular Cuenta: " + root.getObject().getMetadata().getTitularCuenta());
    }
    
 
    



}
