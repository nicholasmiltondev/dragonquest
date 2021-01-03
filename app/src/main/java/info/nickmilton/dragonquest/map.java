package info.nickmilton.dragonquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class map extends AppCompatActivity {

    MediaPlayer buttonPressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        buttonPressed = MediaPlayer.create(this, R.raw.coin);
    }
    public void goBackToAdventureScreen(View view){
        buttonPressed.start();
        Intent adventureScreen = new Intent(this, adventure.class);
        startActivity(adventureScreen);
    }
}
