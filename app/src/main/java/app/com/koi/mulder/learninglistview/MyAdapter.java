package app.com.koi.mulder.learninglistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by mulder on 10/6/15.
 */
public class MyAdapter extends ArrayAdapter<String>{
    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());
        View theView = theInflater.inflate(R.layout.row_layout, parent, false);

        String tvShow = getItem(position);

        TextView theTextView =  (TextView) theView.findViewById(R.id.textview1);

        //show what you want to show
        theTextView.setText(tvShow);

        /*ImageView theImageView = (ImageView) theView.findViewById(R.id.imageview1 );

        theImageView.setImageResource(R.drawable.ic_sun_icon);*/

        return theView;
    }
}
