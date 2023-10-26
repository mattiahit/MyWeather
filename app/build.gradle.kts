import pl.mattiahit.Dependencies

plugins {
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "pl.mattiahit.myweather"
    compileSdk = 33

    defaultConfig {
        applicationId = "pl.mattiahit.myweather"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Dependencies.AndroidX.ROOM_RUNTIME)
    annotationProcessor(Dependencies.AndroidX.ROOM_COMPILER)
    kapt(Dependencies.AndroidX.ROOM_COMPILER)
    implementation(Dependencies.AndroidX.ROOM_KTX)
    implementation(Dependencies.DaggerHilt.DAGGER_HILT)
    kapt(Dependencies.DaggerHilt.DAGGER_HILT_COMPILER)
    implementation(Dependencies.KotlinX.COROUTINE_CORE)
    implementation(Dependencies.AndroidX.LIFECYCLE_VIEW_MODEL_KTX)
    implementation(Dependencies.AndroidX.LIFECYCLE_RUNTIME_KTX)
    implementation(Dependencies.AndroidX.CORE_KTX)
    implementation(Dependencies.AndroidX.ACTIVITY_COMPOSE)
    implementation(platform(Dependencies.AndroidX.COMPOSE_BOM))
    implementation(Dependencies.AndroidX.UI)
    implementation(Dependencies.AndroidX.UI_GRAPHICS)
    implementation(Dependencies.AndroidX.UI_TOOLING_PREVIEW)
    implementation(Dependencies.AndroidX.MATERIAL3)
    testImplementation(Dependencies.Junit.JUNIT)
    testImplementation(Dependencies.AndroidX.ROOM_TESTING)
    androidTestImplementation(Dependencies.AndroidX.JUNIT_EXT)
    androidTestImplementation(Dependencies.AndroidX.ESPRESSO_CORE)
    androidTestImplementation(platform(Dependencies.AndroidX.COMPOSE_BOM))
    androidTestImplementation(Dependencies.AndroidX.UI_TEST_JUNIT4)
    debugImplementation(Dependencies.AndroidX.UI_TOOLING)
    debugImplementation(Dependencies.AndroidX.UI_TEST_MANIFEST)
}