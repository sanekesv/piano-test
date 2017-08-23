package ru.piano.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ermolaev on 23.08.2017.
 */
@Controller
public class IndexController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String openIndexPage(Model model) {
    model.addAttribute("Title", "di nah");
    return "index";
  }

  @RequestMapping(value = "search", method = RequestMethod.POST, consumes = "text/plain")
  public List<Object> searchOnStackOverflow(@RequestBody String line) {
    return null;
  }

}
