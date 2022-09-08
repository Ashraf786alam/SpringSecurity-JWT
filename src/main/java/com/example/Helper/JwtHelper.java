package com.example.Helper;

public class JwtHelper {
	
	private static final long serialVersionUID=-2550185165626007488L;
	
	public static final long JWT_TOKEN_VALIDITY=5*60*60;
	
	private String secret="java";
	
	public String getUsernameFromToken(String token) {
		
		return getClaimFromToken(token);
		
	}

	private String getClaimFromToken(String token,Function<Claims,T> claimResolver) {
		// TODO Auto-generated method stub
		return null;
	}

}
