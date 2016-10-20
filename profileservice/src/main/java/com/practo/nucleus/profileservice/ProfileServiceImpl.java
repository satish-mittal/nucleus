package com.practo.nucleus.profileservice;

import java.util.List;

import org.apache.thrift.TException;

import com.practo.nucleus.profile.ProfileInfo;
import com.practo.nucleus.profile.ProfileService;

public class ProfileServiceImpl implements ProfileService.Iface {

public ProfileServiceImpl() {
		// initialize the service dependencies
	}
	public void createProfile(long accountId, long profileId) {

	}
	@Override
	public long addProfile(long arg0, String arg1, String arg2) throws TException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Long> getAllProfiles(long arg0) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProfileInfo getProfileInfo(long arg0) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProfileInfo(long arg0, ProfileInfo arg1) throws TException {
		// TODO Auto-generated method stub
		
	}
}
