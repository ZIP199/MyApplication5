package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.administrator.myapplication.fragment.SimpleTextCellFragment;

public class LoginActivity extends Activity {
	SimpleTextCellFragment fragmentInputCellAcount;
	SimpleTextCellFragment fragmentInputCellPassword;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		fragmentInputCellAcount= (SimpleTextCellFragment) getFragmentManager().findFragmentById(R.id.input_account);
		fragmentInputCellPassword= (SimpleTextCellFragment) getFragmentManager().findFragmentById(R.id.input_password);

		Button register = (Button) findViewById(R.id.btn_register);

		register.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
goRegister();
			}
		});

	}

	void goRegister() {

		Intent intent = new Intent(this, RegisterActivity.class);
		startActivity(intent);
		finish();
	}

	@Override
	protected void onResume() {
		super.onResume();
		fragmentInputCellAcount.setLabelText("用户名");
		fragmentInputCellAcount.setHintText("请输入用户名");
		fragmentInputCellPassword.setLabelText("密  码");
		fragmentInputCellPassword.setHintText("请输入密码");
	}
}
