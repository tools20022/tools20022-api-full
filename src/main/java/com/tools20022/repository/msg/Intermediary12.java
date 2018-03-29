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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02;
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV02;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV03;
import com.tools20022.repository.choice.PartyIdentification4Choice;
import com.tools20022.repository.codeset.InvestmentFundRole3Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Account2;
import com.tools20022.repository.msg.CommunicationAddress3;
import com.tools20022.repository.msg.NameAndAddress4;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Party that provides services relating to financial products to investors, eg,
 * advice on products and placement of orders for the investment fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary12#RoleOrExtendedRoleRule
 * Intermediary12.RoleOrExtendedRoleRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary12#mmIdentification
 * Intermediary12.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary12#mmAccount
 * Intermediary12.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary12#mmWaivedTrailerCommissionIndicator
 * Intermediary12.mmWaivedTrailerCommissionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary12#mmRole
 * Intermediary12.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary12#mmExtendedRole
 * Intermediary12.mmExtendedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary12#mmPrimaryCommunicationAddress
 * Intermediary12.mmPrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary12#mmSecondaryCommunicationAddress
 * Intermediary12.mmSecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary12#mmNameAndAddress
 * Intermediary12.mmNameAndAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IntermediaryRole
 * IntermediaryRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmIntermediaries
 * AccountDetailsConfirmationV02.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmIntermediaries
 * AccountDetailsConfirmationV03.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV02#mmIntermediaries
 * AccountOpeningInstructionV02.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmIntermediaries
 * AccountOpeningInstructionV03.mmIntermediaries}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Intermediary12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that provides services relating to financial products to investors, eg, advice on products and placement of orders for the investment fund."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Intermediary12", propOrder = {"identification", "account", "waivedTrailerCommissionIndicator", "role", "extendedRole", "primaryCommunicationAddress", "secondaryCommunicationAddress", "nameAndAddress"})
