package fitness.rmont.fitnesstracker.fragments.start;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import fitness.rmont.fitnesstracker.R;


public class LoginFragment extends Fragment implements View.OnClickListener {

  private OnFragmentInteractionListener mListener;

  EditText username_edit_text = null;
  EditText password_edit_text = null;
  Button login_button = null;

  public LoginFragment() {
  }

  public static LoginFragment newInstance() {
    LoginFragment fragment = new LoginFragment();
    Bundle args = new Bundle();
//    args.putString(ARG_PARAM1, param1);
//    args.putString(ARG_PARAM2, param2);
    fragment.setArguments(args);
    return fragment;
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View fragment_view = inflater.inflate(R.layout.fragment_login, container, false);

    username_edit_text = (EditText)fragment_view.findViewById(R.id.userNameEditText);
    password_edit_text = (EditText)fragment_view.findViewById(R.id.passwordEditText);
    login_button = (Button)fragment_view.findViewById(R.id.loginButton);

    login_button.setOnClickListener(this);

    return fragment_view;
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    if (context instanceof OnFragmentInteractionListener) {
      mListener = (OnFragmentInteractionListener) context;
    } else {
      throw new RuntimeException(context.toString()
              + " must implement OnFragmentInteractionListener");
    }
  }

  @Override
  public void onDetach() {
    super.onDetach();
    mListener = null;
  }

  @Override
  public void onClick(View v) {

    if(v == login_button) {
      String username = username_edit_text.getText().toString();
      String password = password_edit_text.getText().toString();
      if(username.equals("") || password.equals("")) {
        //TODO: Add logic for notifying user of bad state
      } else {
        mListener.onLoginAttempt(username, password);
      }
    }

  }

  public interface OnFragmentInteractionListener {
    // TODO: Update argument type and name
    void onLoginAttempt(String username, String password);
  }
}
