package com.example.demo.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class ApiProperties {

  @Value("${info.app.external.url}")
  private String externalUrl;

}
