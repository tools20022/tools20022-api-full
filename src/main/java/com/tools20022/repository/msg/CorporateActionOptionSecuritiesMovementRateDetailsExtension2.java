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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DTCMultiplyDivide1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action option securities
 * movement rate details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementRateDetailsExtension2#mmPlaceAndName
 * CorporateActionOptionSecuritiesMovementRateDetailsExtension2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementRateDetailsExtension2#mmDTCSecurityRate
 * CorporateActionOptionSecuritiesMovementRateDetailsExtension2.
 * mmDTCSecurityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementRateDetailsExtension2#mmDTCMultiplyDivideIndicator
 * CorporateActionOptionSecuritiesMovementRateDetailsExtension2.
 * mmDTCMultiplyDivideIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionOptionSecuritiesMovementRateDetailsExtension2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option securities movement rate details."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionOptionSecuritiesMovementRateDetailsExtension2", propOrder = {"placeAndName", "dTCSecurityRate", "dTCMultiplyDivideIndicator"})
public class CorporateActionOptionSecuritiesMovementRateDetailsExtension2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementRateDetailsExtension2
	 * CorporateActionOptionSecuritiesMovementRateDetailsExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOptionSecuritiesMovementRateDetailsExtension2, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionOptionSecuritiesMovementRateDetailsExtension2, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementRateDetailsExtension2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionOptionSecuritiesMovementRateDetailsExtension2 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionOptionSecuritiesMovementRateDetailsExtension2 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "DTCSctyRate")
	protected DecimalNumber dTCSecurityRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementRateDetailsExtension2
	 * CorporateActionOptionSecuritiesMovementRateDetailsExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCSctyRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCSecurityRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of the security is disbursed by DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Security Rate</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOptionSecuritiesMovementRateDetailsExtension2, Optional<DecimalNumber>> mmDTCSecurityRate = new MMMessageAttribute<CorporateActionOptionSecuritiesMovementRateDetailsExtension2, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementRateDetailsExtension2.mmObject();
			isDerived = false;
			xmlTag = "DTCSctyRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Security Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCSecurityRate";
			definition = "Rate of the security is disbursed by DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(CorporateActionOptionSecuritiesMovementRateDetailsExtension2 obj) {
			return obj.getDTCSecurityRate();
		}

		@Override
		public void setValue(CorporateActionOptionSecuritiesMovementRateDetailsExtension2 obj, Optional<DecimalNumber> value) {
			obj.setDTCSecurityRate(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCMltplyDvdInd")
	protected DTCMultiplyDivide1Code dTCMultiplyDivideIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCMultiplyDivide1Code
	 * DTCMultiplyDivide1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementRateDetailsExtension2
	 * CorporateActionOptionSecuritiesMovementRateDetailsExtension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCMltplyDvdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCMultiplyDivideIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Action used to clarify calculation of the security rate: old shares * new shares or old shares/ new shares used by DTC (The Depository Trust Corporation). Used in conjunction with DTC Security Rate element to determine entitlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Multiply/ Divide Indicator</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOptionSecuritiesMovementRateDetailsExtension2, Optional<DTCMultiplyDivide1Code>> mmDTCMultiplyDivideIndicator = new MMMessageAttribute<CorporateActionOptionSecuritiesMovementRateDetailsExtension2, Optional<DTCMultiplyDivide1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementRateDetailsExtension2.mmObject();
			isDerived = false;
			xmlTag = "DTCMltplyDvdInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Multiply/ Divide Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCMultiplyDivideIndicator";
			definition = "Action used to clarify calculation of the security rate: old shares * new shares or old shares/ new shares used by DTC (The Depository Trust Corporation). Used in conjunction with DTC Security Rate element to determine entitlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCMultiplyDivide1Code.mmObject();
		}

		@Override
		public Optional<DTCMultiplyDivide1Code> getValue(CorporateActionOptionSecuritiesMovementRateDetailsExtension2 obj) {
			return obj.getDTCMultiplyDivideIndicator();
		}

		@Override
		public void setValue(CorporateActionOptionSecuritiesMovementRateDetailsExtension2 obj, Optional<DTCMultiplyDivide1Code> value) {
			obj.setDTCMultiplyDivideIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementRateDetailsExtension2.mmPlaceAndName,
						com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementRateDetailsExtension2.mmDTCSecurityRate,
						com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementRateDetailsExtension2.mmDTCMultiplyDivideIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionOptionSecuritiesMovementRateDetailsExtension2";
				definition = "Provides additional information regarding corporate action option securities movement rate details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionOptionSecuritiesMovementRateDetailsExtension2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<DecimalNumber> getDTCSecurityRate() {
		return dTCSecurityRate == null ? Optional.empty() : Optional.of(dTCSecurityRate);
	}

	public CorporateActionOptionSecuritiesMovementRateDetailsExtension2 setDTCSecurityRate(DecimalNumber dTCSecurityRate) {
		this.dTCSecurityRate = dTCSecurityRate;
		return this;
	}

	public Optional<DTCMultiplyDivide1Code> getDTCMultiplyDivideIndicator() {
		return dTCMultiplyDivideIndicator == null ? Optional.empty() : Optional.of(dTCMultiplyDivideIndicator);
	}

	public CorporateActionOptionSecuritiesMovementRateDetailsExtension2 setDTCMultiplyDivideIndicator(DTCMultiplyDivide1Code dTCMultiplyDivideIndicator) {
		this.dTCMultiplyDivideIndicator = dTCMultiplyDivideIndicator;
		return this;
	}
}