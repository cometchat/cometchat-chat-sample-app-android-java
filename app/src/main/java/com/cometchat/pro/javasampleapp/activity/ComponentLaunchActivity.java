package com.cometchat.pro.javasampleapp.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.cometchat.chatuikit.shared.resources.utils.Utils;
import com.cometchat.pro.javasampleapp.R;
import com.cometchat.pro.javasampleapp.fragments.calls.CallButtonFragment;
import com.cometchat.pro.javasampleapp.fragments.conversations.ConversationsFragment;
import com.cometchat.pro.javasampleapp.fragments.conversations.ConversationsWithMessagesFragment;
import com.cometchat.pro.javasampleapp.fragments.groups.AddMemberFragment;
import com.cometchat.pro.javasampleapp.fragments.groups.BannedMembersFragment;
import com.cometchat.pro.javasampleapp.fragments.groups.CreateGroupFragment;
import com.cometchat.pro.javasampleapp.fragments.groups.GroupDetailsFragment;
import com.cometchat.pro.javasampleapp.fragments.groups.GroupMembersFragment;
import com.cometchat.pro.javasampleapp.fragments.groups.GroupsFragment;
import com.cometchat.pro.javasampleapp.fragments.groups.GroupsWithMessagesFragment;
import com.cometchat.pro.javasampleapp.fragments.groups.JoinProtectedGroupFragment;
import com.cometchat.pro.javasampleapp.fragments.groups.TransferOwnershipFragment;
import com.cometchat.pro.javasampleapp.fragments.messages.MessageComposerFragment;
import com.cometchat.pro.javasampleapp.fragments.messages.MessageHeaderFragment;
import com.cometchat.pro.javasampleapp.fragments.messages.MessageListFragment;
import com.cometchat.pro.javasampleapp.fragments.messages.MessagesFragment;
import com.cometchat.pro.javasampleapp.fragments.shared.resources.LocalizeFragment;
import com.cometchat.pro.javasampleapp.fragments.shared.resources.SoundManagerFragment;
import com.cometchat.pro.javasampleapp.fragments.shared.resources.ThemeFragment;
import com.cometchat.pro.javasampleapp.fragments.shared.views.AudioBubbleFragment;
import com.cometchat.pro.javasampleapp.fragments.shared.views.AvatarFragment;
import com.cometchat.pro.javasampleapp.fragments.shared.views.BadgeCountFragment;
import com.cometchat.pro.javasampleapp.fragments.shared.views.FileBubbleFragment;
import com.cometchat.pro.javasampleapp.fragments.shared.views.ImageBubbleFragment;
import com.cometchat.pro.javasampleapp.fragments.shared.views.ListItemFragment;
import com.cometchat.pro.javasampleapp.fragments.shared.views.MessageReceiptFragment;
import com.cometchat.pro.javasampleapp.fragments.shared.views.StatusIndicatorFragment;
import com.cometchat.pro.javasampleapp.fragments.shared.views.TextBubbleFragment;
import com.cometchat.pro.javasampleapp.fragments.shared.views.VideoBubbleFragment;
import com.cometchat.pro.javasampleapp.fragments.users.UsersDetailsFragment;
import com.cometchat.pro.javasampleapp.fragments.users.UsersFragment;
import com.cometchat.pro.javasampleapp.fragments.users.UsersWithMessagesFragment;

public class ComponentLaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component_launch);
        Utils.setStatusBarColor(this, getResources().getColor(R.color.app_background));
        int id = getIntent().getIntExtra("component", 0);

        if (id == R.id.conversationWithMessages) {
            loadFragment(new ConversationsWithMessagesFragment());
        } else if (id == R.id.conversations) {
            loadFragment(new ConversationsFragment());
        } else if (id == R.id.userWithMessages) {
            loadFragment(new UsersWithMessagesFragment());
        } else if (id == R.id.users) {
            loadFragment(new UsersFragment());
        } else if (id == R.id.user_details) {
            loadFragment(new UsersDetailsFragment());
        } else if (id == R.id.groupWithMessages) {
            loadFragment(new GroupsWithMessagesFragment());
        } else if (id == R.id.call_button) {
            loadFragment(new CallButtonFragment());
        } else if (id == R.id.groups) {
            loadFragment(new GroupsFragment());
        } else if (id == R.id.create_group) {
            loadFragment(new CreateGroupFragment());
        } else if (id == R.id.join_protected_group) {
            loadFragment(new JoinProtectedGroupFragment());
        } else if (id == R.id.group_member) {
            loadFragment(new GroupMembersFragment());
        } else if (id == R.id.add_member) {
            loadFragment(new AddMemberFragment());
        } else if (id == R.id.transfer_ownership) {
            loadFragment(new TransferOwnershipFragment());
        } else if (id == R.id.banned_members) {
            loadFragment(new BannedMembersFragment());
        } else if (id == R.id.group_details) {
            loadFragment(new GroupDetailsFragment());
        } else if (id == R.id.messages) {
            loadFragment(new MessagesFragment());
        } else if (id == R.id.messageList) {
            loadFragment(new MessageListFragment());
        } else if (id == R.id.messageHeader) {
            loadFragment(new MessageHeaderFragment());
        } else if (id == R.id.messageComposer) {
            loadFragment(new MessageComposerFragment());
        } else if (id == R.id.avatar) {
            loadFragment(new AvatarFragment());
        } else if (id == R.id.badgeCount) {
            loadFragment(new BadgeCountFragment());
        } else if (id == R.id.messageReceipt) {
            loadFragment(new MessageReceiptFragment());
        } else if (id == R.id.statusIndicator) {
            loadFragment(new StatusIndicatorFragment());
        } else if (id == R.id.soundManager) {
            loadFragment(new SoundManagerFragment());
        } else if (id == R.id.theme) {
            loadFragment(new ThemeFragment());
        } else if (id == R.id.localize) {
            loadFragment(new LocalizeFragment());
        } else if (id == R.id.list_item) {
            loadFragment(new ListItemFragment());
        } else if (id == R.id.text_bubble) {
            loadFragment(new TextBubbleFragment());
        } else if (id == R.id.image_bubble) {
            loadFragment(new ImageBubbleFragment());
        } else if (id == R.id.video_bubble) {
            loadFragment(new VideoBubbleFragment());
        } else if (id == R.id.audio_bubble) {
            loadFragment(new AudioBubbleFragment());
        } else if (id == R.id.files_bubble) {
            loadFragment(new FileBubbleFragment());
        }
    }

    private void loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
        }
    }

}