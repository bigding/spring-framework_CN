/*
 * Copyright 2002-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.lang;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierNickname;
import javax.annotation.meta.When;

/**
 * A common Spring annotation to declare that annotated elements can be {@code null} under
 * some circumstance.
 *
 * <p>Leverages JSR-305 meta-annotations to indicate nullability in Java to common
 * tools with JSR-305 support and used by Kotlin to infer nullability of Spring API.
 *
 * <p>Should be used at parameter, return value, and field level. Methods override should
 * repeat parent {@code @Nullable} annotations unless they behave differently.
 *
 * <p>Can be used in association with {@code @NonNullApi} or {@code @NonNullFields} to
 * override the default non-nullable semantic to nullable.
 *
 * <p>一个通用的spring注解,声明了在某些环境下可以为null的元素.
 *
 * <p>利用JSR-305元注解去表示支持JSR-305的通用工具在java中是否为空,并且被用来在Kotlin指示spring API是否为空.
 *
 * <p>应该被使用在参数,返回值和字段中.重写方法时应该保留父方法的{@code @Nullable},除非子方法和父方法行为不同.
 *
 * <p>可以和{@code @NonNullApi} 或 {@code @NonNullFields}一同使用去重写默认非空的语义,使其为空.
 *
 * @author Sebastien Deleuze
 * @author Juergen Hoeller
 * @since 5.0
 * @see NonNullApi
 * @see NonNullFields
 * @see NonNull
 */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Nonnull(when = When.MAYBE)
@TypeQualifierNickname
public @interface Nullable {
}
