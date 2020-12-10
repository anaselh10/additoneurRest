package com.springboot.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.services.AdderService;

@RequestMapping(value = "/adder", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class AdderController {
  private AdderService adderService;
  public AdderController(AdderService adderService) {
  this.adderService = adderService;
  }
  @GetMapping("/current")
  public int currentNum() {
  return adderService.currentBase();
  }
  @PostMapping
  public int add(@RequestParam int num) {
  return adderService.add(num);
  }
}

