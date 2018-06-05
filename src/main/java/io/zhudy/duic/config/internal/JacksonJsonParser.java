/**
 * Copyright 2017-2018 the original author or authors
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
package io.zhudy.duic.config.internal;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.zhudy.duic.config.DuicClientException;

import java.io.IOException;
import java.util.Map;

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
public class JacksonJsonParser implements JsonParser {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Map<String, Object> parse(String content) {
        try {
            return objectMapper.readValue(content, Map.class);
        } catch (IOException e) {
            throw new DuicClientException(e);
        }
    }
}
