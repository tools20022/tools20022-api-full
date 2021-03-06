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
import com.tools20022.repository.choice.FATCAForm1Choice;
import com.tools20022.repository.choice.MoneyLaunderingCheck1Choice;
import com.tools20022.repository.choice.Party23Choice;
import com.tools20022.repository.codeset.InformationDistribution1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FATCAStatus1;
import com.tools20022.repository.msg.MiFIDClassification1;
import com.tools20022.repository.msg.PartyProfileInformation4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characteristics of the ownership of an investment account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmParty
 * InvestmentAccountOwnershipInformation10.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmMoneyLaunderingCheck
 * InvestmentAccountOwnershipInformation10.mmMoneyLaunderingCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmInvestorProfileValidation
 * InvestmentAccountOwnershipInformation10.mmInvestorProfileValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmOwnershipBeneficiaryRate
 * InvestmentAccountOwnershipInformation10.mmOwnershipBeneficiaryRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmClientIdentification
 * InvestmentAccountOwnershipInformation10.mmClientIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmFiscalExemption
 * InvestmentAccountOwnershipInformation10.mmFiscalExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmSignatoryRightIndicator
 * InvestmentAccountOwnershipInformation10.mmSignatoryRightIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmMiFIDClassification
 * InvestmentAccountOwnershipInformation10.mmMiFIDClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmInformationDistribution
 * InvestmentAccountOwnershipInformation10.mmInformationDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmFATCAFormType
 * InvestmentAccountOwnershipInformation10.mmFATCAFormType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmFATCAStatus
 * InvestmentAccountOwnershipInformation10.mmFATCAStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentAccountOwnershipInformation10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics of the ownership of an investment account."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
 * InvestmentAccountOwnershipInformation12}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9
 * InvestmentAccountOwnershipInformation9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccountOwnershipInformation10", propOrder = {"party", "moneyLaunderingCheck", "investorProfileValidation", "ownershipBeneficiaryRate", "clientIdentification", "fiscalExemption", "signatoryRightIndicator",
		"miFIDClassification", "informationDistribution", "fATCAFormType", "fATCAStatus"})
