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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IndividualPerson6;
import com.tools20022.repository.msg.Organisation3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characteristics of the ownership of an investment account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#MoneyLaunderingCheckOrExtendedRule
 * InvestmentAccountOwnershipInformation3.MoneyLaunderingCheckOrExtendedRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#OrganisationOrIndividualPersonRule
 * InvestmentAccountOwnershipInformation3.OrganisationOrIndividualPersonRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmOrganisation
 * InvestmentAccountOwnershipInformation3.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmIndividualPerson
 * InvestmentAccountOwnershipInformation3.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmMoneyLaunderingCheck
 * InvestmentAccountOwnershipInformation3.mmMoneyLaunderingCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmExtendedMoneyLaunderingCheck
 * InvestmentAccountOwnershipInformation3.mmExtendedMoneyLaunderingCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmOwnershipBeneficiaryRate
 * InvestmentAccountOwnershipInformation3.mmOwnershipBeneficiaryRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmClientIdentification
 * InvestmentAccountOwnershipInformation3.mmClientIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmExtendedPartyRole
 * InvestmentAccountOwnershipInformation3.mmExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmFiscalExemption
 * InvestmentAccountOwnershipInformation3.mmFiscalExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmSignatoryRightIndicator
 * InvestmentAccountOwnershipInformation3.mmSignatoryRightIndicator}</li>
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
 * "InvestmentAccountOwnershipInformation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics of the ownership of an investment account."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccountOwnershipInformation3", propOrder = {"organisation", "individualPerson", "moneyLaunderingCheck", "extendedMoneyLaunderingCheck", "ownershipBeneficiaryRate", "clientIdentification", "extendedPartyRole",
		"fiscalExemption", "signatoryRightIndicator"})
