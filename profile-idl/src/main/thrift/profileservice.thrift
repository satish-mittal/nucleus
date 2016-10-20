namespace java com.practo.nucleus.profile

typedef i64 AccountId
typedef i64 ProfileId

struct AccountInfo {
}

struct MedicalInfo {
}

struct BiometricInfo {
}

struct ProfileInfo {
  1: required AccountInfo accountInfo;
  2: optional MedicalInfo medicalInfo;
  3: optional BiometricInfo biometricInfo;
}

service ProfileService {
  ProfileId addProfile(1:AccountId accountId, 2:string profileName, 3: string profileRelationShip);

  list<ProfileId> getAllProfiles(1:AccountId accountId);

  ProfileInfo getProfile(1:ProfileId profileId);

  void updateProfile(1:ProfileId profileId, 2:ProfileInfo profileInfo);
}
