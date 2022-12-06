package com.unisannio.gdevanno.uiratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        final TextView tv = (TextView) findViewById(R.id.textView);
        final RatingBar bar = (RatingBar) findViewById(R.id.ratingbar);

        bar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            //Called when the user swipes the RatingBar
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tv.setText("Rating:" + v);

            }
        });
    }
}