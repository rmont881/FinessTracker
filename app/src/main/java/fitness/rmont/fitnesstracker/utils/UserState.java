package fitness.rmont.fitnesstracker.utils;

import fitness.rmont.fitnesstracker.models.User;

/**
 * Created by rmontgomery on 2/18/17.
 */

public class UserState {

  private static UserState _user_state = null;

  private User _current_user = null;

  private UserState() {
  }

  public static UserState get_instance() {
    if (_user_state == null) {
      _user_state = new UserState();
    }
    return _user_state;
  }

  public boolean is_logged_in() {
    if (_current_user == null) return false;
    return true;
  }

  public User get_current_user() {
    return _current_user;
  }

  public void set_current_user(User new_user) {
    _current_user = new_user;
  }

}
