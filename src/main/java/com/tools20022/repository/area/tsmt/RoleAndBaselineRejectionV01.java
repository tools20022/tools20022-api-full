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
import com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion;
import com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The RoleAndBaselineRejection message is sent by a secondary bank to the
 * matching application if it rejects to join the transaction based on the
 * baseline and the role that it is expected to play.<br>
 * <b>Usage</b><br>
 * The RoleAndBaselineRejection message is sent in response to a message that is
 * a direct request to join a transaction.
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
 * xmlTag} = "RoleAndBaselnRjctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01#mmRejectionIdentification
 * RoleAndBaselineRejectionV01.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01#mmRelatedMessageReference
 * RoleAndBaselineRejectionV01.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01#mmTransactionIdentification
 * RoleAndBaselineRejectionV01.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01#mmRejectionReason
 * RoleAndBaselineRejectionV01.mmRejectionReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.050.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RoleAndBaselineRejectionV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe RoleAndBaselineRejection message is sent by a secondary bank to the matching application if it rejects to join the transaction based on the baseline and the role that it is expected to play.\r\nUsage\r\nThe RoleAndBaselineRejection message is sent in response to a message that is a direct request to join a transaction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RoleAndBaselineRejectionV01", propOrder = {"rejectionIdentification", "relatedMessageReference", "transactionIdentification", "rejectionReason"})
public class RoleAndBaselineRejectionV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 rejectionIdentification;
	/**
	 * Identifies the rejection message.
	 * <p>
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
				return RoleAndBaselineRejectionV01.class.getMethod("getRejectionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MessageIdentification1 relatedMessageReference;
	/**
	 * Reference to the message that contained the baseline and is rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdMsgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMessageReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the message that contained the baseline and is rejected."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedMessageReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdMsgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMessageReference";
			definition = "Reference to the message that contained the baseline and is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RoleAndBaselineRejectionV01.class.getMethod("getRelatedMessageReference", new Class[]{});
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
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.\n";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RoleAndBaselineRejectionV01.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Reason2 rejectionReason;
	/**
	 * Reason why the user cannot accept the request.
	 * <p>
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
			minOccurs = 0;
			complexType_lazy = () -> Reason2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RoleAndBaselineRejectionV01.class.getMethod("getRejectionReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RoleAndBaselineRejectionV01";
				definition = "Scope\r\nThe RoleAndBaselineRejection message is sent by a secondary bank to the matching application if it rejects to join the transaction based on the baseline and the role that it is expected to play.\r\nUsage\r\nThe RoleAndBaselineRejection message is sent in response to a message that is a direct request to join a transaction.";
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOPreviousversion.mmObject(), TradeServicesManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "RoleAndBaselnRjctn";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01.mmRejectionIdentification,
						com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01.mmRelatedMessageReference, com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01.mmTransactionIdentification,
						com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01.mmRejectionReason);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "050";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RoleAndBaselineRejectionV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RjctnId", required = true)
	public MessageIdentification1 getRejectionIdentification() {
		return rejectionIdentification;
	}

	public void setRejectionIdentification(MessageIdentification1 rejectionIdentification) {
		this.rejectionIdentification = rejectionIdentification;
	}

	@XmlElement(name = "RltdMsgRef", required = true)
	public MessageIdentification1 getRelatedMessageReference() {
		return relatedMessageReference;
	}

	public void setRelatedMessageReference(MessageIdentification1 relatedMessageReference) {
		this.relatedMessageReference = relatedMessageReference;
	}

	@XmlElement(name = "TxId", required = true)
	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "RjctnRsn")
	public Reason2 getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(Reason2 rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.050.01.01")
	static public class Document {
		@XmlElement(name = "RoleAndBaselnRjctn", required = true)
		public RoleAndBaselineRejectionV01 messageBody;
	}
}