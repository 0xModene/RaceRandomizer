/**ExpansionActivity
 * @author BlackBox
 * This handles the expansion sets for determining which
 * races to use.
 * 
 * @version 1.1.0
 */

package com.blackbox.racegen;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

public class ExpansionActivity extends Activity implements OnClickListener {
	int playercount;
	boolean large = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expansion);
        
        Bundle bundle = this.getIntent().getExtras();
		playercount = bundle.getInt("playercount");

        View none = findViewById(R.id.none);
        none.setOnClickListener(this);
        View first = findViewById(R.id.first);
        first.setOnClickListener(this);
        View second = findViewById(R.id.second);
        second.setOnClickListener(this);
        View both = findViewById(R.id.both);
        both.setOnClickListener(this);
		
    }
    
    public void onClick(View v) {
		Intent intent = new Intent();
		
		switch(v.getId()) {
		case R.id.none:
			large = false;
			intent.setClass(getApplicationContext(), ShowRacesActivity.class);//change for display activity
			intent.putExtra("playercount", playercount);
			intent.putExtra("races", getRaces(0));
			intent.putExtra("large", large);
			break;
		case R.id.first:
			large = false;
			intent.setClass(getApplicationContext(), ShowRacesActivity.class);//change for display activity
			intent.putExtra("playercount", playercount);
			intent.putExtra("races", getRaces(1));
			intent.putExtra("large", large);
			break;
		case R.id.second:
			large = false;
			intent.setClass(getApplicationContext(), ShowRacesActivity.class);//change for display activity
			intent.putExtra("playercount", playercount);
			intent.putExtra("races", getRaces(2));
			intent.putExtra("large", large);
			break;
		case R.id.both:
			large = true;
			intent.setClass(getApplicationContext(), ShowRacesActivity.class);//change for display activity
			intent.putExtra("playercount", playercount);
			intent.putExtra("races", getRaces(3));
			intent.putExtra("large", large);
			break;
		}
		startActivity(intent);
		
    }
    
    public String[] getRaces(int j) {
	      int size = 10;
	      if (j == 1)
	         size = 14;
	      if (j == 2)
	         size = 13;
	      if (j == 3 || j == 4)
	         size = 17;
	    
	      String[] races = new String[size];
	      
	      if (j == 0) //base set
	      {
	         races[0] = "The Mentak Coalition";
	         races[1] = "The Emirates of Hacan";
	         races[2] = "The Barony of Letnev";
	         races[3] = "The L1Z1X Mindnet";
	         races[4] = "The Universities of Jol-Nar";
	         races[5] = "The Sardakk N'orr";
	         races[6] = "The Xxcha Kingdom";
	         races[7] = "The Naalu Collective";
	         races[8] = "The Yssaril Tribes";
	         races[9] = "The Federation of Sol";
	      }
	         
	      if (j == 1) //with expansion 1
	      {      
	         races[0] = "The Mentak Coalition";
	         races[1] = "The Emirates of Hacan";
	         races[2] = "The Barony of Letnev";
	         races[3] = "The L1Z1X Mindnet";
	         races[4] = "The Universities of Jol-Nar";
	         races[5] = "The Sardakk N'orr";
	         races[6] = "The Xxcha Kingdom";
	         races[7] = "The Naalu Collective";
	         races[8] = "The Yssaril Tribes";
	         races[9] = "The Federation of Sol";
	         races[10] = "The Embers of Muuat";
	         races[11] = "The Clan of Saar";
	         races[12] = "The Winnu";
	         races[13] = "The Yin Brotherhood";
	      }
	               
	      if (j == 2) //with expansion 2
	      {
	         races[0] = "The Mentak Coalition";
	         races[1] = "The Emirates of Hacan";
	         races[2] = "The Barony of Letnev";
	         races[3] = "The L1Z1X Mindnet";
	         races[4] = "The Universities of Jol-Nar";
	         races[5] = "The Sardakk N'orr";
	         races[6] = "The Xxcha Kingdom";
	         races[7] = "The Naalu Collective";
	         races[8] = "The Yssaril Tribes";
	         races[9] = "The Federation of Sol";
	         races[10] = "The Ghosts of Creuss";
	         races[11] = "The Arborec";
	         races[12] = "The Nekro Virus";
	      }
	               
	      if (j == 3) //with both expansions
	      {
	         races[0] = "The Mentak Coalition";
	         races[1] = "The Emirates of Hacan";
	         races[2] = "The Barony of Letnev";
	         races[3] = "The L1Z1X Mindnet";
	         races[4] = "The Universities of Jol-Nar";
	         races[5] = "The Sardakk N'orr";
	         races[6] = "The Xxcha Kingdom";
	         races[7] = "The Naalu Collective";
	         races[8] = "The Yssaril Tribes";
	         races[9] = "The Federation of Sol";
	         races[10] = "The Embers of Muuat";
	         races[11] = "The Clan of Saar";
	         races[12] = "The Winnu";
	         races[13] = "The Yin Brotherhood";
	         races[14] = "The Ghosts of Creuss";
	         races[15] = "The Arborec";
	         races[16] = "The Nekro Virus";
	      }
	      
	      if (j == 4) //with both expansions and nicknames
	      {
	         races[0] = "The Dirty Pirate Hookers";
	         races[1] = "The Econo-kitties";
	         races[2] = "The Environmentalists";
	         races[3] = "The Null Pointers";
	         races[4] = "The Face of Boe";
	         races[5] = "The Edgarbugs"; //the formic
	         races[6] = "The Diplomacy Turtles";
	         races[7] = "The Little Mermaids";
	         races[8] = "The Stoor Tribes";
	         races[9] = "The Humans";
	         races[10] = "The Imperials";
	         races[11] = "Team Jacob";
	         races[12] = "Winnu the Poo";
	         races[13] = "The Clones";
	         races[14] = "Those Wormhole Guys";
	         races[15] = "The Planeteers";
	         races[16] = "The Borg";
	      }
	      return races;
		}
    
}
