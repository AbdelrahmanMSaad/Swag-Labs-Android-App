package configs.appPackageAndActivities;

public class AppPackageAndActivities {
    private static final String com ="com.";
    private static final String activity = "Activity";

    public static final String appPackage = com+"swaglabsmobileapp";

    public static final String splashActivity = appPackage+".Splash"+activity;
    public static final String mainActivity = appPackage+".Main"+activity;
    public static final String devSettingsActivity = com+"facebook.react.devsupport,DevSettings"+activity;
    public static final String deviceCredentialHandlerActivity = "androidx.biometric.DeviceCredentialHandler"+activity;
    public static final String googleApiActivity = com+"google.android.gms.common.api.GoogleApi"+activity;
}
