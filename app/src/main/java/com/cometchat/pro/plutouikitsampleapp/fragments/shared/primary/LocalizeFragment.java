package com.cometchat.pro.plutouikitsampleapp.fragments.shared.primary;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.cometchat.pro.plutouikitsampleapp.R;
import com.cometchat.pro.plutouikitsampleapp.activity.ComponentLaunchActivity;
import com.cometchatworkspace.components.shared.primaryComponents.localize.CometChatLocalize;
import com.cometchatworkspace.components.shared.primaryComponents.localize.Language;


public class LocalizeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_localize, container, false);
        TextView localizeIntro = view.findViewById(R.id.localizeOverview);
        TextView language = view.findViewById(R.id.language);
        AppCompatButton button = view.findViewById(R.id.button);
        RadioGroup radioGroup = view.findViewById(R.id.toggle);
        if (getActivity() != null)
            CometChatLocalize.setLocale(getActivity(), Language.Code.ENGLISH);
        radioGroup.setOnCheckedChangeListener((radio, i) -> {
            if (getActivity() != null) {
                if (i == R.id.english) {
                    localizeIntro.setText(getResources().getString(R.string.localize_english_overview));
                    language.setText(getResources().getString(R.string.language_english));
                    button.setText(getResources().getString(R.string.view_english));
                    CometChatLocalize.setLocale(getActivity(), Language.Code.ENGLISH); //Localize UiKit to English
                } else if (i == R.id.hindi) {
                    localizeIntro.setText(getResources().getString(R.string.localize_hindi_overview));
                    language.setText(getResources().getString(R.string.language_hindi));
                    button.setText(getResources().getString(R.string.view_hindi));
                    CometChatLocalize.setLocale(getActivity(), Language.Code.HINDI); //Localize UiKit to Hindi
                }
            }

        });
        view.findViewById(R.id.button).setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(), ComponentLaunchActivity.class);
            intent.putExtra("component", R.id.conversationWithMessages);
            startActivity(intent);
        });

        return view;
    }
}