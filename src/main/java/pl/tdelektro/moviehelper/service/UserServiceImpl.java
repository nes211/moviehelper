package pl.tdelektro.moviehelper.service;

import lombok.AllArgsConstructor;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.parser.BeanOutputParser;
import org.springframework.stereotype.Service;
import pl.tdelektro.moviehelper.pojo.Recommendation;
import pl.tdelektro.moviehelper.pojo.User;
import pl.tdelektro.moviehelper.repository.UserRepository;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Override
    public Recommendation getMessage(User user) {
        userRepository.save(user);
        Recommendation message = new Recommendation();
        return message;
    }

    @Override
    public Prompt getPrompt(User user) {

        BeanOutputParser<Recommendation> parser = new BeanOutputParser<>(Recommendation.class);

        String promptString = """
                including criteria:
                category: {category},
                platform: {platform},
                rating equals:{rating},
                score IMDB greater then: {score},
                favourite actor {actor},
                if something is not filled please omit it.
                For input data generate list of best 5 movies with rating
                As a title in response write: Top 5 {platform}:
                Return in format: {format}
                """;

        PromptTemplate template = new PromptTemplate(promptString);
        template.add("category", user.getCategory());
        template.add("platform", user.getPlatform());
        template.add("rating", user.getRating());
        template.add("score", user.getScore());
        template.add("actor", user.getActor());
        template.add("format", parser.getFormat());

        return template.create();
    }
}
