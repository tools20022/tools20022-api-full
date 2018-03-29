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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.AgentCANotificationAdviceV01;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the CA option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmOptionNumber
 * CorporateActionOption1.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmOptionType
 * CorporateActionOption1.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmOptionAvailabilityStatus
 * CorporateActionOption1.mmOptionAvailabilityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmCertificationIndicator
 * CorporateActionOption1.mmCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmCertificationType
 * CorporateActionOption1.mmCertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmAssentedLineSecurityIdentification
 * CorporateActionOption1.mmAssentedLineSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmAgentSecuritiesAccountIdentification
 * CorporateActionOption1.mmAgentSecuritiesAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmAgentCashAccountIdentification
 * CorporateActionOption1.mmAgentCashAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmOfferType
 * CorporateActionOption1.mmOfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmIntermediateSecuritiesDistributionType
 * CorporateActionOption1.mmIntermediateSecuritiesDistributionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmWithdrawalAllowedIndicator
 * CorporateActionOption1.mmWithdrawalAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmChangeAllowedIndicator
 * CorporateActionOption1.mmChangeAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmDateDetails
 * CorporateActionOption1.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmRateAndAmountDetails
 * CorporateActionOption1.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmPriceDetails
 * CorporateActionOption1.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmPeriodDetails
 * CorporateActionOption1.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmSecuritiesMovementDetails
 * CorporateActionOption1.mmSecuritiesMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmCashMovementDetails
 * CorporateActionOption1.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmCorporateActionOtherAgentDetails
 * CorporateActionOption1.mmCorporateActionOtherAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmFractionDisposition
 * CorporateActionOption1.mmFractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmRedemptionChargesAppliedIndicator
 * CorporateActionOption1.mmRedemptionChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmOptionFeatures
 * CorporateActionOption1.mmOptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmCorporateActionAdditionalInformation
 * CorporateActionOption1.mmCorporateActionAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#mmCorporateActionOptionDetails
 * AgentCANotificationAdviceV01.mmCorporateActionOptionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChangeAllowedRule#forCorporateActionOption1
 * ConstraintChangeAllowedRule.forCorporateActionOption1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintWithdrawalAllowedRule#forCorporateActionOption1
 * ConstraintWithdrawalAllowedRule.forCorporateActionOption1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionOption1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the CA option."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionOption1", propOrder = {"optionNumber", "optionType", "optionAvailabilityStatus", "certificationIndicator", "certificationType", "assentedLineSecurityIdentification", "agentSecuritiesAccountIdentification",
		"agentCashAccountIdentification", "offerType", "intermediateSecuritiesDistributionType", "withdrawalAllowedIndicator", "changeAllowedIndicator", "dateDetails", "rateAndAmountDetails", "priceDetails", "periodDetails",
		"securitiesMovementDetails", "cashMovementDetails", "corporateActionOtherAgentDetails", "fractionDisposition", "redemptionChargesAppliedIndicator", "optionFeatures", "corporateActionAdditionalInformation"})
