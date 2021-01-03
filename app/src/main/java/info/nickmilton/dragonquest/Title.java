package info.nickmilton.dragonquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Title extends AppCompatActivity {

    MediaPlayer buttonPressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        final MediaPlayer startSound = MediaPlayer.create(this, R.raw.victory);
        startSound.start();

        buttonPressed = MediaPlayer.create(this, R.raw.start);

//        Button clickStart = (Button) this.findViewById(R.id.button);

//        clickStart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                buttonPressed.start();
//            }
//        });
    }
    public void goChooseRaceScreen(View view){
        buttonPressed.start();
        Intent raceScreen = new Intent(this, GameScreen.class);
        startActivity(raceScreen);
    }
}
