package app.revanced.patches.tiktok.misc.login.fixgoogle.annotations

import app.revanced.patcher.annotation.Compatibility
import app.revanced.patcher.annotation.Package

@Compatibility(
    [
        Package("com.ss.android.ugc.trill"),
        Package("com.zhiliaoapp.musically")
    ]
)
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
internal annotation class FixGoogleLoginCompatibility