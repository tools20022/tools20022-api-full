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

package com.tools20022.repository.area.semt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesManagementPreviousVersion;
import com.tools20022.repository.msg.AdditionalReference3;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.RejectionReason3;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer, for example, a registrar, transfer agent or custodian
 * bank, sends the SecuritiesMessageRejection message to the account owner, for
 * example, an investor or its authorised agent, to reject a previously received
 * message on which action cannot be taken.<br>
 * The message may also be sent by an executing party, for example, transfer
 * agent to the instructing party, for example, investment manager or its
 * authorised representative to reject a previously received message on which
 * action cannot be taken.<br>
 * <b>Usage</b><br>
 * The SecuritiesMessageRejection message is used for the following reasons:<br>
 * - the executing party does not recognise the linked reference, so the
 * executing party cannot process the message<br>
 * - the instructing party should not have sent the message.<br>
 * Reasons that a receiver does not expect a message include no SLA in place
 * between the Sender and the Receiver.<br>
 * The SecuritiesMessageRejection message must not be used to reject an
 * instruction message that cannot be processed for business reasons, for
 * example, if information is missing in an instruction message or because
 * securities are not available for settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02#mmMessageIdentification
 * SecuritiesMessageRejectionV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02#mmRelatedReference
 * SecuritiesMessageRejectionV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02#mmReason
 * SecuritiesMessageRejectionV02.mmReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesMsgRjctnV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementPreviousVersion
 * SecuritiesManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.001.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesMessageRejectionV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer, for example, a registrar, transfer agent or custodian bank, sends the SecuritiesMessageRejection message to the account owner, for example, an investor or its authorised agent, to reject a previously received message on which action cannot be taken.\r\nThe message may also be sent by an executing party, for example, transfer agent to the instructing party, for example, investment manager or its authorised representative to reject a previously received message on which action cannot be taken.\r\nUsage\r\nThe SecuritiesMessageRejection message is used for the following reasons:\r\n- the executing party does not recognise the linked reference, so the executing party cannot process the message\r\n- the instructing party should not have sent the message.\r\nReasons that a receiver does not expect a message include no SLA in place between the Sender and the Receiver.\r\nThe SecuritiesMessageRejection message must not be used to reject an instruction message that cannot be processed for business reasons, for example, if information is missing in an instruction message or because securities are not available for settlement."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03
 * SecuritiesMessageRejectionV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejection
 * SecuritiesMessageRejection}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesMessageRejectionV02", propOrder = {"messageIdentification", "relatedReference", "reason"})
public class SecuritiesMessageRejectionV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
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
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03#mmMessageIdentification
	 * SecuritiesMessageRejectionV03.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesMessageRejectionV03.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesMessageRejectionV02.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RltdRef", required = true)
	protected AdditionalReference3 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03#mmRelatedReference
	 * SecuritiesMessageRejectionV03.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesMessageRejectionV03.mmRelatedReference);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesMessageRejectionV02.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Rsn", required = true)
	protected RejectionReason3 reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason3
	 * RejectionReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason to reject the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03#mmReason
	 * SecuritiesMessageRejectionV03.mmReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReason = new MMMessageBuildingBlock() {
		{
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason to reject the message.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesMessageRejectionV03.mmReason);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> RejectionReason3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesMessageRejectionV02.class.getMethod("getReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesMessageRejectionV02";
				definition = "Scope\r\nAn account servicer, for example, a registrar, transfer agent or custodian bank, sends the SecuritiesMessageRejection message to the account owner, for example, an investor or its authorised agent, to reject a previously received message on which action cannot be taken.\r\nThe message may also be sent by an executing party, for example, transfer agent to the instructing party, for example, investment manager or its authorised representative to reject a previously received message on which action cannot be taken.\r\nUsage\r\nThe SecuritiesMessageRejection message is used for the following reasons:\r\n- the executing party does not recognise the linked reference, so the executing party cannot process the message\r\n- the instructing party should not have sent the message.\r\nReasons that a receiver does not expect a message include no SLA in place between the Sender and the Receiver.\r\nThe SecuritiesMessageRejection message must not be used to reject an instruction message that cannot be processed for business reasons, for example, if information is missing in an instruction message or because securities are not available for settlement.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesMessageRejectionV03.mmObject());
				previousVersion_lazy = () -> SecuritiesMessageRejection.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesMsgRjctnV02";
				businessArea_lazy = () -> SecuritiesManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02.mmMessageIdentification,
						com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02.mmRelatedReference, com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02.mmReason);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "001";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesMessageRejectionV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public SecuritiesMessageRejectionV02 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public AdditionalReference3 getRelatedReference() {
		return relatedReference;
	}

	public SecuritiesMessageRejectionV02 setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public RejectionReason3 getReason() {
		return reason;
	}

	public SecuritiesMessageRejectionV02 setReason(RejectionReason3 reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.001.001.02")
	static public class Document {
		@XmlElement(name = "SctiesMsgRjctnV02", required = true)
		public SecuritiesMessageRejectionV02 messageBody;
	}
}