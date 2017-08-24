package ru.piano.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.piano.model.StackOverflowAnswer;
import ru.piano.util.JsonMapper;

/**
 * Created by ermolaev on 23.08.2017.
 */
@Controller
public class IndexController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String openIndexPage(Model model) {
    return "index";
  }

  @RequestMapping(value = "search", method = RequestMethod.GET)
  public String searchOnStackOverflow(@RequestParam String line, @RequestParam(defaultValue = "1", required = false) int page, Model model) throws URISyntaxException {
    HttpResponse response = sendGet(line, page);
    JsonMapper<StackOverflowAnswer> jsonMapper = new JsonMapper<>();
    try {
      BufferedReader rd = new BufferedReader(
          new InputStreamReader(response.getEntity().getContent()));

      StringBuffer result = new StringBuffer();
      String answer = "";
      while ((answer = rd.readLine()) != null) {
        result.append(answer);
      }
      StackOverflowAnswer stackOverflowAnswer = jsonMapper.transform(result.toString(), StackOverflowAnswer.class);
      model.addAttribute("questions", stackOverflowAnswer);
      model.addAttribute("line", line);
      model.addAttribute("page", page);
    }
    catch (IOException e) {
      e.printStackTrace();
    }

    return "index";
  }

  private HttpResponse sendGet(String line, int page) throws URISyntaxException {

    URIBuilder builder = new URIBuilder();
    builder.setScheme("http").setHost("api.stackexchange.com").setPath("/2.2" + "/" + "search")
        .setParameter("page", String.valueOf(page))
        .setParameter("order", "desc")
        .setParameter("sort", "activity")
        .setParameter("intitle", line)
        .setParameter("site", "stackoverflow");
    URI uri = builder.build();
    HttpClient client = HttpClientBuilder.create().build();
    HttpGet httpget = new HttpGet(uri);
    try {
      return client.execute(httpget);
    }
    catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

}
