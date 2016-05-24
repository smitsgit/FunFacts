package com.example.smitald.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FunActivity extends Activity {
    public static final String TAG = FunActivity.class.getSimpleName();
    private FactBook myBook = new FactBook();
    private ColorBook myCol = new ColorBook();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun);

        // Declare view variables
        final TextView funLable = (TextView) findViewById(R.id.FunTextView);
        final Button   show_me = (Button) findViewById(R.id.FunButton);
        final RelativeLayout rel = (RelativeLayout) findViewById(R.id.relId);
        View.OnClickListener listner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                funLable.setText(myBook.getFact());
                rel.setBackgroundColor((myCol.getCol()));
                show_me.setTextColor((myCol.getCol()));
            }
        };
        show_me.setOnClickListener(listner);
        String message = "My Activity is created";
        Toast myToast = Toast.makeText(this,message,10);
        myToast.show();
        Log.d(TAG, message);
    }
}
