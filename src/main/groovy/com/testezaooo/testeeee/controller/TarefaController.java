package com.testezaooo.testeeee.controller;

import com.testezaooo.testeeee.client.CustomPageImpl;
import com.testezaooo.testeeee.domain.Tarefa;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/tarefa")
public class TarefaController {

   @GetMapping
   public CustomPageImpl<Tarefa> listTarefaPaginate() {
       RestTemplate rest = new RestTemplate();
       ;
       ParameterizedTypeReference<CustomPageImpl<Tarefa>> response = new ParameterizedTypeReference<CustomPageImpl<Tarefa>>(){};
       return rest.exchange("http://localhost:8081/rest-results?offset=1&limit=100&max=100",
               HttpMethod.GET,new HttpEntity<Tarefa>(){},
               response).getBody();
    }
}
