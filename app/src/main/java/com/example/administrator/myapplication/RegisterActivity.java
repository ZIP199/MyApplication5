package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;

import com.example.administrator.myapplication.fragment.PictureInputCellFragment;
import com.example.administrator.myapplication.fragment.SimpleTextCellFragment;

public class RegisterActivity extends Activity {
    SimpleTextCellFragment fragmentInputCellAcount;
    SimpleTextCellFragment fragmentInputCellPassword;
    SimpleTextCellFragment fragmentInputCellPasswordRepeat;
    PictureInputCellFragment pictureInputCellFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        fragmentInputCellAcount= (SimpleTextCellFragment) getFragmentManager().findFragmentById(R.id.input_account);
        fragmentInputCellPassword= (SimpleTextCellFragment) getFragmentManager().findFragmentById(R.id.input_password);
        fragmentInputCellPasswordRepeat= (SimpleTextCellFragment) getFragmentManager().findFragmentById(R.id.input_twice);
        pictureInputCellFragment=(PictureInputCellFragment)getFragmentManager().findFragmentById(R.id.picture);
    }
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        fragmentInputCellAcount.setLabelText("用 户 名");
        fragmentInputCellAcount.setHintText("请输入用户名");
        fragmentInputCellPassword.setLabelText(" 密  码 ");
        fragmentInputCellPassword.setHintText("请输入密码");
        fragmentInputCellPasswordRepeat.setLabelText("重复密码");
        fragmentInputCellPasswordRepeat.setHintText("请重复输入密码");
    }

}
