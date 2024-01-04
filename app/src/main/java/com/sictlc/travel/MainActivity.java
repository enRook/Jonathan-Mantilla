package com.sictlc.travel;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);

        Button signInButton = findViewById(R.id.button);
        signInButton.setOnClickListener(view -> signIn());
    }

    private void signIn() {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        // Check if username and password match the condition
        if (username.equals("Than") && password.equals("Thantot")) {
            // If the condition is met, navigate to SearchDestinationActivity
            startActivity(new Intent(MainActivity.this, SearchDestinationActivity.class));
        } else {
            // If the condition fails, show a toast indicating invalid credentials
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
        }
    }
}
