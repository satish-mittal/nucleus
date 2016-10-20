namespace java com.practo.nucleus.record

typedef i64 ProfileId
typedef i64 RecordId

enum RecordType {
  PRESCRIPTION,
  DIAGNOSTIC,
  BILL
}

union RecordPayload {
}

service RecordService {
  RecordId addRecord(1:ProfileId profileId, 2:RecordType recordType, 3:RecordPayload record, 4:bool confirmed);

  list<RecordPayload> getAllRecords(1:ProfileId profileId);

  void transferAllRecords(1:ProfileId oldProfileId, 2:ProfileId newProfileId);

  void transferRecord(1:RecordId recordId, 2:ProfileId oldProfileId, 3:ProfileId newProfileId);

  void updateRecord(1:ProfileId profileId, 2:RecordType recordType, 3:RecordPayload record);
}
