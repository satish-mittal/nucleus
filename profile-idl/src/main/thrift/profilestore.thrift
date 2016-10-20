namespace java com.practo.nucleus.profile

struct ProfileEntry {
  1: required i64 profileId;
  2: required string profileName;
  3: required string profileRelationship;
}

struct AccountProfiles {
  1: required i64 AccountId;
  2: required list<ProfileEntry> profiles;
}