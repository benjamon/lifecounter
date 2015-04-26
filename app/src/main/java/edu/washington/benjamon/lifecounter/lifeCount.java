package edu.washington.benjamon.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class lifeCount extends ActionBarActivity {

    protected int thizint = 10;
      /*protected TextView p1livesbox = (TextView)findViewById(R.id.p1lives);
      protected TextView p2livesbox = (TextView)findViewById(R.id.p2lives);
      protected TextView p3livesbox = (TextView)findViewById(R.id.p3lives);
      protected TextView p4livesbox = (TextView)findViewById(R.id.p4lives);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_count);
        TextView lifeboxes[] = new TextView[4];

        lifeboxes[0] = (TextView)findViewById(R.id.p1lives);
        lifeboxes[1] = (TextView)findViewById(R.id.p2lives);
        lifeboxes[2] = (TextView)findViewById(R.id.p3lives);
        lifeboxes[3] = (TextView)findViewById(R.id.p4lives);
        lifeboxes[3].setText(" " + thizint);
//        final Button button[] = new Button[16];
//
//        for (int i = 1; i < 13; i++) {
//            int id = getResources().getIdentifier("b"+i, "id", getPackageName());
//            button[i] = (Button)findViewById(id);
//        }
//        applyClick(button);
    }

    //Process buttons
    public void applyClick(Button[] button) {
       /* for (int i = 1; i < 13; i++) {
            button[i].setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {
                            p1livesbox.setText(" lives");
                        }
                    }
            );*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_life_count, menu);
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
