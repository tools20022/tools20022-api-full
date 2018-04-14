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
import com.tools20022.repository.area.auth.CCPClearingMemberReportV01;
import com.tools20022.repository.codeset.CreditQuality1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.ClearingMemberRole;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ClearingAccount1;
import com.tools20022.repository.msg.PartyIdentification121;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Legal counterpart to trades cleared through a central counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingMember1#mmIdentification
 * ClearingMember1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingMember1#mmCreditQuality
 * ClearingMember1.mmCreditQuality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingMember1#mmUltimateParentIdentification
 * ClearingMember1.mmUltimateParentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingMember1#mmFuturesCommissionMerchantIndicator
 * ClearingMember1.mmFuturesCommissionMerchantIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingMember1#mmMembershipValidFrom
 * ClearingMember1.mmMembershipValidFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingMember1#mmMembershipValidTo
 * ClearingMember1.mmMembershipValidTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingMember1#mmSponsoringClearingMemberIdentification
 * ClearingMember1.mmSponsoringClearingMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingMember1#mmClearingAccountOwner
 * ClearingMember1.mmClearingAccountOwner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
 * ClearingMemberRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPClearingMemberReportV01#mmClearingMember
 * CCPClearingMemberReportV01.mmClearingMember}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingMember1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Legal counterpart to trades cleared through a central counterparty."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClearingMember1", propOrder = {"identification", "creditQuality", "ultimateParentIdentification", "futuresCommissionMerchantIndicator", "membershipValidFrom", "membershipValidTo", "sponsoringClearingMemberIdentification",
		"clearingAccountOwner"})
