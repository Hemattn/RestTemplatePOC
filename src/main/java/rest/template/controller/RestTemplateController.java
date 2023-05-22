package rest.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.template.service.RestTemplateService;

@RestController
@RequestMapping("/rest")
public class RestTemplateController {
    @Autowired
    private RestTemplateService restTemplateService;
    @GetMapping("/hello/world")
    public ResponseEntity<String> helloWorld(@RequestParam("message") String message){
        return restTemplateService.helloWorld(message);

    }
}
