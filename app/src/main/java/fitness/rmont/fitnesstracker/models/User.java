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

  public String getAuth_token() {
    return auth_token;
  }

  public void setAuth_token(String auth_token) {
    this.auth_token = auth_token;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

}
