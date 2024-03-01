package pl.tdelektro.carhelper.controller;

import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pl.tdelektro.carhelper.pojo.UserDTO;
import pl.tdelektro.carhelper.service.UserServiceImpl;
import reactor.core.publisher.Flux;

import java.util.Map;

@RestController
public class ChatController {

    private final OpenAiChatClient chatClient;

    @Autowired
    UserServiceImpl userService;
    @Autowired
    public ChatController(OpenAiChatClient chatClient) {
        this.chatClient = chatClient;
    }

    //Request from URL
    @PostMapping("/ai/generate")
    public Map generate(@RequestBody UserDTO user) {
        String message = userService.getMessage(user);
        return Map.of("generation", chatClient.call(message));
    }


    // Test redirect to URL www.tdelektro.pl
    @GetMapping("/webpage")
    public ModelAndView redirectToWebpage() {
        String webpageUrl = "http://www.tdelektro.pl";
        return new ModelAndView(new RedirectView(webpageUrl));
    }

}