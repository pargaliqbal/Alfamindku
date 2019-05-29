package store.pargalapp.alfamindku.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import store.pargalapp.alfamindku.R;
/**
 * Created by pargal on 5/28/2019.
 */
public class FavoritesFragment extends Fragment {

    public static FavoritesFragment newInstance() {
        return new FavoritesFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_aktivitas, container, false);

        return view;
    }
}
