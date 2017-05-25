package com.moussi.microservicesentenceclient.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * Created by moussiaymen on 18/05/17.
 */
@RestController
public class SentenceController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/sentence")
    public @ResponseBody String getSentence() {
        return
            getWord("MICROSERVICE-SUBJECT-CLIENT") + " "
                + getWord("MICROSERVICE-VERB-CLIENT") + " "
                + getWord("MICROSERVICE-ARTICLE-CLIENT") + " "
                + getWord("MICROSERVICE-ADJECTIVE-CLIENT") + " "
                + getWord("MICROSERVICE-NOUN-CLIENT") + "."
            ;
    }

    public String getWord(String service) {
        List<ServiceInstance> list = client.getInstances(service);
        if (list != null && list.size() > 0 ) {
            URI uri = list.get(0).getUri();
            if (uri !=null ) {
                return (new RestTemplate()).getForObject(uri,String.class);
            }
        }
        return null;
    }
}
