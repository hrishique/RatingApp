package com.hrishique.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    RatingBar ratingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingbar=findViewById(R.id.ratingbar);
        submit=findViewById(R.id.submit);
        ratingbar.setRating(2.5f);
        ratingbar.setNumStars(5);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rate=ratingbar.getRating();
                Toast.makeText(getApplicationContext(),"rating :"+String.valueOf(rate),Toast.LENGTH_SHORT ).show();

            }
        });
        ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                Toast.makeText(getApplicationContext(),String.valueOf(rating),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
