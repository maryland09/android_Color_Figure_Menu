package com.marmylad.lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int CURRENT_COLOR = 0;
    final int COLOR_RED = 1;
    final int COLOR_BLUE = 2;
    final int COLOR_GREEN = 3;
    final int COLOR_ORANGE = 4;
    int CURRENT_FIGURE = 0;
    final int FIGURE_CIRCLE = 1;
    final int FIGURE_SQUARE = 2;
    final int FIGURE_RECTANGLE = 3;
    private static final String TAG = "myLogs";
    public static final boolean isDebug = true;

    public void myLogs(String statement){
        if (isDebug) {
            Log.d(TAG, statement);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button_clear = findViewById(R.id.button_clear);
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myLogs("нажата кнопка очистки");
                //Log.d(TAG, "нажата кнопка очиcтки");
                TextView tv_circle = findViewById(R.id.tv_circle);
                TextView tv_square = findViewById(R.id.tv_square);
                TextView tv_rectangle = findViewById(R.id.tv_rectangle);

                tv_circle.setVisibility(View.INVISIBLE);
                tv_rectangle.setVisibility(View.INVISIBLE);
                tv_square.setVisibility(View.INVISIBLE);

                CURRENT_COLOR = 0;
                CURRENT_FIGURE = 0;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        TextView tv_circle = findViewById(R.id.tv_circle);
        TextView tv_square = findViewById(R.id.tv_square);
        TextView tv_rectangle = findViewById(R.id.tv_rectangle);

        switch (item.getItemId()){
            case R.id.blue:
                Toast.makeText(this, "blue", Toast.LENGTH_LONG).show();
                CURRENT_COLOR = COLOR_BLUE;
                switch (CURRENT_FIGURE){
                    case FIGURE_CIRCLE:
                        tv_circle.setBackground(getResources().getDrawable(R.drawable.circle_blue));
                        return true;
                    case FIGURE_SQUARE:
                        tv_square.setBackground(getResources().getDrawable(R.drawable.square_blue));
                        return true;
                 case FIGURE_RECTANGLE:
                        tv_rectangle.setBackground(getResources().getDrawable(R.drawable.rectangle_blue));
                        return true;
                }
                return true;

            case R.id.red:
                Toast.makeText(this, "red", Toast.LENGTH_SHORT).show();
                CURRENT_COLOR = COLOR_RED;

                switch (CURRENT_FIGURE){
                    case FIGURE_CIRCLE:
                        tv_circle.setBackground(getResources().getDrawable(R.drawable.circle_red));
                        return true;
                    case FIGURE_SQUARE:
                        tv_square.setBackground(getResources().getDrawable(R.drawable.square_red));
                        return true;
                    case FIGURE_RECTANGLE:
                        tv_rectangle.setBackground(getResources().getDrawable(R.drawable.rectangle_red));
                        return true;
                }
                return true;

            case R.id.green:
                Toast.makeText(this, "green", Toast.LENGTH_SHORT).show();
                CURRENT_COLOR = COLOR_GREEN;
                switch (CURRENT_FIGURE){
                    case FIGURE_CIRCLE:
                        tv_circle.setBackground(getResources().getDrawable(R.drawable.circle_green));
                        return true;
                    case FIGURE_SQUARE:
                        tv_square.setBackground(getResources().getDrawable(R.drawable.square_green));
                        return true;
                    case FIGURE_RECTANGLE:
                        tv_rectangle.setBackground(getResources().getDrawable(R.drawable.rectangle_green));
                        return true;
                }
                return true;

            case R.id.orange:
                Toast.makeText(this, "orange", Toast.LENGTH_SHORT).show();
                CURRENT_COLOR = COLOR_ORANGE;
                switch (CURRENT_FIGURE){
                    case FIGURE_CIRCLE:
                        tv_circle.setBackground(getResources().getDrawable(R.drawable.circle_orange));
                        return true;
                    case FIGURE_SQUARE:
                        tv_square.setBackground(getResources().getDrawable(R.drawable.square_orange));
                        return true;
                    case FIGURE_RECTANGLE:
                        tv_rectangle.setBackground(getResources().getDrawable(R.drawable.rectangle_orange));
                        return true;
                }
                return true;

            case R.id.circle:
                myLogs("выбран круг");
                CURRENT_FIGURE = FIGURE_CIRCLE;
                tv_square.setVisibility(View.INVISIBLE);
                tv_rectangle.setVisibility(View.INVISIBLE);
                tv_circle.setVisibility(View.VISIBLE);
                //Toast.makeText(this, "circle", Toast.LENGTH_SHORT).show();
                switch (CURRENT_COLOR){
                    case COLOR_BLUE:
                        tv_circle.setBackground(getResources().getDrawable(R.drawable.circle_blue));
                        //Toast.makeText(this, "blue color", Toast.LENGTH_SHORT).show();
                        return true;
                    case COLOR_RED:
                        tv_circle.setBackground(getResources().getDrawable(R.drawable.circle_red));
                        //Toast.makeText(this, "red color", Toast.LENGTH_SHORT).show();
                        return true;
                    case COLOR_GREEN:
                        tv_circle.setBackground(getResources().getDrawable(R.drawable.circle_green));
                        //Toast.makeText(this, "green color", Toast.LENGTH_SHORT).show();
                        return true;
                    case COLOR_ORANGE:
                        tv_circle.setBackground(getResources().getDrawable(R.drawable.circle_orange));
                        //Toast.makeText(this, "orange color", Toast.LENGTH_SHORT).show();
                        return true;
                        default: tv_circle.setBackground(getResources().getDrawable(R.drawable.circle_default));
                }
                return true;

            case R.id.square:
                myLogs("выбран квадрат");
                CURRENT_FIGURE = FIGURE_SQUARE;
                tv_square.setVisibility(View.VISIBLE);
                tv_rectangle.setVisibility(View.INVISIBLE);
                tv_circle.setVisibility(View.INVISIBLE);
                //Toast.makeText(this, "square", Toast.LENGTH_SHORT).show();
                switch (CURRENT_COLOR){
                    case COLOR_BLUE:
                        tv_square.setBackground(getResources().getDrawable(R.drawable.square_blue));
                        //Toast.makeText(this, "blue color", Toast.LENGTH_SHORT).show();
                        return true;
                    case COLOR_RED:
                        tv_square.setBackground(getResources().getDrawable(R.drawable.square_red));
                        //Toast.makeText(this, "red color", Toast.LENGTH_SHORT).show();
                        return true;
                    case COLOR_GREEN:
                        tv_square.setBackground(getResources().getDrawable(R.drawable.square_green));
                        //Toast.makeText(this, "green color", Toast.LENGTH_SHORT).show();
                        return true;
                    case COLOR_ORANGE:
                        tv_square.setBackground(getResources().getDrawable(R.drawable.square_orange));
                        //Toast.makeText(this, "orange color", Toast.LENGTH_SHORT).show();
                        return true;
                    default: tv_square.setBackground(getResources().getDrawable(R.drawable.square_default));
                }
                return true;

            case R.id.rectangle:
                myLogs("выбран прямоугольник");
                CURRENT_FIGURE = FIGURE_RECTANGLE;
                tv_square.setVisibility(View.INVISIBLE);
                tv_rectangle.setVisibility(View.VISIBLE);
                tv_circle.setVisibility(View.INVISIBLE);
                //Toast.makeText(this, "rectangle", Toast.LENGTH_SHORT).show();
                switch (CURRENT_COLOR){
                    case COLOR_BLUE:
                        tv_rectangle.setBackground(getResources().getDrawable(R.drawable.rectangle_blue));
                        //Toast.makeText(this, "blue color", Toast.LENGTH_SHORT).show();
                        return true;
                    case COLOR_RED:
                        tv_rectangle.setBackground(getResources().getDrawable(R.drawable.rectangle_red));
                        //Toast.makeText(this, "red color", Toast.LENGTH_SHORT).show();
                        return true;
                    case COLOR_GREEN:
                        tv_rectangle.setBackground(getResources().getDrawable(R.drawable.rectangle_green));
                        //Toast.makeText(this, "green color", Toast.LENGTH_SHORT).show();
                        return true;
                    case COLOR_ORANGE:
                        tv_rectangle.setBackground(getResources().getDrawable(R.drawable.rectangle_orange));
                        //Toast.makeText(this, "orange color", Toast.LENGTH_SHORT).show();
                        return true;
                    default: tv_rectangle.setBackground(getResources().getDrawable(R.drawable.rectangle_default));
                }
                return true;

                default:return super.onOptionsItemSelected(item);

        }
    }
}
