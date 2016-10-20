package com.practo.nucleus.profile.service;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import com.practo.nucleus.profile.ProfileService;

public class ProfileClient {

	public static void main(String[] args) {
		try {
			TTransport transport = new TSocket("localhost", 9090);
			transport.open();
			TProtocol protocol = new TBinaryProtocol(transport);
			ProfileService.Client client = new ProfileService.Client(protocol);

			//client.createProfile(0);
			System.out.println("created profile");
		} catch (TException e) {
			e.printStackTrace();
		}
	}
}
