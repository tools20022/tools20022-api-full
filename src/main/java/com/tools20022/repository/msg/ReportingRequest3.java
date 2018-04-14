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
import com.tools20022.repository.area.camt.AccountReportingRequestV03;
import com.tools20022.repository.choice.Party12Choice;
import com.tools20022.repository.datatype.Max35Text;
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
 * Provides further details on the reporting request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#mmIdentification
 * ReportingRequest3.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#mmRequestedMessageNameIdentification
 * ReportingRequest3.mmRequestedMessageNameIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingRequest3#mmAccount
 * ReportingRequest3.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#mmAccountOwner
 * ReportingRequest3.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#mmAccountServicer
 * ReportingRequest3.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#mmReportingPeriod
 * ReportingRequest3.mmReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#mmRequestedTransactionType
 * ReportingRequest3.mmRequestedTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#mmRequestedBalanceType
 * ReportingRequest3.mmRequestedBalanceType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ReportingService
 * ReportingService}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AccountReportingRequestV03#mmReportingRequest
 * AccountReportingRequestV03.mmReportingRequest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportingRequest3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides further details on the reporting request."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingRequest4
 * ReportingRequest4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReportingRequest3", propOrder = {"identification", "requestedMessageNameIdentification", "account", "accountOwner", "accountServicer", "reportingPeriod", "requestedTransactionType", "requestedBalanceType"})
