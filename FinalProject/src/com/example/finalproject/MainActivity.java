package com.example.finalproject;

import org.json.JSONArray;
import org.json.JSONObject;

import com.temboo.Library.YouTube.Search.ListSearchResults;
import com.temboo.Library.YouTube.Search.ListSearchResults.ListSearchResultsInputSet;
import com.temboo.Library.YouTube.Search.ListSearchResults.ListSearchResultsResultSet;
import com.temboo.core.TembooSession;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	static String[] title, linkId;
	static String searchVar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	EditText searchonline = (EditText)findViewById(R.id.search);
	public void Tembyoutube(){
		
    	// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
    	// TembooSession session = new TembooSession("katpark2993", "myFirstApp", "6c523e8fc6b7498eb1578d2450991b20");
		try{
    
	    	TembooSession session = new TembooSession("katpark2993", "myFirstApp", "6c523e8fc6b7498eb1578d2450991b20");
	
	    	ListSearchResults listSearchResultsChoreo = new ListSearchResults(session);
	
	    	// Get an InputSet object for the choreo
	    	ListSearchResultsInputSet listSearchResultsInputs = listSearchResultsChoreo.newInputSet();
	
	    	title = new String[5];
	    	linkId = new String[5];
	    	
	    	// We Need image variables
	    	
	    	//image = new Image[5];
	    	//imagez = new ImageIcon[5];
	    	
	    	// Set inputs
	    	// We need something to parse the url
	    	searchVar = searchonline.getText().toString();
	    	listSearchResultsInputs.set_Query(searchVar);
	
	    	// Execute Choreo
	    	ListSearchResultsResultSet listSearchResultsResults = listSearchResultsChoreo.execute(listSearchResultsInputs);
	    	
	    	
	    	
	    	
	    	// Parse JSON response (The mess you got returned is called JSON, it's actually really cool if you dealt with it before)
	    	JSONObject results = new JSONObject(listSearchResultsResults.get_Response());
	    	
	    	// Get array of item
	    	JSONArray items = results.getJSONArray("items");
	    	
	    	
	    	for(int i = 0; i < 5; ++i){
	    	
	    		JSONObject item = items.getJSONObject(i);
			
				JSONObject link = item.getJSONObject("snippet").getJSONObject("thumbnails").getJSONObject("high");
				String thumbnail = link.getString("url");
				
				//We need things to parse the url
				
				//image[i] = ImageIO.read(url);
				//System.out.println(image[i]);
				
				// Get the snippet object within the first item
		    	JSONObject snippet = item.getJSONObject("snippet");
		    	JSONObject getid = item.getJSONObject("id"); 
		    	
		    	
		    	// Parse the title and description fields
		    	
		    	
		    	title[i] = snippet.getString("title");
		    	linkId[i] = getid.getString("videoId");
		    	//String description = snippet.getString("link");
		
		    	// Print title and description
		/*    	System.out.println(title[i]);
		    	System.out.println("https://www.youtube.com/watch?v="+linkId[i]);
		    	System.out.println();*/
		    	//System.out.println(description);
	    	
	    		}
    		}
    	catch(Exception e){
    		System.out.println();
    	}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
