package fitness.rmont.fitnesstracker.utils;

import fitness.rmont.fitnesstracker.models.User;

/**
 * Created by rmontgomery on 2/18/17.
 */

public class RemoteDataManager {

  public boolean attempt_login(String user_name, String password) {
    //Wire this up to backend when implemented.
    if(user_name.equals("robtest") && password.equals("asdf")) {
      User user = new User();

      return true;
    }
    return false;
  }

}
