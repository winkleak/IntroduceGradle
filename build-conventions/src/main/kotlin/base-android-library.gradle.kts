plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 33

    defaultConfig {
        minSdk = 30

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

val libs = the<VersionCatalogsExtension>().named("libs")
dependencies {
    implementation(libs.findLibrary("androidx.core.ktx").get())

    testImplementation(libs.findLibrary("junit").get())

    androidTestImplementation(libs.findBundle("androidx.test").get())
}