public class InvestmentAccountOwnershipInformation3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Org", required = true)
	protected Organisation3 organisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation3
	 * Organisation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Org"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organised structure that is set up for a particular purpose, eg, a business, government body, department, charity, or financial institution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation3, Organisation3> mmOrganisation = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation3, Organisation3>() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
			isDerived = false;
			xmlTag = "Org";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Organisation";
			definition = "Organised structure that is set up for a particular purpose, eg, a business, government body, department, charity, or financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Organisation3.mmObject();
		}

		@Override
		public Organisation3 getValue(InvestmentAccountOwnershipInformation3 obj) {
			return obj.getOrganisation();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation3 obj, Organisation3 value) {
			obj.setOrganisation(value);
		}
	};
	@XmlElement(name = "IndvPrsn", required = true)
	protected IndividualPerson6 individualPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson6
	 * IndividualPerson6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvPrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation3, IndividualPerson6> mmIndividualPerson = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation3, IndividualPerson6>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
			isDerived = false;
			xmlTag = "IndvPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualPerson";
			definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IndividualPerson6.mmObject();
		}

		@Override
		public IndividualPerson6 getValue(InvestmentAccountOwnershipInformation3 obj) {
			return obj.getIndividualPerson();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation3 obj, IndividualPerson6 value) {
			obj.setIndividualPerson(value);
		}
	};
	@XmlElement(name = "MnyLndrgChck")
	protected OldMoneyLaunderingCheck1Code moneyLaunderingCheck;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code
	 * OldMoneyLaunderingCheck1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmMoneyLaunderingCheck
	 * Party.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnyLndrgChck"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyLaunderingCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.\n\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation3, Optional<OldMoneyLaunderingCheck1Code>> mmMoneyLaunderingCheck = new MMMessageAttribute<InvestmentAccountOwnershipInformation3, Optional<OldMoneyLaunderingCheck1Code>>() {
		{
			businessElementTrace_lazy = () -> Party.mmMoneyLaunderingCheck;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
			isDerived = false;
			xmlTag = "MnyLndrgChck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.\n\n.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OldMoneyLaunderingCheck1Code.mmObject();
		}

		@Override
		public Optional<OldMoneyLaunderingCheck1Code> getValue(InvestmentAccountOwnershipInformation3 obj) {
			return obj.getMoneyLaunderingCheck();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation3 obj, Optional<OldMoneyLaunderingCheck1Code> value) {
			obj.setMoneyLaunderingCheck(value.orElse(null));
		}
	};
	@XmlElement(name = "XtndedMnyLndrgChck")
	protected Extended350Code extendedMoneyLaunderingCheck;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmMoneyLaunderingCheck
	 * Party.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedMnyLndrgChck"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedMoneyLaunderingCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.\n\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation3, Optional<Extended350Code>> mmExtendedMoneyLaunderingCheck = new MMMessageAttribute<InvestmentAccountOwnershipInformation3, Optional<Extended350Code>>() {
		{
			businessElementTrace_lazy = () -> Party.mmMoneyLaunderingCheck;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
			isDerived = false;
			xmlTag = "XtndedMnyLndrgChck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedMoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.\n\n.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Optional<Extended350Code> getValue(InvestmentAccountOwnershipInformation3 obj) {
			return obj.getExtendedMoneyLaunderingCheck();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation3 obj, Optional<Extended350Code> value) {
			obj.setExtendedMoneyLaunderingCheck(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnrshBnfcryRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnershipBeneficiaryRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of ownership or beneficiary ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation3, Optional<PercentageRate>> mmOwnershipBeneficiaryRate = new MMMessageAttribute<InvestmentAccountOwnershipInformation3, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
			isDerived = false;
			xmlTag = "OwnrshBnfcryRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnershipBeneficiaryRate";
			definition = "Percentage of ownership or beneficiary ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(InvestmentAccountOwnershipInformation3 obj) {
			return obj.getOwnershipBeneficiaryRate();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation3 obj, Optional<PercentageRate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation3, Optional<Max35Text>> mmClientIdentification = new MMMessageAttribute<InvestmentAccountOwnershipInformation3, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
			isDerived = false;
			xmlTag = "ClntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientIdentification";
			definition = "Unique identification, as assigned by an organisation, to unambiguously identify a party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentAccountOwnershipInformation3 obj) {
			return obj.getClientIdentification();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation3 obj, Optional<Max35Text> value) {
			obj.setClientIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "XtndedPtyRole")
	protected Extended350Code extendedPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer#mmRole
	 * RolePlayer.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedPtyRole"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of the party in the activity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation3, Optional<Extended350Code>> mmExtendedPartyRole = new MMMessageAttribute<InvestmentAccountOwnershipInformation3, Optional<Extended350Code>>() {
		{
			businessElementTrace_lazy = () -> RolePlayer.mmRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
			isDerived = false;
			xmlTag = "XtndedPtyRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedPartyRole";
			definition = "Role of the party in the activity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Optional<Extended350Code> getValue(InvestmentAccountOwnershipInformation3 obj) {
			return obj.getExtendedPartyRole();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation3 obj, Optional<Extended350Code> value) {
			obj.setExtendedPartyRole(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation3, Optional<YesNoIndicator>> mmFiscalExemption = new MMMessageAttribute<InvestmentAccountOwnershipInformation3, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmFiscalExemption;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
			isDerived = false;
			xmlTag = "FsclXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalExemption";
			definition = "Indicates whether an owner of an investment account may benefit from a fiscal exemption or amnesty for instance for declaring overseas investments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvestmentAccountOwnershipInformation3 obj) {
			return obj.getFiscalExemption();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation3 obj, Optional<YesNoIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntryRghtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatoryRightIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account owner signature is required to authorise transactions on the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation3, Optional<YesNoIndicator>> mmSignatoryRightIndicator = new MMMessageAttribute<InvestmentAccountOwnershipInformation3, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmSignatoryRightIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
			isDerived = false;
			xmlTag = "SgntryRghtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatoryRightIndicator";
			definition = "Indicates whether the account owner signature is required to authorise transactions on the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvestmentAccountOwnershipInformation3 obj) {
			return obj.getSignatoryRightIndicator();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation3 obj, Optional<YesNoIndicator> value) {
			obj.setSignatoryRightIndicator(value.orElse(null));
		}
	};
	/**
	 * Either MoneyLaunderingCheck or ExtendedMoneyLaunderingCheck may be
	 * present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation3.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmExtendedMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation3.mmExtendedMoneyLaunderingCheck}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyLaunderingCheckOrExtendedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either MoneyLaunderingCheck or ExtendedMoneyLaunderingCheck may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor MoneyLaunderingCheckOrExtendedRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyLaunderingCheckOrExtendedRule";
			definition = "Either MoneyLaunderingCheck or ExtendedMoneyLaunderingCheck may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmMoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmExtendedMoneyLaunderingCheck);
		}
	};
	/**
	 * Either Organisation or IndividualPerson must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmOrganisation
	 * InvestmentAccountOwnershipInformation3.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmIndividualPerson
	 * InvestmentAccountOwnershipInformation3.mmIndividualPerson}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationOrIndividualPersonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Organisation or IndividualPerson must be present, but not both."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor OrganisationOrIndividualPersonRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationOrIndividualPersonRule";
			definition = "Either Organisation or IndividualPerson must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmOrganisation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmIndividualPerson);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmOrganisation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmIndividualPerson,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmMoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmExtendedMoneyLaunderingCheck,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmOwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmClientIdentification,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmExtendedPartyRole, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmFiscalExemption,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmSignatoryRightIndicator);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InvestmentAccountOwnershipInformation3";
				definition = "Characteristics of the ownership of an investment account.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.MoneyLaunderingCheckOrExtendedRule,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.OrganisationOrIndividualPersonRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Organisation3 getOrganisation() {
		return organisation;
	}

	public InvestmentAccountOwnershipInformation3 setOrganisation(Organisation3 organisation) {
		this.organisation = Objects.requireNonNull(organisation);
		return this;
	}

	public IndividualPerson6 getIndividualPerson() {
		return individualPerson;
	}

	public InvestmentAccountOwnershipInformation3 setIndividualPerson(IndividualPerson6 individualPerson) {
		this.individualPerson = Objects.requireNonNull(individualPerson);
		return this;
	}

	public Optional<OldMoneyLaunderingCheck1Code> getMoneyLaunderingCheck() {
		return moneyLaunderingCheck == null ? Optional.empty() : Optional.of(moneyLaunderingCheck);
	}

	public InvestmentAccountOwnershipInformation3 setMoneyLaunderingCheck(OldMoneyLaunderingCheck1Code moneyLaunderingCheck) {
		this.moneyLaunderingCheck = moneyLaunderingCheck;
		return this;
	}

	public Optional<Extended350Code> getExtendedMoneyLaunderingCheck() {
		return extendedMoneyLaunderingCheck == null ? Optional.empty() : Optional.of(extendedMoneyLaunderingCheck);
	}

	public InvestmentAccountOwnershipInformation3 setExtendedMoneyLaunderingCheck(Extended350Code extendedMoneyLaunderingCheck) {
		this.extendedMoneyLaunderingCheck = extendedMoneyLaunderingCheck;
		return this;
	}

	public Optional<PercentageRate> getOwnershipBeneficiaryRate() {
		return ownershipBeneficiaryRate == null ? Optional.empty() : Optional.of(ownershipBeneficiaryRate);
	}

	public InvestmentAccountOwnershipInformation3 setOwnershipBeneficiaryRate(PercentageRate ownershipBeneficiaryRate) {
		this.ownershipBeneficiaryRate = ownershipBeneficiaryRate;
		return this;
	}

	public Optional<Max35Text> getClientIdentification() {
		return clientIdentification == null ? Optional.empty() : Optional.of(clientIdentification);
	}

	public InvestmentAccountOwnershipInformation3 setClientIdentification(Max35Text clientIdentification) {
		this.clientIdentification = clientIdentification;
		return this;
	}

	public Optional<Extended350Code> getExtendedPartyRole() {
		return extendedPartyRole == null ? Optional.empty() : Optional.of(extendedPartyRole);
	}

	public InvestmentAccountOwnershipInformation3 setExtendedPartyRole(Extended350Code extendedPartyRole) {
		this.extendedPartyRole = extendedPartyRole;
		return this;
	}

	public Optional<YesNoIndicator> getFiscalExemption() {
		return fiscalExemption == null ? Optional.empty() : Optional.of(fiscalExemption);
	}

	public InvestmentAccountOwnershipInformation3 setFiscalExemption(YesNoIndicator fiscalExemption) {
		this.fiscalExemption = fiscalExemption;
		return this;
	}

	public Optional<YesNoIndicator> getSignatoryRightIndicator() {
		return signatoryRightIndicator == null ? Optional.empty() : Optional.of(signatoryRightIndicator);
	}

	public InvestmentAccountOwnershipInformation3 setSignatoryRightIndicator(YesNoIndicator signatoryRightIndicator) {
		this.signatoryRightIndicator = signatoryRightIndicator;
		return this;
	}
}