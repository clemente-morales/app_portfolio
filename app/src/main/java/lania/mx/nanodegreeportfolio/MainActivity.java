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
     * I adds a click for a button to display the content it will open.
     * @param buttonId id of the button to add the event.
     * @param buttonTextId Text id of the title.
     */
    private void addClickButton(final int buttonId, final int buttonTextId) {
        Button button = (Button) findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String messageFormat = getString(R.string.portfolio_button_message_format);
                String buttonMessage = String.format(messageFormat, getString(buttonTextId));

                Toast.makeText(MainActivity.this, buttonMessage, Toast.LENGTH_SHORT).show();
            }
        });
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
}
