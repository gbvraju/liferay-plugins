/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.sync.engine.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import com.liferay.sync.engine.service.persistence.BasePersistenceImpl;

/**
 * @author Shinn Lok
 */
@DatabaseTable(daoClass = BasePersistenceImpl.class, tableName = "Site")
public class Site {

	public long getAccountId() {
		return accountId;
	}

	public String getFilePath() {
		return filePath;
	}

	public long getGroupId() {
		return groupId;
	}

	public long getSiteId() {
		return siteId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public void setSiteId(long siteId) {
		this.siteId = siteId;
	}

	@DatabaseField(useGetSet = true)
	protected long accountId;

	@DatabaseField(useGetSet = true, width = 16777216)
	protected String filePath;

	@DatabaseField(useGetSet = true)
	protected long groupId;

	@DatabaseField(generatedId = true, useGetSet = true)
	protected long siteId;

}