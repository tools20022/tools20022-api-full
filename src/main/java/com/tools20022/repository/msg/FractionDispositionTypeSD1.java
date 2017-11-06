/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.FractionalSecurityRule1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides additional information regarding corporate action securities
 * movement fraction disposition details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FractionDispositionTypeSD1#mmPlaceAndName
 * FractionDispositionTypeSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FractionDispositionTypeSD1#mmFractionalSecurityRule
 * FractionDispositionTypeSD1.mmFractionalSecurityRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FractionDispositionTypeSD1#mmRoundingFactor
 * FractionDispositionTypeSD1.mmRoundingFactor}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FractionDispositionTypeSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action securities movement fraction disposition details."
 * </li>
 * </ul>
 */
public class FractionDispositionTypeSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FractionDispositionTypeSD1
	 * FractionDispositionTypeSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FractionDispositionTypeSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected FractionalSecurityRule1Code fractionalSecurityRule;
	/**
	 * Used for the fractional rule that cannot be classified in ISO (fractional
	 * disposition) in the event that fractional disposition is calculated
	 * specific to the beneficial owner positions. Identifies a scenario where
	 * the issuer / market announced fractional security rounding at beneficial
	 * holder level. Used in conjunction with a rounding factor. For an example
	 * if rounding factor is 0.6, this means that fractional units greater than
	 * or equal to 6 will be rounded up and less than 6 will be rounded down.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRule1Code
	 * FractionalSecurityRule1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FractionDispositionTypeSD1
	 * FractionDispositionTypeSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrctnlSctyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalSecurityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for the fractional rule that cannot be classified in ISO (fractional disposition) in the event that fractional disposition is calculated specific to the beneficial owner positions.  Identifies a scenario where the issuer / market announced fractional security rounding at beneficial holder level. Used in conjunction with a rounding factor. For an example if rounding factor is 0.6, this means that fractional units greater than or equal to 6 will be rounded up and  less than 6 will be rounded down."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFractionalSecurityRule = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FractionDispositionTypeSD1.mmObject();
			isDerived = false;
			xmlTag = "FrctnlSctyRule";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalSecurityRule";
			definition = "Used for the fractional rule that cannot be classified in ISO (fractional disposition) in the event that fractional disposition is calculated specific to the beneficial owner positions.  Identifies a scenario where the issuer / market announced fractional security rounding at beneficial holder level. Used in conjunction with a rounding factor. For an example if rounding factor is 0.6, this means that fractional units greater than or equal to 6 will be rounded up and  less than 6 will be rounded down.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FractionalSecurityRule1Code.mmObject();
		}
	};
	protected DecimalNumber roundingFactor;
	/**
	 * Decimal above which numbers are rounded. For an example if rounding
	 * factor is 0.6 this means that fractional units greater than or equal to 6
	 * will be rounded up and less than 6 will be rounded down.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FractionDispositionTypeSD1
	 * FractionDispositionTypeSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndgFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Decimal above which numbers are rounded. For an example if rounding factor is 0.6 this means that fractional units greater than or equal to 6 will be rounded up and  less than 6 will be rounded down."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRoundingFactor = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FractionDispositionTypeSD1.mmObject();
			isDerived = false;
			xmlTag = "RndgFctr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingFactor";
			definition = "Decimal above which numbers are rounded. For an example if rounding factor is 0.6 this means that fractional units greater than or equal to 6 will be rounded up and  less than 6 will be rounded down.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FractionDispositionTypeSD1.mmPlaceAndName, com.tools20022.repository.msg.FractionDispositionTypeSD1.mmFractionalSecurityRule,
						com.tools20022.repository.msg.FractionDispositionTypeSD1.mmRoundingFactor);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FractionDispositionTypeSD1";
				definition = "Provides additional information regarding corporate action securities movement fraction disposition details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public FractionalSecurityRule1Code getFractionalSecurityRule() {
		return fractionalSecurityRule;
	}

	public void setFractionalSecurityRule(FractionalSecurityRule1Code fractionalSecurityRule) {
		this.fractionalSecurityRule = fractionalSecurityRule;
	}

	public DecimalNumber getRoundingFactor() {
		return roundingFactor;
	}

	public void setRoundingFactor(DecimalNumber roundingFactor) {
		this.roundingFactor = roundingFactor;
	}
}