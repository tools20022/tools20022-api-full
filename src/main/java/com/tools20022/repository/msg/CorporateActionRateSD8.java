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
import com.tools20022.repository.choice.PriceFormatSD2Choice;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8#mmPlaceAndName
 * CorporateActionRateSD8.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8#mmDeclaredSecurityRate
 * CorporateActionRateSD8.mmDeclaredSecurityRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8#mmEstimatedRateFlag
 * CorporateActionRateSD8.mmEstimatedRateFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8#mmDeclaredFeeRate
 * CorporateActionRateSD8.mmDeclaredFeeRate}</li>
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
 * "CorporateActionRateSD8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option securities movement rate details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRateSD10
 * CorporateActionRateSD10}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD6
 * CorporateActionRateSD6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionRateSD8", propOrder = {"placeAndName", "declaredSecurityRate", "estimatedRateFlag", "declaredFeeRate"})
public class CorporateActionRateSD8 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8
	 * CorporateActionRateSD8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD10#mmPlaceAndName
	 * CorporateActionRateSD10.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD6#mmPlaceAndName
	 * CorporateActionRateSD6.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRateSD8, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionRateSD8, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRateSD8.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRateSD10.mmPlaceAndName);
			previousVersion_lazy = () -> CorporateActionRateSD6.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionRateSD8 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionRateSD8 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "DclrdSctyRate")
	protected CorporateActionRateSD6Choice declaredSecurityRate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8
	 * CorporateActionRateSD8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdSctyRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: New Quantity, DTCCSynonym: Old Quantity</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredSecurityRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corresponding rate of the security being disbursed as a result of the corporate action as declared by the issuer or offeror on the market."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD10#mmDeclaredSecurityRate
	 * CorporateActionRateSD10.mmDeclaredSecurityRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD6#mmDeclaredSecurityRate
	 * CorporateActionRateSD6.mmDeclaredSecurityRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRateSD8, Optional<CorporateActionRateSD6Choice>> mmDeclaredSecurityRate = new MMMessageAttribute<CorporateActionRateSD8, Optional<CorporateActionRateSD6Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRateSD8.mmObject();
			isDerived = false;
			xmlTag = "DclrdSctyRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "New Quantity"), new DTCCSynonym(this, "Old Quantity"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredSecurityRate";
			definition = "Corresponding rate of the security being disbursed as a result of the corporate action as declared by the issuer or offeror on the market.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRateSD10.mmDeclaredSecurityRate);
			previousVersion_lazy = () -> CorporateActionRateSD6.mmDeclaredSecurityRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionRateSD6Choice.mmObject();
		}

		@Override
		public Optional<CorporateActionRateSD6Choice> getValue(CorporateActionRateSD8 obj) {
			return obj.getDeclaredSecurityRate();
		}

		@Override
		public void setValue(CorporateActionRateSD8 obj, Optional<CorporateActionRateSD6Choice> value) {
			obj.setDeclaredSecurityRate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8
	 * CorporateActionRateSD8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD10#mmEstimatedRateFlag
	 * CorporateActionRateSD10.mmEstimatedRateFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD6#mmEstimatedRateFlag
	 * CorporateActionRateSD6.mmEstimatedRateFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRateSD8, Optional<YesNoIndicator>> mmEstimatedRateFlag = new MMMessageAttribute<CorporateActionRateSD8, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRateSD8.mmObject();
			isDerived = false;
			xmlTag = "EstmtdRateFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Estimated Rate Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedRateFlag";
			definition = "Denotes whether the rate is approximate.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRateSD10.mmEstimatedRateFlag);
			previousVersion_lazy = () -> CorporateActionRateSD6.mmEstimatedRateFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionRateSD8 obj) {
			return obj.getEstimatedRateFlag();
		}

		@Override
		public void setValue(CorporateActionRateSD8 obj, Optional<YesNoIndicator> value) {
			obj.setEstimatedRateFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "DclrdFeeRate")
	protected PriceFormatSD2Choice declaredFeeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD2Choice
	 * PriceFormatSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD8
	 * CorporateActionRateSD8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Declared Fee Rate, DTCCSynonym: Currency
	 * (Declared Fee Rate)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which the fee will be charged to a DTC participant."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD10#mmDeclaredFeeRate
	 * CorporateActionRateSD10.mmDeclaredFeeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD6#mmDeclaredFeeRate
	 * CorporateActionRateSD6.mmDeclaredFeeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRateSD8, Optional<PriceFormatSD2Choice>> mmDeclaredFeeRate = new MMMessageAttribute<CorporateActionRateSD8, Optional<PriceFormatSD2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRateSD8.mmObject();
			isDerived = false;
			xmlTag = "DclrdFeeRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Declared Fee Rate"), new DTCCSynonym(this, "Currency (Declared Fee Rate)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredFeeRate";
			definition = "Rate at which the fee will be charged to a DTC participant.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRateSD10.mmDeclaredFeeRate);
			previousVersion_lazy = () -> CorporateActionRateSD6.mmDeclaredFeeRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD2Choice.mmObject();
		}

		@Override
		public Optional<PriceFormatSD2Choice> getValue(CorporateActionRateSD8 obj) {
			return obj.getDeclaredFeeRate();
		}

		@Override
		public void setValue(CorporateActionRateSD8 obj, Optional<PriceFormatSD2Choice> value) {
			obj.setDeclaredFeeRate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRateSD8.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionRateSD8.mmDeclaredSecurityRate,
						com.tools20022.repository.msg.CorporateActionRateSD8.mmEstimatedRateFlag, com.tools20022.repository.msg.CorporateActionRateSD8.mmDeclaredFeeRate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRateSD8";
				definition = "Provides additional information regarding corporate action option securities movement rate details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionRateSD10.mmObject());
				previousVersion_lazy = () -> CorporateActionRateSD6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionRateSD8 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<CorporateActionRateSD6Choice> getDeclaredSecurityRate() {
		return declaredSecurityRate == null ? Optional.empty() : Optional.of(declaredSecurityRate);
	}

	public CorporateActionRateSD8 setDeclaredSecurityRate(CorporateActionRateSD6Choice declaredSecurityRate) {
		this.declaredSecurityRate = declaredSecurityRate;
		return this;
	}

	public Optional<YesNoIndicator> getEstimatedRateFlag() {
		return estimatedRateFlag == null ? Optional.empty() : Optional.of(estimatedRateFlag);
	}

	public CorporateActionRateSD8 setEstimatedRateFlag(YesNoIndicator estimatedRateFlag) {
		this.estimatedRateFlag = estimatedRateFlag;
		return this;
	}

	public Optional<PriceFormatSD2Choice> getDeclaredFeeRate() {
		return declaredFeeRate == null ? Optional.empty() : Optional.of(declaredFeeRate);
	}

	public CorporateActionRateSD8 setDeclaredFeeRate(PriceFormatSD2Choice declaredFeeRate) {
		this.declaredFeeRate = declaredFeeRate;
		return this;
	}
}