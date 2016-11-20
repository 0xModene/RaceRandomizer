/**PlayerCountActivity
 * @author BlackBox
 * This Determines the amount of player that
 * are to be playing the game.
 * 
 * @version 1.0.0
 */

package com.blackbox.racegen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;

public class PlayerCountActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.playercount);
		View button3 = findViewById(R.id.button3);
		button3.setOnClickListener(this);
		button3.setOnLongClickListener(new OnLongClickListener() {
			public boolean onLongClick(View arg0) {
				Toast.makeText(getApplicationContext(), "333",
						Toast.LENGTH_SHORT).show();
				return true;
			}
		});
		View button4 = findViewById(R.id.button4);
		button4.setOnClickListener(this);
		button4.setOnLongClickListener(new OnLongClickListener() {
			public boolean onLongClick(View arg0) {
				Toast.makeText(getApplicationContext(), "What was that 4?",
						Toast.LENGTH_SHORT).show();
				return true;
			}
		});
		View button5 = findViewById(R.id.button5);
		button5.setOnClickListener(this);
		View button6 = findViewById(R.id.button6);
		button6.setOnClickListener(this);
		View button7 = findViewById(R.id.button7);
		button7.setOnClickListener(this);
		View button8 = findViewById(R.id.button8);
		button8.setOnClickListener(this);
		button8.setOnLongClickListener(new OnLongClickListener() {
			public boolean onLongClick(View arg0) {
				Toast.makeText(getApplicationContext(),
						"You're in for a long game...", Toast.LENGTH_SHORT)
						.show();
				return true;
			}
		});
	}

	public void onClick(View v) {
		Intent intent = new Intent();

		switch (v.getId()) {

		case R.id.button3:
			intent.setClass(getApplicationContext(), ExpansionActivity.class);
			intent.putExtra("playercount", 3);
			break;
		case R.id.button4:
			intent.setClass(getApplicationContext(), ExpansionActivity.class);
			intent.putExtra("playercount", 4);
			break;
		case R.id.button5:
			intent.setClass(getApplicationContext(), ExpansionActivity.class);
			intent.putExtra("playercount", 5);
			break;
		case R.id.button6:
			intent.setClass(getApplicationContext(), ExpansionActivity.class);
			intent.putExtra("playercount", 6);
			break;
		case R.id.button7:
			intent.setClass(getApplicationContext(), ExpansionActivity.class);
			intent.putExtra("playercount", 7);
			break;
		case R.id.button8:
			intent.setClass(getApplicationContext(), ExpansionActivity.class);
			intent.putExtra("playercount", 8);
			break;
		}

		startActivity(intent);
	}

}
