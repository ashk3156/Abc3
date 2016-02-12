package self.ashish.abc3;

import android.app.Activity;
import android.app.ListActivity;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    private String[] os=new String[]{"Mac-OS","Linux-OS","Windows-OS","iOS","Android-OS","Windows-MobileOS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,os));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        switch (position){
            case 0:
                Toast.makeText(this,"item is"+position,Toast.LENGTH_LONG).show();
                break;

            case 1:
                Toast.makeText(this,"item is"+position,Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(this,"item is"+position,Toast.LENGTH_LONG).show();
                break;
            case 3:
                Toast.makeText(this,"item is"+position,Toast.LENGTH_LONG).show();
                break;
            case 4:
                Toast.makeText(this,"item is"+position,Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(this,"nothing clicked",Toast.LENGTH_LONG).show();



        }
    }
}
