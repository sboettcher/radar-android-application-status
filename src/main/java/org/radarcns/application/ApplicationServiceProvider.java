/*
 * Copyright 2017 The Hyve
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.radarcns.application;

import android.os.Bundle;
import android.os.Parcelable;

import org.radarcns.android.RadarConfiguration;
import org.radarcns.android.device.DeviceServiceProvider;

import java.util.Collections;
import java.util.List;

import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class ApplicationServiceProvider extends DeviceServiceProvider<ApplicationState> {
    @Override
    public Class<?> getServiceClass() {
        return ApplicationStatusService.class;
    }

    @Override
    public Parcelable.Creator<ApplicationState> getStateCreator() {
        return ApplicationState.CREATOR;
    }

    @Override
    public boolean isDisplayable() {
        return false;
    }

    @Override
    public List<String> needsPermissions() {
        return Collections.singletonList(WRITE_EXTERNAL_STORAGE);
    }

    @Override
    protected void configure(Bundle bundle) {
        super.configure(bundle);
        this.getConfig().putExtras(bundle, RadarConfiguration.DEVICE_SERVICES_TO_CONNECT);
    }

    @Override
    public String getDisplayName() {
        return getActivity().getString(R.string.applicationServiceDisplayName);
    }
}