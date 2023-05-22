package rest.template.service;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateService {
    private RestTemplate restTemplate;

    public RestTemplateService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public ResponseEntity<String> helloWorld(String message){
        ResponseEntity<String > response=restTemplate.exchange
                ("http://localhost:8080/java/publish?message="+message,
                HttpMethod.GET, null, String.class);
        return response;
    }

}
