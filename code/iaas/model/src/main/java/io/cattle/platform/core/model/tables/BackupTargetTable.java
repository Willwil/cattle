/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BackupTargetTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.BackupTargetRecord> {

	private static final long serialVersionUID = -458497012;

	/**
	 * The singleton instance of <code>cattle.backup_target</code>
	 */
	public static final io.cattle.platform.core.model.tables.BackupTargetTable BACKUP_TARGET = new io.cattle.platform.core.model.tables.BackupTargetTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.BackupTargetRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.BackupTargetRecord.class;
	}

	/**
	 * The column <code>cattle.backup_target.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.BackupTargetRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.backup_target.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.BackupTargetRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.backup_target.account_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.BackupTargetRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.backup_target.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.BackupTargetRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.backup_target.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.BackupTargetRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.backup_target.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.BackupTargetRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.backup_target.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.BackupTargetRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.backup_target.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.BackupTargetRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.backup_target.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.BackupTargetRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.backup_target.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.BackupTargetRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.backup_target.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.BackupTargetRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(65535).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * Create a <code>cattle.backup_target</code> table reference
	 */
	public BackupTargetTable() {
		this("backup_target", null);
	}

	/**
	 * Create an aliased <code>cattle.backup_target</code> table reference
	 */
	public BackupTargetTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.BackupTargetTable.BACKUP_TARGET);
	}

	private BackupTargetTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.BackupTargetRecord> aliased) {
		this(alias, aliased, null);
	}

	private BackupTargetTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.BackupTargetRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.BackupTargetRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_BACKUP_TARGET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.BackupTargetRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_BACKUP_TARGET_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.BackupTargetRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.BackupTargetRecord>>asList(io.cattle.platform.core.model.Keys.KEY_BACKUP_TARGET_PRIMARY, io.cattle.platform.core.model.Keys.KEY_BACKUP_TARGET_IDX_BACKUP_TARGET_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.BackupTargetRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.BackupTargetRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_BACKUP_TARGET__ACCOUNT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.BackupTargetTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.BackupTargetTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.BackupTargetTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.BackupTargetTable(name, null);
	}
}
