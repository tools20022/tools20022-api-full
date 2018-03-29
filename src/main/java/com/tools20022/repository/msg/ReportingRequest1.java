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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.CashAccountContract;
import com.tools20022.repository.entity.ReportingService;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BalanceType12;
import com.tools20022.repository.msg.CashAccount20;
import com.tools20022.repository.msg.ReportingPeriod1;
import com.tools20022.repository.msg.TransactionType1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide details of the reporting request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest1#mmIdentification
 * ReportingRequest1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest1#mmRequestedMessageType
 * ReportingRequest1.mmRequestedMessageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingRequest1#mmAccount
 * ReportingRequest1.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest1#mmReportingPeriod
 * ReportingRequest1.mmReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest1#mmRequestedTransactionType
 * ReportingRequest1.mmRequestedTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest1#mmRequestedBalanceType
 * ReportingRequest1.mmRequestedBalanceType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ReportingService
 * ReportingService}</li>
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
 * "ReportingRequest1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide details of the reporting request."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReportingRequest1", propOrder = {"identification", "requestedMessageType", "account", "reportingPeriod", "requestedTransactionType", "requestedBalanceType"})
public class ReportingRequest1 {

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
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest1
	 * ReportingRequest1}</li>
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
	 * "Unique identification, as assigned by the account owner, to unambiguously identify the account reporting request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportingRequest1, Optional<Max35Text>> mmIdentification = new MMMessageAttribute<ReportingRequest1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification, as assigned by the account owner, to unambiguously identify the account reporting request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ReportingRequest1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(ReportingRequest1 obj, Optional<Max35Text> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdMsgTp")
	protected Max35Text requestedMessageType;
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
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest1
	 * ReportingRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdMsgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedMessageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of the requested reporting message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportingRequest1, Optional<Max35Text>> mmRequestedMessageType = new MMMessageAttribute<ReportingRequest1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest1.mmObject();
			isDerived = false;
			xmlTag = "ReqdMsgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedMessageType";
			definition = "Specifies the type of the requested reporting message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ReportingRequest1 obj) {
			return obj.getRequestedMessageType();
		}

		@Override
		public void setValue(ReportingRequest1 obj, Optional<Max35Text> value) {
			obj.setRequestedMessageType(value.orElse(null));
		}
	};
	@XmlElement(name = "Acct", required = true)
	protected CashAccount20 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount20
	 * CashAccount20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccount
	 * CashAccountContract.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest1
	 * ReportingRequest1}</li>
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
	 * "Unambiguous identification of the account to which the reporting request refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest1, CashAccount20> mmAccount = new MMMessageAssociationEnd<ReportingRequest1, CashAccount20>() {
		{
			businessElementTrace_lazy = () -> CashAccountContract.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest1.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unambiguous identification of the account to which the reporting request refers.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount20.mmObject();
		}

		@Override
		public CashAccount20 getValue(ReportingRequest1 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(ReportingRequest1 obj, CashAccount20 value) {
			obj.setAccount(value);
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest1
	 * ReportingRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the requested reporting period."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest1, Optional<ReportingPeriod1>> mmReportingPeriod = new MMMessageAssociationEnd<ReportingRequest1, Optional<ReportingPeriod1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest1.mmObject();
			isDerived = false;
			xmlTag = "RptgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingPeriod";
			definition = "Specifies the requested reporting period.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReportingPeriod1.mmObject();
		}

		@Override
		public Optional<ReportingPeriod1> getValue(ReportingRequest1 obj) {
			return obj.getReportingPeriod();
		}

		@Override
		public void setValue(ReportingRequest1 obj, Optional<ReportingPeriod1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest1
	 * ReportingRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdTxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the transactions to be reported."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest1, Optional<TransactionType1>> mmRequestedTransactionType = new MMMessageAssociationEnd<ReportingRequest1, Optional<TransactionType1>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashEntry;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest1.mmObject();
			isDerived = false;
			xmlTag = "ReqdTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedTransactionType";
			definition = "Set of elements used to identify the transactions to be reported.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionType1.mmObject();
		}

		@Override
		public Optional<TransactionType1> getValue(ReportingRequest1 obj) {
			return obj.getRequestedTransactionType();
		}

		@Override
		public void setValue(ReportingRequest1 obj, Optional<TransactionType1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest1
	 * ReportingRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdBalTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide details on the requested balance reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingRequest1, List<BalanceType12>> mmRequestedBalanceType = new MMMessageAssociationEnd<ReportingRequest1, List<BalanceType12>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingRequest1.mmObject();
			isDerived = false;
			xmlTag = "ReqdBalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedBalanceType";
			definition = "Set of elements used to provide details on the requested balance reporting.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceType12.mmObject();
		}

		@Override
		public List<BalanceType12> getValue(ReportingRequest1 obj) {
			return obj.getRequestedBalanceType();
		}

		@Override
		public void setValue(ReportingRequest1 obj, List<BalanceType12> value) {
			obj.setRequestedBalanceType(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportingRequest1.mmIdentification, com.tools20022.repository.msg.ReportingRequest1.mmRequestedMessageType,
						com.tools20022.repository.msg.ReportingRequest1.mmAccount, com.tools20022.repository.msg.ReportingRequest1.mmReportingPeriod, com.tools20022.repository.msg.ReportingRequest1.mmRequestedTransactionType,
						com.tools20022.repository.msg.ReportingRequest1.mmRequestedBalanceType);
				trace_lazy = () -> ReportingService.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportingRequest1";
				definition = "Set of elements used to provide details of the reporting request.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public ReportingRequest1 setIdentification(Max35Text identification) {
		this.identification = identification;
		return this;
	}

	public Optional<Max35Text> getRequestedMessageType() {
		return requestedMessageType == null ? Optional.empty() : Optional.of(requestedMessageType);
	}

	public ReportingRequest1 setRequestedMessageType(Max35Text requestedMessageType) {
		this.requestedMessageType = requestedMessageType;
		return this;
	}

	public CashAccount20 getAccount() {
		return account;
	}

	public ReportingRequest1 setAccount(CashAccount20 account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public Optional<ReportingPeriod1> getReportingPeriod() {
		return reportingPeriod == null ? Optional.empty() : Optional.of(reportingPeriod);
	}

	public ReportingRequest1 setReportingPeriod(ReportingPeriod1 reportingPeriod) {
		this.reportingPeriod = reportingPeriod;
		return this;
	}

	public Optional<TransactionType1> getRequestedTransactionType() {
		return requestedTransactionType == null ? Optional.empty() : Optional.of(requestedTransactionType);
	}

	public ReportingRequest1 setRequestedTransactionType(TransactionType1 requestedTransactionType) {
		this.requestedTransactionType = requestedTransactionType;
		return this;
	}

	public List<BalanceType12> getRequestedBalanceType() {
		return requestedBalanceType == null ? requestedBalanceType = new ArrayList<>() : requestedBalanceType;
	}

	public ReportingRequest1 setRequestedBalanceType(List<BalanceType12> requestedBalanceType) {
		this.requestedBalanceType = Objects.requireNonNull(requestedBalanceType);
		return this;
	}
}