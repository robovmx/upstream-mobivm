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
package org.robovm.apple.homekit;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMService/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMServicePtr extends Ptr<HMService, HMServicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMService.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HMService() {}
    protected HMService(Handle h, long handle) { super(h, handle); }
    protected HMService(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "accessory")
    public native HMAccessory getAccessory();
    @Property(selector = "serviceType")
    public native HMServiceType getServiceType();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "associatedServiceType")
    public native HMServiceType getAssociatedServiceType();
    @Property(selector = "characteristics")
    public native NSArray<HMCharacteristic> getCharacteristics();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "uniqueIdentifier")
    public native NSUUID getUniqueIdentifier();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "isUserInteractive")
    public native boolean isUserInteractive();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "isPrimaryService")
    public native boolean isPrimaryService();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "linkedServices")
    public native NSArray<HMService> getLinkedServices();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "updateName:completionHandler:")
    public native void updateName(String name, @Block VoidBlock1<NSError> completion);
    @Method(selector = "updateAssociatedServiceType:completionHandler:")
    public native void updateAssociatedServiceType(HMServiceType serviceType, @Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
