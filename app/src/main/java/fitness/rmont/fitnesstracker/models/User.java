package fitness.rmont.fitnesstracker.models;

/**
 * Created by rmontgomery on 2/18/17.
 */

public class User {

  String auth_token = "";
  String first_name = "";
  String last_name = "";
  int age = -1;
  String nickname = "";
  float weight = 0.0f;

  public String get_auth_token() {
    return auth_token;
  }

  public void set_auth_token(String auth_token) {
    this.auth_token = auth_token;
  }

  public String get_first_name() {
    return first_name;
  }

  public void set_first_name(String first_name) {
    this.first_name = first_name;
  }

  public String get_last_name() {
    return last_name;
  }

  public void set_last_name(String last_name) {
    this.last_name = last_name;
  }

  public int get_age() {
    return age;
  }

  public void set_age(int age) {
    this.age = age;
  }

  public String get_nickname() {
    return nickname;
  }

  public void set_nickname(String nickname) {
    this.nickname = nickname;
  }

  public float get_weight() {
    return weight;
  }

  public void set_weight(float weight) {
    this.weight = weight;
  }

}
