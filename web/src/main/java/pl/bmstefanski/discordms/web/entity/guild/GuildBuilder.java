package pl.bmstefanski.discordms.web.entity.guild;

import pl.bmstefanski.discordms.web.util.Buildable;

public class GuildBuilder implements Buildable<GuildEntityImpl> {

  private boolean owner;
  private long permissions;
  private String icon;
  private long identifier;
  private String name;

  public GuildBuilder withOwner(boolean owner) {
    this.owner = owner;
    return this;
  }

  public GuildBuilder withPermissions(long permissions) {
    this.permissions = permissions;
    return this;
  }

  public GuildBuilder withIcon(String icon) {
    this.icon = icon;
    return this;
  }

  public GuildBuilder withIdentifier(long identifier) {
    this.identifier = identifier;
    return this;
  }

  public GuildBuilder withName(String name) {
    this.name = name;
    return this;
  }

  @Override
  public GuildEntityImpl build() {
    return new GuildEntityImpl(this.owner, this.permissions, this.icon, this.identifier, this.name);
  }

}
