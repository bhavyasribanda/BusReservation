package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.MyConnection;
import com.dto.Bus;

public class BusDAOJ {
	public List<Bus> getAllBuses(String source, String destination) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		System.out.println(source);
		System.out.println(destination);
		final String SELECT_QUERY="select * from Bus where source=? and destination=?";
		con = MyConnection.getConnection();
		List <Bus> arrayList=new ArrayList<Bus>();
		try {
				pst = con.prepareStatement(SELECT_QUERY);
				pst.setString(1, source);
				pst.setString(2, destination);
			pst = con.prepareStatement(SELECT_QUERY);			
			rs = pst.executeQuery();
			while(rs.next()) {
				Bus bus = new Bus();
				bus.setBusId(rs.getInt(1));
				bus.setBusType(rs.getString(2));
				bus.setSource(rs.getString(3));
				bus.setDestination(rs.getString(4));
				bus.setDepart(rs.getString(5));	
				bus.setArrival(rs.getString(6));
				bus.setPrice(rs.getInt(8));	
				bus.setSeats(rs.getInt(7));	
				arrayList.add(bus);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	return arrayList;	
	}
	public int register(Bus bus) {
		Connection con = null;
		PreparedStatement pst = null;
		final String INSERT_QUERY="insert into bus(Bus_Id,bus_Type,source,destination,depart,arrival,seats,price) values(?,?,?,?,?,?,?,?)";
		con = MyConnection.getConnection();
		int x = 0;
		try {
			pst = con.prepareStatement(INSERT_QUERY);
			pst.setInt(1, bus.getBusId());
			pst.setString(2, bus.getBusType());
			pst.setString(3, bus.getSource());
			pst.setString(4, bus.getDestination());
			pst.setString(5, bus.getDepart());
			pst.setString(6, bus.getArrival());
			pst.setInt(7, bus.getSeats());
			pst.setInt(8, bus.getPrice());
			
			x = pst.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;		
		
	}
}
