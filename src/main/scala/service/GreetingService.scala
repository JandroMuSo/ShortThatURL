package dev.jandromuso
package service

import conf.PropertiesBundle
import model.Greeting

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GreetingService @Autowired()(properties: PropertiesBundle) {

  def get: Greeting = Greeting(s"Hey!, ${properties.greeting1}")

}