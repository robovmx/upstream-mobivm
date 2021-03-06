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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INStartWorkoutIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INStartWorkoutIntentPtr extends Ptr<INStartWorkoutIntent, INStartWorkoutIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INStartWorkoutIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INStartWorkoutIntent() {}
    protected INStartWorkoutIntent(Handle h, long handle) { super(h, handle); }
    protected INStartWorkoutIntent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithWorkoutName:goalValue:workoutGoalUnitType:workoutLocationType:isOpenEnded:")
    public INStartWorkoutIntent(INSpeakableString workoutName, NSNumber goalValue, INWorkoutGoalUnitType workoutGoalUnitType, INWorkoutLocationType workoutLocationType, NSNumber isOpenEnded) { super((SkipInit) null); initObject(init(workoutName, goalValue, workoutGoalUnitType, workoutLocationType, isOpenEnded)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "workoutName")
    public native INSpeakableString getWorkoutName();
    @Property(selector = "goalValue")
    public native NSNumber getGoalValue();
    @Property(selector = "workoutGoalUnitType")
    public native INWorkoutGoalUnitType getWorkoutGoalUnitType();
    @Property(selector = "workoutLocationType")
    public native INWorkoutLocationType getWorkoutLocationType();
    @Property(selector = "isOpenEnded")
    public native NSNumber getIsOpenEnded();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithWorkoutName:goalValue:workoutGoalUnitType:workoutLocationType:isOpenEnded:")
    protected native @Pointer long init(INSpeakableString workoutName, NSNumber goalValue, INWorkoutGoalUnitType workoutGoalUnitType, INWorkoutLocationType workoutLocationType, NSNumber isOpenEnded);
    /*</methods>*/
}
