package com.rcg.sample.datetimesample;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.florent37.singledateandtimepicker.SingleDateAndTimePicker;
import com.github.florent37.singledateandtimepicker.dialog.SingleDateAndTimePickerDialog;

import java.util.Date;

public class MainActivity extends Activity {

	SingleDateAndTimePickerDialog.Builder singleBuilder;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

//		this works
//		SingleDateAndTimePicker singleDateAndTimePicker = (SingleDateAndTimePicker) findViewById(R.id.single_day_picker);
//		singleDateAndTimePicker.setMustBeOnFuture(true);
//		singleDateAndTimePicker
//			.setListener(new SingleDateAndTimePicker.Listener() {
//			@Override
//			public void onDateChanged(String displayed, Date date) {
//				display(date.toString());
//			}
//		});

		// this works but i can' change the date
//		new SingleDateAndTimePickerDialog.Builder(this)
//			.minutesStep(15)
//			.display();

		// this doesn't work
		new SingleDateAndTimePickerDialog.Builder(this)
			.bottomSheet()
			.curved()
			.display();
	}

	private void display(String toDisplay) {
		Toast.makeText(this, toDisplay, Toast.LENGTH_SHORT).show();
	}
}
