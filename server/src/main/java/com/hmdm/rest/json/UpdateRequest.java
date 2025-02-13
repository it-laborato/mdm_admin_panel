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

package com.hmdm.rest.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateRequest {
    private boolean update;
    private boolean sendStats;
    private List<UpdateEntry> updates;

    public UpdateRequest() {
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public boolean isSendStats() {
        return sendStats;
    }

    public void setSendStats(boolean sendStats) {
        this.sendStats = sendStats;
    }

    public List<UpdateEntry> getUpdates() {
        return updates;
    }

    public void setUpdates(List<UpdateEntry> updates) {
        this.updates = updates;
    }
}
