package com.stech.DAOI;

import com.stech.vo.User;

public interface UserDAOI {
	User findUser(String accessCode);
}
