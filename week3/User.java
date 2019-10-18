import java.util.*;

public class User 
{
	private Long id;
	private String userName;
	private String password;
	private boolean active;
	private Set<Role> roles;

	public User(String username, String password, boolean active, Set<Role> roles)
	{
        super();
        this.userName = username;
        this.password = password;
        this.active = active;
        this.roles = roles;
    }

    public void setId(Long id)
    {
    	this.id = id;
    }

    public Long getId()
    {
    	return id;
    }
    //================
    
    public void setUserName(String userName)
    {
    	this.userName = userName;
    }

    public String getUserName()
    {
    	return userName;
    }

    //========================

    public void setPassword(String password)
    {
    	this.password = password;
    }

    public String getPassword()
    {
    	return password;
    }

    //===========================

    public void setActive(boolean active)
    {
    	this.active = active;
    }

    public boolean isActive()
    {
    	return active;
    }

    //===========================

    public void setRoles(Set<Role> roles)
    {
    	this.roles = roles;
    }

    public Set<Role> getRoles()
    {
    	return roles;
    }

    public String toString()
    {
    	return "id: "+id+"\nUser Name: "+userName+"\nPassword: "+password+"\nRoles: "+roles+"";
    }
}