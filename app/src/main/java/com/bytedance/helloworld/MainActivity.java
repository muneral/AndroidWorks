package com.bytedance.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "MainActivity");
    }

    int size=30;
    public void bigger(View v){     // 按钮对应的 onclick 响应
        TextView txv;
        txv= (TextView) findViewById(R.id.txv);  // 根据ID找到对应的text对象
        txv.setTextSize(++size);       // 修改对象的字符大小-size
        Log.d("button","放大");
    }

    public void display(View v){     // 另外一个按钮对应的 onclick 响应
        EditText name= (EditText) findViewById(R.id.name);  //还是根据ID找到对象，并进行接下来的操作
        TextView text2= (TextView) findViewById(R.id.txv);
        text2.setText(name.getText().toString());   // 设置字符
        Log.w("confirm","修改");
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Switch mSwitch = (Switch) findViewById(R.id.switch1);
        TextView mText = (TextView) findViewById(R.id.kg);
        if (isChecked){
            mText.setText("开启");
        }else {
            mText.setText("关闭");
        }

        Log.i("switch1","开关");
    }

}
