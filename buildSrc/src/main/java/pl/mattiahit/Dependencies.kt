package pl.mattiahit

object Dependencies {
    object DaggerHilt {
        const val DAGGER_HILT = "com.google.dagger:hilt-android:${Versions.DAGGER_HILT}"
        const val DAGGER_HILT_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.DAGGER_HILT}"
    }
    object KotlinX {
        const val COROUTINE_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE_CORE}"
    }
    object AndroidX {
        const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
        const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
        const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
        const val ROOM_TESTING = "androidx.room:room-testing:${Versions.ROOM}"
        const val LIFECYCLE_VIEW_MODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_KTX}"
        const val LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_KTX}"
        const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
        const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.ACTIVITY_COMPOSE}"
        const val COMPOSE_BOM = "androidx.compose:compose-bom:${Versions.COMPOSE_BOM}"
        const val UI = "androidx.compose.ui:ui"
        const val UI_GRAPHICS = "androidx.compose.ui:ui-graphics"
        const val UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview"
        const val MATERIAL3 = "androidx.compose.material3:material3"
        const val JUNIT_EXT = "androidx.test.ext:junit:${Versions.JUNIT_EXT}"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
        const val UI_TEST_JUNIT4 = "androidx.compose.ui:ui-test-junit4"
        const val UI_TOOLING = "androidx.compose.ui:ui-tooling"
        const val UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest"
    }
    object Junit {
        const val JUNIT = "junit:junit:${Versions.JUNIT}"
    }
}