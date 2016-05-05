/*
 * Copyright (C) 2015 Twitter, Inc.
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
 *
 */

package com.digits.sdk.android;

/**
 * DigitsEventLogger can be implented to receive synchronous callbacks from Digits when the user completes
 * different stages of the Digits Auth.
 * DigitsEventLogger may be used by apps to plugin analytics frameworks like Fabric' s Answers to better understand
 * their login/signup funnel.
 */
public abstract class DigitsEventLogger {
    public void phoneNumberImpression(){};
    public void phoneNumberSubmit() {};
    public void phoneNumberSuccess() {};
    public void loginSuccess() {};
}