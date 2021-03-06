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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/
import org.robovm.apple.coretext.CTAttributedStringAttributes;

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSNumberFormatter/*</name>*/ 
    extends /*<extends>*/NSFormatter/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSNumberFormatterPtr extends Ptr<NSNumberFormatter, NSNumberFormatterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSNumberFormatter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSNumberFormatter() {}
    protected NSNumberFormatter(Handle h, long handle) { super(h, handle); }
    protected NSNumberFormatter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    @WeaklyLinked
    public NSAttributedStringAttributes getTextAttributesForNegativeValues() {
        NSDictionary dict = getTextAttributesDictionaryForNegativeValues();
        if (dict == null) {
            return null;
        }
        return new NSAttributedStringAttributes(dict);
    }
    @WeaklyLinked
    public CMTextMarkupAttributes getTextMarkupAttributesForNegativeValues() {
        NSDictionary dict = getTextAttributesDictionaryForNegativeValues();
        if (dict == null) {
            return null;
        }
        return new CMTextMarkupAttributes(dict.as(CFDictionary.class));
    }
    @WeaklyLinked
    public CTAttributedStringAttributes getCoreTextAttributesForNegativeValues() {
        NSDictionary dict = getTextAttributesDictionaryForNegativeValues();
        if (dict == null) {
            return null;
        }
        return new CTAttributedStringAttributes(dict.as(CFDictionary.class));
    }
    @WeaklyLinked
    public void setTextAttributesForNegativeValues(NSAttributedStringAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForNegativeValues(null);
        } else {
            setTextAttributesDictionaryForNegativeValues(v.getDictionary());
        }
    }
    @WeaklyLinked
    public void setTextMarkupAttributesForNegativeValues(CMTextMarkupAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForNegativeValues(null);
        } else {
            setTextAttributesDictionaryForNegativeValues(v.getDictionary().as(NSDictionary.class));
        }
    }
    @WeaklyLinked
    public void setCoreTextAttributesForNegativeValues(CTAttributedStringAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForNegativeValues(null);
        } else {
            setTextAttributesDictionaryForNegativeValues(v.getDictionary().as(NSDictionary.class));
        }
    }
    @WeaklyLinked
    public NSAttributedStringAttributes getTextAttributesForPositiveValues() {
        NSDictionary dict = getTextAttributesDictionaryForPositiveValues();
        if (dict == null) return null;
        return new NSAttributedStringAttributes(dict);
    }
    @WeaklyLinked
    public CMTextMarkupAttributes getTextMarkupAttributesForPositiveValues() {
        NSDictionary dict = getTextAttributesDictionaryForPositiveValues();
        if (dict == null) return null;
        return new CMTextMarkupAttributes(dict.as(CFDictionary.class));
    }
    @WeaklyLinked
    public CTAttributedStringAttributes getCoreTextAttributesForPositiveValues() {
        NSDictionary dict = getTextAttributesDictionaryForPositiveValues();
        if (dict == null) return null;
        return new CTAttributedStringAttributes(dict.as(CFDictionary.class));
    }
    @WeaklyLinked
    public void setTextAttributesForPositiveValues(NSAttributedStringAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForPositiveValues(null);
        } else {
            setTextAttributesDictionaryForPositiveValues(v.getDictionary());
        }
    }
    @WeaklyLinked
    public void setTextMarkupAttributesForPositiveValues(CMTextMarkupAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForPositiveValues(null);
        } else {
            setTextAttributesDictionaryForPositiveValues(v.getDictionary().as(NSDictionary.class));
        }
    }
    @WeaklyLinked
    public void setCoreTextAttributesForPositiveValues(CTAttributedStringAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForPositiveValues(null);
        } else {
            setTextAttributesDictionaryForPositiveValues(v.getDictionary().as(NSDictionary.class));
        }
    }
    @WeaklyLinked
    public NSAttributedStringAttributes getTextAttributesForZero() {
        NSDictionary dict = getTextAttributesDictionaryForZero();
        if (dict == null) return null;
        return new NSAttributedStringAttributes(dict);
    }
    @WeaklyLinked
    public CMTextMarkupAttributes getTextMarkupAttributesForZero() {
        NSDictionary dict = getTextAttributesDictionaryForZero();
        if (dict == null) return null;
        return new CMTextMarkupAttributes(dict.as(CFDictionary.class));
    }
    @WeaklyLinked
    public CTAttributedStringAttributes getCoreTextAttributesForZero() {
        NSDictionary dict = getTextAttributesDictionaryForZero();
        if (dict == null) return null;
        return new CTAttributedStringAttributes(dict.as(CFDictionary.class));
    }
    @WeaklyLinked
    public void setTextAttributesForZero(NSAttributedStringAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForZero(null);
        } else {
            setTextAttributesDictionaryForZero(v.getDictionary());
        }
    }
    @WeaklyLinked
    public void setTextMarkupAttributesForZero(CMTextMarkupAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForZero(null);
        } else {
            setTextAttributesDictionaryForZero(v.getDictionary().as(NSDictionary.class));
        }
    }
    @WeaklyLinked
    public void setCoreTextAttributesForZero(CTAttributedStringAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForZero(null);
        } else {
            setTextAttributesDictionaryForZero(v.getDictionary().as(NSDictionary.class));
        }
    }
    @WeaklyLinked
    public NSAttributedStringAttributes getTextAttributesForNull() {
        NSDictionary dict = getTextAttributesDictionaryForNull();
        if (dict == null) return null;
        return new NSAttributedStringAttributes(dict);
    }
    @WeaklyLinked
    public CMTextMarkupAttributes getTextMarkupAttributesForNull() {
        NSDictionary dict = getTextAttributesDictionaryForNull();
        if (dict == null) return null;
        return new CMTextMarkupAttributes(dict.as(CFDictionary.class));
    }
    @WeaklyLinked
    public CTAttributedStringAttributes getCoreTextAttributesForNull() {
        NSDictionary dict = getTextAttributesDictionaryForNull();
        if (dict == null) return null;
        return new CTAttributedStringAttributes(dict.as(CFDictionary.class));
    }
    @WeaklyLinked
    public void setTextAttributesForNull(NSAttributedStringAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForNull(null);
        } else {
            setTextAttributesDictionaryForNull(v.getDictionary());
        }
    }
    @WeaklyLinked
    public void setTextMarkupAttributesForNull(CMTextMarkupAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForNull(null);
        } else {
            setTextAttributesDictionaryForNull(v.getDictionary().as(NSDictionary.class));
        }
    }
    @WeaklyLinked
    public void setCoreTextAttributesForNull(CTAttributedStringAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForNull(null);
        } else {
            setTextAttributesDictionaryForNull(v.getDictionary().as(NSDictionary.class));
        }
    }
    @WeaklyLinked
    public NSAttributedStringAttributes getTextAttributesForNaN() {
        NSDictionary dict = getTextAttributesDictionaryForNaN();
        if (dict == null) return null;
        return new NSAttributedStringAttributes(dict);
    }
    @WeaklyLinked
    public CMTextMarkupAttributes getTextMarkupAttributesForNaN() {
        NSDictionary dict = getTextAttributesDictionaryForNaN();
        if (dict == null) return null;
        return new CMTextMarkupAttributes(dict.as(CFDictionary.class));
    }
    @WeaklyLinked
    public CTAttributedStringAttributes getCoreTextAttributesForNaN() {
        NSDictionary dict = getTextAttributesDictionaryForNaN();
        if (dict == null) return null;
        return new CTAttributedStringAttributes(dict.as(CFDictionary.class));
    }
    @WeaklyLinked
    public void setTextAttributesForNaN(NSAttributedStringAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForNaN(null);
        } else {
            setTextAttributesDictionaryForNaN(v.getDictionary());
        }
    }
    @WeaklyLinked
    public void setTextMarkupAttributesForNaN(CMTextMarkupAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForNaN(null);
        } else {
            setTextAttributesDictionaryForNaN(v.getDictionary().as(NSDictionary.class));
        }
    }
    @WeaklyLinked
    public void setCoreTextAttributesForNaN(CTAttributedStringAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForNaN(null);
        } else {
            setTextAttributesDictionaryForNaN(v.getDictionary().as(NSDictionary.class));
        }
    }
    @WeaklyLinked
    public NSAttributedStringAttributes getTextAttributesForPositiveInfinity() {
        NSDictionary dict = getTextAttributesDictionaryForPositiveInfinity();
        if (dict == null) return null;
        return new NSAttributedStringAttributes(dict);
    }
    @WeaklyLinked
    public CMTextMarkupAttributes getTextMarkupAttributesForPositiveInfinity() {
        NSDictionary dict = getTextAttributesDictionaryForPositiveInfinity();
        if (dict == null) return null;
        return new CMTextMarkupAttributes(dict.as(CFDictionary.class));
    }
    @WeaklyLinked
    public CTAttributedStringAttributes getCoreTextAttributesForPositiveInfinity() {
        NSDictionary dict = getTextAttributesDictionaryForPositiveInfinity();
        if (dict == null) return null;
        return new CTAttributedStringAttributes(dict.as(CFDictionary.class));
    }
    @WeaklyLinked
    public void setTextAttributesForPositiveInfinity(NSAttributedStringAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForPositiveInfinity(null);
        } else {
            setTextAttributesDictionaryForPositiveInfinity(v.getDictionary());
        }
    }
    @WeaklyLinked
    public void setTextMarkupAttributesForPositiveInfinity(CMTextMarkupAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForPositiveInfinity(null);
        } else {
            setTextAttributesDictionaryForPositiveInfinity(v.getDictionary().as(NSDictionary.class));
        }
    }
    @WeaklyLinked
    public void setCoreTextAttributesForPositiveInfinity(CTAttributedStringAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForPositiveInfinity(null);
        } else {
            setTextAttributesDictionaryForPositiveInfinity(v.getDictionary().as(NSDictionary.class));
        }
    }
    @WeaklyLinked
    public NSAttributedStringAttributes getTextAttributesForNegativeInfinity() {
        NSDictionary dict = getTextAttributesDictionaryForNegativeInfinity();
        if (dict == null) return null;
        return new NSAttributedStringAttributes(dict);
    }
    @WeaklyLinked
    public CMTextMarkupAttributes getTextMarkupAttributesForNegativeInfinity() {
        NSDictionary dict = getTextAttributesDictionaryForNegativeInfinity();
        if (dict == null) return null;
        return new CMTextMarkupAttributes(dict.as(CFDictionary.class));
    }
    @WeaklyLinked
    public CTAttributedStringAttributes getCoreTextAttributesForNegativeInfinity() {
        NSDictionary dict = getTextAttributesDictionaryForNegativeInfinity();
        if (dict == null) return null;
        return new CTAttributedStringAttributes(dict.as(CFDictionary.class));
    }
    @WeaklyLinked
    public void setTextAttributesForNegativeInfinity(NSAttributedStringAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForNegativeInfinity(null);
        } else {
            setTextAttributesDictionaryForNegativeInfinity(v.getDictionary());
        }
    }
    @WeaklyLinked
    public void setTextMarkupAttributesForNegativeInfinity(CMTextMarkupAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForNegativeInfinity(null);
        } else {
            setTextAttributesDictionaryForNegativeInfinity(v.getDictionary().as(NSDictionary.class));
        }
    }
    @WeaklyLinked
    public void setCoreTextAttributesForNegativeInfinity(CTAttributedStringAttributes v) {
        if (v == null) {
            setTextAttributesDictionaryForNegativeInfinity(null);
        } else {
            setTextAttributesDictionaryForNegativeInfinity(v.getDictionary().as(NSDictionary.class));
        }
    }
    /*<properties>*/
    @Property(selector = "formattingContext")
    public native NSFormattingContext getFormattingContext();
    @Property(selector = "setFormattingContext:")
    public native void setFormattingContext(NSFormattingContext v);
    @Property(selector = "numberStyle")
    public native NSNumberFormatterStyle getNumberStyle();
    @Property(selector = "setNumberStyle:")
    public native void setNumberStyle(NSNumberFormatterStyle v);
    @Property(selector = "locale")
    public native NSLocale getLocale();
    @Property(selector = "setLocale:")
    public native void setLocale(NSLocale v);
    @Property(selector = "generatesDecimalNumbers")
    public native boolean generatesDecimalNumbers();
    @Property(selector = "setGeneratesDecimalNumbers:")
    public native void setGeneratesDecimalNumbers(boolean v);
    @Property(selector = "formatterBehavior")
    public native NSNumberFormatterBehavior getFormatterBehavior();
    @Property(selector = "setFormatterBehavior:")
    public native void setFormatterBehavior(NSNumberFormatterBehavior v);
    @Property(selector = "negativeFormat")
    public native String getNegativeFormat();
    @Property(selector = "setNegativeFormat:")
    public native void setNegativeFormat(String v);
    @Property(selector = "textAttributesForNegativeValues")
    public native NSDictionary<?, ?> getTextAttributesDictionaryForNegativeValues();
    @Property(selector = "setTextAttributesForNegativeValues:")
    public native void setTextAttributesDictionaryForNegativeValues(NSDictionary<?, ?> v);
    @Property(selector = "positiveFormat")
    public native String getPositiveFormat();
    @Property(selector = "setPositiveFormat:")
    public native void setPositiveFormat(String v);
    @Property(selector = "textAttributesForPositiveValues")
    public native NSDictionary<?, ?> getTextAttributesDictionaryForPositiveValues();
    @Property(selector = "setTextAttributesForPositiveValues:")
    public native void setTextAttributesDictionaryForPositiveValues(NSDictionary<?, ?> v);
    @Property(selector = "allowsFloats")
    public native boolean allowsFloats();
    @Property(selector = "setAllowsFloats:")
    public native void setAllowsFloats(boolean v);
    @Property(selector = "decimalSeparator")
    public native String getDecimalSeparator();
    @Property(selector = "setDecimalSeparator:")
    public native void setDecimalSeparator(String v);
    @Property(selector = "alwaysShowsDecimalSeparator")
    public native boolean alwaysShowsDecimalSeparator();
    @Property(selector = "setAlwaysShowsDecimalSeparator:")
    public native void setAlwaysShowsDecimalSeparator(boolean v);
    @Property(selector = "currencyDecimalSeparator")
    public native String getCurrencyDecimalSeparator();
    @Property(selector = "setCurrencyDecimalSeparator:")
    public native void setCurrencyDecimalSeparator(String v);
    @Property(selector = "usesGroupingSeparator")
    public native boolean usesGroupingSeparator();
    @Property(selector = "setUsesGroupingSeparator:")
    public native void setUsesGroupingSeparator(boolean v);
    @Property(selector = "groupingSeparator")
    public native String getGroupingSeparator();
    @Property(selector = "setGroupingSeparator:")
    public native void setGroupingSeparator(String v);
    @Property(selector = "zeroSymbol")
    public native String getZeroSymbol();
    @Property(selector = "setZeroSymbol:")
    public native void setZeroSymbol(String v);
    @Property(selector = "textAttributesForZero")
    public native NSDictionary<?, ?> getTextAttributesDictionaryForZero();
    @Property(selector = "setTextAttributesForZero:")
    public native void setTextAttributesDictionaryForZero(NSDictionary<?, ?> v);
    @Property(selector = "nilSymbol")
    public native String getNullSymbol();
    @Property(selector = "setNilSymbol:")
    public native void setNullSymbol(String v);
    @Property(selector = "textAttributesForNil")
    public native NSDictionary<?, ?> getTextAttributesDictionaryForNull();
    @Property(selector = "setTextAttributesForNil:")
    public native void setTextAttributesDictionaryForNull(NSDictionary<?, ?> v);
    @Property(selector = "notANumberSymbol")
    public native String getNaNSymbol();
    @Property(selector = "setNotANumberSymbol:")
    public native void setNaNSymbol(String v);
    @Property(selector = "textAttributesForNotANumber")
    public native NSDictionary<?, ?> getTextAttributesDictionaryForNaN();
    @Property(selector = "setTextAttributesForNotANumber:")
    public native void setTextAttributesDictionaryForNaN(NSDictionary<?, ?> v);
    @Property(selector = "positiveInfinitySymbol")
    public native String getPositiveInfinitySymbol();
    @Property(selector = "setPositiveInfinitySymbol:")
    public native void setPositiveInfinitySymbol(String v);
    @Property(selector = "textAttributesForPositiveInfinity")
    public native NSDictionary<?, ?> getTextAttributesDictionaryForPositiveInfinity();
    @Property(selector = "setTextAttributesForPositiveInfinity:")
    public native void setTextAttributesDictionaryForPositiveInfinity(NSDictionary<?, ?> v);
    @Property(selector = "negativeInfinitySymbol")
    public native String getNegativeInfinitySymbol();
    @Property(selector = "setNegativeInfinitySymbol:")
    public native void setNegativeInfinitySymbol(String v);
    @Property(selector = "textAttributesForNegativeInfinity")
    public native NSDictionary<?, ?> getTextAttributesDictionaryForNegativeInfinity();
    @Property(selector = "setTextAttributesForNegativeInfinity:")
    public native void setTextAttributesDictionaryForNegativeInfinity(NSDictionary<?, ?> v);
    @Property(selector = "positivePrefix")
    public native String getPositivePrefix();
    @Property(selector = "setPositivePrefix:")
    public native void setPositivePrefix(String v);
    @Property(selector = "positiveSuffix")
    public native String getPositiveSuffix();
    @Property(selector = "setPositiveSuffix:")
    public native void setPositiveSuffix(String v);
    @Property(selector = "negativePrefix")
    public native String getNegativePrefix();
    @Property(selector = "setNegativePrefix:")
    public native void setNegativePrefix(String v);
    @Property(selector = "negativeSuffix")
    public native String getNegativeSuffix();
    @Property(selector = "setNegativeSuffix:")
    public native void setNegativeSuffix(String v);
    @Property(selector = "currencyCode")
    public native String getCurrencyCode();
    @Property(selector = "setCurrencyCode:")
    public native void setCurrencyCode(String v);
    @Property(selector = "currencySymbol")
    public native String getCurrencySymbol();
    @Property(selector = "setCurrencySymbol:")
    public native void setCurrencySymbol(String v);
    @Property(selector = "internationalCurrencySymbol")
    public native String getInternationalCurrencySymbol();
    @Property(selector = "setInternationalCurrencySymbol:")
    public native void setInternationalCurrencySymbol(String v);
    @Property(selector = "percentSymbol")
    public native String getPercentSymbol();
    @Property(selector = "setPercentSymbol:")
    public native void setPercentSymbol(String v);
    @Property(selector = "perMillSymbol")
    public native String getPerMillSymbol();
    @Property(selector = "setPerMillSymbol:")
    public native void setPerMillSymbol(String v);
    @Property(selector = "minusSign")
    public native String getMinusSign();
    @Property(selector = "setMinusSign:")
    public native void setMinusSign(String v);
    @Property(selector = "plusSign")
    public native String getPlusSign();
    @Property(selector = "setPlusSign:")
    public native void setPlusSign(String v);
    @Property(selector = "exponentSymbol")
    public native String getExponentSymbol();
    @Property(selector = "setExponentSymbol:")
    public native void setExponentSymbol(String v);
    @Property(selector = "groupingSize")
    public native @MachineSizedUInt long getGroupingSize();
    @Property(selector = "setGroupingSize:")
    public native void setGroupingSize(@MachineSizedUInt long v);
    @Property(selector = "secondaryGroupingSize")
    public native @MachineSizedUInt long getSecondaryGroupingSize();
    @Property(selector = "setSecondaryGroupingSize:")
    public native void setSecondaryGroupingSize(@MachineSizedUInt long v);
    @Property(selector = "multiplier")
    public native NSNumber getMultiplier();
    @Property(selector = "setMultiplier:")
    public native void setMultiplier(NSNumber v);
    @Property(selector = "formatWidth")
    public native @MachineSizedUInt long getFormatWidth();
    @Property(selector = "setFormatWidth:")
    public native void setFormatWidth(@MachineSizedUInt long v);
    @Property(selector = "paddingCharacter")
    public native String getPaddingCharacter();
    @Property(selector = "setPaddingCharacter:")
    public native void setPaddingCharacter(String v);
    @Property(selector = "paddingPosition")
    public native NSNumberFormatterPadPosition getPaddingPosition();
    @Property(selector = "setPaddingPosition:")
    public native void setPaddingPosition(NSNumberFormatterPadPosition v);
    @Property(selector = "roundingMode")
    public native NSNumberFormatterRoundingMode getRoundingMode();
    @Property(selector = "setRoundingMode:")
    public native void setRoundingMode(NSNumberFormatterRoundingMode v);
    @Property(selector = "roundingIncrement")
    public native NSNumber getRoundingIncrement();
    @Property(selector = "setRoundingIncrement:")
    public native void setRoundingIncrement(NSNumber v);
    @Property(selector = "minimumIntegerDigits")
    public native @MachineSizedUInt long getMinimumIntegerDigits();
    @Property(selector = "setMinimumIntegerDigits:")
    public native void setMinimumIntegerDigits(@MachineSizedUInt long v);
    @Property(selector = "maximumIntegerDigits")
    public native @MachineSizedUInt long getMaximumIntegerDigits();
    @Property(selector = "setMaximumIntegerDigits:")
    public native void setMaximumIntegerDigits(@MachineSizedUInt long v);
    @Property(selector = "minimumFractionDigits")
    public native @MachineSizedUInt long getMinimumFractionDigits();
    @Property(selector = "setMinimumFractionDigits:")
    public native void setMinimumFractionDigits(@MachineSizedUInt long v);
    @Property(selector = "maximumFractionDigits")
    public native @MachineSizedUInt long getMaximumFractionDigits();
    @Property(selector = "setMaximumFractionDigits:")
    public native void setMaximumFractionDigits(@MachineSizedUInt long v);
    @Property(selector = "minimum")
    public native NSNumber getMinimum();
    @Property(selector = "setMinimum:")
    public native void setMinimum(NSNumber v);
    @Property(selector = "maximum")
    public native NSNumber getMaximum();
    @Property(selector = "setMaximum:")
    public native void setMaximum(NSNumber v);
    @Property(selector = "currencyGroupingSeparator")
    public native String getCurrencyGroupingSeparator();
    @Property(selector = "setCurrencyGroupingSeparator:")
    public native void setCurrencyGroupingSeparator(String v);
    @Property(selector = "isLenient")
    public native boolean isLenient();
    @Property(selector = "setLenient:")
    public native void setLenient(boolean v);
    @Property(selector = "usesSignificantDigits")
    public native boolean usesSignificantDigits();
    @Property(selector = "setUsesSignificantDigits:")
    public native void setUsesSignificantDigits(boolean v);
    @Property(selector = "minimumSignificantDigits")
    public native @MachineSizedUInt long getMinimumSignificantDigits();
    @Property(selector = "setMinimumSignificantDigits:")
    public native void setMinimumSignificantDigits(@MachineSizedUInt long v);
    @Property(selector = "maximumSignificantDigits")
    public native @MachineSizedUInt long getMaximumSignificantDigits();
    @Property(selector = "setMaximumSignificantDigits:")
    public native void setMaximumSignificantDigits(@MachineSizedUInt long v);
    @Property(selector = "isPartialStringValidationEnabled")
    public native boolean isPartialStringValidationEnabled();
    @Property(selector = "setPartialStringValidationEnabled:")
    public native void setPartialStringValidationEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public String format(Number number) {
        return format(NSNumber.pointerValueOf(number));
    }
    /*<methods>*/
    @Method(selector = "stringFromNumber:")
    public native String format(NSNumber number);
    @Method(selector = "numberFromString:")
    public native NSNumber parse(String string);
    @Method(selector = "localizedStringFromNumber:numberStyle:")
    public static native String formatLocalized(NSNumber num, NSNumberFormatterStyle nstyle);
    @Method(selector = "defaultFormatterBehavior")
    public static native NSNumberFormatterBehavior getDefaultFormatterBehavior();
    @Method(selector = "setDefaultFormatterBehavior:")
    public static native void setDefaultFormatterBehavior(NSNumberFormatterBehavior behavior);
    /*</methods>*/
}
