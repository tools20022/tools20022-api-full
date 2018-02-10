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
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The StatusChangeRequestRejection message is sent by the party requested to
 * accept or reject the request of a change in the status of a transaction to
 * the matching application.<br>
 * This message is used to inform about the rejection of a request to change the
 * status of a transaction.<br>
 * <b>Usage</b><br>
 * The StatusChangeRequestRejection message can be sent by the party requested
 * to accept or reject a request to change the status of a transaction to inform
 * that it rejects the request.<br>
 * The message can be sent in response to a StatusChangeRequestNotification
 * message.<br>
 * The acceptance of a request to change the status of a transaction can be
 * achieved by sending a StatusChangeRequestAcceptance message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02#mmRejectionIdentification
 * StatusChangeRequestRejectionV02.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02#mmTransactionIdentification
 * StatusChangeRequestRejectionV02.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02#mmSubmitterTransactionReference
 * StatusChangeRequestRejectionV02.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02#mmRejectedStatusChange
 * StatusChangeRequestRejectionV02.mmRejectedStatusChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02#mmRejectionReason
 * StatusChangeRequestRejectionV02.mmRejectionReason}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "StsChngReqRjctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.029.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusChangeRequestRejectionV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe StatusChangeRequestRejection message is sent by the party requested to accept or reject the request of a change in the status of a transaction to the matching application.\r\nThis message is used to inform about the rejection of a request to change the status of a transaction.\r\nUsage\r\nThe StatusChangeRequestRejection message can be sent by the party requested to accept or reject a request to change the status of a transaction to inform that it rejects the request.\r\nThe message can be sent in response to a StatusChangeRequestNotification message.\r\nThe acceptance of a request to change the status of a transaction can be achieved by sending a StatusChangeRequestAcceptance message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatusChangeRequestRejectionV02", propOrder = {"rejectionIdentification", "transactionIdentification", "submitterTransactionReference", "rejectedStatusChange", "rejectionReason"})
public class StatusChangeRequestRejectionV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RjctnId", required = true)
	protected MessageIdentification1 rejectionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the rejection message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRejectionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "RjctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionIdentification";
			definition = "Identifies the rejection message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusChangeRequestRejectionV02.class.getMethod("getRejectionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxId", required = true)
	protected SimpleIdentificationInformation transactionIdentification;
	/**
	 * 
	 <p>
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
				return StatusChangeRequestRejectionV02.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SubmitrTxRef")
	protected SimpleIdentificationInformation submitterTransactionReference;
	/**
	 * 
	 <p>
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
				return StatusChangeRequestRejectionV02.class.getMethod("getSubmitterTransactionReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RjctdStsChng", required = true)
	protected TransactionStatus3 rejectedStatusChange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus3
	 * TransactionStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdStsChng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedStatusChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status rejected."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRejectedStatusChange = new MMMessageBuildingBlock() {
		{
			xmlTag = "RjctdStsChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedStatusChange";
			definition = "Specifies the status rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionStatus3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusChangeRequestRejectionV02.class.getMethod("getRejectedStatusChange", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RjctnRsn", required = true)
	protected Reason2 rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Reason2 Reason2}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the user cannot accept the request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRejectionReason = new MMMessageBuildingBlock() {
		{
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Reason why the user cannot accept the request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Reason2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusChangeRequestRejectionV02.class.getMethod("getRejectionReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusChangeRequestRejectionV02";
				definition = "Scope\r\nThe StatusChangeRequestRejection message is sent by the party requested to accept or reject the request of a change in the status of a transaction to the matching application.\r\nThis message is used to inform about the rejection of a request to change the status of a transaction.\r\nUsage\r\nThe StatusChangeRequestRejection message can be sent by the party requested to accept or reject a request to change the status of a transaction to inform that it rejects the request.\r\nThe message can be sent in response to a StatusChangeRequestNotification message.\r\nThe acceptance of a request to change the status of a transaction can be achieved by sending a StatusChangeRequestAcceptance message.";
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOPreviousversion.mmObject(), TradeServicesManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "StsChngReqRjctn";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02.mmRejectionIdentification,
						com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02.mmTransactionIdentification, com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02.mmSubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02.mmRejectedStatusChange, com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02.mmRejectionReason);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "029";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return StatusChangeRequestRejectionV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getRejectionIdentification() {
		return rejectionIdentification;
	}

	public StatusChangeRequestRejectionV02 setRejectionIdentification(MessageIdentification1 rejectionIdentification) {
		this.rejectionIdentification = Objects.requireNonNull(rejectionIdentification);
		return this;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public StatusChangeRequestRejectionV02 setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<SimpleIdentificationInformation> getSubmitterTransactionReference() {
		return submitterTransactionReference == null ? Optional.empty() : Optional.of(submitterTransactionReference);
	}

	public StatusChangeRequestRejectionV02 setSubmitterTransactionReference(SimpleIdentificationInformation submitterTransactionReference) {
		this.submitterTransactionReference = submitterTransactionReference;
		return this;
	}

	public TransactionStatus3 getRejectedStatusChange() {
		return rejectedStatusChange;
	}

	public StatusChangeRequestRejectionV02 setRejectedStatusChange(TransactionStatus3 rejectedStatusChange) {
		this.rejectedStatusChange = Objects.requireNonNull(rejectedStatusChange);
		return this;
	}

	public Reason2 getRejectionReason() {
		return rejectionReason;
	}

	public StatusChangeRequestRejectionV02 setRejectionReason(Reason2 rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.029.001.02")
	static public class Document {
		@XmlElement(name = "StsChngReqRjctn", required = true)
		public StatusChangeRequestRejectionV02 messageBody;
	}
}