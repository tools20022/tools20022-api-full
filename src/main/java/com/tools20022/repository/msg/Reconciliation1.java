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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Reconciliation1", propOrder = {"reportIdentification", "reportPagination", "bankToCustomerAccountReportCopy", "initialMessageIdentification", "controlCode"})
public class Reconciliation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text reportIdentification;
	/**
	 * Unique Identifier of partitions aggregate.
	 * <p>
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
	public static final MMMessageAttribute mmReportIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reconciliation1.mmObject();
			isDerived = false;
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Unique Identifier of partitions aggregate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Pagination reportPagination;
	/**
	 * Page number of the message and continuation indicator to indicate that
	 * the multi-parts notification is to continue or that the message is the
	 * last page of the multi-parts notification.
	 * <p>
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
	public static final MMMessageAssociationEnd mmReportPagination = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Reconciliation1.mmObject();
			isDerived = false;
			xmlTag = "RptPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportPagination";
			definition = "Page number of the message and continuation indicator to indicate that the multi-parts notification is to continue or that the message is the last page of the multi-parts notification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Pagination.mmObject();
		}
	};
	protected BankToCustomerAccountReportCopy1 bankToCustomerAccountReportCopy;
	/**
	 * The BankToCustomerAccountReport message is sent by the account servicer
	 * to an account owner or to a party authorised by the account owner to
	 * receive the message. It can be used to inform the account owner, or
	 * authorised party, of the entries reported to the account, and/or to
	 * provide the owner with balance information on the account at a given
	 * point in time.
	 * <p>
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
	public static final MMMessageAssociationEnd mmBankToCustomerAccountReportCopy = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Reconciliation1.mmObject();
			isDerived = false;
			xmlTag = "BkToCstmrAcctRptCpy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankToCustomerAccountReportCopy";
			definition = "The BankToCustomerAccountReport message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It can be used to inform the account owner, or authorised party, of the entries reported to the account, and/or to provide the owner with balance information on the account at a given point in time.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BankToCustomerAccountReportCopy1.mmObject();
		}
	};
	protected Max35Text initialMessageIdentification;
	/**
	 * Business identification of the initial message.
	 * <p>
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
	public static final MMMessageAttribute mmInitialMessageIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reconciliation1.mmObject();
			isDerived = false;
			xmlTag = "InitlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMessageIdentification";
			definition = "Business identification of the initial message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<Max4NumericText> controlCode;
	/**
	 * Electronic message control code.
	 * <p>
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
	public static final MMMessageAttribute mmControlCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reconciliation1.mmObject();
			isDerived = false;
			xmlTag = "CtrlCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlCode";
			definition = "Electronic message control code.";
			minOccurs = 0;
			simpleType_lazy = () -> Max4NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Reconciliation1.mmReportIdentification, Reconciliation1.mmReportPagination, Reconciliation1.mmBankToCustomerAccountReportCopy, Reconciliation1.mmInitialMessageIdentification,
						Reconciliation1.mmControlCode);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Reconciliation1";
				definition = "Report on account transactions to reconcile documents of the day of participants.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RptId", required = true)
	public Max35Text getReportIdentification() {
		return reportIdentification;
	}

	public void setReportIdentification(Max35Text reportIdentification) {
		this.reportIdentification = reportIdentification;
	}

	@XmlElement(name = "RptPgntn")
	public Pagination getReportPagination() {
		return reportPagination;
	}

	public void setReportPagination(com.tools20022.repository.msg.Pagination reportPagination) {
		this.reportPagination = reportPagination;
	}

	@XmlElement(name = "BkToCstmrAcctRptCpy", required = true)
	public BankToCustomerAccountReportCopy1 getBankToCustomerAccountReportCopy() {
		return bankToCustomerAccountReportCopy;
	}

	public void setBankToCustomerAccountReportCopy(com.tools20022.repository.msg.BankToCustomerAccountReportCopy1 bankToCustomerAccountReportCopy) {
		this.bankToCustomerAccountReportCopy = bankToCustomerAccountReportCopy;
	}

	@XmlElement(name = "InitlMsgId")
	public Max35Text getInitialMessageIdentification() {
		return initialMessageIdentification;
	}

	public void setInitialMessageIdentification(Max35Text initialMessageIdentification) {
		this.initialMessageIdentification = initialMessageIdentification;
	}

	@XmlElement(name = "CtrlCd")
	public List<Max4NumericText> getControlCode() {
		return controlCode;
	}

	public void setControlCode(List<Max4NumericText> controlCode) {
		this.controlCode = controlCode;
	}
}