package temple.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    EditText email;
    EditText username;
    EditText password;
    EditText passwordCon;
    Button saveButton;

    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        email = findViewById(R.id.email);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        passwordCon = findViewById(R.id.passwordConfirm);
        saveButton = findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().length() == 0 ||
                        username.getText().length() == 0 ||
                        password.getText().length() == 0 ||
                        passwordCon.getText().length() == 0){
                    Toast.makeText(context, "Must enter all fields!", Toast.LENGTH_LONG).show();
                }else{
                    if(password.getText().toString().equals(passwordCon.getText().toString()))
                    {
                        // passwords match
                        Toast.makeText(context, "Welcome, "+ username.getText().toString() + ", to the SignUpForm App", Toast.LENGTH_LONG).show();

                    }else{
                        Toast.makeText(context, "Passwords must match!", Toast.LENGTH_LONG).show();

                    }
                }
            }
        });

    }
}
