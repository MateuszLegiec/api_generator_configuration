package pl.legit.api_from_swagger_generator;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.legit.api_from_swagger_generator.client.api.UserApi;
import pl.legit.api_from_swagger_generator.rest.api.UserApiDelegate;
import pl.legit.api_from_swagger_generator.rest.model.User;

@Service
@AllArgsConstructor
public class UserApiDelegateService implements UserApiDelegate {

    private final UserApi userApi;

    @Override
    public ResponseEntity<User> getUserById(Long id) {
        userApi.getUserById(1L);
        return null;
    }
}
