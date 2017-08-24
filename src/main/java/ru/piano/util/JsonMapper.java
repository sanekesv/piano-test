package ru.piano.util;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by ermolaev on 24.08.2017.
 */
public class JsonMapper<T> {
  public T transform(String answer, Class clazz) {
    // covert JSON to Java object
    T responce = null;
    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
    try {
      responce = (T) mapper.readValue(answer, clazz);
    }
    catch (Exception e) {
      e.printStackTrace();
      System.out.println("Response from server is ok, but message cannot be translated properly. " +
          "Message id cannot be identified as well. \n" +
          "Answer is : " + answer);
    }

    return responce;
  }

}