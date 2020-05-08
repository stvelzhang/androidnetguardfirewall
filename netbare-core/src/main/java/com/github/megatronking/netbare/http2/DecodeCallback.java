/*  NetBare - An android network capture and injection library.
 *  Copyright (C) 2018-2019 Megatron King
 *  Copyright (C) 2018-2019 GuoShi
 *
 *  NetBare is free software: you can redistribute it and/or modify it under the terms
 *  of the GNU General Public License as published by the Free Software Found-
 *  ation, either version 3 of the License, or (at your option) any later version.
 *
 *  NetBare is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 *  PURPOSE. See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along with NetBare.
 *  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.megatronking.netbare.http2;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * A callback for HTTP2 header and data decodes.
 *
 * @author Megatron King
 * @since 2019/1/5 20:36
 */
/* package */ interface DecodeCallback {

    void onPending(ByteBuffer buffer);

    void onResult(ByteBuffer buffer, boolean isFinished) throws IOException;

    void onSkip(ByteBuffer buffer) throws IOException;

}
