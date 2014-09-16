package com.notedpath.linode;

/**
 * Enumeration of available API actions the Linode API supports
 * 
 * @author theodore nguyen-cao
 * 
 */
public enum API_ACTION {
    AVAIL_DATACENTERS, AVAIL_KERNELS, AVAIL_LINODEPLANS, AVAIL_DISTRIBUTIONS, DOMAIN_UPDATE, DOMAIN_CREATE, DOMAIN_LIST, DOMAIN_DELETE, DOMAIN_RESOURCE_CREATE, DOMAIN_RESOURCE_DELETE, DOMAIN_RESOURCE_UPDATE, DOMAIN_RESOURCE_LIST, LINODE_UPDATE, LINODE_BOOT, LINODE_CLONE, LINODE_CREATE, LINODE_REBOOT, LINODE_DELETE, LINODE_RESIZE, LINODE_LIST, LINODE_CONFIG_UPDATE, LINODE_CONFIG_CREATE, LINODE_CONFIG_LIST, LINODE_CONFIG_DELETE, LINODE_DISK_UPDATE, LINODE_DISK_CREATE, LINODE_DISK_LIST, LINODE_DISK_CREATEFROMDISTRIBUTION, LINODE_DISK_DUPLICATE, LINODE_DISK_DELETE, LINODE_DISK_RESIZE, LINODE_IP_LIST, LINODE_JOB_LIST, USER_GETAPIKEY, TEST_ECHO;

	public String getActionName() {
		return toString().toLowerCase().replaceAll("_", ".");
	}
}
