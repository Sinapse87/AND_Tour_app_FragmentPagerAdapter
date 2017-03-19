package in.thepolymath.simplymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        // Find the Now Playing button
        RelativeLayout nowPlaying = (RelativeLayout) findViewById(R.id.nowPlaying);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(PlaylistsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
                finish();
            }
        });

        // Find the Radio button
        RelativeLayout radio = (RelativeLayout) findViewById(R.id.radio);

        // Set a click listener on that View
        radio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(PlaylistsActivity.this, RadioActivity.class);
                startActivity(radioIntent);
                finish();
            }
        });

        // Find the Explore button
        RelativeLayout explore = (RelativeLayout) findViewById(R.id.explore);

        // Set a click listener on that View
        explore.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent exploreIntent = new Intent(PlaylistsActivity.this, ExploreActivity.class);
                startActivity(exploreIntent);
                finish();
            }
        });
    }
}
