package com.cometchat.javasampleapp.fragments.shared.resources;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cometchat.chatuikit.shared.resources.soundManager.CometChatSoundManager;
import com.cometchat.chatuikit.shared.resources.soundManager.Sound;
import com.cometchat.javasampleapp.R;


public class SoundManagerFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sound_manager, container, false);
        CometChatSoundManager soundManager = new CometChatSoundManager(getActivity());
        view.findViewById(R.id.playIncoming).setOnClickListener(view1 -> {
            soundManager.play(Sound.incomingMessage); //To play incoming Messages sound
        });
        view.findViewById(R.id.playOutgoing).setOnClickListener(view12 -> {
            soundManager.play(Sound.outgoingMessage);//To play outgoing Messages sound
        });
        return view;
    }

}