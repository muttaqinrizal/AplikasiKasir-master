package com.demzt.aplikasikasir;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class DaftarPesanan extends AppCompatActivity {
   boolean doubleBackToExitPressedOnce = false;
   private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
           = new BottomNavigationView.OnNavigationItemSelectedListener() {
       @Override
       public boolean onNavigationItemSelected(@NonNull MenuItem item) {
           switch (item.getItemId()) {
               case R.id.MyOrder:
                   Toast.makeText( DaftarPesanan.this, "Orderanku", Toast.LENGTH_SHORT ).show();
               case R.id.List:
                   Toast.makeText( DaftarPesanan.this, "List", Toast.LENGTH_SHORT ).show();
           }
           return false;
       }
   };
   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate( savedInstanceState );
       setContentView( R.layout.activity_daftar_pesanan );
   }
}