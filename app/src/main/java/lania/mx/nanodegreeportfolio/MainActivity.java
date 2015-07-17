package lania.mx.nanodegreeportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControlEvents();
    }

    /**
     * Allows to assign the events for the controllers of the layout activity.
     */
    private void addControlEvents() {
        addClickButton(R.id.spotifyApp, R.string.portfolio_spotify);
        addClickButton(R.id.scoresApp, R.string.portfolio_scores);
        addClickButton(R.id.libraryApp, R.string.portfolio_library);
        addClickButton(R.id.builtItBiggerApp, R.string.portfolio_build_it_bigger);
        addClickButton(R.id.xyzReaderApp, R.string.portfolio_xyz_reader);
        addClickButton(R.id.capstoneApp, R.string.portfolio_capstone);
    }

    /**
     * Toast to show the message of the activity to open.
     */
    private Toast toast;

    /**
     * I adds a click for a button to display the content it will open.
     * @param buttonId id of the button to add the event.
     * @param buttonTextId Text id of the title.
     */
    private void addClickButton(final int buttonId, final int buttonTextId) {
        Button button = (Button) findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toast!=null) {
                    toast.cancel();
                }

                String messageFormat = getString(R.string.portfolio_button_message_format);
                String buttonMessage = String.format(messageFormat, getString(buttonTextId));

                toast = Toast.makeText(MainActivity.this, buttonMessage, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
