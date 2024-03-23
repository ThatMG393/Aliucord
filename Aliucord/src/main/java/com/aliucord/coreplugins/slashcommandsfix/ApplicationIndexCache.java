/*
 * This file is part of Aliucord, an Android Discord client mod.
 * Copyright (c) 2021 Juby210 & Vendicated
 * Licensed under the Open Software License version 3.0
 */

package com.aliucord.coreplugins.slashcommandsfix;

import java.util.HashMap;
import java.util.Map;

class ApplicationIndexCache {
    public Map<Long, ApplicationIndex> guild;
    public Map<Long, ApplicationIndex> dm;

    public ApplicationIndexCache() {
        this.guild = new HashMap<>();
        this.dm = new HashMap<>();
    }
}
