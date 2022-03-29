package com.example.demo;

import jdk.jfr.Registered;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coupon")
public class CouponController {
    private  CouponDAO couponDAO= new CouponDAO();

    @GetMapping("/")
    List<CouponDTO> getAll(){
        return couponDAO.getAll();
    }

    @GetMapping("/{id}")
    CouponDTO getById(@PathVariable int id){
        return couponDAO.geById(id);
    }


}
