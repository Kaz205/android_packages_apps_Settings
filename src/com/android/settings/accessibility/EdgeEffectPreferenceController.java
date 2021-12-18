/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.accessibility;

import android.content.Context;
import android.provider.Settings;
import android.widget.EdgeEffect;

import com.android.settings.core.TogglePreferenceController;

public class EdgeEffectPreferenceController extends TogglePreferenceController {

    private EdgeEffect mEdgeEffect;

    public EdgeEffectPreferenceController(Context context, String preferenceKey) {
        super(context, preferenceKey);
    }

    @Override
    public int getAvailabilityStatus() {
        return AVAILABLE;
    }

    @Override
    public boolean isChecked() {
        return mEdgeEffect.getStretchEdgeEffectStatus();
    }

    @Override
    public boolean setChecked(boolean isChecked) {
        mEdgeEffect.toggleStretchEdgeEffect();
        return true;
    }
}
