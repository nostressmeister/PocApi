package com.hello.world.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class service {

    private RestTemplate restTemplate;

    public String getNome(){
        return "Pedro";
    }

    public String getTempoGoogle(){
        restTemplate = new RestTemplate();
        String url = "http://apiadvisor.climatempo.com.br/api/v1/locale/city?name=S%C3%A3o%20Paulo&state=SP&token=ec82c3cb539cb2a0f0031482e8a1847c";
        try{
            ResponseEntity resp = restTemplate.getForEntity(url, String.class);
            return resp.getBody().toString();
        }catch (Exception ex){
            return null;
        }

    }


    public List<String> createListNomes() {
        List<String> nomes = new ArrayList<>();
        nomes.add("jose");
        nomes.add("maria");
        nomes.add("joao");
        return nomes;
    }





}
