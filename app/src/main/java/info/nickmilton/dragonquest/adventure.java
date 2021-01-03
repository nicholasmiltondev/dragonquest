package info.nickmilton.dragonquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class adventure extends AppCompatActivity {

    MediaPlayer buttonPressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);

        buttonPressed = MediaPlayer.create(this, R.raw.coin);
    }
    public void goMapScreen(View view){
        buttonPressed.start();
        Intent mapScreen = new Intent(this, map.class);
        startActivity(mapScreen);
    }
    public void goTitleScreen(View view){
        buttonPressed.start();
        Intent titleScreen = new Intent(this, Title.class);
        startActivity(titleScreen);
    }
}
