package info.nickmilton.dragonquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class GameScreen extends AppCompatActivity {

    MediaPlayer buttonPressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        buttonPressed = MediaPlayer.create(this, R.raw.coin);
    }
    public void goChooseClassScreen(View view){
        buttonPressed.start();
        Intent classScreen = new Intent(this, chooseClass.class);
        startActivity(classScreen);
    }
}
