package fitness.rmont.fitnesstracker.utils;

import fitness.rmont.fitnesstracker.models.User;

/**
 * Created by rmontgomery on 2/18/17.
 */

public class RemoteDataManager {

  public boolean attempt_login(String user_name, String password) {
    //TODO: Wire this up to backend when implemented.
    if(user_name.equals("robtest") && password.equals("asdf")) {

      //TODO: Parse from JSON response when implemented
      User user = new User();
      user.set_first_name("Rob");
      user.set_last_name("Montgomery");
      user.set_nickname("Bob");
      user.set_age(28);
      user.set_weight(181.1f);
      user.set_auth_token("USER_TOKEN");
      UserState.get_instance().set_current_user(user);


      return true;
    }
    return false;
  }

}
