package fitness.rmont.fitnesstracker;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import fitness.rmont.fitnesstracker.fragments.start.LoginFragment;
import fitness.rmont.fitnesstracker.utils.RemoteDataManager;
import fitness.rmont.fitnesstracker.utils.UserState;

public class StartActivity extends FragmentActivity implements LoginFragment.OnFragmentInteractionListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_start);
  }

  @Override
  public void onLoginAttempt(String username, String password) {
    RemoteDataManager remote_data_manager = new RemoteDataManager();
    remote_data_manager.attempt_login(username, password);
  }
}
