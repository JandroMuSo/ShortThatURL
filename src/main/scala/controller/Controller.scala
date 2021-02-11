package dev.jandromuso
package controller

import dev.jandromuso.service.GreetingService
import dev.model.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
class Controller @Autowired()(greetingService: GreetingService) {

  @RequestMapping(value = Array("/greeting"), method = Array(RequestMethod.GET))
  def greeting: Greeting = greetingService.get

}
