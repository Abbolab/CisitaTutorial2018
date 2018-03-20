package abbo.com.projectworkcisita;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // chiamiamo il metodo per aggiungere il Main Fragment
        createMainFragment();
    }

    /**
     * Creao un metodo per instanziare programmaticamente
     * un nuovo fragment ed aggiungerlo all'activity
      */
    private void createMainFragment() {

        // istanzio nuovo Main Fragment
        MainActivityFragment instanceFragment = new MainActivityFragment();

        // ottengo dall'Activity un Fragment Manager per poter aggiungere il fragment instanziato sopra
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        // aggiungo il fragment al fragment Transaction tramite ID FrameLayout, istanza fragment e TAG per referenziarlo
        transaction.add(R.id.mainContentFragment, instanceFragment, "MAIN_FRAGMENT");

        // conferma ed esegui l'operazione
        transaction.commit();

    }

}
