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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.TransactionReportOrError2Choice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The ReturnTransaction message is sent by the transaction administrator to a
 * member of the system.<br>
 * It is used to provide information on transactions and booked entries held at
 * the transaction administrator.<br>
 * The Return Transaction message can be sent as a response to a related
 * GetTransaction message (pull mode) or initiated by the transaction
 * administrator (push mode). The push of information can take place either at
 * prearranged times or as a warning or alarm when a problem has occurred.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReturnTransactionCopy1#mmMessageHeader
 * ReturnTransactionCopy1.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReturnTransactionCopy1#mmReportOrError
 * ReturnTransactionCopy1.mmReportOrError}</li>
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
 * "ReturnTransactionCopy1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ReturnTransaction message is sent by the transaction administrator to a member of the system.\r\nIt is used to provide information on transactions and booked entries held at the transaction administrator.\r\nThe Return Transaction message can be sent as a response to a related GetTransaction message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred."
 * </li>
 * </ul>
 */
public class ReturnTransactionCopy1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected MessageHeader5 messageHeader;
	/**
	 * Common business identification for the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageHeader5
	 * MessageHeader5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReturnTransactionCopy1
	 * ReturnTransactionCopy1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common business identification for the message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageHeader = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReturnTransactionCopy1.mmObject();
			isDerived = false;
			xmlTag = "MsgHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageHeader";
			definition = "Common business identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MessageHeader5.mmObject();
		}
	};
	protected TransactionReportOrError2Choice reportOrError;
	/**
	 * Reports on transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionReportOrError2Choice
	 * TransactionReportOrError2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReturnTransactionCopy1
	 * ReturnTransactionCopy1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptOrErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reports on transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReportOrError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReturnTransactionCopy1.mmObject();
			isDerived = false;
			xmlTag = "RptOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportOrError";
			definition = "Reports on transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionReportOrError2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ReturnTransactionCopy1.mmMessageHeader, ReturnTransactionCopy1.mmReportOrError);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReturnTransactionCopy1";
				definition = "The ReturnTransaction message is sent by the transaction administrator to a member of the system.\r\nIt is used to provide information on transactions and booked entries held at the transaction administrator.\r\nThe Return Transaction message can be sent as a response to a related GetTransaction message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.";
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader5 getMessageHeader() {
		return messageHeader;
	}

	public void setMessageHeader(com.tools20022.repository.msg.MessageHeader5 messageHeader) {
		this.messageHeader = messageHeader;
	}

	public TransactionReportOrError2Choice getReportOrError() {
		return reportOrError;
	}

	public void setReportOrError(TransactionReportOrError2Choice reportOrError) {
		this.reportOrError = reportOrError;
	}
}