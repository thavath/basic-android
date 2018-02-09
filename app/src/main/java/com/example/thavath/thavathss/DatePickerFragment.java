package com.example.thavath.thavathss;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

import static android.app.TimePickerDialog.*;

/**
 * Created by user on 1/31/2018.
 */

public class DatePickerFragment extends DialogFragment implements OnTimeSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int mn = c.get(Calendar.MINUTE);

        return new DatePickerDialog(getActivity(), (DatePickerDialog.OnDateSetListener) this,hour,mn, DateFormat.AM_PM_FIELD);
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {
        Toast.makeText(getActivity(), "" + i +":"+ i1 +"",Toast.LENGTH_SHORT).show();
    }
}
