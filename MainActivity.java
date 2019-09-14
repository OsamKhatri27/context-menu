package com.example.innu.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView)findViewById(R.id.imageView);
        editText=(EditText)findViewById(R.id.editText);

        //Registering an element for Context Menu
        registerForContextMenu(imageView);
        registerForContextMenu(editText);

    }

    //Define Context Menu Items
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        //Programmatically
        if(v.getId()==R.id.imageView)
        {
            menu.add("Set As Background");
            menu.add("Set As Lock Screen");
            menu.add("Set As Both");
        }
        else
        {
            menu.add("Cut");
            menu.add("Copy");
            menu.add("Paste");
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        switch(item.getTitle().toString())
        {
            case "Set As Background":
                Log.i("MyApp","Set As Background Clicked");
                break;
            case "Set As Lock Screen":
                Log.i("MyApp","Set As Lock Screen Clicked");
                break;
            case "Set As Both":
                Log.i("MyApp","Set As Both");
                break;
            case "Cut":
                Log.i("MyApp","Cut");
                break;
            case "Copy":
                Log.i("MyApp","Copy");
                break;
            case "Paste":
                Log.i("MyApp","Paste");
                break;
        }
        return true;
    }


}
