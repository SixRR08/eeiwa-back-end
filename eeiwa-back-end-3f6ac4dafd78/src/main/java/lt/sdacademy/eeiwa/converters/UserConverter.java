package lt.sdacademy.eeiwa.converters;

import lt.sdacademy.eeiwa.models.dto.User;

import lt.sdacademy.eeiwa.models.entities.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserEntity convert(User user) {
        if (user == null) {
            return null;
        }

        UserEntity result = new UserEntity();
        result.setId(user.getId());
        result.setFirstName(user.getFirstName());
        result.setEmail(user.getUsername());

        return result;
    }
}