public class ClearingMember1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected PartyIdentification121 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification121
	 * PartyIdentification121}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingMember1
	 * ClearingMember1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the clearing member."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ClearingMember1, PartyIdentification121> mmIdentification = new MMMessageAssociationEnd<ClearingMember1, PartyIdentification121>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingMember1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the clearing member.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification121.mmObject();
		}

		@Override
		public PartyIdentification121 getValue(ClearingMember1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(ClearingMember1 obj, PartyIdentification121 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "CdtQlty", required = true)
	protected CreditQuality1Code creditQuality;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code
	 * CreditQuality1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmCreditQuality
	 * Party.mmCreditQuality}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingMember1
	 * ClearingMember1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtQlty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditQuality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit quality for the clearing member."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingMember1, CreditQuality1Code> mmCreditQuality = new MMMessageAttribute<ClearingMember1, CreditQuality1Code>() {
		{
			businessElementTrace_lazy = () -> Party.mmCreditQuality;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingMember1.mmObject();
			isDerived = false;
			xmlTag = "CdtQlty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditQuality";
			definition = "Credit quality for the clearing member.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditQuality1Code.mmObject();
		}

		@Override
		public CreditQuality1Code getValue(ClearingMember1 obj) {
			return obj.getCreditQuality();
		}

		@Override
		public void setValue(ClearingMember1 obj, CreditQuality1Code value) {
			obj.setCreditQuality(value);
		}
	};
	@XmlElement(name = "UltmtPrntId")
	protected PartyIdentification121 ultimateParentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification121
	 * PartyIdentification121}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingMember1
	 * ClearingMember1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtPrntId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateParentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the ultimate parent of a clearing member if it is not the parent company itself.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ClearingMember1, Optional<PartyIdentification121>> mmUltimateParentIdentification = new MMMessageAssociationEnd<ClearingMember1, Optional<PartyIdentification121>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingMember1.mmObject();
			isDerived = false;
			xmlTag = "UltmtPrntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateParentIdentification";
			definition = "Identification of the ultimate parent of a clearing member if it is not the parent company itself.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification121.mmObject();
		}

		@Override
		public Optional<PartyIdentification121> getValue(ClearingMember1 obj) {
			return obj.getUltimateParentIdentification();
		}

		@Override
		public void setValue(ClearingMember1 obj, Optional<PartyIdentification121> value) {
			obj.setUltimateParentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "FutrsComssnMrchntInd", required = true)
	protected YesNoIndicator futuresCommissionMerchantIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.ClearingMember1
	 * ClearingMember1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FutrsComssnMrchntInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FuturesCommissionMerchantIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the clearing member is registered under the Commodity Exchange Act."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingMember1, YesNoIndicator> mmFuturesCommissionMerchantIndicator = new MMMessageAttribute<ClearingMember1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingMember1.mmObject();
			isDerived = false;
			xmlTag = "FutrsComssnMrchntInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FuturesCommissionMerchantIndicator";
			definition = "Identifies whether the clearing member is registered under the Commodity Exchange Act.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(ClearingMember1 obj) {
			return obj.getFuturesCommissionMerchantIndicator();
		}

		@Override
		public void setValue(ClearingMember1 obj, YesNoIndicator value) {
			obj.setFuturesCommissionMerchantIndicator(value);
		}
	};
	@XmlElement(name = "MmbshVldFr", required = true)
	protected ISODate membershipValidFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingMember1
	 * ClearingMember1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MmbshVldFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MembershipValidFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the entity becomes a clearing member contractually subject to the CCP’s Rulebook."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingMember1, ISODate> mmMembershipValidFrom = new MMMessageAttribute<ClearingMember1, ISODate>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingMember1.mmObject();
			isDerived = false;
			xmlTag = "MmbshVldFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MembershipValidFrom";
			definition = "Date on which the entity becomes a clearing member contractually subject to the CCP’s Rulebook.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(ClearingMember1 obj) {
			return obj.getMembershipValidFrom();
		}

		@Override
		public void setValue(ClearingMember1 obj, ISODate value) {
			obj.setMembershipValidFrom(value);
		}
	};
	@XmlElement(name = "MmbshVldTo")
	protected ISODate membershipValidTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmToDateTime
	 * DateTimePeriod.mmToDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingMember1
	 * ClearingMember1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MmbshVldTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MembershipValidTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the clearing member is no longer a member in any clearing services protected by the default waterfall as defined by the CCP’s rules. Typically this will be the day the clearing member’s default fund contribution is repaid or they are no longer contractually subject to rights of assessment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingMember1, Optional<ISODate>> mmMembershipValidTo = new MMMessageAttribute<ClearingMember1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmToDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingMember1.mmObject();
			isDerived = false;
			xmlTag = "MmbshVldTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MembershipValidTo";
			definition = "Date on which the clearing member is no longer a member in any clearing services protected by the default waterfall as defined by the CCP’s rules. Typically this will be the day the clearing member’s default fund contribution is repaid or they are no longer contractually subject to rights of assessment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(ClearingMember1 obj) {
			return obj.getMembershipValidTo();
		}

		@Override
		public void setValue(ClearingMember1 obj, Optional<ISODate> value) {
			obj.setMembershipValidTo(value.orElse(null));
		}
	};
	@XmlElement(name = "SpnsrgClrMmbId")
	protected PartyIdentification121 sponsoringClearingMemberIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification121
	 * PartyIdentification121}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingMember1
	 * ClearingMember1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpnsrgClrMmbId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SponsoringClearingMemberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of another clearing member or institution that acts as sponsor to the clearing member, undertaking certain of its obligations at the central counterparty on its behalf. These obligations typically include, but are not limited to, making default fund contributions and participating in default auctions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ClearingMember1, Optional<PartyIdentification121>> mmSponsoringClearingMemberIdentification = new MMMessageAssociationEnd<ClearingMember1, Optional<PartyIdentification121>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingMember1.mmObject();
			isDerived = false;
			xmlTag = "SpnsrgClrMmbId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SponsoringClearingMemberIdentification";
			definition = "Identification of another clearing member or institution that acts as sponsor to the clearing member, undertaking certain of its obligations at the central counterparty on its behalf. These obligations typically include, but are not limited to, making default fund contributions and participating in default auctions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification121.mmObject();
		}

		@Override
		public Optional<PartyIdentification121> getValue(ClearingMember1 obj) {
			return obj.getSponsoringClearingMemberIdentification();
		}

		@Override
		public void setValue(ClearingMember1 obj, Optional<PartyIdentification121> value) {
			obj.setSponsoringClearingMemberIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrAcctOwnr", required = true)
	protected List<ClearingAccount1> clearingAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ClearingAccount1
	 * ClearingAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingAccount
	 * ClearingMemberRole.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingMember1
	 * ClearingMember1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrAcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Operational construct of a central counterparty that defines the relationship between collateral, margin and position accounts and upon default of a clearing member defines the segregation of losses on positions and assets held in that account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ClearingMember1, List<ClearingAccount1>> mmClearingAccountOwner = new MMMessageAssociationEnd<ClearingMember1, List<ClearingAccount1>>() {
		{
			businessElementTrace_lazy = () -> ClearingMemberRole.mmClearingAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingMember1.mmObject();
			isDerived = false;
			xmlTag = "ClrAcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingAccountOwner";
			definition = "Operational construct of a central counterparty that defines the relationship between collateral, margin and position accounts and upon default of a clearing member defines the segregation of losses on positions and assets held in that account.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ClearingAccount1.mmObject();
		}

		@Override
		public List<ClearingAccount1> getValue(ClearingMember1 obj) {
			return obj.getClearingAccountOwner();
		}

		@Override
		public void setValue(ClearingMember1 obj, List<ClearingAccount1> value) {
			obj.setClearingAccountOwner(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ClearingMember1.mmIdentification, com.tools20022.repository.msg.ClearingMember1.mmCreditQuality,
						com.tools20022.repository.msg.ClearingMember1.mmUltimateParentIdentification, com.tools20022.repository.msg.ClearingMember1.mmFuturesCommissionMerchantIndicator,
						com.tools20022.repository.msg.ClearingMember1.mmMembershipValidFrom, com.tools20022.repository.msg.ClearingMember1.mmMembershipValidTo,
						com.tools20022.repository.msg.ClearingMember1.mmSponsoringClearingMemberIdentification, com.tools20022.repository.msg.ClearingMember1.mmClearingAccountOwner);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPClearingMemberReportV01.mmClearingMember);
				trace_lazy = () -> ClearingMemberRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ClearingMember1";
				definition = "Legal counterpart to trades cleared through a central counterparty.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification121 getIdentification() {
		return identification;
	}

	public ClearingMember1 setIdentification(PartyIdentification121 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public CreditQuality1Code getCreditQuality() {
		return creditQuality;
	}

	public ClearingMember1 setCreditQuality(CreditQuality1Code creditQuality) {
		this.creditQuality = Objects.requireNonNull(creditQuality);
		return this;
	}

	public Optional<PartyIdentification121> getUltimateParentIdentification() {
		return ultimateParentIdentification == null ? Optional.empty() : Optional.of(ultimateParentIdentification);
	}

	public ClearingMember1 setUltimateParentIdentification(PartyIdentification121 ultimateParentIdentification) {
		this.ultimateParentIdentification = ultimateParentIdentification;
		return this;
	}

	public YesNoIndicator getFuturesCommissionMerchantIndicator() {
		return futuresCommissionMerchantIndicator;
	}

	public ClearingMember1 setFuturesCommissionMerchantIndicator(YesNoIndicator futuresCommissionMerchantIndicator) {
		this.futuresCommissionMerchantIndicator = Objects.requireNonNull(futuresCommissionMerchantIndicator);
		return this;
	}

	public ISODate getMembershipValidFrom() {
		return membershipValidFrom;
	}

	public ClearingMember1 setMembershipValidFrom(ISODate membershipValidFrom) {
		this.membershipValidFrom = Objects.requireNonNull(membershipValidFrom);
		return this;
	}

	public Optional<ISODate> getMembershipValidTo() {
		return membershipValidTo == null ? Optional.empty() : Optional.of(membershipValidTo);
	}

	public ClearingMember1 setMembershipValidTo(ISODate membershipValidTo) {
		this.membershipValidTo = membershipValidTo;
		return this;
	}

	public Optional<PartyIdentification121> getSponsoringClearingMemberIdentification() {
		return sponsoringClearingMemberIdentification == null ? Optional.empty() : Optional.of(sponsoringClearingMemberIdentification);
	}

	public ClearingMember1 setSponsoringClearingMemberIdentification(PartyIdentification121 sponsoringClearingMemberIdentification) {
		this.sponsoringClearingMemberIdentification = sponsoringClearingMemberIdentification;
		return this;
	}

	public List<ClearingAccount1> getClearingAccountOwner() {
		return clearingAccountOwner == null ? clearingAccountOwner = new ArrayList<>() : clearingAccountOwner;
	}

	public ClearingMember1 setClearingAccountOwner(List<ClearingAccount1> clearingAccountOwner) {
		this.clearingAccountOwner = Objects.requireNonNull(clearingAccountOwner);
		return this;
	}
}