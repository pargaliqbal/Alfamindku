package store.pargalapp.alfamindku;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by pargal on 5/28/2019.
 */

public class Lantai4 extends Fragment {
    public static Lantai4 newInstance() {
        return new Lantai4();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lantai4, container, false);
        return rootView;
    }
}
