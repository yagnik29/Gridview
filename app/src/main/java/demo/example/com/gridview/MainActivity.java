package demo.example.com.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    public static int[] itemImages = {R.drawable.apple,R.drawable.backgound,R.drawable.book};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.grid);

        GridAdapter gridAdapter = new GridAdapter(MainActivity.this,itemImages);

        gridView.setAdapter(gridAdapter);
    }
}
