package pl.twigit.lightsswitcherforhackerspacekrk;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    public static final String TAG = "Hackerspace";

    private Button corridorButton;
    private Button hardroomButton;
    private Button softroomButton;
    private Button kitchen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        corridorButton = (Button) this.findViewById(R.id.corridor);
        hardroomButton = (Button) this.findViewById(R.id.hardroom);
        softroomButton = (Button) this.findViewById(R.id.softroom);
        kitchen        = (Button) this.findViewById(R.id.kitchen );


        new RequestTask().execute("http://light/light.php/?where=hardroom&set=off");


        /*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/
    }

    private View.OnClickListener switchLight = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            view.getTag();
        }
    };

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(android.R.menu.main, menu);
        return true;
    }*/

    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

    /**
     * A placeholder fragm ent containing a simple view.
     */
    /*
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fr agment, container, false);
            return rootView;
        }
    }*/

}
