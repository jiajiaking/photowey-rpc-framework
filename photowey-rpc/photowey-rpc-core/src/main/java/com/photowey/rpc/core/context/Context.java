/*
 * Copyright © 2020 photowey (photowey@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.photowey.rpc.core.context;

import java.util.Map;
import java.util.function.Supplier;

/**
 * Context
 *
 * @author WcJun
 * @date 2020/02/21
 * @since v1.0.0
 */
public interface Context {

    <T> void setAttribute(String key, T value);

    <T> T getAttribute(String key);

    <T> T getAttribute(String key, Supplier<T> supplier);

    <T> Map<String, T> getContext();
}
