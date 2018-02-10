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
import com.tools20022.repository.codeset.ExternalTypeOfParty1Code;
import com.tools20022.repository.codeset.UndertakingName1Code;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.ModelForm;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.entity.UndertakingBeneficiary;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Independent undertaking, such as a demand guarantee or standby letter of
 * credit, that provides financial assurance, to be honoured on the presentation
 * of documents that comply with its terms and conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking2#mmName
 * Undertaking2.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking2#mmBeneficiary
 * Undertaking2.mmBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking2#mmExpiryDetails
 * Undertaking2.mmExpiryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking2#mmCounterUndertakingAmount
 * Undertaking2.mmCounterUndertakingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking2#mmConfirmationChargesPayableBy
 * Undertaking2.mmConfirmationChargesPayableBy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking2#mmGovernanceRulesAndLaw
 * Undertaking2.mmGovernanceRulesAndLaw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking2#mmStandardClaimDocumentIndicator
 * Undertaking2.mmStandardClaimDocumentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking2#mmAdditionalInformation
 * Undertaking2.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Undertaking
 * Undertaking}</li>
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
 * "Undertaking2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be honoured on the presentation of documents that comply with its terms and conditions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Undertaking2", propOrder = {"name", "beneficiary", "expiryDetails", "counterUndertakingAmount", "confirmationChargesPayableBy", "governanceRulesAndLaw", "standardClaimDocumentIndicator", "additionalInformation"})