public class CorporateActionOption1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OptnNb", required = true)
	protected Exact3NumericText optionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
	 * CorporateActionOption.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, Exact3NumericText> mmOptionNumber = new MMMessageAttribute<CorporateActionOption1, Exact3NumericText>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Exact3NumericText getValue(CorporateActionOption1 obj) {
			return obj.getOptionNumber();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, Exact3NumericText value) {
			obj.setOptionNumber(value);
		}
	};
	@XmlElement(name = "OptnTp", required = true)
	protected CorporateActionOption1FormatChoice optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice
	 * CorporateActionOption1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the corporate action options available to the account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, CorporateActionOption1FormatChoice> mmOptionType = new MMMessageAttribute<CorporateActionOption1, CorporateActionOption1FormatChoice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionOption1FormatChoice.mmObject();
		}

		@Override
		public CorporateActionOption1FormatChoice getValue(CorporateActionOption1 obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, CorporateActionOption1FormatChoice value) {
			obj.setOptionType(value);
		}
	};
	@XmlElement(name = "OptnAvlbtySts", required = true)
	protected CorporateActionEventStatus2FormatChoice optionAvailabilityStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStatus2FormatChoice
	 * CorporateActionEventStatus2FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmOptionAvailabilityStatus
	 * CorporateActionStatus.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnAvlbtySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionAvailabilityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the option."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, CorporateActionEventStatus2FormatChoice> mmOptionAvailabilityStatus = new MMMessageAttribute<CorporateActionOption1, CorporateActionEventStatus2FormatChoice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatus.mmOptionAvailabilityStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "OptnAvlbtySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionAvailabilityStatus";
			definition = "Specifies the status of the option.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionEventStatus2FormatChoice.mmObject();
		}

		@Override
		public CorporateActionEventStatus2FormatChoice getValue(CorporateActionOption1 obj) {
			return obj.getOptionAvailabilityStatus();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, CorporateActionEventStatus2FormatChoice value) {
			obj.setOptionAvailabilityStatus(value);
		}
	};
	@XmlElement(name = "CertfctnInd")
	protected YesNoIndicator certificationIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationIndicator
	 * BeneficialOwner.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Whether or not certification is required from the account owner. \nYes: certification required \nNo: no certification required."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, Optional<YesNoIndicator>> mmCertificationIndicator = new MMMessageAttribute<CorporateActionOption1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "CertfctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationIndicator";
			definition = "Whether or not certification is required from the account owner. \nYes: certification required \nNo: no certification required.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionOption1 obj) {
			return obj.getCertificationIndicator();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, Optional<YesNoIndicator> value) {
			obj.setCertificationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnTp")
	protected BeneficiaryCertificationType1FormatChoice certificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice
	 * BeneficiaryCertificationType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of certification which is required."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, Optional<BeneficiaryCertificationType1FormatChoice>> mmCertificationType = new MMMessageAttribute<CorporateActionOption1, Optional<BeneficiaryCertificationType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "CertfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationType";
			definition = "Type of certification which is required.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BeneficiaryCertificationType1FormatChoice.mmObject();
		}

		@Override
		public Optional<BeneficiaryCertificationType1FormatChoice> getValue(CorporateActionOption1 obj) {
			return obj.getCertificationType();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, Optional<BeneficiaryCertificationType1FormatChoice> value) {
			obj.setCertificationType(value.orElse(null));
		}
	};
	@XmlElement(name = "AssntdLineSctyId")
	protected SecurityIdentification7 assentedLineSecurityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssntdLineSctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssentedLineSecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a temporary security used for processing reasons, eg, contra security used in the US."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, Optional<SecurityIdentification7>> mmAssentedLineSecurityIdentification = new MMMessageAttribute<CorporateActionOption1, Optional<SecurityIdentification7>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "AssntdLineSctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssentedLineSecurityIdentification";
			definition = "Identification of a temporary security used for processing reasons, eg, contra security used in the US.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityIdentification7.mmObject();
		}

		@Override
		public Optional<SecurityIdentification7> getValue(CorporateActionOption1 obj) {
			return obj.getAssentedLineSecurityIdentification();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, Optional<SecurityIdentification7> value) {
			obj.setAssentedLineSecurityIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AgtSctiesAcctId")
	protected Max35Text agentSecuritiesAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtSctiesAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentSecuritiesAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the safekeeping account held by an agent at the CSD."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, Optional<Max35Text>> mmAgentSecuritiesAccountIdentification = new MMMessageAttribute<CorporateActionOption1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "AgtSctiesAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentSecuritiesAccountIdentification";
			definition = "Identification of the safekeeping account held by an agent at the CSD.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CorporateActionOption1 obj) {
			return obj.getAgentSecuritiesAccountIdentification();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, Optional<Max35Text> value) {
			obj.setAgentSecuritiesAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AgtCshAcctId")
	protected AccountIdentification2Choice agentCashAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification2Choice
	 * AccountIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtCshAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCashAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the cash account held by an agent at the CSD."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, Optional<AccountIdentification2Choice>> mmAgentCashAccountIdentification = new MMMessageAttribute<CorporateActionOption1, Optional<AccountIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "AgtCshAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCashAccountIdentification";
			definition = "Identification of the cash account held by an agent at the CSD.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentification2Choice.mmObject();
		}

		@Override
		public Optional<AccountIdentification2Choice> getValue(CorporateActionOption1 obj) {
			return obj.getAgentCashAccountIdentification();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, Optional<AccountIdentification2Choice> value) {
			obj.setAgentCashAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OfferTp")
	protected List<OfferType1FormatChoice> offerType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.OfferType1FormatChoice
	 * OfferType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOfferType
	 * CorporateActionOption.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OfferTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conditions that apply to the offer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, List<OfferType1FormatChoice>> mmOfferType = new MMMessageAttribute<CorporateActionOption1, List<OfferType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOfferType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "OfferTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferType";
			definition = "Specifies the conditions that apply to the offer.";
			minOccurs = 0;
			complexType_lazy = () -> OfferType1FormatChoice.mmObject();
		}

		@Override
		public List<OfferType1FormatChoice> getValue(CorporateActionOption1 obj) {
			return obj.getOfferType();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, List<OfferType1FormatChoice> value) {
			obj.setOfferType(value);
		}
	};
	@XmlElement(name = "IntrmdtSctiesDstrbtnTp")
	protected IntermediateSecurityDistributionType1FormatChoice intermediateSecuritiesDistributionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecurityDistributionType1FormatChoice
	 * IntermediateSecurityDistributionType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesDistributionType
	 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmdtSctiesDstrbtnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistributionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of intermediates securities distribution, eg, stock dividend, reverse right."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, Optional<IntermediateSecurityDistributionType1FormatChoice>> mmIntermediateSecuritiesDistributionType = new MMMessageAttribute<CorporateActionOption1, Optional<IntermediateSecurityDistributionType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "IntrmdtSctiesDstrbtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistributionType";
			definition = "Type of intermediates securities distribution, eg, stock dividend, reverse right.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IntermediateSecurityDistributionType1FormatChoice.mmObject();
		}

		@Override
		public Optional<IntermediateSecurityDistributionType1FormatChoice> getValue(CorporateActionOption1 obj) {
			return obj.getIntermediateSecuritiesDistributionType();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, Optional<IntermediateSecurityDistributionType1FormatChoice> value) {
			obj.setIntermediateSecuritiesDistributionType(value.orElse(null));
		}
	};
	@XmlElement(name = "WdrwlAllwdInd", required = true)
	protected YesNoIndicator withdrawalAllowedIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmWithdrawalAllowedIndicator
	 * CorporateActionOption.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WdrwlAllwdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether withdrawal of instruction is allowed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, YesNoIndicator> mmWithdrawalAllowedIndicator = new MMMessageAttribute<CorporateActionOption1, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmWithdrawalAllowedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "WdrwlAllwdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalAllowedIndicator";
			definition = "Indicates whether withdrawal of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionOption1 obj) {
			return obj.getWithdrawalAllowedIndicator();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, YesNoIndicator value) {
			obj.setWithdrawalAllowedIndicator(value);
		}
	};
	@XmlElement(name = "ChngAllwdInd", required = true)
	protected YesNoIndicator changeAllowedIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChangeAllowedIndicator
	 * CorporateActionOption.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChngAllwdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether change of instruction is allowed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, YesNoIndicator> mmChangeAllowedIndicator = new MMMessageAttribute<CorporateActionOption1, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChangeAllowedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "ChngAllwdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeAllowedIndicator";
			definition = "Indicates whether change of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionOption1 obj) {
			return obj.getChangeAllowedIndicator();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, YesNoIndicator value) {
			obj.setChangeAllowedIndicator(value);
		}
	};
	@XmlElement(name = "DtDtls")
	protected CorporateActionDate4 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate4
	 * CorporateActionDate4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the dates related to a CA option."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption1, Optional<CorporateActionDate4>> mmDateDetails = new MMMessageAssociationEnd<CorporateActionOption1, Optional<CorporateActionDate4>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a CA option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionDate4.mmObject();
		}

		@Override
		public Optional<CorporateActionDate4> getValue(CorporateActionOption1 obj) {
			return obj.getDateDetails();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, Optional<CorporateActionDate4> value) {
			obj.setDateDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RateAndAmtDtls")
	protected CorporateActionRate2 rateAndAmountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateAndAmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndAmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about rates and amounts related to a CA option."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption1, Optional<CorporateActionRate2>> mmRateAndAmountDetails = new MMMessageAssociationEnd<CorporateActionOption1, Optional<CorporateActionRate2>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a CA option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionRate2.mmObject();
		}

		@Override
		public Optional<CorporateActionRate2> getValue(CorporateActionOption1 obj) {
			return obj.getRateAndAmountDetails();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, Optional<CorporateActionRate2> value) {
			obj.setRateAndAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected CorporateActionPrice1 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice1
	 * CorporateActionPrice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the prices related to a CA option."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption1, Optional<CorporateActionPrice1>> mmPriceDetails = new MMMessageAssociationEnd<CorporateActionOption1, Optional<CorporateActionPrice1>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a CA option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPrice1.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice1> getValue(CorporateActionOption1 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, Optional<CorporateActionPrice1> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PrdDtls")
	protected CorporateActionPeriod2 periodDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2
	 * CorporateActionPeriod2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrdDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the periods related to a CA option."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption1, Optional<CorporateActionPeriod2>> mmPeriodDetails = new MMMessageAssociationEnd<CorporateActionOption1, Optional<CorporateActionPeriod2>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "PrdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a CA option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPeriod2.mmObject();
		}

		@Override
		public Optional<CorporateActionPeriod2> getValue(CorporateActionOption1 obj) {
			return obj.getPeriodDetails();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, Optional<CorporateActionPeriod2> value) {
			obj.setPeriodDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesMvmntDtls")
	protected List<SecurityOption1> securitiesMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityOption1
	 * SecurityOption1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSecuritiesProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the securities movement linked to the CA option."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption1, List<SecurityOption1>> mmSecuritiesMovementDetails = new MMMessageAssociationEnd<CorporateActionOption1, List<SecurityOption1>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementDetails";
			definition = "Provides information about the securities movement linked to the CA option.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityOption1.mmObject();
		}

		@Override
		public List<SecurityOption1> getValue(CorporateActionOption1 obj) {
			return obj.getSecuritiesMovementDetails();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, List<SecurityOption1> value) {
			obj.setSecuritiesMovementDetails(value);
		}
	};
	@XmlElement(name = "CshMvmntDtls")
	protected List<CashOption1> cashMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOption1
	 * CashOption1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the cash movement linked to the CA option."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption1, List<CashOption1>> mmCashMovementDetails = new MMMessageAssociationEnd<CorporateActionOption1, List<CashOption1>>() {
		{
			businessComponentTrace_lazy = () -> CashProceedsDefinition.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "CshMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMovementDetails";
			definition = "Provides information about the cash movement linked to the CA option.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashOption1.mmObject();
		}

		@Override
		public List<CashOption1> getValue(CorporateActionOption1 obj) {
			return obj.getCashMovementDetails();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, List<CashOption1> value) {
			obj.setCashMovementDetails(value);
		}
	};
	@XmlElement(name = "CorpActnOthrAgtDtls")
	protected List<CorporateActionAgent1> corporateActionOtherAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionAgent1
	 * CorporateActionAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionAgent
	 * CorporateActionAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnOthrAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOtherAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the agents linked to the CA option."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption1, List<CorporateActionAgent1>> mmCorporateActionOtherAgentDetails = new MMMessageAssociationEnd<CorporateActionOption1, List<CorporateActionAgent1>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionAgent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "CorpActnOthrAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionOtherAgentDetails";
			definition = "Provides information about the agents linked to the CA option.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionAgent1.mmObject();
		}

		@Override
		public List<CorporateActionAgent1> getValue(CorporateActionOption1 obj) {
			return obj.getCorporateActionOtherAgentDetails();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, List<CorporateActionAgent1> value) {
			obj.setCorporateActionOtherAgentDetails(value);
		}
	};
	@XmlElement(name = "FrctnDspstn")
	protected FractionDispositionType1FormatChoice fractionDisposition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1FormatChoice
	 * FractionDispositionType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmFractionDisposition
	 * CorporateActionOption.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrctnDspstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionDisposition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, Optional<FractionDispositionType1FormatChoice>> mmFractionDisposition = new MMMessageAttribute<CorporateActionOption1, Optional<FractionDispositionType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmFractionDisposition;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "FrctnDspstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionDisposition";
			definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FractionDispositionType1FormatChoice.mmObject();
		}

		@Override
		public Optional<FractionDispositionType1FormatChoice> getValue(CorporateActionOption1 obj) {
			return obj.getFractionDisposition();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, Optional<FractionDispositionType1FormatChoice> value) {
			obj.setFractionDisposition(value.orElse(null));
		}
	};
	@XmlElement(name = "RedChrgsApldInd")
	protected YesNoIndicator redemptionChargesAppliedIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChargesAppliedIndicator
	 * CorporateActionOption.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedChrgsApldInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionChargesAppliedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ndicates whether redemption charges apply."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, Optional<YesNoIndicator>> mmRedemptionChargesAppliedIndicator = new MMMessageAttribute<CorporateActionOption1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChargesAppliedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "RedChrgsApldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionChargesAppliedIndicator";
			definition = "ndicates whether redemption charges apply.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionOption1 obj) {
			return obj.getRedemptionChargesAppliedIndicator();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, Optional<YesNoIndicator> value) {
			obj.setRedemptionChargesAppliedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnFeatrs")
	protected List<OptionFeatures1FormatChoice> optionFeatures;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.OptionFeatures1FormatChoice
	 * OptionFeatures1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionFeatures
	 * CorporateActionOption.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnFeatrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionFeatures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the features that may apply to a corporate action option."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption1, List<OptionFeatures1FormatChoice>> mmOptionFeatures = new MMMessageAttribute<CorporateActionOption1, List<OptionFeatures1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionFeatures;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "OptnFeatrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionFeatures";
			definition = "Specifies the features that may apply to a corporate action option.";
			minOccurs = 0;
			complexType_lazy = () -> OptionFeatures1FormatChoice.mmObject();
		}

		@Override
		public List<OptionFeatures1FormatChoice> getValue(CorporateActionOption1 obj) {
			return obj.getOptionFeatures();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, List<OptionFeatures1FormatChoice> value) {
			obj.setOptionFeatures(value);
		}
	};
	@XmlElement(name = "CorpActnAddtlInf")
	protected CorporateActionNarrative1 corporateActionAdditionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative1
	 * CorporateActionNarrative1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnAddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption1, Optional<CorporateActionNarrative1>> mmCorporateActionAdditionalInformation = new MMMessageAssociationEnd<CorporateActionOption1, Optional<CorporateActionNarrative1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
			isDerived = false;
			xmlTag = "CorpActnAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionAdditionalInformation";
			definition = "Provides additional information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionNarrative1.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative1> getValue(CorporateActionOption1 obj) {
			return obj.getCorporateActionAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionOption1 obj, Optional<CorporateActionNarrative1> value) {
			obj.setCorporateActionAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption1.mmOptionNumber, com.tools20022.repository.msg.CorporateActionOption1.mmOptionType,
						com.tools20022.repository.msg.CorporateActionOption1.mmOptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption1.mmCertificationIndicator,
						com.tools20022.repository.msg.CorporateActionOption1.mmCertificationType, com.tools20022.repository.msg.CorporateActionOption1.mmAssentedLineSecurityIdentification,
						com.tools20022.repository.msg.CorporateActionOption1.mmAgentSecuritiesAccountIdentification, com.tools20022.repository.msg.CorporateActionOption1.mmAgentCashAccountIdentification,
						com.tools20022.repository.msg.CorporateActionOption1.mmOfferType, com.tools20022.repository.msg.CorporateActionOption1.mmIntermediateSecuritiesDistributionType,
						com.tools20022.repository.msg.CorporateActionOption1.mmWithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption1.mmChangeAllowedIndicator,
						com.tools20022.repository.msg.CorporateActionOption1.mmDateDetails, com.tools20022.repository.msg.CorporateActionOption1.mmRateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption1.mmPriceDetails,
						com.tools20022.repository.msg.CorporateActionOption1.mmPeriodDetails, com.tools20022.repository.msg.CorporateActionOption1.mmSecuritiesMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption1.mmCashMovementDetails, com.tools20022.repository.msg.CorporateActionOption1.mmCorporateActionOtherAgentDetails,
						com.tools20022.repository.msg.CorporateActionOption1.mmFractionDisposition, com.tools20022.repository.msg.CorporateActionOption1.mmRedemptionChargesAppliedIndicator,
						com.tools20022.repository.msg.CorporateActionOption1.mmOptionFeatures, com.tools20022.repository.msg.CorporateActionOption1.mmCorporateActionAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCANotificationAdviceV01.mmCorporateActionOptionDetails);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChangeAllowedRule.forCorporateActionOption1,
						com.tools20022.repository.constraints.ConstraintWithdrawalAllowedRule.forCorporateActionOption1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOption1";
				definition = "Provides information about the CA option.";
			}
		});
		return mmObject_lazy.get();
	}

	public Exact3NumericText getOptionNumber() {
		return optionNumber;
	}

	public CorporateActionOption1 setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = Objects.requireNonNull(optionNumber);
		return this;
	}

	public CorporateActionOption1FormatChoice getOptionType() {
		return optionType;
	}

	public CorporateActionOption1 setOptionType(CorporateActionOption1FormatChoice optionType) {
		this.optionType = Objects.requireNonNull(optionType);
		return this;
	}

	public CorporateActionEventStatus2FormatChoice getOptionAvailabilityStatus() {
		return optionAvailabilityStatus;
	}

	public CorporateActionOption1 setOptionAvailabilityStatus(CorporateActionEventStatus2FormatChoice optionAvailabilityStatus) {
		this.optionAvailabilityStatus = Objects.requireNonNull(optionAvailabilityStatus);
		return this;
	}

	public Optional<YesNoIndicator> getCertificationIndicator() {
		return certificationIndicator == null ? Optional.empty() : Optional.of(certificationIndicator);
	}

	public CorporateActionOption1 setCertificationIndicator(YesNoIndicator certificationIndicator) {
		this.certificationIndicator = certificationIndicator;
		return this;
	}

	public Optional<BeneficiaryCertificationType1FormatChoice> getCertificationType() {
		return certificationType == null ? Optional.empty() : Optional.of(certificationType);
	}

	public CorporateActionOption1 setCertificationType(BeneficiaryCertificationType1FormatChoice certificationType) {
		this.certificationType = certificationType;
		return this;
	}

	public Optional<SecurityIdentification7> getAssentedLineSecurityIdentification() {
		return assentedLineSecurityIdentification == null ? Optional.empty() : Optional.of(assentedLineSecurityIdentification);
	}

	public CorporateActionOption1 setAssentedLineSecurityIdentification(SecurityIdentification7 assentedLineSecurityIdentification) {
		this.assentedLineSecurityIdentification = assentedLineSecurityIdentification;
		return this;
	}

	public Optional<Max35Text> getAgentSecuritiesAccountIdentification() {
		return agentSecuritiesAccountIdentification == null ? Optional.empty() : Optional.of(agentSecuritiesAccountIdentification);
	}

	public CorporateActionOption1 setAgentSecuritiesAccountIdentification(Max35Text agentSecuritiesAccountIdentification) {
		this.agentSecuritiesAccountIdentification = agentSecuritiesAccountIdentification;
		return this;
	}

	public Optional<AccountIdentification2Choice> getAgentCashAccountIdentification() {
		return agentCashAccountIdentification == null ? Optional.empty() : Optional.of(agentCashAccountIdentification);
	}

	public CorporateActionOption1 setAgentCashAccountIdentification(AccountIdentification2Choice agentCashAccountIdentification) {
		this.agentCashAccountIdentification = agentCashAccountIdentification;
		return this;
	}

	public List<OfferType1FormatChoice> getOfferType() {
		return offerType == null ? offerType = new ArrayList<>() : offerType;
	}

	public CorporateActionOption1 setOfferType(List<OfferType1FormatChoice> offerType) {
		this.offerType = Objects.requireNonNull(offerType);
		return this;
	}

	public Optional<IntermediateSecurityDistributionType1FormatChoice> getIntermediateSecuritiesDistributionType() {
		return intermediateSecuritiesDistributionType == null ? Optional.empty() : Optional.of(intermediateSecuritiesDistributionType);
	}

	public CorporateActionOption1 setIntermediateSecuritiesDistributionType(IntermediateSecurityDistributionType1FormatChoice intermediateSecuritiesDistributionType) {
		this.intermediateSecuritiesDistributionType = intermediateSecuritiesDistributionType;
		return this;
	}

	public YesNoIndicator getWithdrawalAllowedIndicator() {
		return withdrawalAllowedIndicator;
	}

	public CorporateActionOption1 setWithdrawalAllowedIndicator(YesNoIndicator withdrawalAllowedIndicator) {
		this.withdrawalAllowedIndicator = Objects.requireNonNull(withdrawalAllowedIndicator);
		return this;
	}

	public YesNoIndicator getChangeAllowedIndicator() {
		return changeAllowedIndicator;
	}

	public CorporateActionOption1 setChangeAllowedIndicator(YesNoIndicator changeAllowedIndicator) {
		this.changeAllowedIndicator = Objects.requireNonNull(changeAllowedIndicator);
		return this;
	}

	public Optional<CorporateActionDate4> getDateDetails() {
		return dateDetails == null ? Optional.empty() : Optional.of(dateDetails);
	}

	public CorporateActionOption1 setDateDetails(CorporateActionDate4 dateDetails) {
		this.dateDetails = dateDetails;
		return this;
	}

	public Optional<CorporateActionRate2> getRateAndAmountDetails() {
		return rateAndAmountDetails == null ? Optional.empty() : Optional.of(rateAndAmountDetails);
	}

	public CorporateActionOption1 setRateAndAmountDetails(CorporateActionRate2 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
		return this;
	}

	public Optional<CorporateActionPrice1> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public CorporateActionOption1 setPriceDetails(CorporateActionPrice1 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}

	public Optional<CorporateActionPeriod2> getPeriodDetails() {
		return periodDetails == null ? Optional.empty() : Optional.of(periodDetails);
	}

	public CorporateActionOption1 setPeriodDetails(CorporateActionPeriod2 periodDetails) {
		this.periodDetails = periodDetails;
		return this;
	}

	public List<SecurityOption1> getSecuritiesMovementDetails() {
		return securitiesMovementDetails == null ? securitiesMovementDetails = new ArrayList<>() : securitiesMovementDetails;
	}

	public CorporateActionOption1 setSecuritiesMovementDetails(List<SecurityOption1> securitiesMovementDetails) {
		this.securitiesMovementDetails = Objects.requireNonNull(securitiesMovementDetails);
		return this;
	}

	public List<CashOption1> getCashMovementDetails() {
		return cashMovementDetails == null ? cashMovementDetails = new ArrayList<>() : cashMovementDetails;
	}

	public CorporateActionOption1 setCashMovementDetails(List<CashOption1> cashMovementDetails) {
		this.cashMovementDetails = Objects.requireNonNull(cashMovementDetails);
		return this;
	}

	public List<CorporateActionAgent1> getCorporateActionOtherAgentDetails() {
		return corporateActionOtherAgentDetails == null ? corporateActionOtherAgentDetails = new ArrayList<>() : corporateActionOtherAgentDetails;
	}

	public CorporateActionOption1 setCorporateActionOtherAgentDetails(List<CorporateActionAgent1> corporateActionOtherAgentDetails) {
		this.corporateActionOtherAgentDetails = Objects.requireNonNull(corporateActionOtherAgentDetails);
		return this;
	}

	public Optional<FractionDispositionType1FormatChoice> getFractionDisposition() {
		return fractionDisposition == null ? Optional.empty() : Optional.of(fractionDisposition);
	}

	public CorporateActionOption1 setFractionDisposition(FractionDispositionType1FormatChoice fractionDisposition) {
		this.fractionDisposition = fractionDisposition;
		return this;
	}

	public Optional<YesNoIndicator> getRedemptionChargesAppliedIndicator() {
		return redemptionChargesAppliedIndicator == null ? Optional.empty() : Optional.of(redemptionChargesAppliedIndicator);
	}

	public CorporateActionOption1 setRedemptionChargesAppliedIndicator(YesNoIndicator redemptionChargesAppliedIndicator) {
		this.redemptionChargesAppliedIndicator = redemptionChargesAppliedIndicator;
		return this;
	}

	public List<OptionFeatures1FormatChoice> getOptionFeatures() {
		return optionFeatures == null ? optionFeatures = new ArrayList<>() : optionFeatures;
	}

	public CorporateActionOption1 setOptionFeatures(List<OptionFeatures1FormatChoice> optionFeatures) {
		this.optionFeatures = Objects.requireNonNull(optionFeatures);
		return this;
	}

	public Optional<CorporateActionNarrative1> getCorporateActionAdditionalInformation() {
		return corporateActionAdditionalInformation == null ? Optional.empty() : Optional.of(corporateActionAdditionalInformation);
	}

	public CorporateActionOption1 setCorporateActionAdditionalInformation(CorporateActionNarrative1 corporateActionAdditionalInformation) {
		this.corporateActionAdditionalInformation = corporateActionAdditionalInformation;
		return this;
	}
}