public class Intermediary12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected PartyIdentification4Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification4Choice
	 * PartyIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary12 Intermediary12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an organisation that is allocated by an institution, eg, Dun &amp; Bradstreet Identification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Intermediary12, PartyIdentification4Choice> mmIdentification = new MMMessageAttribute<Intermediary12, PartyIdentification4Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary12.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier for an organisation that is allocated by an institution, eg, Dun & Bradstreet Identification.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification4Choice.mmObject();
		}

		@Override
		public PartyIdentification4Choice getValue(Intermediary12 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Intermediary12 obj, PartyIdentification4Choice value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Acct")
	protected Account2 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account2
	 * Account2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountPartyRole#mmAccount
	 * AccountPartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary12 Intermediary12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business relationship between two entities; one entity is the account owner, the other entity is the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Intermediary12, Optional<Account2>> mmAccount = new MMMessageAttribute<Intermediary12, Optional<Account2>>() {
		{
			businessElementTrace_lazy = () -> AccountPartyRole.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary12.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Business relationship between two entities; one entity is the account owner, the other entity is the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Account2.mmObject();
		}

		@Override
		public Optional<Account2> getValue(Intermediary12 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(Intermediary12 obj, Optional<Account2> value) {
			obj.setAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "WvdTrlrComssnInd")
	protected YesNoIndicator waivedTrailerCommissionIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionWaiving
	 * Commission.mmCommissionWaiving}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary12 Intermediary12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WvdTrlrComssnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaivedTrailerCommissionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Non-enforcement of the right to all or part of a commission by the party entitled to the commission."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Intermediary12, Optional<YesNoIndicator>> mmWaivedTrailerCommissionIndicator = new MMMessageAttribute<Intermediary12, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommissionWaiving;
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary12.mmObject();
			isDerived = false;
			xmlTag = "WvdTrlrComssnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaivedTrailerCommissionIndicator";
			definition = "Non-enforcement of the right to all or part of a commission by the party entitled to the commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Intermediary12 obj) {
			return obj.getWaivedTrailerCommissionIndicator();
		}

		@Override
		public void setValue(Intermediary12 obj, Optional<YesNoIndicator> value) {
			obj.setWaivedTrailerCommissionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Role")
	protected InvestmentFundRole3Code role;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryRole
	 * IntermediaryRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary12 Intermediary12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The role or function performed by an intermediary in a given situation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Intermediary12, Optional<InvestmentFundRole3Code>> mmRole = new MMMessageAttribute<Intermediary12, Optional<InvestmentFundRole3Code>>() {
		{
			businessComponentTrace_lazy = () -> IntermediaryRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary12.mmObject();
			isDerived = false;
			xmlTag = "Role";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Role";
			definition = "The role or function performed by an intermediary in a given situation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InvestmentFundRole3Code.mmObject();
		}

		@Override
		public Optional<InvestmentFundRole3Code> getValue(Intermediary12 obj) {
			return obj.getRole();
		}

		@Override
		public void setValue(Intermediary12 obj, Optional<InvestmentFundRole3Code> value) {
			obj.setRole(value.orElse(null));
		}
	};
	@XmlElement(name = "XtndedRole")
	protected Extended350Code extendedRole;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryRole
	 * IntermediaryRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary12 Intermediary12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The role or function performed by an intermediary in a given situation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Intermediary12, Optional<Extended350Code>> mmExtendedRole = new MMMessageAttribute<Intermediary12, Optional<Extended350Code>>() {
		{
			businessComponentTrace_lazy = () -> IntermediaryRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary12.mmObject();
			isDerived = false;
			xmlTag = "XtndedRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedRole";
			definition = "The role or function performed by an intermediary in a given situation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Optional<Extended350Code> getValue(Intermediary12 obj) {
			return obj.getExtendedRole();
		}

		@Override
		public void setValue(Intermediary12 obj, Optional<Extended350Code> value) {
			obj.setExtendedRole(value.orElse(null));
		}
	};
	@XmlElement(name = "PmryComAdr")
	protected CommunicationAddress3 primaryCommunicationAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommunicationAddress3
	 * CommunicationAddress3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary12 Intermediary12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryComAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryCommunicationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Communication device number or electronic address used for communication."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Intermediary12, Optional<CommunicationAddress3>> mmPrimaryCommunicationAddress = new MMMessageAssociationEnd<Intermediary12, Optional<CommunicationAddress3>>() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary12.mmObject();
			isDerived = false;
			xmlTag = "PmryComAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryCommunicationAddress";
			definition = "Communication device number or electronic address used for communication.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommunicationAddress3.mmObject();
		}

		@Override
		public Optional<CommunicationAddress3> getValue(Intermediary12 obj) {
			return obj.getPrimaryCommunicationAddress();
		}

		@Override
		public void setValue(Intermediary12 obj, Optional<CommunicationAddress3> value) {
			obj.setPrimaryCommunicationAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndryComAdr")
	protected CommunicationAddress3 secondaryCommunicationAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommunicationAddress3
	 * CommunicationAddress3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary12 Intermediary12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryComAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryCommunicationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Communication device number or electronic address used for communication."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Intermediary12, Optional<CommunicationAddress3>> mmSecondaryCommunicationAddress = new MMMessageAssociationEnd<Intermediary12, Optional<CommunicationAddress3>>() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary12.mmObject();
			isDerived = false;
			xmlTag = "ScndryComAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryCommunicationAddress";
			definition = "Communication device number or electronic address used for communication.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommunicationAddress3.mmObject();
		}

		@Override
		public Optional<CommunicationAddress3> getValue(Intermediary12 obj) {
			return obj.getSecondaryCommunicationAddress();
		}

		@Override
		public void setValue(Intermediary12 obj, Optional<CommunicationAddress3> value) {
			obj.setSecondaryCommunicationAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "NmAndAdr")
	protected NameAndAddress4 nameAndAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress4
	 * NameAndAddress4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary12 Intermediary12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmAndAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameAndAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address, as defined by postal services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Intermediary12, Optional<NameAndAddress4>> mmNameAndAddress = new MMMessageAssociationEnd<Intermediary12, Optional<NameAndAddress4>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary12.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Information that locates and identifies a specific address, as defined by postal services.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NameAndAddress4.mmObject();
		}

		@Override
		public Optional<NameAndAddress4> getValue(Intermediary12 obj) {
			return obj.getNameAndAddress();
		}

		@Override
		public void setValue(Intermediary12 obj, Optional<NameAndAddress4> value) {
			obj.setNameAndAddress(value.orElse(null));
		}
	};
	/**
	 * Either Role or ExtendedRole may be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary12 Intermediary12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary12#mmRole
	 * Intermediary12.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary12#mmExtendedRole
	 * Intermediary12.mmExtendedRole}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoleOrExtendedRoleRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either Role or ExtendedRole may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor RoleOrExtendedRoleRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoleOrExtendedRoleRule";
			definition = "Either Role or ExtendedRole may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.Intermediary12.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary12.mmRole, com.tools20022.repository.msg.Intermediary12.mmExtendedRole);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.msg.Intermediary12.mmIdentification, com.tools20022.repository.msg.Intermediary12.mmAccount, com.tools20022.repository.msg.Intermediary12.mmWaivedTrailerCommissionIndicator,
								com.tools20022.repository.msg.Intermediary12.mmRole, com.tools20022.repository.msg.Intermediary12.mmExtendedRole, com.tools20022.repository.msg.Intermediary12.mmPrimaryCommunicationAddress,
								com.tools20022.repository.msg.Intermediary12.mmSecondaryCommunicationAddress, com.tools20022.repository.msg.Intermediary12.mmNameAndAddress);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountDetailsConfirmationV02.mmIntermediaries, AccountDetailsConfirmationV03.mmIntermediaries, AccountOpeningInstructionV02.mmIntermediaries,
						AccountOpeningInstructionV03.mmIntermediaries);
				trace_lazy = () -> IntermediaryRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Intermediary12";
				definition = "Party that provides services relating to financial products to investors, eg, advice on products and placement of orders for the investment fund.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary12.RoleOrExtendedRoleRule);
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification4Choice getIdentification() {
		return identification;
	}

	public Intermediary12 setIdentification(PartyIdentification4Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Account2> getAccount() {
		return account == null ? Optional.empty() : Optional.of(account);
	}

	public Intermediary12 setAccount(Account2 account) {
		this.account = account;
		return this;
	}

	public Optional<YesNoIndicator> getWaivedTrailerCommissionIndicator() {
		return waivedTrailerCommissionIndicator == null ? Optional.empty() : Optional.of(waivedTrailerCommissionIndicator);
	}

	public Intermediary12 setWaivedTrailerCommissionIndicator(YesNoIndicator waivedTrailerCommissionIndicator) {
		this.waivedTrailerCommissionIndicator = waivedTrailerCommissionIndicator;
		return this;
	}

	public Optional<InvestmentFundRole3Code> getRole() {
		return role == null ? Optional.empty() : Optional.of(role);
	}

	public Intermediary12 setRole(InvestmentFundRole3Code role) {
		this.role = role;
		return this;
	}

	public Optional<Extended350Code> getExtendedRole() {
		return extendedRole == null ? Optional.empty() : Optional.of(extendedRole);
	}

	public Intermediary12 setExtendedRole(Extended350Code extendedRole) {
		this.extendedRole = extendedRole;
		return this;
	}

	public Optional<CommunicationAddress3> getPrimaryCommunicationAddress() {
		return primaryCommunicationAddress == null ? Optional.empty() : Optional.of(primaryCommunicationAddress);
	}

	public Intermediary12 setPrimaryCommunicationAddress(CommunicationAddress3 primaryCommunicationAddress) {
		this.primaryCommunicationAddress = primaryCommunicationAddress;
		return this;
	}

	public Optional<CommunicationAddress3> getSecondaryCommunicationAddress() {
		return secondaryCommunicationAddress == null ? Optional.empty() : Optional.of(secondaryCommunicationAddress);
	}

	public Intermediary12 setSecondaryCommunicationAddress(CommunicationAddress3 secondaryCommunicationAddress) {
		this.secondaryCommunicationAddress = secondaryCommunicationAddress;
		return this;
	}

	public Optional<NameAndAddress4> getNameAndAddress() {
		return nameAndAddress == null ? Optional.empty() : Optional.of(nameAndAddress);
	}

	public Intermediary12 setNameAndAddress(NameAndAddress4 nameAndAddress) {
		this.nameAndAddress = nameAndAddress;
		return this;
	}
}