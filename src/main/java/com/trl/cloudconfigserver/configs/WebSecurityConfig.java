package com.trl.cloudconfigserver.configs;

/*@EnableWebSecurity
@Configuration*/
public class WebSecurityConfig /*extends WebSecurityConfigurerAdapter*/ {

    /*@Value("${security.superuser.name}")
    private String superUserName;

    @Value("${spring.security.user.name}")
    private String adminName;

    @Value("${security.superuser.password}")
    private String superUserPassword;

    @Value("${spring.security.user.password}")
    private String adminPassword;

    @Value("${security.superuser.role}")
    private String superUserRole;

    @Value("${spring.security.user.role}")
    private String adminRole;

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        final User.UserBuilder userBuilder = User.builder().passwordEncoder(encoder::encode);
        UserDetails user = userBuilder
                .username(adminName)
                .password(adminPassword)
                .roles(adminRole)
                .build();
        UserDetails admin = userBuilder
                .username(superUserName)
                .password(superUserPassword)
                .roles(superUserRole)
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/encrypt**").hasAnyRole(superUserRole)
                .antMatchers("/decrypt**").hasAnyRole(superUserRole)
                .anyRequest().authenticated()
                .and()
                .formLogin().disable();

        http.csrf().disable();
        http.headers().frameOptions().disable();
    }*/

}
