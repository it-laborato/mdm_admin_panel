/*
 *
 * MDM-Lab: Open Source Android MDM Software
 * https://laborato.org
 *
*
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.hmdm.persistence;

/**
 * <p>An exception to be thrown by DAO implementations in case an internal error occurs which prevents the method from
 * successful execution.</p>
 *
 * @author isv
 */
public class DAOException extends RuntimeException {

    /**
     * <p>Constructs new <code>DAOException</code> instance. This implementation does nothing.</p>
     */
    public DAOException(String message) {
        super(message);
    }

}
