package com.example.coupang.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;


public class MainActivity extends Activity {

    private LinearLayout layout;
    private Button linear1;
    private Button linear2;
    private Button frame;
    private Button relative;

    private Click onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (LinearLayout) findViewById(R.id.sublayout);
        linear1 = (Button) findViewById(R.id.linearlayout1);
        linear2 = (Button) findViewById(R.id.linearlayout2);
        frame = (Button) findViewById(R.id.framelayout);
        relative = (Button) findViewById(R.id.relativelayout);

        onClickListener = new Click(this);
        linear1.setOnClickListener(onClickListener);
        linear2.setOnClickListener(onClickListener);
        frame.setOnClickListener(onClickListener);
        relative.setOnClickListener(onClickListener);

    }

    class Click implements View.OnClickListener {

        private Context context;

        public Click(Context context) {
            this.context = context;
        }

        @Override
        public void onClick(View v) {

            layout.removeAllViews();
            LayoutInflater inflater = LayoutInflater.from(context);
            View view;
            int id = v.getId();
            switch (id) {
                case R.id.linearlayout1:
                    view = inflater.inflate(R.layout.linearlayout1, null);
                    layout.addView(view);
                    layout.invalidate();
                    break;
                case R.id.linearlayout2:
                    view = inflater.inflate(R.layout.linearlayout2, null);
                    layout.addView(view);
                    layout.invalidate();
                    break;
                case R.id.framelayout:
                    view = inflater.inflate(R.layout.framelayout, null);
                    layout.addView(view);
                    layout.invalidate();
                    break;
                case R.id.relativelayout:
                    view = inflater.inflate(R.layout.relativelayout, null);
                    layout.addView(view);
                    layout.invalidate();
                    break;

            }

        }

    }

}
