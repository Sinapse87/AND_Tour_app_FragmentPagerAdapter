package in.thepolymath.simplymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Find the Radio button
        RelativeLayout radio = (RelativeLayout) findViewById(R.id.radio);

        // Set a click listener on that View
        radio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(NowPlayingActivity.this, RadioActivity.class);
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
                Intent exploreIntent = new Intent(NowPlayingActivity.this, ExploreActivity.class);
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
                Intent playlistsIntent = new Intent(NowPlayingActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
                finish();
            }
        });
    }
}
