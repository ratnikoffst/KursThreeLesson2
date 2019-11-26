package ru.ratnikoff.flagi;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final int ABHASIA = 0;
    private static final int BELARUS = 1;
    private static final int ISRAEL = 2;
    private static final int KAZAKHSTAN = 3;
    private static final int RUSSIA = 4;
    private static final int UKRAINE = 5;
    private String[] mArrayTemperature;
    private ImageView mImageFlag;
    private TextView mTextTemperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initResource();
    }

    private void initResource() {
        Spinner spinner = findViewById(R.id.spinner_country);
        spinner.setOnItemSelectedListener(this);
        mImageFlag = findViewById(R.id.imageFlag);
        mTextTemperature = findViewById(R.id.textTemperature);
        mArrayTemperature = getResources().getStringArray(R.array.temperature);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        mTextTemperature.setText(mArrayTemperature[position]);
        switch (position) {
            case ABHASIA:
                mImageFlag.setImageResource(R.drawable.abkhazia);
                break;
            case BELARUS:
                mImageFlag.setImageResource(R.drawable.belarus);
                break;
            case ISRAEL:
                mImageFlag.setImageResource(R.drawable.israel);
                break;
            case KAZAKHSTAN:
                mImageFlag.setImageResource(R.drawable.kazakhstan);
                break;
            case RUSSIA:
                mImageFlag.setImageResource(R.drawable.russia);
                break;
            case UKRAINE:
                mImageFlag.setImageResource(R.drawable.ukraine);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
