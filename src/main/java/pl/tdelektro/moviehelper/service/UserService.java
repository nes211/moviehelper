package pl.tdelektro.moviehelper.service;

import org.springframework.ai.chat.prompt.Prompt;
import pl.tdelektro.moviehelper.pojo.Recommendation;
import pl.tdelektro.moviehelper.pojo.User;

public interface UserService {
    Recommendation getMessage(User user);

    Prompt getPrompt(User user);

}
