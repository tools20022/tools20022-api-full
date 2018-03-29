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
import com.tools20022.repository.codeset.FractionDispositionType12Code;
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
 * Provides additional information regarding corporate action confirmation
 * details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD1#mmPlaceAndName
 * CorporateActionConfirmationDetailsSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD1#mmProrationRoundingIndicator
 * CorporateActionConfirmationDetailsSD1.mmProrationRoundingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD1#mmProrationFraction
 * CorporateActionConfirmationDetailsSD1.mmProrationFraction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionConfirmationDetailsSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action confirmation details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD2
 * CorporateActionConfirmationDetailsSD2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionConfirmationDetailsSD1", propOrder = {"placeAndName", "prorationRoundingIndicator", "prorationFraction"})
public class CorporateActionConfirmationDetailsSD1 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD1
	 * CorporateActionConfirmationDetailsSD1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD2#mmPlaceAndName
	 * CorporateActionConfirmationDetailsSD2.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionConfirmationDetailsSD1, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionConfirmationDetailsSD1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationDetailsSD2.mmPlaceAndName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionConfirmationDetailsSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionConfirmationDetailsSD1 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "PrratnRndgInd")
	protected FractionDispositionType12Code prorationRoundingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType12Code
	 * FractionDispositionType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD1
	 * CorporateActionConfirmationDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrratnRndgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProrationRoundingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how fractional positions will be handled for events with prorated options."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD2#mmProrationRoundingIndicator
	 * CorporateActionConfirmationDetailsSD2.mmProrationRoundingIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionConfirmationDetailsSD1, Optional<FractionDispositionType12Code>> mmProrationRoundingIndicator = new MMMessageAttribute<CorporateActionConfirmationDetailsSD1, Optional<FractionDispositionType12Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrratnRndgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProrationRoundingIndicator";
			definition = "Indicates how fractional positions will be handled for events with prorated options.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationDetailsSD2.mmProrationRoundingIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FractionDispositionType12Code.mmObject();
		}

		@Override
		public Optional<FractionDispositionType12Code> getValue(CorporateActionConfirmationDetailsSD1 obj) {
			return obj.getProrationRoundingIndicator();
		}

		@Override
		public void setValue(CorporateActionConfirmationDetailsSD1 obj, Optional<FractionDispositionType12Code> value) {
			obj.setProrationRoundingIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PrratnFrctn")
	protected DecimalNumber prorationFraction;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD1
	 * CorporateActionConfirmationDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrratnFrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Allocated Cash Value</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProrationFraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Decimal above which numbers are rounded for prorated options. (e.g., if the rounding factor is 0.5, numbers of 0.5 and above will be rounded up)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD2#mmProrationFraction
	 * CorporateActionConfirmationDetailsSD2.mmProrationFraction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionConfirmationDetailsSD1, Optional<DecimalNumber>> mmProrationFraction = new MMMessageAttribute<CorporateActionConfirmationDetailsSD1, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrratnFrctn";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Allocated Cash Value"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProrationFraction";
			definition = "Decimal above which numbers are rounded for prorated options. (e.g., if the rounding factor is 0.5, numbers of 0.5 and above will be rounded up).";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationDetailsSD2.mmProrationFraction);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(CorporateActionConfirmationDetailsSD1 obj) {
			return obj.getProrationFraction();
		}

		@Override
		public void setValue(CorporateActionConfirmationDetailsSD1 obj, Optional<DecimalNumber> value) {
			obj.setProrationFraction(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD1.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD1.mmProrationRoundingIndicator,
						com.tools20022.repository.msg.CorporateActionConfirmationDetailsSD1.mmProrationFraction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionConfirmationDetailsSD1";
				definition = "Provides additional information regarding corporate action confirmation details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationDetailsSD2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionConfirmationDetailsSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<FractionDispositionType12Code> getProrationRoundingIndicator() {
		return prorationRoundingIndicator == null ? Optional.empty() : Optional.of(prorationRoundingIndicator);
	}

	public CorporateActionConfirmationDetailsSD1 setProrationRoundingIndicator(FractionDispositionType12Code prorationRoundingIndicator) {
		this.prorationRoundingIndicator = prorationRoundingIndicator;
		return this;
	}

	public Optional<DecimalNumber> getProrationFraction() {
		return prorationFraction == null ? Optional.empty() : Optional.of(prorationFraction);
	}

	public CorporateActionConfirmationDetailsSD1 setProrationFraction(DecimalNumber prorationFraction) {
		this.prorationFraction = prorationFraction;
		return this;
	}
}