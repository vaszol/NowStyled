package com.example.vas.nowstyled;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;


public class NowStyled extends Activity
        implements View.OnClickListener  {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
        updateTime();
    }

    @Override
    public void onClick(View view) {
        updateTime();
    }

    private void updateTime() {
        btn.setText(new Date().toString());
    }

}
