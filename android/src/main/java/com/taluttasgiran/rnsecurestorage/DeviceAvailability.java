package com.taluttasgiran.rnsecurestorage;

import android.content.Context;
import android.content.pm.PackageManager;

import androidx.annotation.NonNull;
import androidx.biometric.BiometricManager;

import static androidx.biometric.BiometricManager.BIOMETRIC_SUCCESS;

@SuppressWarnings({"WeakerAccess", "deprecation"})
public class DeviceAvailability {
    public static boolean isBiometricAuthAvailable(@NonNull final Context context) {
        return BiometricManager.from(context).canAuthenticate() == BIOMETRIC_SUCCESS;
    }

    public static boolean isFingerprintAuthAvailable(@NonNull final Context context) {
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_FINGERPRINT);
    }

    public static boolean isFaceAuthAvailable(@NonNull final Context context) {
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_FACE);
    }

    public static boolean isIrisAuthAvailable(@NonNull final Context context) {
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_IRIS);
    }
}