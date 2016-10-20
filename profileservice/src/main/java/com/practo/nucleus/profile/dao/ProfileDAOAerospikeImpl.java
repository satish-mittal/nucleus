package com.practo.nucleus.profile.dao;

import java.util.List;

import com.aerospike.client.AerospikeClient;
import com.practo.nucleus.profile.ProfileInfo;

public class ProfileDAOAerospikeImpl implements ProfileDAO {
	private AerospikeClient client;
	
	public ProfileDAOAerospikeImpl() {
		client = new AerospikeClient("10.0.1.10", 3000);
	}

	@Override
	public void addProfile(long accountId, String profileName, String profileRelationShip) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Long> getAllProfiles(long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProfileInfo getProfile(long profileId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProfile(long profileId, ProfileInfo profileInfo) {
		// TODO Auto-generated method stub
	}

}
