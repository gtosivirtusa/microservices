/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.virtusa.microservices.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.virtusa.microservices.data.dao.BankDAO;
import com.virtusa.microservices.data.model.Bank;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Hello service resource class.
 */
@Path("/bank")
public class BankService {

    Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();

    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAll(){
        List<Bank> banks = new BankDAO().getAll();
        return gson.toJson(banks);
    }

    @GET
    @Path("/get/{bank_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String get(@PathParam("bank_id") int bank_id){
        Bank bank = new BankDAO().get(bank_id);
        return gson.toJson(bank);
    }
}