public class Undertaking2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nm")
	protected UndertakingName1Code name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingName1Code
	 * UndertakingName1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingName
	 * Undertaking.mmUndertakingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking2 Undertaking2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking name."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking2.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Undertaking name.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UndertakingName1Code.mmObject();
		}
	};
	@XmlElement(name = "Bnfcry")
	protected PartyIdentification43 beneficiary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingBeneficiary
	 * UndertakingBeneficiary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking2 Undertaking2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bnfcry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party in whose favour the counter-undertaking is issued. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficiary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> UndertakingBeneficiary.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking2.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Party in whose favour the counter-undertaking is issued. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	@XmlElement(name = "XpryDtls")
	protected ExpiryDetails2 expiryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExpiryDetails2
	 * ExpiryDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmExpiry
	 * Undertaking.mmExpiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking2 Undertaking2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the expiry terms of the counter-undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExpiryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmExpiry;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking2.mmObject();
			isDerived = false;
			xmlTag = "XpryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDetails";
			definition = "Details related to the expiry terms of the counter-undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExpiryDetails2.mmObject();
		}
	};
	@XmlElement(name = "CntrUdrtkgAmt")
	protected UndertakingAmount1 counterUndertakingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UndertakingAmount1
	 * UndertakingAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmount
	 * Undertaking.mmUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking2 Undertaking2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntrUdrtkgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the amount of the counter-undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterUndertakingAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking2.mmObject();
			isDerived = false;
			xmlTag = "CntrUdrtkgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertakingAmount";
			definition = "Details related to the amount of the counter-undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UndertakingAmount1.mmObject();
		}
	};
	@XmlElement(name = "ConfChrgsPyblBy")
	protected ExternalTypeOfParty1Code confirmationChargesPayableBy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalTypeOfParty1Code
	 * ExternalTypeOfParty1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmRelatedChargesPayableBy
	 * Undertaking.mmRelatedChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking2 Undertaking2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfChrgsPyblBy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationChargesPayableBy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the confirmation charges."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmationChargesPayableBy = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmRelatedChargesPayableBy;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking2.mmObject();
			isDerived = false;
			xmlTag = "ConfChrgsPyblBy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationChargesPayableBy";
			definition = "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the confirmation charges.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalTypeOfParty1Code.mmObject();
		}
	};
	@XmlElement(name = "GovncRulesAndLaw")
	protected GovernanceRules1 governanceRulesAndLaw;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GovernanceRules1
	 * GovernanceRules1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ModelForm#mmGovernanceRules
	 * ModelForm.mmGovernanceRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking2 Undertaking2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GovncRulesAndLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernanceRulesAndLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rules and laws governing the counter-undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGovernanceRulesAndLaw = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ModelForm.mmGovernanceRules;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking2.mmObject();
			isDerived = false;
			xmlTag = "GovncRulesAndLaw";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernanceRulesAndLaw";
			definition = "Rules and laws governing the counter-undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GovernanceRules1.mmObject();
		}
	};
	@XmlElement(name = "StdClmDocInd")
	protected YesNoIndicator standardClaimDocumentIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmStandardClaimDocumentIndicator
	 * Undertaking.mmStandardClaimDocumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking2 Undertaking2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StdClmDocInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardClaimDocumentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication as to whether a claim is to utilise a standard claim form of the issuing institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStandardClaimDocumentIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmStandardClaimDocumentIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking2.mmObject();
			isDerived = false;
			xmlTag = "StdClmDocInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardClaimDocumentIndicator";
			definition = "Indication as to whether a claim is to utilise a standard claim form of the issuing institution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max2000Text> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking2 Undertaking2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the counter-undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the counter-undertaking.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking2.mmName, com.tools20022.repository.msg.Undertaking2.mmBeneficiary, com.tools20022.repository.msg.Undertaking2.mmExpiryDetails,
						com.tools20022.repository.msg.Undertaking2.mmCounterUndertakingAmount, com.tools20022.repository.msg.Undertaking2.mmConfirmationChargesPayableBy, com.tools20022.repository.msg.Undertaking2.mmGovernanceRulesAndLaw,
						com.tools20022.repository.msg.Undertaking2.mmStandardClaimDocumentIndicator, com.tools20022.repository.msg.Undertaking2.mmAdditionalInformation);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Undertaking2";
				definition = "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be honoured on the presentation of documents that comply with its terms and conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<UndertakingName1Code> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public Undertaking2 setName(UndertakingName1Code name) {
		this.name = name;
		return this;
	}

	public Optional<PartyIdentification43> getBeneficiary() {
		return beneficiary == null ? Optional.empty() : Optional.of(beneficiary);
	}

	public Undertaking2 setBeneficiary(com.tools20022.repository.msg.PartyIdentification43 beneficiary) {
		this.beneficiary = beneficiary;
		return this;
	}

	public Optional<ExpiryDetails2> getExpiryDetails() {
		return expiryDetails == null ? Optional.empty() : Optional.of(expiryDetails);
	}

	public Undertaking2 setExpiryDetails(com.tools20022.repository.msg.ExpiryDetails2 expiryDetails) {
		this.expiryDetails = expiryDetails;
		return this;
	}

	public Optional<UndertakingAmount1> getCounterUndertakingAmount() {
		return counterUndertakingAmount == null ? Optional.empty() : Optional.of(counterUndertakingAmount);
	}

	public Undertaking2 setCounterUndertakingAmount(com.tools20022.repository.msg.UndertakingAmount1 counterUndertakingAmount) {
		this.counterUndertakingAmount = counterUndertakingAmount;
		return this;
	}

	public Optional<ExternalTypeOfParty1Code> getConfirmationChargesPayableBy() {
		return confirmationChargesPayableBy == null ? Optional.empty() : Optional.of(confirmationChargesPayableBy);
	}

	public Undertaking2 setConfirmationChargesPayableBy(ExternalTypeOfParty1Code confirmationChargesPayableBy) {
		this.confirmationChargesPayableBy = confirmationChargesPayableBy;
		return this;
	}

	public Optional<GovernanceRules1> getGovernanceRulesAndLaw() {
		return governanceRulesAndLaw == null ? Optional.empty() : Optional.of(governanceRulesAndLaw);
	}

	public Undertaking2 setGovernanceRulesAndLaw(com.tools20022.repository.msg.GovernanceRules1 governanceRulesAndLaw) {
		this.governanceRulesAndLaw = governanceRulesAndLaw;
		return this;
	}

	public Optional<YesNoIndicator> getStandardClaimDocumentIndicator() {
		return standardClaimDocumentIndicator == null ? Optional.empty() : Optional.of(standardClaimDocumentIndicator);
	}

	public Undertaking2 setStandardClaimDocumentIndicator(YesNoIndicator standardClaimDocumentIndicator) {
		this.standardClaimDocumentIndicator = standardClaimDocumentIndicator;
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public Undertaking2 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}