package com.example.antonellab.xsi0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.text.TextUtils;

public class StartGame extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "example.firstApp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

    }

    public void sendGamersName(View view) {
        //cod care va citi continutul casetei text si va incepe o alta Activitate

        //creere obiect de tip Intent pt a incepe o noua activitate (DisplayMessageActivity).
        // Intent = obiect care in timpul rularii face legatura intre doua componente separate (ex. activitati; intentia utiliz de a face ceva
        Intent intent = new Intent(this, Game.class);

        //extragere text din elementul EditText
        EditText editText = (EditText) findViewById(R.id.nume1);
        String message = editText.getText().toString();

        //apel putExtra() pt a transmite val din caseta text
        intent.putExtra(EXTRA_MESSAGE, message); //putExtra(numele_cheii, valoarea_cheii);

        //apelare metoda startActivity() pt a incepe activitatea specficata la creerea Intent-ului
        startActivity(intent);

    }

    public void startGameFunction(View view)
    {
        EditText jucator1 = (EditText) findViewById(R.id.nume1);
        EditText jucator2 = (EditText) findViewById(R.id.nume2);
        String jucator1Str = jucator1.getText().toString();
        String jucator2Str = jucator2.getText().toString();

        if(TextUtils.isEmpty(jucator1Str) &&  TextUtils.isEmpty(jucator2Str))
        {
            jucator1.setError("Necompletat!");
            jucator2.setError("Necompletat!");
            Toast.makeText(this, "Completeaza numele jucatorilor!", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(jucator2Str))
        {
            jucator2.setError("Necompletat!");
        }
        else if(TextUtils.isEmpty(jucator1Str))
        {
            jucator1.setError("Necompletat!");
        }
        else if(jucator1Str.equals(jucator2Str))
        {
            Toast.makeText(this, "Jucatorii nu pot avea acelasi nume!", Toast.LENGTH_LONG).show();
        }
        else
        {
            Intent intent = new Intent(this, Game.class);

            EditText editText1 = (EditText) findViewById(R.id.nume1);
            String primulJucStr = editText1.getText().toString();

            EditText editText2 = (EditText) findViewById(R.id.nume2);
            String aldoileaJucStr = editText2.getText().toString();

            intent.putExtra("jucator1", primulJucStr);
            intent.putExtra("jucator2", aldoileaJucStr);
            startActivity(intent);
            //finish();
            //android.os.Process.killProcess(android.os.Process.myPid());
        }
    }

}
