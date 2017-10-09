package edu.upc.eseiaat.pma.exemples.web;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class WebActivity extends AppCompatActivity {
    private EditText editTextURL;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        editTextURL = (EditText) findViewById(R.id.editTextURL);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
    }

}
