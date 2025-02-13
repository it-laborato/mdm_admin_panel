/*
 *
 * MDM-Lab: Android MDM Software
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

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.hmdm.persistence.domain.Customer;
import com.hmdm.persistence.domain.Settings;
import com.hmdm.persistence.domain.UsageStats;
import com.hmdm.persistence.domain.User;
import com.hmdm.persistence.mapper.CommonMapper;
import com.hmdm.persistence.mapper.CustomerMapper;
import com.hmdm.persistence.mapper.DeviceMapper;
import com.hmdm.persistence.mapper.UsageStatsMapper;
import com.hmdm.security.SecurityContext;
import com.hmdm.security.SecurityException;

@Singleton
public class UsageStatsDAO {

    private final UsageStatsMapper mapper;

    @Inject
    public UsageStatsDAO(UsageStatsMapper mapper) {
        this.mapper = mapper;
    }

    public void insertUsageStats(UsageStats usageStats) {
        mapper.insert(usageStats);
    }
}
