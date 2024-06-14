plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "hao.com.manager.appbanhang"
    compileSdk = 34

    defaultConfig {
        applicationId = "hao.com.manager.appbanhang"
        minSdk = 24
        targetSdk = 34
        multiDexEnabled = true
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        ndk {
            abiFilters.add("x86")
            abiFilters.add("armeabi")
            abiFilters.add("armeabi-v7a")
            //abiFilters ABI_FILTERS
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures{
        viewBinding = true
        dataBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.multidex:multidex:2.0.1")
    implementation("androidx.core:core:1.13.0")
    implementation("com.android.support:support-compat:28.0.0")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.activity:activity:1.9.0")
    implementation("com.google.firebase:firebase-auth:22.3.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    //RxJava
    implementation("io.reactivex.rxjava3:rxandroid:3.0.2")
    implementation("io.reactivex.rxjava3:rxjava:3.1.8")
    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
    implementation("com.github.akarnokd:rxjava3-retrofit-adapter:3.0.0")
    //bradge
    implementation("com.nex3z:notification-badge:1.0.5")
    //event bus
    implementation("org.greenrobot:eventbus:3.3.1")
    //paper
    implementation("io.github.pilgr:paperdb:2.7.2")
    //Gson
    implementation("com.google.code.gson:gson:2.10.1")
    //lotte
    implementation("com.airbnb.android:lottie:6.4.0")
    //neumorphim
    implementation("com.github.fornewid:neumorphism:0.3.2")
    //image pick
    implementation("com.github.dhaval2404:imagepicker:2.1")
    // Import the BoM for the Firebase platform
    implementation(platform("com.google.firebase:firebase-bom:32.8.1"))
    implementation("com.google.firebase:firebase-messaging:23.4.1")
    implementation("com.google.firebase:firebase-analytics:21.6.2")
    implementation("com.google.firebase:firebase-firestore:24.11.1")
    //chart
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
    //videosdk
    implementation("live.videosdk:rtc-android-sdk:0.1.26")
    // library to perform Network call to generate a meeting id
    implementation("com.amitshekhar.android:android-networking:1.0.2")
}