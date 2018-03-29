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
import com.tools20022.repository.area.acmt.AccountManagementStatusReportV06;
import com.tools20022.repository.choice.AcceptedStatusReason1Choice;
import com.tools20022.repository.choice.BlockedStatusReason2Choice;
import com.tools20022.repository.choice.Status25Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Account23;
import com.tools20022.repository.msg.AccountStatus2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmStatus
 * AccountManagementStatusAndReason5.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmStatusReason
 * AccountManagementStatusAndReason5.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmAccountApplicationIdentification
 * AccountManagementStatusAndReason5.mmAccountApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmExistingAccountIdentification
 * AccountManagementStatusAndReason5.mmExistingAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmAccountIdentification
 * AccountManagementStatusAndReason5.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmAccountStatus
 * AccountManagementStatusAndReason5.mmAccountStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmBlockedStatus
 * AccountManagementStatusAndReason5.mmBlockedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmFATCAReportingDate
 * AccountManagementStatusAndReason5.mmFATCAReportingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmCRSReportingDate
 * AccountManagementStatusAndReason5.mmCRSReportingDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountStatus
 * AccountStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#mmStatusReport
 * AccountManagementStatusReportV06.mmStatusReport}</li>
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
 * "AccountManagementStatusAndReason5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason4
 * AccountManagementStatusAndReason4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountManagementStatusAndReason5", propOrder = {"status", "statusReason", "accountApplicationIdentification", "existingAccountIdentification", "accountIdentification", "accountStatus", "blockedStatus",
		"fATCAReportingDate", "cRSReportingDate"})
