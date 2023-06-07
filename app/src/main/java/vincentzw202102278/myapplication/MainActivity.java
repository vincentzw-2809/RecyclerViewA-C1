package vincentzw202102278.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView _recyclerView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);
        List<NegaraModel> negaraModelList = new ArrayList<>();

        String[] namaNegara = {"Albania", "Hungary", "Slovenia", "Belgium", "Canada"};
        ArrayList<String> deskripsiNegara = new ArrayList<>();
        ArrayList<String> urlNegara = new ArrayList<>();

        deskripsiNegara.add("Negara ini menggunakan bendera berwarna merah terang.");
        deskripsiNegara.add("Hungaria negara dengan padang rumput hijau membentang");
        deskripsiNegara.add("Slovenia, resminya Republik Slovenia, adalah sebuah negara pesisir sub-Alpen di Eropa Tengah. Slovenia berbatasan dengan Italia di barat, Austria di utara, Hungaria di timurlaut, Kroasia di tenggara ");
        deskripsiNegara.add("dimana cocoa tumbuh dan enak hingga terkenal dengan nama coklat belgia");
        deskripsiNegara.add("Negara ini akan menjuarai turnamen hockey ");
        urlNegara.add("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Albania-Flag-icon.png");
        urlNegara.add("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Hungary-Flag-icon.png");
        urlNegara.add("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Slovenia-Flag-icon.png");
        urlNegara.add("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Belgium-Flag-icon.png");
        urlNegara.add("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Canada-Flag-icon.png");

        for (int i = 0; i < urlNegara.size(); i++) {
            NegaraModel nm = new NegaraModel();
            nm.setNama(namaNegara[i]);
            nm.setDeskripsi(deskripsiNegara.get(i));
            nm.setUrl(urlNegara.get(i));
            negaraModelList.add(nm);
        }

        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        _recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraModelList);
        _recyclerView1.setAdapter(na);
    }
}