package social_network;

import social_network.chat.*;
import social_network.wall.Message;

public class MySocialNetwork {

    public static void main(String[] args) {

        Person person = new Person();

        // ?????????????????????????????
        // What type of Message is this?
        // ?????????????????????????????

        social_network.chat.Message directMessage = new social_network.chat.Message();
        directMessage.directMessageFrom = "";

        Message wallMessage = new Message();
        wallMessage.numberOfLikes = 12;

    }

    private static void BothTypesOfMessage() {
//        Message directMessage = new Message();
//        directMessage.directMessageFrom = "James";
//        directMessage.directMessageTo = "Gareth";
//        directMessage.message = "Pub after work?";
//
//        Message wallMessage = new Message();
//        wallMessage.message = "Look at this awesome photo of a cat";
//        wallMessage.photoUrl = "http://softwire.com/cat.gif";
//        wallMessage.numberOfLikes = 1000;
    }
}