public class AccountManagementStatusAndReason5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sts", required = true)
	protected Status25Choice status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Status25Choice
	 * Status25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5
	 * AccountManagementStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the account management instruction that was previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason4#mmStatus
	 * AccountManagementStatusAndReason4.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountManagementStatusAndReason5, Status25Choice> mmStatus = new MMMessageAttribute<AccountManagementStatusAndReason5, Status25Choice>() {
		{
			businessComponentTrace_lazy = () -> AccountStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the account management instruction that was previously received.";
			previousVersion_lazy = () -> AccountManagementStatusAndReason4.mmStatus;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Status25Choice.mmObject();
		}

		@Override
		public Status25Choice getValue(AccountManagementStatusAndReason5 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(AccountManagementStatusAndReason5 obj, Status25Choice value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "StsRsn")
	protected List<AcceptedStatusReason1Choice> statusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatusReason1Choice
	 * AcceptedStatusReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5
	 * AccountManagementStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the status of the account management instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountManagementStatusAndReason5, List<AcceptedStatusReason1Choice>> mmStatusReason = new MMMessageAssociationEnd<AccountManagementStatusAndReason5, List<AcceptedStatusReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "StsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReason";
			definition = "Reason for the status of the account management instruction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AcceptedStatusReason1Choice.mmObject();
		}

		@Override
		public List<AcceptedStatusReason1Choice> getValue(AccountManagementStatusAndReason5 obj) {
			return obj.getStatusReason();
		}

		@Override
		public void setValue(AccountManagementStatusAndReason5 obj, List<AcceptedStatusReason1Choice> value) {
			obj.setStatusReason(value);
		}
	};
	@XmlElement(name = "AcctApplId")
	protected Max35Text accountApplicationIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5
	 * AccountManagementStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctApplId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of the account opening or modification instruction at application level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason4#mmAccountApplicationIdentification
	 * AccountManagementStatusAndReason4.mmAccountApplicationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountManagementStatusAndReason5, Optional<Max35Text>> mmAccountApplicationIdentification = new MMMessageAttribute<AccountManagementStatusAndReason5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "AcctApplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountApplicationIdentification";
			definition = "Unique and unambiguous identifier of the account opening or modification instruction at application level.";
			previousVersion_lazy = () -> AccountManagementStatusAndReason4.mmAccountApplicationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AccountManagementStatusAndReason5 obj) {
			return obj.getAccountApplicationIdentification();
		}

		@Override
		public void setValue(AccountManagementStatusAndReason5 obj, Optional<Max35Text> value) {
			obj.setAccountApplicationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ExstgAcctId")
	protected List<Account23> existingAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Account23 Account23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5
	 * AccountManagementStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExstgAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExistingAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to which the account opening is related."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason4#mmExistingAccountIdentification
	 * AccountManagementStatusAndReason4.mmExistingAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountManagementStatusAndReason5, List<Account23>> mmExistingAccountIdentification = new MMMessageAssociationEnd<AccountManagementStatusAndReason5, List<Account23>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "ExstgAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExistingAccountIdentification";
			definition = "Account to which the account opening is related.";
			previousVersion_lazy = () -> AccountManagementStatusAndReason4.mmExistingAccountIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Account23.mmObject();
		}

		@Override
		public List<Account23> getValue(AccountManagementStatusAndReason5 obj) {
			return obj.getExistingAccountIdentification();
		}

		@Override
		public void setValue(AccountManagementStatusAndReason5 obj, List<Account23> value) {
			obj.setExistingAccountIdentification(value);
		}
	};
	@XmlElement(name = "AcctId")
	protected Max35Text accountIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5
	 * AccountManagementStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountManagementStatusAndReason5, Optional<Max35Text>> mmAccountIdentification = new MMMessageAttribute<AccountManagementStatusAndReason5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AccountManagementStatusAndReason5 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(AccountManagementStatusAndReason5 obj, Optional<Max35Text> value) {
			obj.setAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSts")
	protected AccountStatus2 accountStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountStatus2
	 * AccountStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmStatus
	 * Account.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5
	 * AccountManagementStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountManagementStatusAndReason5, Optional<AccountStatus2>> mmAccountStatus = new MMMessageAssociationEnd<AccountManagementStatusAndReason5, Optional<AccountStatus2>>() {
		{
			businessElementTrace_lazy = () -> Account.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "AcctSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountStatus";
			definition = "Status of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountStatus2.mmObject();
		}

		@Override
		public Optional<AccountStatus2> getValue(AccountManagementStatusAndReason5 obj) {
			return obj.getAccountStatus();
		}

		@Override
		public void setValue(AccountManagementStatusAndReason5 obj, Optional<AccountStatus2> value) {
			obj.setAccountStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "BlckdSts")
	protected BlockedStatusReason2Choice blockedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BlockedStatusReason2Choice
	 * BlockedStatusReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmStatus
	 * Account.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5
	 * AccountManagementStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account is blocked and other factors for the blocked account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountManagementStatusAndReason5, Optional<BlockedStatusReason2Choice>> mmBlockedStatus = new MMMessageAttribute<AccountManagementStatusAndReason5, Optional<BlockedStatusReason2Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "BlckdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedStatus";
			definition = "Specifies the account is blocked and other factors for the blocked account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BlockedStatusReason2Choice.mmObject();
		}

		@Override
		public Optional<BlockedStatusReason2Choice> getValue(AccountManagementStatusAndReason5 obj) {
			return obj.getBlockedStatus();
		}

		@Override
		public void setValue(AccountManagementStatusAndReason5 obj, Optional<BlockedStatusReason2Choice> value) {
			obj.setBlockedStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "FATCARptgDt")
	protected ISODate fATCAReportingDate;
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
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus#mmFATCAReportingDate
	 * FATCAStatus.mmFATCAReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5
	 * AccountManagementStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FATCARptgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAReportingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountManagementStatusAndReason5, Optional<ISODate>> mmFATCAReportingDate = new MMMessageAttribute<AccountManagementStatusAndReason5, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> FATCAStatus.mmFATCAReportingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "FATCARptgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAReportingDate";
			definition = "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AccountManagementStatusAndReason5 obj) {
			return obj.getFATCAReportingDate();
		}

		@Override
		public void setValue(AccountManagementStatusAndReason5 obj, Optional<ISODate> value) {
			obj.setFATCAReportingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CRSRptgDt")
	protected ISODate cRSReportingDate;
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
	 * {@linkplain com.tools20022.repository.entity.CRSStatus#mmCRSReportingDate
	 * CRSStatus.mmCRSReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5
	 * AccountManagementStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CRSRptgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRSReportingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountManagementStatusAndReason5, Optional<ISODate>> mmCRSReportingDate = new MMMessageAttribute<AccountManagementStatusAndReason5, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CRSStatus.mmCRSReportingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "CRSRptgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRSReportingDate";
			definition = "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AccountManagementStatusAndReason5 obj) {
			return obj.getCRSReportingDate();
		}

		@Override
		public void setValue(AccountManagementStatusAndReason5 obj, Optional<ISODate> value) {
			obj.setCRSReportingDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmStatus, com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmStatusReason,
						com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmAccountApplicationIdentification, com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmExistingAccountIdentification,
						com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmAccountIdentification, com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmAccountStatus,
						com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmBlockedStatus, com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmFATCAReportingDate,
						com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmCRSReportingDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountManagementStatusReportV06.mmStatusReport);
				trace_lazy = () -> AccountStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountManagementStatusAndReason5";
				definition = "Status information.";
				previousVersion_lazy = () -> AccountManagementStatusAndReason4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Status25Choice getStatus() {
		return status;
	}

	public AccountManagementStatusAndReason5 setStatus(Status25Choice status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<AcceptedStatusReason1Choice> getStatusReason() {
		return statusReason == null ? statusReason = new ArrayList<>() : statusReason;
	}

	public AccountManagementStatusAndReason5 setStatusReason(List<AcceptedStatusReason1Choice> statusReason) {
		this.statusReason = Objects.requireNonNull(statusReason);
		return this;
	}

	public Optional<Max35Text> getAccountApplicationIdentification() {
		return accountApplicationIdentification == null ? Optional.empty() : Optional.of(accountApplicationIdentification);
	}

	public AccountManagementStatusAndReason5 setAccountApplicationIdentification(Max35Text accountApplicationIdentification) {
		this.accountApplicationIdentification = accountApplicationIdentification;
		return this;
	}

	public List<Account23> getExistingAccountIdentification() {
		return existingAccountIdentification == null ? existingAccountIdentification = new ArrayList<>() : existingAccountIdentification;
	}

	public AccountManagementStatusAndReason5 setExistingAccountIdentification(List<Account23> existingAccountIdentification) {
		this.existingAccountIdentification = Objects.requireNonNull(existingAccountIdentification);
		return this;
	}

	public Optional<Max35Text> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public AccountManagementStatusAndReason5 setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}

	public Optional<AccountStatus2> getAccountStatus() {
		return accountStatus == null ? Optional.empty() : Optional.of(accountStatus);
	}

	public AccountManagementStatusAndReason5 setAccountStatus(AccountStatus2 accountStatus) {
		this.accountStatus = accountStatus;
		return this;
	}

	public Optional<BlockedStatusReason2Choice> getBlockedStatus() {
		return blockedStatus == null ? Optional.empty() : Optional.of(blockedStatus);
	}

	public AccountManagementStatusAndReason5 setBlockedStatus(BlockedStatusReason2Choice blockedStatus) {
		this.blockedStatus = blockedStatus;
		return this;
	}

	public Optional<ISODate> getFATCAReportingDate() {
		return fATCAReportingDate == null ? Optional.empty() : Optional.of(fATCAReportingDate);
	}

	public AccountManagementStatusAndReason5 setFATCAReportingDate(ISODate fATCAReportingDate) {
		this.fATCAReportingDate = fATCAReportingDate;
		return this;
	}

	public Optional<ISODate> getCRSReportingDate() {
		return cRSReportingDate == null ? Optional.empty() : Optional.of(cRSReportingDate);
	}

	public AccountManagementStatusAndReason5 setCRSReportingDate(ISODate cRSReportingDate) {
		this.cRSReportingDate = cRSReportingDate;
		return this;
	}
}