package com.example.thavath.thavathss;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

//    private Button btnOk;
//    private EditText text1;

//        private Button DatePicker;
//        private Button TimePicker;
        private ImageView vView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vView = (ImageView) findViewById(R.id.v_image);


//        DatePicker = (Button) findViewById(R.id.btn_date_picker);
//        TimePicker = (Button) findViewById(R.id.btn_time_picker);
//
//        DatePicker.setOnClickListener(this);
//        TimePicker.setOnClickListener(this);
    }
    public void onChanged(View view) {
        vView.setImageResource(R.drawable.ic_menu_camera);
    }
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.btn_time_picker:
//                DialogFragment timePickerFragment = new DatePickerFragment();
//                timePickerFragment.show(getFragmentManager(), "Time Picker"); break;
//            case R.id.btn_date_picker:
//                break;
//        }
//    }
//  text1 = (EditText) findViewById(R.id.textInput);
//        btnOk = (Button) findViewById(R.id.btnS);
//
//        btnOk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String s= text1.getText().toString();
//                Toast.makeText(MainActivity.this, s , Toast.LENGTH_SHORT).show();
//            }
//        });
//        toggle = (ToggleButton) findViewById(R.id.toggle_button);
//        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isCheck) {
//                if(isCheck){
//                    Toast.makeText(MainActivity.this, "start on", Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(MainActivity.this, "start off", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

    @Override
    public void onStart()
    {
        super.onStart();
        Log.d("In the onStart() event", "is started");
    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.d("In the onResume() event", "is started");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.d("In the onPause() event", "is started");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.d("In the onStop() event", "is started");
    }
    @Override
    public void onRestart()
    {
        super.onRestart();
        Log.d("The onRestart() event", "is started");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d("The onDestroy() event", "is started");
    }



//    public void onUpload(View view) {
//        boolean isChecked = ((RadioButton) view).isChecked();
//        switch (view.getId()){
//            case R.id.rd_male:
//                if(isChecked)
//                Toast.makeText(this,"Is Male", Toast.LENGTH_SHORT).show(); break;
//            case R.id.rd_female:
//                if(isChecked)
//                Toast.makeText(this,"Is Female", Toast.LENGTH_SHORT).show(); break;
//            case R.id.rd_other:
//                if(isChecked)
//                Toast.makeText(this,"Is Other", Toast.LENGTH_SHORT).show(); break;
//        }
//    }

//    public void onEventHandler(View view) {
//        boolean inChecked = ((CheckBox)view).isChecked();
//        switch (view.getId()){
//            case R.id.c_male :
//                if(inChecked){
//                    Toast.makeText(this,"Male", Toast.LENGTH_SHORT).show();
//                }
//            case R.id.c_female :
//                if(inChecked){
//                    Toast.makeText(this,"Female", Toast.LENGTH_SHORT).show();
//                }
//            case R.id.c_other :
//                if(inChecked){
//                    Toast.makeText(this,"Other", Toast.LENGTH_SHORT).show();
//                }
//        }
//    }
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Button One", Toast.LENGTH_SHORT).show();
//            }
//        });
//    public void onButton1(View view) {
//        Toast.makeText(this, "Button One", Toast.LENGTH_SHORT).show();
//    }
//    public void onButton2(View view) {
//        Toast.makeText(this, "Button Image", Toast.LENGTH_SHORT).show();
//    }
//    public void onButton3(View view) {
//        Toast.makeText(this, "Button Second", Toast.LENGTH_SHORT).show();
//    }
}


