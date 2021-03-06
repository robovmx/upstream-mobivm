/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.metalps;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSIntegerDivisionParams/*</name>*/ 
    extends /*<extends>*/Struct<MPSIntegerDivisionParams>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSIntegerDivisionParamsPtr extends Ptr<MPSIntegerDivisionParams, MPSIntegerDivisionParamsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSIntegerDivisionParams() {}
    public MPSIntegerDivisionParams(short divisor, short recip, short addend, short shift) {
        this.setDivisor(divisor);
        this.setRecip(recip);
        this.setAddend(addend);
        this.setShift(shift);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native short getDivisor();
    @StructMember(0) public native MPSIntegerDivisionParams setDivisor(short divisor);
    @StructMember(1) public native short getRecip();
    @StructMember(1) public native MPSIntegerDivisionParams setRecip(short recip);
    @StructMember(2) public native short getAddend();
    @StructMember(2) public native MPSIntegerDivisionParams setAddend(short addend);
    @StructMember(3) public native short getShift();
    @StructMember(3) public native MPSIntegerDivisionParams setShift(short shift);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
