package edu.washington.benjamon.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class lifeCount extends ActionBarActivity {

    int p1number = 20;
    int p2number = 20;
    int p3number = 20;
    int p4number = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_count);
        final TextView lifeboxes[] = new TextView[4];

        lifeboxes[0] = (TextView)findViewById(R.id.p1lives);
        lifeboxes[1] = (TextView)findViewById(R.id.p2lives);
        lifeboxes[2] = (TextView)findViewById(R.id.p3lives);
        lifeboxes[3] = (TextView)findViewById(R.id.p4lives);
        Button button[] = new Button[16];
        for (int i = 0; i < 16; i++) {
            int id = getResources().getIdentifier("b"+(i+1), "id", getPackageName());
            button[i] = (Button)findViewById(id);
        }
        applyClick(button, lifeboxes);
    }

    //Process buttons
    public void applyClick(final Button button[], final TextView texty[]) {
        for (int i = 0; i < 16; i++) {
            switch(i) {
                case 0:case 1:case 2:case 3: {
                    button[i].setOnClickListener(new Button.OnClickListener() {
                        public void onClick(View v) {
                            int c = getChange(button[0].getText().toString());
                            int m = Integer.parseInt(texty[0].getText().toString())+c;
                            texty[0].setText("" + m);
                            if (m <= 0) {
                                Toast.makeText(getApplicationContext(), "Player 1 Loses!", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
                break;
                case 4:case 5:case 6:case 7: {
                    button[i].setOnClickListener(new Button.OnClickListener() {
                        public void onClick(View v) {
                            int c = getChange(button[0].getText().toString());
                            int m = Integer.parseInt(texty[1].getText().toString())+c;
                            texty[1].setText("" + m);
                            if (m <= 0) {
                                Toast.makeText(getApplicationContext(), "Player 2 Loses!", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
                break;
                case 8:case 9:case 10:case 11: {
                    button[i].setOnClickListener(new Button.OnClickListener() {
                        public void onClick(View v) {
                            int c = getChange(button[0].getText().toString());
                            int m = Integer.parseInt(texty[2].getText().toString())+c;
                            texty[2].setText("" + m);
                            if (m <= 0) {
                                Toast.makeText(getApplicationContext(), "Player 3 Loses!", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
                break;
                case 12:case 13:case 14:case 15: {
                    button[i].setOnClickListener(new Button.OnClickListener() {
                        public void onClick(View v) {
                            int c = getChange(button[0].getText().toString());
                            int m = Integer.parseInt(texty[3].getText().toString())+c;
                            texty[3].setText("" + m);
                            if (m <= 0) {
                                Toast.makeText(getApplicationContext(), "Player 4 Loses!", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
                break;
            }
        }
    }

    public int getChange(String s) {
        if (s.equals("-")) {
            return -1;
        } else if (s.equals("+")) {
            return 1;
        } else if (s.equals("-5")) {
            return -5;
        } else if (s.equals("+5")) {
            return 5;
        } else {
            return 2;
        }
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
