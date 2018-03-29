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
import com.tools20022.repository.choice.CorporateActionRateSD6Choice;
import com.tools20022.repository.choice.PriceFormatSD1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD7#mmPlaceAndName
 * CorporateActionRateSD7.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD7#mmCSDSecurityRate
 * CorporateActionRateSD7.mmCSDSecurityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD7#mmEstimatedRateFlag
 * CorporateActionRateSD7.mmEstimatedRateFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD7#mmDTCFeeRate
 * CorporateActionRateSD7.mmDTCFeeRate}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionRateSD7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option securities movement rate details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionRateSD7", propOrder = {"placeAndName", "cSDSecurityRate", "estimatedRateFlag", "dTCFeeRate"})
public class CorporateActionRateSD7 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD7
	 * CorporateActionRateSD7}</li>
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
	public static final MMMessageAttribute<CorporateActionRateSD7, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionRateSD7, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRateSD7.mmObject();
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
		public Max350Text getValue(CorporateActionRateSD7 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionRateSD7 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "CSDSctyRate")
	protected CorporateActionRateSD6Choice cSDSecurityRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionRateSD6Choice
	 * CorporateActionRateSD6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD7
	 * CorporateActionRateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSDSctyRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Security Rate</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDSecurityRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corresponding rate of the security disbursed by CSD (for an example in US, DTC The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRateSD7, Optional<CorporateActionRateSD6Choice>> mmCSDSecurityRate = new MMMessageAttribute<CorporateActionRateSD7, Optional<CorporateActionRateSD6Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRateSD7.mmObject();
			isDerived = false;
			xmlTag = "CSDSctyRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Security Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDSecurityRate";
			definition = "Corresponding rate of the security disbursed by CSD (for an example in US, DTC The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionRateSD6Choice.mmObject();
		}

		@Override
		public Optional<CorporateActionRateSD6Choice> getValue(CorporateActionRateSD7 obj) {
			return obj.getCSDSecurityRate();
		}

		@Override
		public void setValue(CorporateActionRateSD7 obj, Optional<CorporateActionRateSD6Choice> value) {
			obj.setCSDSecurityRate(value.orElse(null));
		}
	};
	@XmlElement(name = "EstmtdRateFlg")
	protected YesNoIndicator estimatedRateFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD7
	 * CorporateActionRateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdRateFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Estimated Rate Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedRateFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denotes whether the rate is approximate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRateSD7, Optional<YesNoIndicator>> mmEstimatedRateFlag = new MMMessageAttribute<CorporateActionRateSD7, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRateSD7.mmObject();
			isDerived = false;
			xmlTag = "EstmtdRateFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Estimated Rate Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedRateFlag";
			definition = "Denotes whether the rate is approximate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionRateSD7 obj) {
			return obj.getEstimatedRateFlag();
		}

		@Override
		public void setValue(CorporateActionRateSD7 obj, Optional<YesNoIndicator> value) {
			obj.setEstimatedRateFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCFeeRate")
	protected PriceFormatSD1Choice dTCFeeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD1Choice
	 * PriceFormatSD1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD7
	 * CorporateActionRateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Fee Rate, DTCCSynonym: Currency (DTC
	 * Fee Rate)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which a fee will be charged to a DTC (The Depository Trust Corporation) participant."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRateSD7, Optional<PriceFormatSD1Choice>> mmDTCFeeRate = new MMMessageAttribute<CorporateActionRateSD7, Optional<PriceFormatSD1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRateSD7.mmObject();
			isDerived = false;
			xmlTag = "DTCFeeRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Fee Rate"), new DTCCSynonym(this, "Currency (DTC Fee Rate)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCFeeRate";
			definition = "Rate at which a fee will be charged to a DTC (The Depository Trust Corporation) participant.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD1Choice.mmObject();
		}

		@Override
		public Optional<PriceFormatSD1Choice> getValue(CorporateActionRateSD7 obj) {
			return obj.getDTCFeeRate();
		}

		@Override
		public void setValue(CorporateActionRateSD7 obj, Optional<PriceFormatSD1Choice> value) {
			obj.setDTCFeeRate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRateSD7.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionRateSD7.mmCSDSecurityRate,
						com.tools20022.repository.msg.CorporateActionRateSD7.mmEstimatedRateFlag, com.tools20022.repository.msg.CorporateActionRateSD7.mmDTCFeeRate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRateSD7";
				definition = "Provides additional information regarding corporate action option securities movement rate details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionRateSD7 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<CorporateActionRateSD6Choice> getCSDSecurityRate() {
		return cSDSecurityRate == null ? Optional.empty() : Optional.of(cSDSecurityRate);
	}

	public CorporateActionRateSD7 setCSDSecurityRate(CorporateActionRateSD6Choice cSDSecurityRate) {
		this.cSDSecurityRate = cSDSecurityRate;
		return this;
	}

	public Optional<YesNoIndicator> getEstimatedRateFlag() {
		return estimatedRateFlag == null ? Optional.empty() : Optional.of(estimatedRateFlag);
	}

	public CorporateActionRateSD7 setEstimatedRateFlag(YesNoIndicator estimatedRateFlag) {
		this.estimatedRateFlag = estimatedRateFlag;
		return this;
	}

	public Optional<PriceFormatSD1Choice> getDTCFeeRate() {
		return dTCFeeRate == null ? Optional.empty() : Optional.of(dTCFeeRate);
	}

	public CorporateActionRateSD7 setDTCFeeRate(PriceFormatSD1Choice dTCFeeRate) {
		this.dTCFeeRate = dTCFeeRate;
		return this;
	}
}