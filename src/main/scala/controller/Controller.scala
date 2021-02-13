package dev.jandromuso
package controller

import model.Greeting
import service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{PathVariable, RequestMapping, RequestMethod, RestController}
import javax.servlet.http.HttpServletResponse

@RestController
class Controller @Autowired()(greetingService: GreetingService) {

  @RequestMapping(value = Array("/greeting"), method = Array(RequestMethod.GET))
  def greeting: Greeting = greetingService.get

  @RequestMapping(value = Array("/redirect/{id}"), method = Array(RequestMethod.GET))
  def redirect(httpServletResponse: HttpServletResponse, @PathVariable id:String): Unit = {
    if(id.equals("1")){
      httpServletResponse.sendRedirect("https://www.google.com")
    }else{
      httpServletResponse.sendRedirect("https://www.facebook.com")
    }

  }

}
