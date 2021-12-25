/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medicweb.controllers;

import com.medicweb.pojo.PrescriptionTemp;
import com.medicweb.utils.Utils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author QUYENNGUYEN
 */
@RestController
public class ApiPrescriptionController {
    
     @PostMapping("/api/prescription")
    public int addCart(@RequestBody PrescriptionTemp params, HttpSession session){
       Map<Integer, PrescriptionTemp> cart = (Map<Integer, PrescriptionTemp>) session.getAttribute("cart");
        if (cart == null)
            cart = new HashMap<>();
        
        int medicinetId = params.getMedicineId();
        if (cart.containsKey(medicinetId) == true) { // san pham da co trong gio
            PrescriptionTemp c = cart.get(medicinetId);
            c.setCount(c.getCount()+1);
        } else { // san pham chua co trong gio
            cart.put(medicinetId, params);
        }
        
        session.setAttribute("cart", cart);
        
        return Utils.count(cart);
    }
    
}