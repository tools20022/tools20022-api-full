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
import com.tools20022.repository.area.SecuritiesManagementArchive;
import com.tools20022.repository.msg.AdditionalReference2;
import com.tools20022.repository.msg.RejectionReason1;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The SecuritiesMessageRejection message is sent by an executing party to the
 * instructing party. Typically, this message is sent by an account servicer to
 * the account owner.<br>
 * This message is used to reject a previously received message on which action
 * cannot be taken.<br>
 * <b>Usage</b><br>
 * The SecuritiesMessageRejection message can be sent for the following reasons:<br>
 * - the executing party does not recognise the linked reference, so the
 * executing party cannot process the message<br>
 * - the instructing party should not have sent the message. This could be
 * because the Receiver does not expect the message, eg, there is no SLA in
 * place between the Sender and the Receiver.<br>
 * The SecuritiesMessageRejection message must not be used to reject an
 * instruction message that cannot be processed for business reasons, eg, if
 * information is missing in an instruction message or because securities are
 * not available for settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejection#mmRelatedReference
 * SecuritiesMessageRejection.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejection#mmReason
 * SecuritiesMessageRejection.mmReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "semt.001.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementArchive
 * SecuritiesManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "semt.001.001.01"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.001.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesMessageRejection"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe SecuritiesMessageRejection message is sent by an executing party to the instructing party. Typically, this message is sent by an account servicer to the account owner.\r\nThis message is used to reject a previously received message on which action cannot be taken.\r\nUsage\r\nThe SecuritiesMessageRejection message can be sent for the following reasons:\r\n- the executing party does not recognise the linked reference, so the executing party cannot process the message\r\n- the instructing party should not have sent the message. This could be because the Receiver does not expect the message, eg, there is no SLA in place between the Sender and the Receiver.\r\nThe SecuritiesMessageRejection message must not be used to reject an instruction message that cannot be processed for business reasons, eg, if information is missing in an instruction message or because securities are not available for settlement."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02
 * SecuritiesMessageRejectionV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "semt.001.001.01", propOrder = {"relatedReference", "reason"})
public class SecuritiesMessageRejection {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RltdRef", required = true)
	protected AdditionalReference2 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesMessageRejection.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Rsn", required = true)
	protected RejectionReason1 reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason1
	 * RejectionReason1}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReason = new MMMessageBuildingBlock() {
		{
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason to reject the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> RejectionReason1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesMessageRejection.class.getMethod("getReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesMessageRejection";
				definition = "Scope\r\nThe SecuritiesMessageRejection message is sent by an executing party to the instructing party. Typically, this message is sent by an account servicer to the account owner.\r\nThis message is used to reject a previously received message on which action cannot be taken.\r\nUsage\r\nThe SecuritiesMessageRejection message can be sent for the following reasons:\r\n- the executing party does not recognise the linked reference, so the executing party cannot process the message\r\n- the instructing party should not have sent the message. This could be because the Receiver does not expect the message, eg, there is no SLA in place between the Sender and the Receiver.\r\nThe SecuritiesMessageRejection message must not be used to reject an instruction message that cannot be processed for business reasons, eg, if information is missing in an instruction message or because securities are not available for settlement.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesMessageRejectionV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "semt.001.001.01";
				businessArea_lazy = () -> SecuritiesManagementArchive.mmObject();
				xmlName = "semt.001.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesMessageRejection.mmRelatedReference, com.tools20022.repository.area.semt.SecuritiesMessageRejection.mmReason);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "001";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesMessageRejection.class;
			}
		});
		return mmObject_lazy.get();
	}

	public AdditionalReference2 getRelatedReference() {
		return relatedReference;
	}

	public SecuritiesMessageRejection setRelatedReference(AdditionalReference2 relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public RejectionReason1 getReason() {
		return reason;
	}

	public SecuritiesMessageRejection setReason(RejectionReason1 reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.001.001.01")
	static public class Document {
		@XmlElement(name = "semt.001.001.01", required = true)
		public SecuritiesMessageRejection messageBody;
	}
}