public class ReportingRequest3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id")
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3
	 * ReportingRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the account owner, to unambiguously identify the account reporting request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmIdentification
	 * ReportingRequest4.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportingRequest3, Optional<Max35Text>> mmIdentification = new MMMessageAttribute<ReportingRequest3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification, as assigned by the account owner, to unambiguously identify the account reporting request.";
			nextVersions_lazy = () -> Arrays.asList(ReportingRequest4.mmIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ReportingRequest3 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(ReportingRequest3 obj, Optional<Max35Text> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdMsgNmId", required = true)
	protected Max35Text requestedMessageNameIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3
	 * ReportingRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdMsgNmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedMessageNameIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of the requested reporting message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmRequestedMessageNameIdentification
	 * ReportingRequest4.mmRequestedMessageNameIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportingRequest3, Max35Text> mmRequestedMessageNameIdentification = new MMMessageAttribute<ReportingRequest3, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest3.mmObject();
			isDerived = false;
			xmlTag = "ReqdMsgNmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedMessageNameIdentification";
			definition = "Specifies the type of the requested reporting message.";
			nextVersions_lazy = () -> Arrays.asList(ReportingRequest4.mmRequestedMessageNameIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ReportingRequest3 obj) {
			return obj.getRequestedMessageNameIdentification();
		}

		@Override
		public void setValue(ReportingRequest3 obj, Max35Text value) {
			obj.setRequestedMessageNameIdentification(value);
		}
	};
	@XmlElement(name = "Acct")
	protected CashAccount24 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccount
	 * CashAccountContract.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3
	 * ReportingRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account to which the reporting request refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmAccount
	 * ReportingRequest4.mmAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest3, Optional<CashAccount24>> mmAccount = new MMMessageAssociationEnd<ReportingRequest3, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> CashAccountContract.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest3.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unambiguous identification of the account to which the reporting request refers.";
			nextVersions_lazy = () -> Arrays.asList(ReportingRequest4.mmAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(ReportingRequest3 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(ReportingRequest3 obj, Optional<CashAccount24> value) {
			obj.setAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnr", required = true)
	protected Party12Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party12Choice
	 * Party12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3
	 * ReportingRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmAccountOwner
	 * ReportingRequest4.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest3, Party12Choice> mmAccountOwner = new MMMessageAssociationEnd<ReportingRequest3, Party12Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest3.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(ReportingRequest4.mmAccountOwner);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party12Choice.mmObject();
		}

		@Override
		public Party12Choice getValue(ReportingRequest3 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(ReportingRequest3 obj, Party12Choice value) {
			obj.setAccountOwner(value);
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected BranchAndFinancialInstitutionIdentification5 accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3
	 * ReportingRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmAccountServicer
	 * ReportingRequest4.mmAccountServicer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest3, Optional<BranchAndFinancialInstitutionIdentification5>> mmAccountServicer = new MMMessageAssociationEnd<ReportingRequest3, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest3.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			nextVersions_lazy = () -> Arrays.asList(ReportingRequest4.mmAccountServicer);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(ReportingRequest3 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(ReportingRequest3 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "RptgPrd")
	protected ReportingPeriod1 reportingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReportingPeriod1
	 * ReportingPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3
	 * ReportingRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the requested reporting period."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmReportingPeriod
	 * ReportingRequest4.mmReportingPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest3, Optional<ReportingPeriod1>> mmReportingPeriod = new MMMessageAssociationEnd<ReportingRequest3, Optional<ReportingPeriod1>>() {
		{
			businessComponentTrace_lazy = () -> DateTimePeriod.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest3.mmObject();
			isDerived = false;
			xmlTag = "RptgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingPeriod";
			definition = "Specifies the requested reporting period.";
			nextVersions_lazy = () -> Arrays.asList(ReportingRequest4.mmReportingPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReportingPeriod1.mmObject();
		}

		@Override
		public Optional<ReportingPeriod1> getValue(ReportingRequest3 obj) {
			return obj.getReportingPeriod();
		}

		@Override
		public void setValue(ReportingRequest3 obj, Optional<ReportingPeriod1> value) {
			obj.setReportingPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdTxTp")
	protected TransactionType1 requestedTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionType1
	 * TransactionType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashEntry
	 * CashAccount.mmCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3
	 * ReportingRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdTxTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the transactions to be reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmRequestedTransactionType
	 * ReportingRequest4.mmRequestedTransactionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest3, Optional<TransactionType1>> mmRequestedTransactionType = new MMMessageAssociationEnd<ReportingRequest3, Optional<TransactionType1>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashEntry;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest3.mmObject();
			isDerived = false;
			xmlTag = "ReqdTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedTransactionType";
			definition = "Identifies the transactions to be reported.";
			nextVersions_lazy = () -> Arrays.asList(ReportingRequest4.mmRequestedTransactionType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionType1.mmObject();
		}

		@Override
		public Optional<TransactionType1> getValue(ReportingRequest3 obj) {
			return obj.getRequestedTransactionType();
		}

		@Override
		public void setValue(ReportingRequest3 obj, Optional<TransactionType1> value) {
			obj.setRequestedTransactionType(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdBalTp")
	protected List<BalanceType12> requestedBalanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BalanceType12
	 * BalanceType12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3
	 * ReportingRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdBalTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the requested balance reporting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmRequestedBalanceType
	 * ReportingRequest4.mmRequestedBalanceType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest3, List<BalanceType12>> mmRequestedBalanceType = new MMMessageAssociationEnd<ReportingRequest3, List<BalanceType12>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest3.mmObject();
			isDerived = false;
			xmlTag = "ReqdBalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedBalanceType";
			definition = "Provides details on the requested balance reporting.";
			nextVersions_lazy = () -> Arrays.asList(ReportingRequest4.mmRequestedBalanceType);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceType12.mmObject();
		}

		@Override
		public List<BalanceType12> getValue(ReportingRequest3 obj) {
			return obj.getRequestedBalanceType();
		}

		@Override
		public void setValue(ReportingRequest3 obj, List<BalanceType12> value) {
			obj.setRequestedBalanceType(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportingRequest3.mmIdentification, com.tools20022.repository.msg.ReportingRequest3.mmRequestedMessageNameIdentification,
						com.tools20022.repository.msg.ReportingRequest3.mmAccount, com.tools20022.repository.msg.ReportingRequest3.mmAccountOwner, com.tools20022.repository.msg.ReportingRequest3.mmAccountServicer,
						com.tools20022.repository.msg.ReportingRequest3.mmReportingPeriod, com.tools20022.repository.msg.ReportingRequest3.mmRequestedTransactionType, com.tools20022.repository.msg.ReportingRequest3.mmRequestedBalanceType);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountReportingRequestV03.mmReportingRequest);
				trace_lazy = () -> ReportingService.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportingRequest3";
				definition = "Provides further details on the reporting request.";
				nextVersions_lazy = () -> Arrays.asList(ReportingRequest4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public ReportingRequest3 setIdentification(Max35Text identification) {
		this.identification = identification;
		return this;
	}

	public Max35Text getRequestedMessageNameIdentification() {
		return requestedMessageNameIdentification;
	}

	public ReportingRequest3 setRequestedMessageNameIdentification(Max35Text requestedMessageNameIdentification) {
		this.requestedMessageNameIdentification = Objects.requireNonNull(requestedMessageNameIdentification);
		return this;
	}

	public Optional<CashAccount24> getAccount() {
		return account == null ? Optional.empty() : Optional.of(account);
	}

	public ReportingRequest3 setAccount(CashAccount24 account) {
		this.account = account;
		return this;
	}

	public Party12Choice getAccountOwner() {
		return accountOwner;
	}

	public ReportingRequest3 setAccountOwner(Party12Choice accountOwner) {
		this.accountOwner = Objects.requireNonNull(accountOwner);
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public ReportingRequest3 setAccountServicer(BranchAndFinancialInstitutionIdentification5 accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public Optional<ReportingPeriod1> getReportingPeriod() {
		return reportingPeriod == null ? Optional.empty() : Optional.of(reportingPeriod);
	}

	public ReportingRequest3 setReportingPeriod(ReportingPeriod1 reportingPeriod) {
		this.reportingPeriod = reportingPeriod;
		return this;
	}

	public Optional<TransactionType1> getRequestedTransactionType() {
		return requestedTransactionType == null ? Optional.empty() : Optional.of(requestedTransactionType);
	}

	public ReportingRequest3 setRequestedTransactionType(TransactionType1 requestedTransactionType) {
		this.requestedTransactionType = requestedTransactionType;
		return this;
	}

	public List<BalanceType12> getRequestedBalanceType() {
		return requestedBalanceType == null ? requestedBalanceType = new ArrayList<>() : requestedBalanceType;
	}

	public ReportingRequest3 setRequestedBalanceType(List<BalanceType12> requestedBalanceType) {
		this.requestedBalanceType = Objects.requireNonNull(requestedBalanceType);
		return this;
	}
}