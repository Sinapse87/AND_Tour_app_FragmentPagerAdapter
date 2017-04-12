package in.thepolymath.dehradunhandbook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MoviesFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of words
        final ArrayList<Info> places = new ArrayList<Info>();
        places.add(new Info(getString(R.string.m1_name), getString(R.string.m1_desc)));
        places.add(new Info(getString(R.string.m2_name), getString(R.string.m2_desc)));
        places.add(new Info(getString(R.string.m3_name), getString(R.string.m3_desc)));
        places.add(new Info(getString(R.string.m4_name), getString(R.string.m4_desc)));
        places.add(new Info(getString(R.string.m5_name), getString(R.string.m5_desc)));
        places.add(new Info(getString(R.string.m6_name), getString(R.string.m6_desc)));
        places.add(new Info(getString(R.string.m7_name), getString(R.string.m7_desc)));
        places.add(new Info(getString(R.string.m8_name), getString(R.string.m8_desc)));
        places.add(new Info(getString(R.string.m9_name), getString(R.string.m9_desc)));
        places.add(new Info(getString(R.string.m10_name), getString(R.string.m10_desc)));

        InfoAdapter adapter = new InfoAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
