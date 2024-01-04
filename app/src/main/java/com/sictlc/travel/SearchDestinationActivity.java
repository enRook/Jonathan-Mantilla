package com.sictlc.travel;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class SearchDestinationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_destination);

        ImageView fbImageView = findViewById(R.id.fb);
        ImageView gmailImageView = findViewById(R.id.gmail);
        ImageView twitterImageView = findViewById(R.id.twitter);

        Button searchButton = findViewById(R.id.search);

        // Set click listeners for the ImageViews
        fbImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite("https://www.facebook.com");
            }
        });

        gmailImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite("https://mail.google.com");
            }
        });

        twitterImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite("https://twitter.com");
            }
        });

        // Set click listener for the search button to navigate to LogoutActivity
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SearchDestinationActivity.this, LogoutActivity.class));
            }
        });
    }

    // Method to open a website in a browser
    private void openWebsite(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
