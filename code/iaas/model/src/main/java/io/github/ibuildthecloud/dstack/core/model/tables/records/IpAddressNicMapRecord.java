/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "ip_address_nic_map", schema = "dstack")
public class IpAddressNicMapRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.IpAddressNicMapRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record9<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String>, io.github.ibuildthecloud.dstack.core.model.IpAddressNicMap {

	private static final long serialVersionUID = 1012133680;

	/**
	 * Setter for <code>dstack.ip_address_nic_map.id</code>. 
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.ip_address_nic_map.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.ip_address_nic_map.state</code>. 
	 */
	@Override
	public void setState(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.ip_address_nic_map.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.ip_address_nic_map.nic_id</code>. 
	 */
	@Override
	public void setNicId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.ip_address_nic_map.nic_id</code>. 
	 */
	@javax.persistence.Column(name = "nic_id", precision = 19)
	@Override
	public java.lang.Long getNicId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>dstack.ip_address_nic_map.account_id</code>. 
	 */
	@Override
	public void setAccountId(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.ip_address_nic_map.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>dstack.ip_address_nic_map.ip_address_id</code>. 
	 */
	@Override
	public void setIpAddressId(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.ip_address_nic_map.ip_address_id</code>. 
	 */
	@javax.persistence.Column(name = "ip_address_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getIpAddressId() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>dstack.ip_address_nic_map.created</code>. 
	 */
	@Override
	public void setCreated(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.ip_address_nic_map.created</code>. 
	 */
	@javax.persistence.Column(name = "created", nullable = false)
	@Override
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>dstack.ip_address_nic_map.removed</code>. 
	 */
	@Override
	public void setRemoved(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dstack.ip_address_nic_map.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	@Override
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>dstack.ip_address_nic_map.uuid</code>. 
	 */
	@Override
	public void setUuid(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dstack.ip_address_nic_map.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", nullable = false, length = 128)
	@Override
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>dstack.ip_address_nic_map.kind</code>. 
	 */
	@Override
	public void setKind(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dstack.ip_address_nic_map.kind</code>. 
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 128)
	@Override
	public java.lang.String getKind() {
		return (java.lang.String) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.core.model.tables.IpAddressNicMapTable.IP_ADDRESS_NIC_MAP.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.core.model.tables.IpAddressNicMapTable.IP_ADDRESS_NIC_MAP.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return io.github.ibuildthecloud.dstack.core.model.tables.IpAddressNicMapTable.IP_ADDRESS_NIC_MAP.NIC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return io.github.ibuildthecloud.dstack.core.model.tables.IpAddressNicMapTable.IP_ADDRESS_NIC_MAP.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return io.github.ibuildthecloud.dstack.core.model.tables.IpAddressNicMapTable.IP_ADDRESS_NIC_MAP.IP_ADDRESS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return io.github.ibuildthecloud.dstack.core.model.tables.IpAddressNicMapTable.IP_ADDRESS_NIC_MAP.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return io.github.ibuildthecloud.dstack.core.model.tables.IpAddressNicMapTable.IP_ADDRESS_NIC_MAP.REMOVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return io.github.ibuildthecloud.dstack.core.model.tables.IpAddressNicMapTable.IP_ADDRESS_NIC_MAP.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return io.github.ibuildthecloud.dstack.core.model.tables.IpAddressNicMapTable.IP_ADDRESS_NIC_MAP.KIND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getNicId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getIpAddressId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getRemoved();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getKind();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IpAddressNicMapRecord value1(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IpAddressNicMapRecord value2(java.lang.String value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IpAddressNicMapRecord value3(java.lang.Long value) {
		setNicId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IpAddressNicMapRecord value4(java.lang.Long value) {
		setAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IpAddressNicMapRecord value5(java.lang.Long value) {
		setIpAddressId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IpAddressNicMapRecord value6(java.sql.Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IpAddressNicMapRecord value7(java.sql.Timestamp value) {
		setRemoved(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IpAddressNicMapRecord value8(java.lang.String value) {
		setUuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IpAddressNicMapRecord value9(java.lang.String value) {
		setKind(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IpAddressNicMapRecord values(java.lang.Long value1, java.lang.String value2, java.lang.Long value3, java.lang.Long value4, java.lang.Long value5, java.sql.Timestamp value6, java.sql.Timestamp value7, java.lang.String value8, java.lang.String value9) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.github.ibuildthecloud.dstack.core.model.IpAddressNicMap from) {
		setId(from.getId());
		setState(from.getState());
		setNicId(from.getNicId());
		setAccountId(from.getAccountId());
		setIpAddressId(from.getIpAddressId());
		setCreated(from.getCreated());
		setRemoved(from.getRemoved());
		setUuid(from.getUuid());
		setKind(from.getKind());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.github.ibuildthecloud.dstack.core.model.IpAddressNicMap> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IpAddressNicMapRecord
	 */
	public IpAddressNicMapRecord() {
		super(io.github.ibuildthecloud.dstack.core.model.tables.IpAddressNicMapTable.IP_ADDRESS_NIC_MAP);
	}

	/**
	 * Create a detached, initialised IpAddressNicMapRecord
	 */
	public IpAddressNicMapRecord(java.lang.Long id, java.lang.String state, java.lang.Long nicId, java.lang.Long accountId, java.lang.Long ipAddressId, java.sql.Timestamp created, java.sql.Timestamp removed, java.lang.String uuid, java.lang.String kind) {
		super(io.github.ibuildthecloud.dstack.core.model.tables.IpAddressNicMapTable.IP_ADDRESS_NIC_MAP);

		setValue(0, id);
		setValue(1, state);
		setValue(2, nicId);
		setValue(3, accountId);
		setValue(4, ipAddressId);
		setValue(5, created);
		setValue(6, removed);
		setValue(7, uuid);
		setValue(8, kind);
	}
}