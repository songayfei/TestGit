package com.weichuanwang.testgit;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //这里是版本第一

    }

    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            new BuildConfig();
            带我怀念那年活塞卡咖啡苦得很彻底彻底
				萨克斯上厕所
				房贷放开低空
        }
    };
}
