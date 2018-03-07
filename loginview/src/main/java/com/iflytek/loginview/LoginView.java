package com.iflytek.loginview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by phoenix on 2018/3/6.
 */

public class LoginView extends LinearLayout {
    private static final String TAG = "LoginView";

    private Context mContext;
    private EditText loginName;
    private EditText loginPwd;
    private Button loginBtn;

    public LoginView(Context context) {
        this(context, null);
    }

    public LoginView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoginView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        Log.d(TAG, "init: ");
        this.mContext = context;
        View view = LayoutInflater.from(context).inflate(R.layout.login_view, this, true);
        loginName = view.findViewById(R.id.name_et);
        loginPwd = view.findViewById(R.id.pwd_et);
        loginBtn = view.findViewById(R.id.login_btn);
        loginBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                loginFun(loginName.getText().toString().trim(), loginPwd.getText().toString().trim());
            }
        });
    }

    /**
     * 登录函数
      * @param name
     * @param pwd
     */
    private void loginFun(String name, String pwd) {

        Toast.makeText(mContext, "login", Toast.LENGTH_LONG).show();
    }
}
