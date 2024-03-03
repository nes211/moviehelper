package pl.tdelektro.moviehelper.controller;

import lombok.AllArgsConstructor;
import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.ai.parser.BeanOutputParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pl.tdelektro.moviehelper.pojo.Recommendation;
import pl.tdelektro.moviehelper.pojo.User;
import pl.tdelektro.moviehelper.service.UserServiceImpl;

@RestController
@AllArgsConstructor
public class ChatController {


    private  OpenAiChatClient chatClient;
    private UserServiceImpl userService;

    //Request from URL
    @PostMapping("/ai/moviehelper")
        Recommendation generate(@RequestBody User user) {


        BeanOutputParser<Recommendation> parser = new BeanOutputParser<>(Recommendation.class);

            var prompt = userService.getPrompt(user);
           var response = chatClient.call(prompt);
            var content = response.getResult().getOutput().getContent();

        return parser.parse(content);
    }

    // Test redirect to URL www.tdelektro.pl
    @GetMapping("/webpage")
    public ModelAndView redirectToWebpage() {
        String webpageUrl = "http://www.tdelektro.pl";
        return new ModelAndView(new RedirectView(webpageUrl));
    }

}