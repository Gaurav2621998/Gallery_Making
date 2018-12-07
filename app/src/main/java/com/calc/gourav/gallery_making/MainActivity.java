package com.calc.gourav.gallery_making;

import android.os.Environment;
import android.provider.DocumentsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    ArrayList<File> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=imageReader(Environment.getExternalStorageDirectory());
    }

    ArrayList<File> imageReader(File root){
        ArrayList<File> a= new ArrayList<>();
        File[] files=root.listFiles();
        for(int i=0;i<files.length;i++)
        {
            if(files[i].isDirectory())
            {
                a.addAll(imageReader(files[i]));
            }
            else
            {
                if(files[i].getName().endsWith(".jpg"))
                {
                    a.add(files[i]);
                }
            }
        }
        return a;
    }

}
