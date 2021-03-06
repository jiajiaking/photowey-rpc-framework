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
package com.photowey.rpc.client.runner;

import com.photowey.rpc.client.pull.PullServiceExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * RpcClientRunner
 *
 * @author WcJun
 * @date 2020/03/22
 * @since v1.0.0
 */
@Component
public class RpcClientRunner implements SmartInitializingSingleton {

    private static final Logger log = LoggerFactory.getLogger(RpcClientRunner.class);

    @Autowired
    private PullServiceExecutor pullServiceExecutor;

    @Override
    public void afterSingletonsInstantiated() {
        try {
            this.pullServiceExecutor.pullService();
        } catch (Exception e) {
            log.error("pull the service info from zk server exception", e);
        }
    }
}
