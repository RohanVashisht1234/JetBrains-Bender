// Copyright 2000-2022 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.TokenSet;

public interface BendTokenSets {

  TokenSet IDENTIFIERS = TokenSet.create(BendTypes.KEY);

  TokenSet COMMENTS = TokenSet.create(BendTypes.COMMENT);

}
