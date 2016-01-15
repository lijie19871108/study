package com.TYYJ.springaop;

import org.springframework.beans.factory.annotation.Autowired;

public interface UserDAO {



    public void saveUser(final User user);

    public User getUser(final long id);

	
	
}
