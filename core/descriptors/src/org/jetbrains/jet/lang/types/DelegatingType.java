/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.lang.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.lang.descriptors.annotations.Annotations;
import org.jetbrains.jet.lang.resolve.scopes.JetScope;

import java.util.List;

public abstract class DelegatingType implements JetType {
    protected abstract JetType getDelegate();

    @NotNull
    @Override
    public TypeConstructor getConstructor() {
        return getDelegate().getConstructor();
    }

    @Override
    @NotNull
    public JetType getUpperBound() {
        return getDelegate().getUpperBound();
    }

    @Override
    @NotNull
    public JetType getLowerBound() {
        return getDelegate().getLowerBound();
    }

    @Override
    public boolean isFlexible() {
        return getDelegate().isFlexible();
    }

    @NotNull
    @Override
    public List<TypeProjection> getArguments() {
        return getDelegate().getArguments();
    }

    @Override
    public boolean isNullable() {
        return getDelegate().isNullable();
    }

    @NotNull
    @Override
    public JetScope getMemberScope() {
        return getDelegate().getMemberScope();
    }

    @Override
    public boolean isError() {
        return getDelegate().isError();
    }

    @NotNull
    @Override
    public Annotations getAnnotations() {
        return getDelegate().getAnnotations();
    }

    @Override
    public int hashCode() {
        return getDelegate().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return getDelegate().equals(obj);
    }

    @Override
    public String toString() {
        return getDelegate().toString();
    }
}
