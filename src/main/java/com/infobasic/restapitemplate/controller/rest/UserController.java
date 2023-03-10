package com.infobasic.restapitemplate.controller.rest;

import static spark.Spark.*;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.infobasic.restapitemplate.controller.rest.util.StandardResponse;
import com.infobasic.restapitemplate.model.Company;
import com.infobasic.restapitemplate.model.Private;
import com.infobasic.restapitemplate.service.UserService;

import spark.Filter;

public class UserController {
    String APIVersion = "/v1";

    public void startServices(UserService userService) {

        after((Filter) (req, res) -> {
            res.header("Access-Control-Allow-Origin", "*");
            res.header("Access-Control-Allow-Methods", "GET, POST, PATCH, PUT, DELETE, OPTIONS");
            res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, eContent-Type, Accept");
            res.header("Access-Control-Max-Age", "86400");
            res.status(200);

        });

        get("/", (req, res) -> "System online!");

        get(APIVersion + "/companies", (req, res) -> {
            res.type("application/json");
            List<Company> list = new ArrayList<>();
            list = userService.getAllCompanies();
            System.out.println(list);
            StandardResponse response = new StandardResponse("200",
                    new Gson().toJsonTree(list));
            return new Gson().toJson(response);
        });


        get(APIVersion + "/privates", (req, res) -> {
            res.type("application/json");
            List<Private> list = new ArrayList<>();
            list = userService.getAllPrivates();
            //System.out.println(list);
            StandardResponse response = new StandardResponse("200",
                    new Gson().toJsonTree(list));
            return new Gson().toJson(response);
        });
        
        /* delete(APIVersion + "/company/delete/:id", (req, res) -> {
            res.type("application/json");
            
            int paramID = Integer.parseInt(req.params("id"));
            System.out.println(paramID);
            userService.deleteCompanyById(paramID);
            res.status(200);
            return "user deleted";
        }); */


        /* delete(APIVersion + "/private/delete/:id", (req, res) -> {
            res.type("application/json");
            
            int paramID = Integer.parseInt(req.params("id"));
            System.out.println(paramID);
            userService.deletePrivateById(paramID);
            return new Gson().toJsonTree(new StandardResponse("200"));
        }); */
       
        /*
        post(APIVersion + "/user/create", (req, res) -> {
            res.type("application/json");

            User userFromRequest = new Gson()
                    .fromJson(req.body(), User.class);

            userService.addUser(userFromRequest);

            return new Gson().toJson(new StandardResponse("200"));
        });
        */
        /*
        put(APIVersion + "/user/update", (req, res) -> {
            res.type("application/json");

            
            Passi per aggionare un record:
            
            1) Prendo il record nuovo da request
            2) Prendo il record da aggiornare nel database
            3) Sovrascrivo (non ID)
            4) Rimando il nuovo record aggiornato
            
            User newUser = new Gson().fromJson(req.body(), User.class);
            User oldUser = userService.getUserById(newUser.getId()); // Prevedere controllo su ID

            Non prevedo aggiornamento dell'ID
            if (oldUser != null) {
                oldUser.setDateRegistered(newUser.getDateRegistered());
                oldUser.setEmail(newUser.getEmail());
                oldUser.setEnabled(newUser.isEnabled());
                oldUser.setRole(newUser.getRole());
                oldUser.setUsername(newUser.getUsername());
            }

            StandardResponse response = new StandardResponse("200",
                    new Gson().toJsonTree(userService.updateUser(oldUser)));
            return new Gson().toJson(response);
        });
        */
    }
    
}
