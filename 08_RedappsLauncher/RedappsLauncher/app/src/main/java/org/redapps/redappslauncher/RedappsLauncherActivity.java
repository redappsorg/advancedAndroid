package org.redapps.redappslauncher;

import android.support.v4.app.Fragment;

public class RedappsLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return RedappsLauncherFragment.newInstance();
    }
}