public class InvestmentAccountOwnershipInformation10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pty", required = true)
	protected Party23Choice party;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Party23Choice Party23Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10
	 * InvestmentAccountOwnershipInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the organisation or individual person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmParty
	 * InvestmentAccountOwnershipInformation12.mmParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmParty
	 * InvestmentAccountOwnershipInformation9.mmParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation10, Party23Choice> mmParty = new MMMessageAttribute<InvestmentAccountOwnershipInformation10, Party23Choice>() {
		{
			businessComponentTrace_lazy = () -> Party.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Information about the organisation or individual person.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation12.mmParty);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation9.mmParty;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Party23Choice.mmObject();
		}

		@Override
		public Party23Choice getValue(InvestmentAccountOwnershipInformation10 obj) {
			return obj.getParty();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation10 obj, Party23Choice value) {
			obj.setParty(value);
		}
	};
	@XmlElement(name = "MnyLndrgChck")
	protected MoneyLaunderingCheck1Choice moneyLaunderingCheck;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MoneyLaunderingCheck1Choice
	 * MoneyLaunderingCheck1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmMoneyLaunderingCheck
	 * Party.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10
	 * InvestmentAccountOwnershipInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnyLndrgChck"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyLaunderingCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of an identity check to prevent money laundering. This includes the counter-terrorism check."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation12.mmMoneyLaunderingCheck}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation9.mmMoneyLaunderingCheck}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation10, Optional<MoneyLaunderingCheck1Choice>> mmMoneyLaunderingCheck = new MMMessageAttribute<InvestmentAccountOwnershipInformation10, Optional<MoneyLaunderingCheck1Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmMoneyLaunderingCheck;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmObject();
			isDerived = false;
			xmlTag = "MnyLndrgChck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation12.mmMoneyLaunderingCheck);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation9.mmMoneyLaunderingCheck;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MoneyLaunderingCheck1Choice.mmObject();
		}

		@Override
		public Optional<MoneyLaunderingCheck1Choice> getValue(InvestmentAccountOwnershipInformation10 obj) {
			return obj.getMoneyLaunderingCheck();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation10 obj, Optional<MoneyLaunderingCheck1Choice> value) {
			obj.setMoneyLaunderingCheck(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstrPrflVldtn")
	protected List<PartyProfileInformation4> investorProfileValidation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmProfileCertification
	 * PersonProfile.mmProfileCertification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10
	 * InvestmentAccountOwnershipInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstrPrflVldtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorProfileValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information to support Know Your Customer processes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation12.mmInvestorProfileValidation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation9.mmInvestorProfileValidation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation10, List<PartyProfileInformation4>> mmInvestorProfileValidation = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation10, List<PartyProfileInformation4>>() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmProfileCertification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmObject();
			isDerived = false;
			xmlTag = "InvstrPrflVldtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorProfileValidation";
			definition = "Information to support Know Your Customer processes.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation12.mmInvestorProfileValidation);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation9.mmInvestorProfileValidation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyProfileInformation4.mmObject();
		}

		@Override
		public List<PartyProfileInformation4> getValue(InvestmentAccountOwnershipInformation10 obj) {
			return obj.getInvestorProfileValidation();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation10 obj, List<PartyProfileInformation4> value) {
			obj.setInvestorProfileValidation(value);
		}
	};
	@XmlElement(name = "OwnrshBnfcryRate")
	protected PercentageRate ownershipBeneficiaryRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmOwnershipBeneficiaryRate
	 * InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10
	 * InvestmentAccountOwnershipInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnrshBnfcryRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnershipBeneficiaryRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation12.mmOwnershipBeneficiaryRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation9.mmOwnershipBeneficiaryRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation10, Optional<PercentageRate>> mmOwnershipBeneficiaryRate = new MMMessageAttribute<InvestmentAccountOwnershipInformation10, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmObject();
			isDerived = false;
			xmlTag = "OwnrshBnfcryRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnershipBeneficiaryRate";
			definition = "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation12.mmOwnershipBeneficiaryRate);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation9.mmOwnershipBeneficiaryRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(InvestmentAccountOwnershipInformation10 obj) {
			return obj.getOwnershipBeneficiaryRate();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation10 obj, Optional<PercentageRate> value) {
			obj.setOwnershipBeneficiaryRate(value.orElse(null));
		}
	};
	@XmlElement(name = "ClntId")
	protected Max35Text clientIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10
	 * InvestmentAccountOwnershipInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by an organisation, to unambiguously identify a party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmClientIdentification
	 * InvestmentAccountOwnershipInformation12.mmClientIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmClientIdentification
	 * InvestmentAccountOwnershipInformation9.mmClientIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation10, Optional<Max35Text>> mmClientIdentification = new MMMessageAttribute<InvestmentAccountOwnershipInformation10, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmObject();
			isDerived = false;
			xmlTag = "ClntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientIdentification";
			definition = "Unique identification, as assigned by an organisation, to unambiguously identify a party.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation12.mmClientIdentification);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation9.mmClientIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentAccountOwnershipInformation10 obj) {
			return obj.getClientIdentification();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation10 obj, Optional<Max35Text> value) {
			obj.setClientIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "FsclXmptn")
	protected YesNoIndicator fiscalExemption;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmFiscalExemption
	 * InvestmentFundTax.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10
	 * InvestmentAccountOwnershipInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FsclXmptn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalExemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an owner of an investment account may benefit from a fiscal exemption or amnesty for instance for declaring overseas investments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation12.mmFiscalExemption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation9.mmFiscalExemption}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation10, Optional<YesNoIndicator>> mmFiscalExemption = new MMMessageAttribute<InvestmentAccountOwnershipInformation10, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmFiscalExemption;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmObject();
			isDerived = false;
			xmlTag = "FsclXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalExemption";
			definition = "Indicates whether an owner of an investment account may benefit from a fiscal exemption or amnesty for instance for declaring overseas investments.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation12.mmFiscalExemption);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation9.mmFiscalExemption;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvestmentAccountOwnershipInformation10 obj) {
			return obj.getFiscalExemption();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation10 obj, Optional<YesNoIndicator> value) {
			obj.setFiscalExemption(value.orElse(null));
		}
	};
	@XmlElement(name = "SgntryRghtInd")
	protected YesNoIndicator signatoryRightIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignatoryRightIndicator
	 * SignatureCondition.mmSignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10
	 * InvestmentAccountOwnershipInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntryRghtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatoryRightIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the signature of the account owner is required to authorise transactions on the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmSignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation12.mmSignatoryRightIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmSignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation9.mmSignatoryRightIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation10, Optional<YesNoIndicator>> mmSignatoryRightIndicator = new MMMessageAttribute<InvestmentAccountOwnershipInformation10, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmSignatoryRightIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmObject();
			isDerived = false;
			xmlTag = "SgntryRghtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatoryRightIndicator";
			definition = "Indicates whether the signature of the account owner is required to authorise transactions on the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation12.mmSignatoryRightIndicator);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation9.mmSignatoryRightIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvestmentAccountOwnershipInformation10 obj) {
			return obj.getSignatoryRightIndicator();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation10 obj, Optional<YesNoIndicator> value) {
			obj.setSignatoryRightIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "MiFIDClssfctn")
	protected MiFIDClassification1 miFIDClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MiFIDClassification1
	 * MiFIDClassification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10
	 * InvestmentAccountOwnershipInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MiFIDClssfctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiFIDClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details about the MiFID classification of the account owner."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmMiFIDClassification
	 * InvestmentAccountOwnershipInformation12.mmMiFIDClassification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmMiFIDClassification
	 * InvestmentAccountOwnershipInformation9.mmMiFIDClassification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation10, Optional<MiFIDClassification1>> mmMiFIDClassification = new MMMessageAttribute<InvestmentAccountOwnershipInformation10, Optional<MiFIDClassification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmObject();
			isDerived = false;
			xmlTag = "MiFIDClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiFIDClassification";
			definition = "Details about the MiFID classification of the account owner.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation12.mmMiFIDClassification);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation9.mmMiFIDClassification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MiFIDClassification1.mmObject();
		}

		@Override
		public Optional<MiFIDClassification1> getValue(InvestmentAccountOwnershipInformation10 obj) {
			return obj.getMiFIDClassification();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation10 obj, Optional<MiFIDClassification1> value) {
			obj.setMiFIDClassification(value.orElse(null));
		}
	};
	@XmlElement(name = "InfDstrbtn")
	protected InformationDistribution1Code informationDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InformationDistribution1Code
	 * InformationDistribution1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10
	 * InvestmentAccountOwnershipInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfDstrbtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how information is sent to the account holder."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmNotification
	 * InvestmentAccountOwnershipInformation12.mmNotification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmInformationDistribution
	 * InvestmentAccountOwnershipInformation9.mmInformationDistribution}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation10, Optional<InformationDistribution1Code>> mmInformationDistribution = new MMMessageAttribute<InvestmentAccountOwnershipInformation10, Optional<InformationDistribution1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmObject();
			isDerived = false;
			xmlTag = "InfDstrbtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationDistribution";
			definition = "Specifies how information is sent to the account holder.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation12.mmNotification);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation9.mmInformationDistribution;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InformationDistribution1Code.mmObject();
		}

		@Override
		public Optional<InformationDistribution1Code> getValue(InvestmentAccountOwnershipInformation10 obj) {
			return obj.getInformationDistribution();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation10 obj, Optional<InformationDistribution1Code> value) {
			obj.setInformationDistribution(value.orElse(null));
		}
	};
	@XmlElement(name = "FATCAFormTp")
	protected List<FATCAForm1Choice> fATCAFormType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.FATCAForm1Choice
	 * FATCAForm1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAFormType
	 * InvestmentAccountPartyRole.mmFATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10
	 * InvestmentAccountOwnershipInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FATCAFormTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAFormType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the investor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation12.mmFATCAFormType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation10, List<FATCAForm1Choice>> mmFATCAFormType = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation10, List<FATCAForm1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmFATCAFormType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmObject();
			isDerived = false;
			xmlTag = "FATCAFormTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAFormType";
			definition = "Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the investor.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation12.mmFATCAFormType);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FATCAForm1Choice.mmObject();
		}

		@Override
		public List<FATCAForm1Choice> getValue(InvestmentAccountOwnershipInformation10 obj) {
			return obj.getFATCAFormType();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation10 obj, List<FATCAForm1Choice> value) {
			obj.setFATCAFormType(value);
		}
	};
	@XmlElement(name = "FATCASts")
	protected List<FATCAStatus1> fATCAStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FATCAStatus1
	 * FATCAStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAStatus
	 * InvestmentAccountPartyRole.mmFATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10
	 * InvestmentAccountOwnershipInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FATCASts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign Account Tax Compliance Act (FATCA) status of the investor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation12.mmFATCAStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation10, List<FATCAStatus1>> mmFATCAStatus = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation10, List<FATCAStatus1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmFATCAStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmObject();
			isDerived = false;
			xmlTag = "FATCASts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAStatus";
			definition = "Foreign Account Tax Compliance Act (FATCA) status of the investor.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation12.mmFATCAStatus);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FATCAStatus1.mmObject();
		}

		@Override
		public List<FATCAStatus1> getValue(InvestmentAccountOwnershipInformation10 obj) {
			return obj.getFATCAStatus();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation10 obj, List<FATCAStatus1> value) {
			obj.setFATCAStatus(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmParty, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmMoneyLaunderingCheck,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmInvestorProfileValidation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmOwnershipBeneficiaryRate,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmClientIdentification, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmFiscalExemption,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmSignatoryRightIndicator, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmMiFIDClassification,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmInformationDistribution, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmFATCAFormType,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmFATCAStatus);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InvestmentAccountOwnershipInformation10";
				definition = "Characteristics of the ownership of an investment account.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation12.mmObject());
				previousVersion_lazy = () -> InvestmentAccountOwnershipInformation9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Party23Choice getParty() {
		return party;
	}

	public InvestmentAccountOwnershipInformation10 setParty(Party23Choice party) {
		this.party = Objects.requireNonNull(party);
		return this;
	}

	public Optional<MoneyLaunderingCheck1Choice> getMoneyLaunderingCheck() {
		return moneyLaunderingCheck == null ? Optional.empty() : Optional.of(moneyLaunderingCheck);
	}

	public InvestmentAccountOwnershipInformation10 setMoneyLaunderingCheck(MoneyLaunderingCheck1Choice moneyLaunderingCheck) {
		this.moneyLaunderingCheck = moneyLaunderingCheck;
		return this;
	}

	public List<PartyProfileInformation4> getInvestorProfileValidation() {
		return investorProfileValidation == null ? investorProfileValidation = new ArrayList<>() : investorProfileValidation;
	}

	public InvestmentAccountOwnershipInformation10 setInvestorProfileValidation(List<PartyProfileInformation4> investorProfileValidation) {
		this.investorProfileValidation = Objects.requireNonNull(investorProfileValidation);
		return this;
	}

	public Optional<PercentageRate> getOwnershipBeneficiaryRate() {
		return ownershipBeneficiaryRate == null ? Optional.empty() : Optional.of(ownershipBeneficiaryRate);
	}

	public InvestmentAccountOwnershipInformation10 setOwnershipBeneficiaryRate(PercentageRate ownershipBeneficiaryRate) {
		this.ownershipBeneficiaryRate = ownershipBeneficiaryRate;
		return this;
	}

	public Optional<Max35Text> getClientIdentification() {
		return clientIdentification == null ? Optional.empty() : Optional.of(clientIdentification);
	}

	public InvestmentAccountOwnershipInformation10 setClientIdentification(Max35Text clientIdentification) {
		this.clientIdentification = clientIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getFiscalExemption() {
		return fiscalExemption == null ? Optional.empty() : Optional.of(fiscalExemption);
	}

	public InvestmentAccountOwnershipInformation10 setFiscalExemption(YesNoIndicator fiscalExemption) {
		this.fiscalExemption = fiscalExemption;
		return this;
	}

	public Optional<YesNoIndicator> getSignatoryRightIndicator() {
		return signatoryRightIndicator == null ? Optional.empty() : Optional.of(signatoryRightIndicator);
	}

	public InvestmentAccountOwnershipInformation10 setSignatoryRightIndicator(YesNoIndicator signatoryRightIndicator) {
		this.signatoryRightIndicator = signatoryRightIndicator;
		return this;
	}

	public Optional<MiFIDClassification1> getMiFIDClassification() {
		return miFIDClassification == null ? Optional.empty() : Optional.of(miFIDClassification);
	}

	public InvestmentAccountOwnershipInformation10 setMiFIDClassification(MiFIDClassification1 miFIDClassification) {
		this.miFIDClassification = miFIDClassification;
		return this;
	}

	public Optional<InformationDistribution1Code> getInformationDistribution() {
		return informationDistribution == null ? Optional.empty() : Optional.of(informationDistribution);
	}

	public InvestmentAccountOwnershipInformation10 setInformationDistribution(InformationDistribution1Code informationDistribution) {
		this.informationDistribution = informationDistribution;
		return this;
	}

	public List<FATCAForm1Choice> getFATCAFormType() {
		return fATCAFormType == null ? fATCAFormType = new ArrayList<>() : fATCAFormType;
	}

	public InvestmentAccountOwnershipInformation10 setFATCAFormType(List<FATCAForm1Choice> fATCAFormType) {
		this.fATCAFormType = Objects.requireNonNull(fATCAFormType);
		return this;
	}

	public List<FATCAStatus1> getFATCAStatus() {
		return fATCAStatus == null ? fATCAStatus = new ArrayList<>() : fATCAStatus;
	}

	public InvestmentAccountOwnershipInformation10 setFATCAStatus(List<FATCAStatus1> fATCAStatus) {
		this.fATCAStatus = Objects.requireNonNull(fATCAStatus);
		return this;
	}
}