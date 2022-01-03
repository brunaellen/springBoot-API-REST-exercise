package br.com.alura.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.controller.dto.TopicDto;
import br.com.alura.model.Course;
import br.com.alura.model.Topic;

@RestController
public class TopicsController {
  
  @RequestMapping("/topics")
  @ResponseBody
  public List<TopicDto> listing() {
    Topic topicExample = new Topic("query", "query using Spring",
        new Course("Spring", "Programming"));
    return TopicDto.convertATopicListToTopicDtoList(Arrays.asList(topicExample, topicExample, topicExample));
  }
}