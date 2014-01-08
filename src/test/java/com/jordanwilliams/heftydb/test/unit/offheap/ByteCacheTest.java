/*
 * Copyright (c) 2013. Jordan Williams
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jordanwilliams.heftydb.test.unit.offheap;


import com.jordanwilliams.heftydb.offheap.ByteCache;
import com.jordanwilliams.heftydb.record.Key;
import com.jordanwilliams.heftydb.record.Value;
import com.jordanwilliams.heftydb.util.ByteBuffers;
import org.junit.Assert;
import org.junit.Test;

public class ByteCacheTest {

    private static final Key TEST_KEY = new Key(ByteBuffers.fromString("test"));
    private static final Value TEST_VALUE = new Value(ByteBuffers.fromString("test1"));

    @Test
    public void getPutTest() {
        ByteCache testCache = new ByteCache(1024);
        testCache.put(TEST_KEY, TEST_VALUE);
        Assert.assertEquals("ByteCache values match", TEST_VALUE, testCache.get(TEST_KEY));
    }
}
