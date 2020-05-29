package com.ioglyph.castor.core.command;

import com.ioglyph.castor.core.profile.Profile;

public interface CreateProfile {
    Profile forUser(String username, String email);
}
