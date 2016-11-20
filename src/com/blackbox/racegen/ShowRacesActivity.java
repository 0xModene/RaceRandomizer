/**ShowRacesActivity
 * @author BlackBox
 * This class displays all of the races that
 * have been randomly chosen.
 * 
 * @version 1.2.0
 */

package com.blackbox.racegen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class ShowRacesActivity extends Activity implements OnClickListener {
	int playercount;
	boolean large = false;
	String[] races, postshuffle = new String[8];
	List<String> players;
	TextView player1, player2, player3, player4, player5, player6, player7,
			player8, regular, special, empty, remove;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show2);

		Bundle bundle = this.getIntent().getExtras();
		playercount = bundle.getInt("playercount");
		races = bundle.getStringArray("races");
		large = bundle.getBoolean("large");

		player1 = (TextView) findViewById(R.id.player1);
		player2 = (TextView) findViewById(R.id.player2);
		player3 = (TextView) findViewById(R.id.player3);
		player4 = (TextView) findViewById(R.id.player4);
		player5 = (TextView) findViewById(R.id.player5);
		player6 = (TextView) findViewById(R.id.player6);
		player7 = (TextView) findViewById(R.id.player7);
		player8 = (TextView) findViewById(R.id.player8);
		regular = (TextView) findViewById(R.id.regular);
		special = (TextView) findViewById(R.id.special);
		empty = (TextView) findViewById(R.id.empty);
		remove = (TextView) findViewById(R.id.remove);
		View refresh = findViewById(R.id.refresh);
		refresh.setOnClickListener(this);

		displayRaces();
		showTiles();
	}

	@Override
	public void onClick(View refresh) {
		displayRaces();
	}

	public List<String> shuffle(String[] races) {
		List<String> list = Arrays.asList(races);
		Collections.shuffle(list);
		return list;
	}

	public void displayRaces() {
		players = shuffle(races);

		int j = 1;
		for (int i = 0; i < 8; i++) {
			postshuffle[i] = j + ". " + players.get(i);
			j++;
		}

		switch (playercount) {
		case 8:
			player8.setText(postshuffle[7]);
		case 7:
			player7.setText(postshuffle[6]);
		case 6:
			player6.setText(postshuffle[5]);
		case 5:
			player5.setText(postshuffle[4]);
		case 4:
			player4.setText(postshuffle[3]);
		case 3:
			player3.setText(postshuffle[2]);
			player2.setText(postshuffle[1]);
			player1.setText(postshuffle[0]);

		}
	}

	public void showTiles() {
		if (playercount == 3) {
			regular.setText(R.string.threeregular);
			special.setText(R.string.threespecial);
			empty.setText(R.string.threeempty);
			remove.setText(R.string.threeremove);
		} else if (playercount == 4) {
			regular.setText(R.string.fourregular);
			special.setText(R.string.fourspecial);
			empty.setText(R.string.fourempty);
			remove.setText(R.string.fourremove);
		} else if (playercount == 5) {
			if (!large) {
				regular.setText(R.string.fiveregular);
				special.setText(R.string.fivespecial);
				empty.setText(R.string.fiveempty);
				remove.setText(R.string.fiveremove);
			} else {
				regular.setText(R.string.fiveregularlarge);
				special.setText(R.string.fivespeciallarge);
				empty.setText(R.string.fiveemptylarge);
				remove.setText(R.string.fiveremovelarge);
			}
		} else if (playercount == 6) {
			if (!large) {
				regular.setText(R.string.sixregular);
				special.setText(R.string.sixspecial);
				empty.setText(R.string.sixempty);
				remove.setText(R.string.sixremove);
			} else {
				regular.setText(R.string.sixregularlarge);
				special.setText(R.string.sixspeciallarge);
				empty.setText(R.string.sixemptylarge);
				remove.setText(R.string.sixremovelarge);
			}
		} else if (playercount == 7) {
			regular.setText(R.string.sevenregular);
			special.setText(R.string.sevenspecial);
			empty.setText(R.string.sevenempty);
			remove.setText(R.string.sevenremove);
		} else if (playercount == 8) {
			regular.setText(R.string.eightregular);
			special.setText(R.string.eightspecial);
			empty.setText(R.string.eightempty);
			remove.setText(R.string.eightremove);
		}
	}

}
