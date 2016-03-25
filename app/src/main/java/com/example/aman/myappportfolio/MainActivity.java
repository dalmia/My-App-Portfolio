package com.example.aman.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button spotifyStreamer, scoresApp, libraryApp,
            buildItBigger, reader, capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiate();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void initiate(){
        spotifyStreamer = (Button) findViewById(R.id.spotify_streamer);
        scoresApp = (Button) findViewById(R.id.scores_app);
        libraryApp = (Button) findViewById(R.id.library_app);
        buildItBigger = (Button) findViewById(R.id.build_it_bigger);
        reader = (Button) findViewById(R.id.reader);
        capstone = (Button) findViewById(R.id.capstone);
        spotifyStreamer.setOnClickListener(this);
        scoresApp.setOnClickListener(this);
        libraryApp.setOnClickListener(this);
        buildItBigger.setOnClickListener(this);
        reader.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.spotify_streamer:
                showToast(getString(R.string.spotify_streamer));
                break;
            case R.id.scores_app:
                showToast(getString(R.string.scores));
                break;
            case R.id.library_app:
                showToast(getString(R.string.library));
                break;
            case R.id.build_it_bigger:
                showToast(getString(R.string.build_it_bigger));
                break;
            case R.id.reader:
                showToast(getString(R.string.reader));
                break;
            case R.id.capstone:
                showToast(getString(R.string.capstone_title));
                break;

        }
    }

    public void showToast(String message){
        Toast.makeText(MainActivity.this, getString(R.string.default_click_message) + " " + message + " App", Toast.LENGTH_SHORT).show();
    }
}
