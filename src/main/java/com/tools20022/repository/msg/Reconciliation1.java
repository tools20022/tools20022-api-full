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
import com.tools20022.repository.datatype.Max4NumericText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BankToCustomerAccountReportCopy1;
import com.tools20022.repository.msg.Pagination;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Report on account transactions to reconcile documents of the day of
 * participants.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reconciliation1#mmReportIdentification
 * Reconciliation1.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reconciliation1#mmReportPagination
 * Reconciliation1.mmReportPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reconciliation1#mmBankToCustomerAccountReportCopy
 * Reconciliation1.mmBankToCustomerAccountReportCopy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reconciliation1#mmInitialMessageIdentification
 * Reconciliation1.mmInitialMessageIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Reconciliation1#mmControlCode
 * Reconciliation1.mmControlCode}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Reconciliation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Report on account transactions to reconcile documents of the day of participants."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Reconciliation1", propOrder = {"reportIdentification", "reportPagination", "bankToCustomerAccountReportCopy", "initialMessageIdentification", "controlCode"})
public class Reconciliation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptId", required = true)
	protected Max35Text reportIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.Reconciliation1
	 * Reconciliation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique Identifier of partitions aggregate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reconciliation1, Max35Text> mmReportIdentification = new MMMessageAttribute<Reconciliation1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reconciliation1.mmObject();
			isDerived = false;
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Unique Identifier of partitions aggregate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reconciliation1 obj) {
			return obj.getReportIdentification();
		}

		@Override
		public void setValue(Reconciliation1 obj, Max35Text value) {
			obj.setReportIdentification(value);
		}
	};
	@XmlElement(name = "RptPgntn")
	protected Pagination reportPagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Pagination Pagination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reconciliation1
	 * Reconciliation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportPagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message and continuation indicator to indicate that the multi-parts notification is to continue or that the message is the last page of the multi-parts notification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reconciliation1, Optional<Pagination>> mmReportPagination = new MMMessageAssociationEnd<Reconciliation1, Optional<Pagination>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reconciliation1.mmObject();
			isDerived = false;
			xmlTag = "RptPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportPagination";
			definition = "Page number of the message and continuation indicator to indicate that the multi-parts notification is to continue or that the message is the last page of the multi-parts notification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Optional<Pagination> getValue(Reconciliation1 obj) {
			return obj.getReportPagination();
		}

		@Override
		public void setValue(Reconciliation1 obj, Optional<Pagination> value) {
			obj.setReportPagination(value.orElse(null));
		}
	};
	@XmlElement(name = "BkToCstmrAcctRptCpy", required = true)
	protected BankToCustomerAccountReportCopy1 bankToCustomerAccountReportCopy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BankToCustomerAccountReportCopy1
	 * BankToCustomerAccountReportCopy1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reconciliation1
	 * Reconciliation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkToCstmrAcctRptCpy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankToCustomerAccountReportCopy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The BankToCustomerAccountReport message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It can be used to inform the account owner, or authorised party, of the entries reported to the account, and/or to provide the owner with balance information on the account at a given point in time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reconciliation1, BankToCustomerAccountReportCopy1> mmBankToCustomerAccountReportCopy = new MMMessageAssociationEnd<Reconciliation1, BankToCustomerAccountReportCopy1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reconciliation1.mmObject();
			isDerived = false;
			xmlTag = "BkToCstmrAcctRptCpy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankToCustomerAccountReportCopy";
			definition = "The BankToCustomerAccountReport message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It can be used to inform the account owner, or authorised party, of the entries reported to the account, and/or to provide the owner with balance information on the account at a given point in time.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BankToCustomerAccountReportCopy1.mmObject();
		}

		@Override
		public BankToCustomerAccountReportCopy1 getValue(Reconciliation1 obj) {
			return obj.getBankToCustomerAccountReportCopy();
		}

		@Override
		public void setValue(Reconciliation1 obj, BankToCustomerAccountReportCopy1 value) {
			obj.setBankToCustomerAccountReportCopy(value);
		}
	};
	@XmlElement(name = "InitlMsgId")
	protected Max35Text initialMessageIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.Reconciliation1
	 * Reconciliation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlMsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Business identification of the initial message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reconciliation1, Optional<Max35Text>> mmInitialMessageIdentification = new MMMessageAttribute<Reconciliation1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reconciliation1.mmObject();
			isDerived = false;
			xmlTag = "InitlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMessageIdentification";
			definition = "Business identification of the initial message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Reconciliation1 obj) {
			return obj.getInitialMessageIdentification();
		}

		@Override
		public void setValue(Reconciliation1 obj, Optional<Max35Text> value) {
			obj.setInitialMessageIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrlCd")
	protected List<Max4NumericText> controlCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4NumericText
	 * Max4NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reconciliation1
	 * Reconciliation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Electronic message control code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reconciliation1, List<Max4NumericText>> mmControlCode = new MMMessageAttribute<Reconciliation1, List<Max4NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reconciliation1.mmObject();
			isDerived = false;
			xmlTag = "CtrlCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlCode";
			definition = "Electronic message control code.";
			minOccurs = 0;
			simpleType_lazy = () -> Max4NumericText.mmObject();
		}

		@Override
		public List<Max4NumericText> getValue(Reconciliation1 obj) {
			return obj.getControlCode();
		}

		@Override
		public void setValue(Reconciliation1 obj, List<Max4NumericText> value) {
			obj.setControlCode(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Reconciliation1.mmReportIdentification, com.tools20022.repository.msg.Reconciliation1.mmReportPagination,
						com.tools20022.repository.msg.Reconciliation1.mmBankToCustomerAccountReportCopy, com.tools20022.repository.msg.Reconciliation1.mmInitialMessageIdentification,
						com.tools20022.repository.msg.Reconciliation1.mmControlCode);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Reconciliation1";
				definition = "Report on account transactions to reconcile documents of the day of participants.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getReportIdentification() {
		return reportIdentification;
	}

	public Reconciliation1 setReportIdentification(Max35Text reportIdentification) {
		this.reportIdentification = Objects.requireNonNull(reportIdentification);
		return this;
	}

	public Optional<Pagination> getReportPagination() {
		return reportPagination == null ? Optional.empty() : Optional.of(reportPagination);
	}

	public Reconciliation1 setReportPagination(Pagination reportPagination) {
		this.reportPagination = reportPagination;
		return this;
	}

	public BankToCustomerAccountReportCopy1 getBankToCustomerAccountReportCopy() {
		return bankToCustomerAccountReportCopy;
	}

	public Reconciliation1 setBankToCustomerAccountReportCopy(BankToCustomerAccountReportCopy1 bankToCustomerAccountReportCopy) {
		this.bankToCustomerAccountReportCopy = Objects.requireNonNull(bankToCustomerAccountReportCopy);
		return this;
	}

	public Optional<Max35Text> getInitialMessageIdentification() {
		return initialMessageIdentification == null ? Optional.empty() : Optional.of(initialMessageIdentification);
	}

	public Reconciliation1 setInitialMessageIdentification(Max35Text initialMessageIdentification) {
		this.initialMessageIdentification = initialMessageIdentification;
		return this;
	}

	public List<Max4NumericText> getControlCode() {
		return controlCode == null ? controlCode = new ArrayList<>() : controlCode;
	}

	public Reconciliation1 setControlCode(List<Max4NumericText> controlCode) {
		this.controlCode = Objects.requireNonNull(controlCode);
		return this;
	}
}