/*
 * Copyright (C) 2024 The LineageOS Project
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

package org.lineageos.setupwizard;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

import org.lineageos.setupwizard.util.SetupWizardUtils;

import kotlin.coroutines.Continuation;

public class SetupWizardExitWorker extends CoroutineWorker {

    public SetupWizardExitWorker(@NonNull Context appContext,
            @NonNull WorkerParameters params) {
        super(appContext, params);
    }

    @Nullable
    @Override
    public Object doWork(@NonNull Continuation<? super Result> continuation) {
        SetupWizardUtils.finishSetupWizard(getApplicationContext());
        return Result.success();
    }
}
