package in.thepolymath.simplymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        // Find the Now Playing button
        RelativeLayout nowPlaying = (RelativeLayout) findViewById(R.id.nowPlaying);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(RadioActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
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
                Intent exploreIntent = new Intent(RadioActivity.this, ExploreActivity.class);
                startActivity(exploreIntent);
                finish();
            }
        });

        // Find the Playlists button
        RelativeLayout playlists = (RelativeLayout) findViewById(R.id.playlist);

        // Set a click listener on that View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(RadioActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
                finish();
            }
        });
    }
}