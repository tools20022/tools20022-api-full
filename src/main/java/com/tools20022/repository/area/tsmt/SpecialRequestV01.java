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
import com.tools20022.repository.msg.Notification1;
import com.tools20022.repository.msg.SimpleIdentificationInformation;
import com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion;
import com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The SpecialRequest message is sent by a party to the transaction to the
 * matching application if special circumstances are such that it cannot take
 * part any longer to a specific transaction or that it cannot fulfill its role
 * in the transaction.<br>
 * <b>Usage</b><br>
 * The SpecialRequest message can be sent at any time during the life time of a
 * transaction as long as the transaction is established and not yet closed.
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
 * xmlTag} = "SpclReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialRequestV01#mmRequestIdentification
 * SpecialRequestV01.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialRequestV01#mmTransactionIdentification
 * SpecialRequestV01.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialRequestV01#mmSubmitterTransactionReference
 * SpecialRequestV01.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialRequestV01#mmNotification
 * SpecialRequestV01.mmNotification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.047.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SpecialRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe SpecialRequest message is sent by a party to the transaction to the matching application if special circumstances are such that it cannot take part any longer to a specific transaction or that it cannot fulfill its role in the transaction.\r\nUsage\r\nThe SpecialRequest message can be sent at any time during the life time of a transaction as long as the transaction is established and not yet closed."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SpecialRequestV01", propOrder = {"requestIdentification", "transactionIdentification", "submitterTransactionReference", "notification"})
public class SpecialRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 requestIdentification;
	/**
	 * Identifies the acceptance message.
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
	 * definition} = "Identifies the acceptance message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestIdentification";
			definition = "Identifies the acceptance message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SpecialRequestV01.class.getMethod("getRequestIdentification", new Class[]{});
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
				return SpecialRequestV01.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SimpleIdentificationInformation submitterTransactionReference;
	/**
	 * Reference to the identification of the transaction for the requesting
	 * financial institution.
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
	 * "Reference to the identification of the transaction for the requesting financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubmitterTransactionReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubmitrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterTransactionReference";
			definition = "Reference to the identification of the transaction for the requesting financial institution.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SpecialRequestV01.class.getMethod("getSubmitterTransactionReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Notification1 notification;
	/**
	 * Type and details of the notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Notification1
	 * Notification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type and details of the notification."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNotification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Ntfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notification";
			definition = "Type and details of the notification.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Notification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SpecialRequestV01.class.getMethod("getNotification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SpecialRequestV01";
				definition = "Scope\r\nThe SpecialRequest message is sent by a party to the transaction to the matching application if special circumstances are such that it cannot take part any longer to a specific transaction or that it cannot fulfill its role in the transaction.\r\nUsage\r\nThe SpecialRequest message can be sent at any time during the life time of a transaction as long as the transaction is established and not yet closed.";
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOPreviousversion.mmObject(), TradeServicesManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "SpclReq";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.SpecialRequestV01.mmRequestIdentification, com.tools20022.repository.area.tsmt.SpecialRequestV01.mmTransactionIdentification,
						com.tools20022.repository.area.tsmt.SpecialRequestV01.mmSubmitterTransactionReference, com.tools20022.repository.area.tsmt.SpecialRequestV01.mmNotification);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "047";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SpecialRequestV01.class;
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

	@XmlElement(name = "Ntfctn", required = true)
	public Notification1 getNotification() {
		return notification;
	}

	public void setNotification(Notification1 notification) {
		this.notification = notification;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.047.01.01")
	static public class Document {
		@XmlElement(name = "SpclReq", required = true)
		public SpecialRequestV01 messageBody;
	}
}