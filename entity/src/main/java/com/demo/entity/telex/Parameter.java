package com.demo.entity.telex;

import lombok.Data;

@Data
public class Parameter {

    private Long id;
    private String sourceType;
    private String source;
    private String queueName;
    private String rate;
    private String dataBit;
    private String parity;
    private String stopBit;
    private String codeType;
    private String mqAddress;
    private String repost;
    private String iata;
    private String icao;
    private String socketEncoding;
    private String socketTimeout;
}
