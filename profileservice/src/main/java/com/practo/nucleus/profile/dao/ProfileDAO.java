package com.practo.nucleus.profile.dao;

import java.util.List;

import com.practo.nucleus.profile.ProfileInfo;

public interface ProfileDAO {

	public void addProfile(long accountId, String profileName, String profileRelationShip);

	List<Long> getAllProfiles(long accountId);

	ProfileInfo getProfile(long profileId);

	void updateProfile(long profileId, ProfileInfo profileInfo);
}
