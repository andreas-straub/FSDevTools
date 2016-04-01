/*
 *
 * *********************************************************************
 * fsdevtools
 * %%
 * Copyright (C) 2016 e-Spirit AG
 * %%
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
 * *********************************************************************
 *
 */

package com.espirit.moddev.cli;

import com.espirit.moddev.cli.exception.CliErrorEvent;

/**
 * Interface that defines means to receive events from the cli application.
 *
 * @see com.espirit.moddev.cli.Cli#addListener(CliListener)
 * @author e-Spirit AG
 */
@FunctionalInterface
public interface CliListener {

    /**
     * Notify this listener about an error event.
     *
     * @param e the error event
     */
    void errorOccurred(final CliErrorEvent e);
}
