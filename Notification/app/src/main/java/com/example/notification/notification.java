//package com.example.notification;
//
//public class notification {
//    String email = "example@domain.com";
//    String emailAuthHash = "..."; // Email auth hash generated from your server
//    OneSignal.setEmail(email, emailAuthHash, new OneSignal.EmailUpdateHandler() {
//        @Override
//        public void onSuccess() {
//            // Email successfully synced with OneSignal
//        }
//
//        @Override
//        public void onFailure(OneSignal.EmailUpdateError error) {
//            // Error syncing email, check error.getType() and error.getMessage() for details
//        }
//    });
//}
