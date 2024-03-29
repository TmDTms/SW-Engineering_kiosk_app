package com.example.kiosk_help_app.alone.Transfer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.kiosk_help_app.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AloneTransferTimeTableFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AloneTransferTimeTableFragment extends Fragment implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AloneTransferTimeTableFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AloneTransferTimeTableFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AloneTransferTimeTableFragment newInstance(String param1, String param2) {
        AloneTransferTimeTableFragment fragment = new AloneTransferTimeTableFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_alone_transfer_time_table, container, false);
        // Fragment에서는 onClick을 사용할 수 없기때문에,  별도로 리스너를 달아서 클릭이벤트를 지정한다.
        LinearLayout layout_1 = rootview.findViewById(R.id.gangneung_time_1);
        LinearLayout layout_2 = rootview.findViewById(R.id.gangneung_time_2);
        LinearLayout layout_3 = rootview.findViewById(R.id.gangneung_time_3);
        LinearLayout layout_4 = rootview.findViewById(R.id.gangneung_time_4);

        layout_1.setOnClickListener(this);
        layout_1.setOnClickListener(this);
        layout_1.setOnClickListener(this);
        layout_1.setOnClickListener(this);
        return rootview;
    }

    public void aloneSeatSelectOnClick(View v) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.gangneung_time_1:
                ((AloneTransferOnsiteActivity) getActivity()).popUpSelectSeat(1);
                break;
            case R.id.gangneung_time_2:
                ((AloneTransferOnsiteActivity) getActivity()).popUpSelectSeat(2);
                break;
            case R.id.gangneung_time_3:
                ((AloneTransferOnsiteActivity) getActivity()).popUpSelectSeat(3);
                break;
            case R.id.gangneung_time_4:
                ((AloneTransferOnsiteActivity) getActivity()).popUpSelectSeat(4);
                break;


        }
    }
}