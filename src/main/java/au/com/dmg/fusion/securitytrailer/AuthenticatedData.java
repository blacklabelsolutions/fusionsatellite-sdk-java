/*
 * Copyright (c) 2021. DatameshGroup
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package au.com.dmg.fusion.securitytrailer;

import com.squareup.moshi.Json;
import org.jetbrains.annotations.NotNull;

public class AuthenticatedData {
    @Json(name = "Version")
    private final String version;
    @Json(name = "Recipient")
    private final Recipient recipient;

    public AuthenticatedData(String version, Recipient recipient) {
        if (version == null) {
            version = "";
        }
        if (recipient == null) {
            throw new NullPointerException("Error recipient cannot be null.");
        }
        this.version = version;
        this.recipient = recipient;
    }

    @NotNull
    public String getVersion() {
        return version;
    }

    @NotNull
    public Recipient getRecipient() {
        return recipient;
    }
}
