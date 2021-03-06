package com.dodo.project.rebate.rebot.dao.system.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSystemUserGroupRole<M extends BaseSystemUserGroupRole<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setUserGroupId(java.lang.Integer userGroupId) {
		set("user_group_id", userGroupId);
	}
	
	public java.lang.Integer getUserGroupId() {
		return getInt("user_group_id");
	}

	public void setRoleId(java.lang.Integer roleId) {
		set("role_id", roleId);
	}
	
	public java.lang.Integer getRoleId() {
		return getInt("role_id");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
