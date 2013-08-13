package com.gautamk.pfm.models;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * User: gautam
 * Date: 13/8/13
 * Time: 9:30 AM
 */
@DatabaseTable(tableName = "transaction")
public class Transaction {
	public enum Type {
		Income("Income"),
		Expense("Expense");
		private String type;
		private Type(String type){
			this.type = type;
		}
		@Override
		public String toString() {
			return type;
		}
	}

	@DatabaseField(generatedId = true)
	int id;

	@DatabaseField(index = true)
	float amount;

	@DatabaseField(defaultValue = "")
	String note;

	@DatabaseField(dataType = DataType.ENUM_STRING, index = true)
	Type transactionType;

	@DatabaseField(index = true)
	Date date;

	@ForeignCollectionField(eager = true)
	ForeignCollection<Tag> tags;



	public Transaction() {}

}
