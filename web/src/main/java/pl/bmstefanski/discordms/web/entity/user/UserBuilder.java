package pl.bmstefanski.discordms.web.entity.user;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.security.core.GrantedAuthority;
import pl.bmstefanski.discordms.web.entity.guild.GuildEntityImpl;
import pl.bmstefanski.discordms.web.util.Buildable;

public class UserBuilder implements Buildable<UserEntityImpl> {

  private long identifier;
  private String username;
  private int discriminator;
  private String avatarHash;
  private String locale;
  private String email;
  private LocalDateTime created;
  private LocalDateTime lastLogin;
  private Set<GrantedAuthority> authorities;
  private Map<String, Object> attributes;
  private List<GuildEntityImpl> guildEntities;
  private String firstName;
  private String secondName;
  private String description;
  private LocalDate birthDay;

  public UserBuilder() {
    this.firstName = "N/A";
    this.secondName = "N/A";
    this.description = "N/A";
  }

  public UserBuilder withIdentifier(long identifier) {
    this.identifier = identifier;
    return this;
  }

  public UserBuilder withUsername(String username) {
    this.username = username;
    return this;
  }

  public UserBuilder withDiscriminator(int discriminator) {
    this.discriminator = discriminator;
    return this;
  }

  public UserBuilder withAvatarHash(String avatarHash) {
    this.avatarHash = avatarHash;
    return this;
  }

  public UserBuilder withLocale(String locale) {
    this.locale = locale;
    return this;
  }

  public UserBuilder withEmail(String email) {
    this.email = email;
    return this;
  }

  public UserBuilder withCreated(LocalDateTime created) {
    this.created = created;
    return this;
  }

  public UserBuilder withLastLogin(LocalDateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

  public UserBuilder withAuthorities(Set<GrantedAuthority> authorities) {
    this.authorities = authorities;
    return this;
  }

  public UserBuilder withAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public UserBuilder withGuildEntities(List<GuildEntityImpl> guildEntities) {
    this.guildEntities = guildEntities;
    return this;
  }

  public UserBuilder withFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public UserBuilder withSecondName(String secondName) {
    this.secondName = secondName;
    return this;
  }

  public UserBuilder withDescription(String description) {
    this.description = description;
    return this;
  }

  public UserBuilder withBirthDay(LocalDate birthDay) {
    this.birthDay = birthDay;
    return this;
  }

  @Override
  public UserEntityImpl build() {
    return new UserEntityImpl(this.identifier, this.discriminator, this.username, this.avatarHash,
        this.locale, this.email, this.firstName, this.secondName, this.description, this.birthDay,
        this.created, this.lastLogin, this.authorities, this.attributes, this.guildEntities);
  }

}
