package abbo.com.projectworkcisita;

import android.os.Debug;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Ottengo il widget TextView definito nel XML layout dalla View principale che ha come ID: textViewTest2
        // La variabile è definita come "final" poiché usata all'interno del blocco [onClick]
        final TextView myTextView = (TextView)view.findViewById(R.id.textViewTest2);

        // Ottengo il widget Button definito nel XML layout dalla View principale che ha come ID: buttonActionTest
        Button myButtonAction = (Button)view.findViewById(R.id.buttonActionTest);

        // Implemento un Listener per l'evento OnClick del pulsante
        myButtonAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Stampo a Console "Logcat" un testo per le verifiche con un TAG a scelta [CISITA]
                Log.d("CISITA", "Pulsante premuto!");
                //Renderizzo un testo a scelta nella TextView ottenuta in precedenza
                myTextView.setText("Pulsante premuto!!!");
            }
        });

    }
}
