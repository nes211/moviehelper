package pl.tdelektro.carhelper.service;

import org.springframework.ai.chat.prompt.Prompt;
import pl.tdelektro.carhelper.pojo.Recommendation;
import pl.tdelektro.carhelper.pojo.User;

public interface UserService {
    Recommendation getMessage(User user);

    Prompt getPrompt(User user);

}
