package com.example.antonellab.xsi0;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends AppCompatActivity  implements OnColorChangedListener{
    Toolbar toolbar;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, restartButton;
    int turn_count = 0;
    int clicked;
    String firstG = "";
    String secondG = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
       // getSupportActionBar().hide();

        placeToolbar();

        //set gamers name
        Intent intent = getIntent();

        String jucator1String = intent.getStringExtra("jucator1");
        String jucator2String = intent.getStringExtra("jucator2");

        firstG = jucator1String;
        secondG = jucator2String;

        final TextView name1 = (TextView)findViewById(R.id.juc1);
        final TextView name2 = (TextView)findViewById(R.id.juc2);
        name1.setText(jucator1String.toUpperCase());
        name2.setText(jucator2String.toUpperCase());

        //backbutton on toolbar
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        restartButton = (Button) findViewById(R.id.buttonRestart);
        restartButton.setEnabled(false);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        name1.setTextColor(Color.parseColor("#FF4000"));
        name1.setTextSize(20);
        name2.setTextSize(20);

        clicked = 1;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {turn_count++;
                if (b1.getText().toString().equals("")) {
                    if (clicked == 1) {
                        clicked = 2;
                        b1.setText("X");
                        name1.setTextColor(Color.parseColor("#000000"));
                        name2.setTextColor(Color.parseColor("#FF4000"));
                    } else if (clicked == 2) {
                        clicked = 1;
                        b1.setText("0");
                        name1.setTextColor(Color.parseColor("#FF4000"));
                        name2.setTextColor(Color.parseColor("#000000"));
                    }
                }
                checkWinner();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {turn_count++;
                if (b2.getText().toString().equals("")) {
                    if (clicked == 1) {
                        clicked = 2;
                        b2.setText("X");
                        name1.setTextColor(Color.parseColor("#000000"));
                        name2.setTextColor(Color.parseColor("#FF4000"));
                    } else if (clicked == 2) {
                        clicked = 1;
                        b2.setText("0");
                        name1.setTextColor(Color.parseColor("#FF4000"));
                        name2.setTextColor(Color.parseColor("#000000"));
                    }
                }
                checkWinner();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {turn_count++;
                if (b3.getText().toString().equals("")) {
                    if (clicked == 1) {
                        clicked = 2;
                        b3.setText("X");
                        name1.setTextColor(Color.parseColor("#000000"));
                        name2.setTextColor(Color.parseColor("#FF4000"));
                    } else if (clicked == 2) {
                        clicked = 1;
                        b3.setText("0");
                        name1.setTextColor(Color.parseColor("#FF4000"));
                        name2.setTextColor(Color.parseColor("#000000"));
                    }
                }
                checkWinner();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {turn_count++;
                if (b4.getText().toString().equals("")) {
                    if (clicked == 1) {
                        clicked = 2;
                        b4.setText("X");
                        name1.setTextColor(Color.parseColor("#000000"));
                        name2.setTextColor(Color.parseColor("#FF4000"));
                    } else if (clicked == 2) {
                        clicked = 1;
                        b4.setText("0");
                        name1.setTextColor(Color.parseColor("#FF4000"));
                        name2.setTextColor(Color.parseColor("#000000"));
                    }
                }
                checkWinner();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {turn_count++;
                if (b5.getText().toString().equals("")) {
                    if (clicked == 1) {
                        clicked = 2;
                        b5.setText("X");
                        name1.setTextColor(Color.parseColor("#000000"));
                        name2.setTextColor(Color.parseColor("#FF4000"));
                    } else if (clicked == 2) {
                        clicked = 1;
                        b5.setText("0");
                        name1.setTextColor(Color.parseColor("#FF4000"));
                        name2.setTextColor(Color.parseColor("#000000"));
                    }
                }
                checkWinner();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {turn_count++;
                if (b6.getText().toString().equals("")) {
                    if (clicked == 1) {
                        clicked = 2;
                        b6.setText("X");
                        name1.setTextColor(Color.parseColor("#000000"));
                        name2.setTextColor(Color.parseColor("#FF4000"));
                    } else if (clicked == 2) {
                        clicked = 1;
                        b6.setText("0");
                        name1.setTextColor(Color.parseColor("#FF4000"));
                        name2.setTextColor(Color.parseColor("#000000"));
                    }
                }
                checkWinner();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {turn_count++;
                if (b7.getText().toString().equals("")) {
                    if (clicked == 1) {
                        clicked = 2;
                        b7.setText("X");
                        name1.setTextColor(Color.parseColor("#000000"));
                        name2.setTextColor(Color.parseColor("#FF4000"));
                    } else if (clicked == 2) {
                        clicked = 1;
                        b7.setText("0");
                        name1.setTextColor(Color.parseColor("#FF4000"));
                        name2.setTextColor(Color.parseColor("#000000"));
                    }
                }
                checkWinner();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {turn_count++;
                if (b8.getText().toString().equals("")) {
                    if (clicked == 1) {
                        clicked = 2;
                        b8.setText("X");
                        name1.setTextColor(Color.parseColor("#000000"));
                        name2.setTextColor(Color.parseColor("#FF4000"));
                    } else if (clicked == 2) {
                        clicked = 1;
                        b8.setText("0");
                        name1.setTextColor(Color.parseColor("#FF4000"));
                        name2.setTextColor(Color.parseColor("#000000"));
                    }
                }
                checkWinner();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {turn_count++;
                if (b9.getText().toString().equals("")) {
                    if (clicked == 1) {
                        clicked = 2;
                        b9.setText("X");
                        name1.setTextColor(Color.parseColor("#000000"));
                        name2.setTextColor(Color.parseColor("#FF4000"));
                    } else if (clicked == 2) {
                        clicked = 1;
                        b9.setText("0");
                        name1.setTextColor(Color.parseColor("#FF4000"));
                        name2.setTextColor(Color.parseColor("#000000"));
                    }
                }
                checkWinner();
            }
        });

    }

    public void placeToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(android.R.drawable.ic_media_previous);
    }

    public void openPicker(View view) {
        new ColorPickerRect(this, this, "", Color.BLACK, Color.WHITE).show();
    }

    @Override
    public void colorChanged(String key, int color) {
        this.findViewById(android.R.id.content)
                .setBackgroundColor(color);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home)
        {
            //intent your parent activity
            Intent intent = new Intent(getApplicationContext(),StartGame.class);

            startActivity(intent);
            finish();

            //Other way
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }

    public void checkWinner()
    {
        String one, two, three , four, five, six, seven, eight, nine;
        one = b1.getText().toString();
        two = b2.getText().toString();
        three = b3.getText().toString();
        four = b4.getText().toString();
        five = b5.getText().toString();
        six = b6.getText().toString();
        seven = b7.getText().toString();
        eight = b8.getText().toString();
        nine = b9.getText().toString();

        boolean gameOver = false;

        if(one.equals("X") && two.equals("X") && three.equals("X"))
        {
            Toast.makeText(Game.this, firstG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if(one.equals("X") && five.equals("X") && nine.equals("X"))
        {
            Toast.makeText(Game.this, firstG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if(one.equals("X") && four.equals("X") && seven.equals("X"))
        {
            Toast.makeText(Game.this, firstG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if(two.equals("X") && five.equals("X") && eight.equals("X"))
        {
            Toast.makeText(Game.this, firstG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if(three.equals("X") && six.equals("X") && nine.equals("X"))
        {
            Toast.makeText(Game.this, firstG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if(four.equals("X") && five.equals("X") && six.equals("X"))
        {
            Toast.makeText(Game.this, firstG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if(seven.equals("X") && eight.equals("X") && nine.equals("X"))
        {
            Toast.makeText(Game.this, firstG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if (seven.equals("X") && five.equals("X") && three.equals("X"))
        {
            Toast.makeText(Game.this, firstG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if(one.equals("0") && two.equals("0") && three.equals("0"))
        {
            Toast.makeText(Game.this, secondG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if(one.equals("0") && five.equals("0") && nine.equals("0"))
        {
            Toast.makeText(Game.this, secondG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if(one.equals("0") && four.equals("0") && seven.equals("0"))
        {
            Toast.makeText(Game.this, secondG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if(two.equals("0") && five.equals("0") && eight.equals("0"))
        {
            Toast.makeText(Game.this, secondG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if(three.equals("0") && six.equals("0") && nine.equals("0")) {
            Toast.makeText(Game.this, secondG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if(four.equals("0") && five.equals("0") && six.equals("0"))
        {
            Toast.makeText(Game.this, secondG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if(seven.equals("0") && eight.equals("0") && nine.equals("0")) {
            Toast.makeText(Game.this, secondG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }
        if (seven.equals("0") && five.equals("0") && three.equals("0"))
        {
            Toast.makeText(Game.this, secondG + " a castigat!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }


        if(turn_count == 9 && gameOver==false)
        {
            Toast.makeText(Game.this, "Paritate!", Toast.LENGTH_LONG).show();
            gameOver = true;
            restartButton.setEnabled(true);
        }



        if(gameOver)
        {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }

    public void newGame(View view)
    {
        //reincepe jocul
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        turn_count = 0;
    }

    public void exitGame(View view)
    {
        finish();
        android.os.Process.killProcess(android.os.Process.myPid());
    }


}
