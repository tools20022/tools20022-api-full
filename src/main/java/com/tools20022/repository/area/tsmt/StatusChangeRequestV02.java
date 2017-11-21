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

package com.tools20022.repository.area.tsmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesManagementLatestVersion;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.Reason2;
import com.tools20022.repository.msg.SimpleIdentificationInformation;
import com.tools20022.repository.msg.TransactionStatus3;
import com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion;
import com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The StatusChangeRequest message is sent by a party involved in a transaction
 * to the matching application.<br>
 * This message is used to request a change in the status of a transaction.<br>
 * <b>Usage</b><br>
 * The StatusChangeRequest message can be sent by either party involved in a
 * transaction to the matching application to request a change in the status of
 * a transaction.<br>
 * The matching application will pass on the request by sending a
 * StatusChangeRequestNotification message to the counterparty which can accept
 * or reject the request by sending a SatausChangeRequestAcceptance or
 * StatusChangeRequestRejection message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion
 * TradeServicesManagementISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion
 * TradeServicesManagementISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "StsChngReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestV02#mmRequestIdentification
 * StatusChangeRequestV02.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestV02#mmTransactionIdentification
 * StatusChangeRequestV02.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestV02#mmSubmitterTransactionReference
 * StatusChangeRequestV02.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestV02#mmRequestedStatus
 * StatusChangeRequestV02.mmRequestedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestV02#mmRequestReason
 * StatusChangeRequestV02.mmRequestReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.026.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusChangeRequestV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe StatusChangeRequest message is sent by a party involved in a transaction to the matching application.\r\nThis message is used to request a change in the status of a transaction.\r\nUsage\r\nThe StatusChangeRequest message can be sent by either party involved in a transaction to the matching application to request a change in the status of a transaction.\r\nThe matching application will pass on the request by sending a StatusChangeRequestNotification message to the counterparty which can accept or reject the request by sending a SatausChangeRequestAcceptance or StatusChangeRequestRejection message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "StatusChangeRequestV02", propOrder = {"requestIdentification", "transactionIdentification", "submitterTransactionReference", "requestedStatus", "requestReason"})
public class StatusChangeRequestV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 requestIdentification;
	/**
	 * Identifies the request message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the request message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestIdentification";
			definition = "Identifies the request message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusChangeRequestV02.class.getMethod("getRequestIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SimpleIdentificationInformation transactionIdentification;
	/**
	 * Unique identification assigned by the matching application to the
	 * transaction. This identification is to be used in any communication
	 * between the parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
	 * SimpleIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusChangeRequestV02.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SimpleIdentificationInformation submitterTransactionReference;
	/**
	 * Reference to the transaction for the requesting financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
	 * SimpleIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitrTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitterTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction for the requesting financial institution."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubmitterTransactionReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubmitrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterTransactionReference";
			definition = "Reference to the transaction for the requesting financial institution.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusChangeRequestV02.class.getMethod("getSubmitterTransactionReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransactionStatus3 requestedStatus;
	/**
	 * Specifies the baseline status requested by the submitter by means of a
	 * code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus3
	 * TransactionStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the baseline status requested by the submitter by means of a code. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestedStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedStatus";
			definition = "Specifies the baseline status requested by the submitter by means of a code. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionStatus3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusChangeRequestV02.class.getMethod("getRequestedStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Reason2 requestReason;
	/**
	 * Specifies the reason for the request to change status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Reason2 Reason2}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the request to change status."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestReason = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestReason";
			definition = "Specifies the reason for the request to change status.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Reason2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusChangeRequestV02.class.getMethod("getRequestReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusChangeRequestV02";
				definition = "Scope\r\nThe StatusChangeRequest message is sent by a party involved in a transaction to the matching application.\r\nThis message is used to request a change in the status of a transaction.\r\nUsage\r\nThe StatusChangeRequest message can be sent by either party involved in a transaction to the matching application to request a change in the status of a transaction.\r\nThe matching application will pass on the request by sending a StatusChangeRequestNotification message to the counterparty which can accept or reject the request by sending a SatausChangeRequestAcceptance or StatusChangeRequestRejection message.";
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOPreviousversion.mmObject(), TradeServicesManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "StsChngReq";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.StatusChangeRequestV02.mmRequestIdentification, com.tools20022.repository.area.tsmt.StatusChangeRequestV02.mmTransactionIdentification,
						com.tools20022.repository.area.tsmt.StatusChangeRequestV02.mmSubmitterTransactionReference, com.tools20022.repository.area.tsmt.StatusChangeRequestV02.mmRequestedStatus,
						com.tools20022.repository.area.tsmt.StatusChangeRequestV02.mmRequestReason);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "026";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return StatusChangeRequestV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ReqId", required = true)
	public MessageIdentification1 getRequestIdentification() {
		return requestIdentification;
	}

	public void setRequestIdentification(MessageIdentification1 requestIdentification) {
		this.requestIdentification = requestIdentification;
	}

	@XmlElement(name = "TxId", required = true)
	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "SubmitrTxRef")
	public SimpleIdentificationInformation getSubmitterTransactionReference() {
		return submitterTransactionReference;
	}

	public void setSubmitterTransactionReference(SimpleIdentificationInformation submitterTransactionReference) {
		this.submitterTransactionReference = submitterTransactionReference;
	}

	@XmlElement(name = "ReqdSts", required = true)
	public TransactionStatus3 getRequestedStatus() {
		return requestedStatus;
	}

	public void setRequestedStatus(TransactionStatus3 requestedStatus) {
		this.requestedStatus = requestedStatus;
	}

	@XmlElement(name = "ReqRsn")
	public Reason2 getRequestReason() {
		return requestReason;
	}

	public void setRequestReason(Reason2 requestReason) {
		this.requestReason = requestReason;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.026.02.02")
	static public class Document {
		@XmlElement(name = "StsChngReq", required = true)
		public StatusChangeRequestV02 messageBody;
	}
}