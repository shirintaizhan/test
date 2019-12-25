package com.shop.demo.model;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.*;


    @Entity
    @Table(name = "users")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "user_id" )
        private long userId;

        @Column(name = "email")
        private String email;

        @Column(name = "user_password")
        private String password;

        @Column(name = "user_active")
        private boolean active;

        @OneToOne(fetch = FetchType.EAGER)
        @GeneratedValue(generator = "customer_id")
        @JoinColumn(name = "ccustomer_id")

        @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
        @CollectionTable(name = "user_role",joinColumns = @JoinColumn(name = "user_id"))
        @Enumerated(EnumType.STRING)
        private Set<Role> roles;

        public User() { }

        public User(String email, String password, boolean active) {
            this.email = email;
            this.password = password;
            this.active = active;
        }

        public User( String email, String password, boolean active, Set<Role> roles) {
            this( email, password, active);
            this.roles = roles;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public boolean getActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }

        public Set<Role> getRoles() {
            return roles;
        }

        public void setRoles(Set<Role> roles) {
            this.roles = roles;
        }

        public String toString() {
            return "id: "+userId+"\nUser Name: "+ email +"\nPassword: "+password+"\nRoles: "+roles+"";
        }
}
