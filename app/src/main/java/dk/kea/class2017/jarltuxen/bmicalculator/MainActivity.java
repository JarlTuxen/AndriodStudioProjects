package dk.kea.class2017.jarltuxen.bmicalculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText myEditTextWeight = (EditText) findViewById(R.id.editTextWeight);
        EditText myEditTextHeight = (EditText) findViewById(R.id.editTextHeight);
        myEditTextHeight.setBackgroundColor(Color.WHITE);
        myEditTextWeight.setBackgroundColor(Color.WHITE);
    }

    public void OnClickbtnCalculateBMI(View v)
    {
        EditText myEditTextWeight = (EditText) findViewById(R.id.editTextWeight);
        EditText myEditTextHeight = (EditText) findViewById(R.id.editTextHeight);
        TextView myTextViewBMI = (TextView) findViewById(R.id.textViewBMI);
        Double weight = Double.parseDouble(myEditTextWeight.getText().toString());
        Double height = Double.parseDouble(myEditTextHeight.getText().toString());
        Double bmi = weight / (height * height);
        myTextViewBMI.setText(Double.toString(bmi));
        //myTextViewBMI.setText(String.format(Locale.ENGLISH Double.toString(bmi));
    }
}
