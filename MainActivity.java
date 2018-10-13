package e.niharikapujar.referhub;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] brands={"Uber","Bird","Lyft","UberEats","Audible"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getListView().getContext(),android.R.layout.simple_list_item_1,brands);
        getListView().setAdapter(adapter);

    }
}
