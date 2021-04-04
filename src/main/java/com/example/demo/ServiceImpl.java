package com.example.demo;


import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;
@Service
public class ServiceImpl {

    public String connect()
    {
        final String uri = "http://localhost:8083/";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
        return result;
    }

    public String getUser()
    {
        final String uri = "http://localhost:8083/users/1";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
        return result;
    }

    public String getAllUserNames()
    {
        final String uri = "http://localhost:8083/api/users";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
        return result;
    }


}
