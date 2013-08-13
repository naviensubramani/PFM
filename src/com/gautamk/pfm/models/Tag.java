package com.gautamk.pfm.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * User: gautam
 * Date: 13/8/13
 * Time: 10:01 AM
 */
@DatabaseTable(tableName = "tag")
public class Tag {

	@DatabaseField(id = true)
	String name;

	@DatabaseField(foreign = true,foreignAutoCreate = true)
	Tag parent;


}
