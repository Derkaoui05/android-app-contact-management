package com.example.tp3;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText userId,username,userAddress,userPhone;
    Button ajouter,modifier,supprimer,lister,findbyid;
    ListView liste;
    GestionContacts gc = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        gc =new GestionContacts(getApplicationContext());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        userId = findViewById(R.id.userId);
        username = findViewById(R.id.username);
        userAddress = findViewById(R.id.userAddress);
        userPhone = findViewById(R.id.userPhone);

        ajouter = findViewById(R.id.ajouter);
        modifier = findViewById(R.id.modifier);
        lister = findViewById(R.id.lister);
        findbyid = findViewById(R.id.findbyid);

        liste = findViewById(R.id.listeview);
        ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(userId.getText().toString());
                String name1 = username.getText().toString();
                String address1 = userAddress.getText().toString();
                String phone1 = userPhone.getText().toString();
                gc.Ajouter(new Contact(num,name1,address1,phone1));
                Toast.makeText(getApplicationContext(),"Insertion Ok",Toast.LENGTH_LONG).show();
                vider();
            }
        });
    }
    public void vider(){
        userId.setText("");
        username.setText("");
        userAddress.setText("");
        userPhone.setText("");
    }
}