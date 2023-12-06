plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.beras_ai"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.beras_ai"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.6")
    implementation("androidx.core:core-ktx:1.9.0")

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.5")

    //Testing
    testImplementation("junit:junit:4.13.2")
    testImplementation ("io.mockk:mockk:1.11.0")
    implementation ("androidx.test:core-ktx:1.5.0")
    implementation ("androidx.test:runner:1.5.2")
    androidTestImplementation ("androidx.test:rules:1.5.0")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    testImplementation ("org.mockito:mockito-core:4.4.0")
    testImplementation ("org.mockito.kotlin:mockito-kotlin:3.2.0")
    testImplementation ("androidx.arch.core:core-testing:2.1.0")
    testImplementation ("org.mockito:mockito-inline:4.4.0")
    //testImplementation ("org.mockito:mockito-android:3.11.2")
    testImplementation ("org.robolectric:robolectric:4.11.1")
    //testImplementation ("com.nhaarman.mockitokotlin2:mockito-kotlin:2.1.0")

    implementation ("dev.priyankvasa.android:cameraview-ex:3.5.5-alpha")

    implementation ("org.tensorflow:tensorflow-lite:2.5.0")
}