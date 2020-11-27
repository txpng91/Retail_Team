package com.example.retailteam;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Context;
        import android.os.Bundle;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.AdapterView;
        import android.widget.BaseAdapter;
        import android.widget.GridView;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

public class Shop extends AppCompatActivity {
    //Create array for products
    Integer[] Products = {R.drawable.bottom1, R.drawable.bottom2, R.drawable.bottom3, R.drawable.bottom4
    , R.drawable.top1, R.drawable.top2, R.drawable.top3, R.drawable.top4, R.drawable.girlbottom1, R.drawable.girlbottom2,
    R.drawable.girlbottom3, R.drawable.girlbottom4, R.drawable.girltop1, R.drawable.girltop2, R.drawable.girltop3
    , R.drawable.girltop4};
    ImageView pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        GridView grid = (GridView)findViewById(R.id.gridView);
        final ImageView pic = (ImageView) findViewById(R.id.imgLarge);
        grid.setAdapter(new ImageAdapter(this));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getBaseContext(), "Item " + (position + 1), Toast.LENGTH_SHORT).show();
                pic.setImageResource(Products[position]);
                switch(position) {
                    case 0:
                        Toast.makeText(getBaseContext(), "Price: $11.99 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(getBaseContext(), "Price: $24.99 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getBaseContext(), "Price: $11.99 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(getBaseContext(), "Price: $29.99 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(getBaseContext(), "Price: $14.99 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(getBaseContext(), "Price: $19.99 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(getBaseContext(), "Price: $19.95 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(getBaseContext(), "Price: $14.99 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(getBaseContext(), "Price: $24.99 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(getBaseContext(), "Price: $29.95 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 10:
                        Toast.makeText(getBaseContext(), "Price: $24.95 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 11:
                        Toast.makeText(getBaseContext(), "Price: $24.99 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 12:
                        Toast.makeText(getBaseContext(), "Price: $14.99 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 13:
                        Toast.makeText(getBaseContext(), "Price: $16.99 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 14:
                        Toast.makeText(getBaseContext(), "Price: $13.99 ", Toast.LENGTH_SHORT).show();
                        break;
                    case 15:
                        Toast.makeText(getBaseContext(), "Price: $18.99 ", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        // code block
                }
            }
        });
    }
    public class ImageAdapter extends BaseAdapter {
        private Context context;
        public ImageAdapter(Context c){
            context = c;
        }

        @Override
        public int getCount(){
            return Products.length;
        }

        @Override
        public Object getItem(int position){
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            pic = new ImageView(context);
            pic.setImageResource(Products[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(350, 345));
            return pic;
        }
    }
}