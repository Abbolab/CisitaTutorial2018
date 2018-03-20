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

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;

import cz.msebera.android.httpclient.Header;


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

        // ottengo pulsante per il download dati
        Button btnDonwload = view.findViewById(R.id.buttonDownload);

        btnDonwload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // avviamo procedura di download dati
                executeDownloadData();
            }
        });

    }

    /***
     * Avvio procedura di donwload dati interrogando WebService
     */
    private void executeDownloadData() {

        Log.d("CISITA", ">>>> executeDownloadData()");

        AsyncHttpClient client = new AsyncHttpClient();
        client.get("https://private-241152-cisitatest.apiary-mock.com/users", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

                Log.d("CISITA", "AsyncHTTPClient - onSuccess :-) !!!");

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

                Log.d("CISITA", "AsyncHTTPClient - onFailure :-(");

            }
        });

    }
}
