package com.example.demo;

import org.postgresql.Driver;

import javax.xml.stream.events.DTD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CouponDAO {

    public CouponDAO() {
    }

    public List<CouponDTO> getAll(){
        Connection con = null;
        var list = new ArrayList<CouponDTO>();
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres"
                            ,"postgres","hothaifa");
            System.out.println("success");
            Statement st= con.createStatement();
            var res = st.executeQuery("SELECT * FROM \"Coupon\"");
            while (res.next()){
               list.add(new CouponDTO(
                        res.getInt("id")
                        , res.getString("title")
                        ,res.getString("genre")
                        ,res.getInt("available")));

            }
            con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {

        }

        return list;


    }

    public CouponDTO geById(int _id){
        Connection con = null;
        var list = new ArrayList<CouponDTO>();
        CouponDTO s= new CouponDTO();
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres"
                            ,"postgres","hothaifa");
            System.out.println("success");
            Statement st= con.createStatement();
            var res = st.executeQuery("SELECT * FROM \"Coupon\" WHERE \"id\"="+_id);
            res.next();
                 s=new CouponDTO(
                        res.getInt("id")
                        , res.getString("title")
                        ,res.getString("genre")
                        ,res.getInt("available"));
            con.close();

        }
        catch (Exception e){
            System.out.println(e);
        }


        return s;
    }
}
