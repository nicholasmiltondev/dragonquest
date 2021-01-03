package info.nickmilton.dragonquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class chooseClass extends AppCompatActivity {

    MediaPlayer buttonPressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_class);

        buttonPressed = MediaPlayer.create(this, R.raw.coin);
    }
    public void goAdventureScreen(View view){
        buttonPressed.start();
        Intent adventureScreen = new Intent(this, adventure.class);
        startActivity(adventureScreen);
    }
}
