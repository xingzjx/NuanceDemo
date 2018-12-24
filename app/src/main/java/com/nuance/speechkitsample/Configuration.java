package com.nuance.speechkitsample;

import android.net.Uri;

import com.nuance.speechkit.PcmFormat;

/**
 * All Nuance Developers configuration parameters can be set here.
 *
 * Copyright (c) 2015 Nuance Communications. All rights reserved.
 */
public class Configuration {

    //All fields are required.
    //Your credentials can be found in your Nuance Developers portal, under "Manage My Apps".
    public static final String APP_KEY = "473cd170a4b32c8830051a88d50ac91a8c7dc075238a50041f364fab0a5f45519b17c13fcaedc7faf3e282c8ec4be278c8a2eeeb2c3eef4c743ff77e9e3ccf39";
    public static final String APP_ID = "NMDPTRIAL_1181313247_qq_com20181112215701";
    public static final String SERVER_HOST = "sslsandbox-nmdp.nuancemobility.net";
    public static final String SERVER_PORT = "443";

    public static final String LANGUAGE = "eng-USA";

    public static final Uri SERVER_URI = Uri.parse("nmsps://" + APP_ID + "@" + SERVER_HOST + ":" + SERVER_PORT);

    //Only needed if using NLU
    public static final String CONTEXT_TAG = "";

    public static final PcmFormat PCM_FORMAT = new PcmFormat(PcmFormat.SampleFormat.SignedLinear16, 16000, 1);
    public static final String LANGUAGE_CODE = (Configuration.LANGUAGE.contains("!") ? "eng-USA" : Configuration.LANGUAGE);

}



