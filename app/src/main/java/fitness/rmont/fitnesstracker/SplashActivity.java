package fitness.rmont.fitnesstracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by rmontgomery on 2/19/17.
 */

public class SplashActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Intent intent = new Intent(this, StartActivity.class);
    startActivity(intent);
    finish();
  }
}
