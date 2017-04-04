package demo.example.com.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by admin on 4/4/2017.
 */

public class GridAdapter extends BaseAdapter {

    Context context;
    int[] itemImage;
    private static LayoutInflater layoutInflater = null;

    public GridAdapter(Context context, int[] itemimage){
        this.itemImage = itemimage;
        this.context = context;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return itemImage.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    public  class Holder{
        ImageView gridimageView;
        RatingBar ratingBar;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final Holder holder = new Holder();

        View rawview;
        rawview = layoutInflater.inflate(R.layout.customgrid,null);
        holder.gridimageView = (ImageView) rawview.findViewById(R.id.gridimage);
        holder.ratingBar = (RatingBar) rawview.findViewById(R.id.ratingbar);
        holder.gridimageView.setImageResource(itemImage[i]);
        holder.ratingBar.getRating();

        rawview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Rating is " + holder.ratingBar.getRating(), Toast.LENGTH_SHORT).show();
            }
        });

        return rawview;
    }
}
