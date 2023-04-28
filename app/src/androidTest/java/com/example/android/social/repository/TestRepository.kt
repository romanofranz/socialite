/*
 * Copyright (C) 2023 The Android Open Source Project
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

package com.example.android.social.repository

import androidx.test.platform.app.InstrumentationRegistry
import com.example.android.social.data.createTestDatabase

fun createTestRepository(): ChatRepository {
    val context = InstrumentationRegistry.getInstrumentation().targetContext
    val database = createTestDatabase()
    return ChatRepository(
        database = database,
        notificationHelper = NotificationHelper(context),
        executor = { runnable -> runnable.run() },
    )
}