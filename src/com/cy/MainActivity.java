package com.cy;



import java.util.ArrayList;
import java.util.List;

import com.cy.android_jsonsmart_v1_demo.R;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONValue;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView tv;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    tv=(TextView)findViewById(R.id.textView1);
    testJsonSmart();
  }
  public void testJsonSmart(){
      List<Person> list=new ArrayList<Person>();
      list.add(new Person("qw",10));
      list.add(new Person("qw1",11));
      list.add(new Person("qw2",12));
      String string=JSONArray.toJSONString(list);
      
      //[{"name":"qw","age":10},{"name":"qw1","age":11},{"name":"qw2","age":12}]
      System.out.println(string);
      
      
      JSONArray jsonArray = new JSONArray();
      jsonArray.addAll(list);
      
      JSONObject result = new JSONObject();
      result.put("persons", jsonArray);
      //{"persons":[{"name":"qw","age":10},{"name":"qw1","age":11},{"name":"qw2","age":12}]}
      System.out.println(JSONValue.toJSONString(result));
      
//      tv.setText(jsonArray.toJSONString());
      
  }

}
