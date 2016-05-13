package xyz.hirekevin.backpackerpro;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by user on 5/12/16.
 */


public class ItineraryActivity extends ListActivity {

    TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BackPackerPro", "loading List");
        setContentView(R.layout.activity_list);

        content = (TextView)findViewById(R.id.output);

        //listView = (ListView) findViewById(R.id.list);
        String[] waypoints = new String[] {
                "(A) Casa Mila",
                "(B) Parc Guell",
                "(C) Picasso Museum",
                "(D) Placa Reial",
                "(E) Santa Maria del Mar",
                "(F) Casa Batllo",
                "(G) La Boqueria Market",
                "(H) La Sagrada Familia"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, waypoints);

        // Assign adapter to List
        setListAdapter(adapter);
    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l, v, position, id);

        // ListView Clicked item index
        int itemPosition     = position;

        // ListView Clicked item value
        String  itemValue    = (String) l.getItemAtPosition(position);

        Log.d("Selected", itemPosition + "");
        content.setText("Selected Itinerary:\n" + itemValue);

    }
}