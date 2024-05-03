package org.example.dataanalysermicroservice.service;

import org.example.dataanalysermicroservice.model.Data;
import org.springframework.stereotype.Service;

@Service
public class KafkaDataServiceImpl implements KafkaDataService {

    @Override
    public void handle(Data data) {
        System.out.println("Data received: " + data.toString());
    }
}
