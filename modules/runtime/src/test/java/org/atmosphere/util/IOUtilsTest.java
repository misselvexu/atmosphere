/*
 * Copyright 2008-2019 Async-IO.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.atmosphere.util;

import org.testng.annotations.Test;

import static org.atmosphere.util.IOUtils.getCleanedServletPath;
import static org.testng.Assert.assertEquals;

/**
 * Created by Romain on 17/03/14.
 */
public class IOUtilsTest {

    @Test
    public void testGetCleanedServletPath() {
        assertEquals(getCleanedServletPath("/foo/bar/*"), "/foo/bar");
        assertEquals(getCleanedServletPath("/foo/bar/"), "/foo/bar");
        assertEquals(getCleanedServletPath("foo"), "/foo");
        assertEquals(getCleanedServletPath("/foo/"), "/foo");
        assertEquals(getCleanedServletPath("foo/bar/**/*"), "/foo/bar/**");
        assertEquals(getCleanedServletPath("/com.zyxabc.abc.Abc/gwtCometEvent*"), "/com.zyxabc.abc.Abc/gwtCometEvent");
        assertEquals(getCleanedServletPath("/com.abc_Abc-abc/"), "/com.abc_Abc-abc");
        assertEquals(getCleanedServletPath("/com.abc_Abc-abc+bca/"), "/com.abc_Abc-abc+bca");
    }

}
