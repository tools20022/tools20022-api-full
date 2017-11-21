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
import com.tools20022.repository.area.auth.FinancialInstrumentReportingStatusAdviceV01;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details of many status advice reports where many received reports
 * are reported at once.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageReportHeader4#mmMessageReportIdentifier
 * MessageReportHeader4.mmMessageReportIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageReportHeader4#mmMessageStatus
 * MessageReportHeader4.mmMessageStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageReportHeader4#mmRecordStatus
 * MessageReportHeader4.mmRecordStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageReportHeader4#mmSupplementaryData
 * MessageReportHeader4.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingStatusAdviceV01#mmStatusAdvice
 * FinancialInstrumentReportingStatusAdviceV01.mmStatusAdvice}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageReportHeader4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details of many status advice reports where many received reports are reported at once."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MessageReportHeader4", propOrder = {"messageReportIdentifier", "messageStatus", "recordStatus", "supplementaryData"})
public class MessageReportHeader4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text messageReportIdentifier;
	/**
	 * Provide detail on previously received message reports that are being
	 * reported as part of this status advice.<br>
	 * <br>
	 * Usage:<br>
	 * When required, this field will be populated with the BAH Business Message
	 * Identifier field. Where only a single message report header is used, this
	 * field is not used and relies solely on the BAH Business Message
	 * Identifier field.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageReportHeader4
	 * MessageReportHeader4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRptIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageReportIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide detail on previously received message reports that are being reported as part of this status advice.\r\n\r\nUsage:\r\nWhen required, this field will be populated with the BAH Business Message Identifier field.  Where only a single message report header is used, this field is not used and relies solely on the BAH Business Message Identifier field."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageReportIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MessageReportHeader4.mmObject();
			isDerived = false;
			xmlTag = "MsgRptIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReportIdentifier";
			definition = "Provide detail on previously received message reports that are being reported as part of this status advice.\r\n\r\nUsage:\r\nWhen required, this field will be populated with the BAH Business Message Identifier field.  Where only a single message report header is used, this field is not used and relies solely on the BAH Business Message Identifier field.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected StatusAdviceReport3 messageStatus;
	/**
	 * Details the status of the whole message that has been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.StatusAdviceReport3
	 * StatusAdviceReport3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageReportHeader4
	 * MessageReportHeader4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details the status of the whole message that has been received."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MessageReportHeader4.mmObject();
			isDerived = false;
			xmlTag = "MsgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageStatus";
			definition = "Details the status of the whole message that has been received.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatusAdviceReport3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.StatusReportRecord3> recordStatus;
	/**
	 * Provides per record status on the report that has been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.StatusReportRecord3
	 * StatusReportRecord3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageReportHeader4
	 * MessageReportHeader4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides per record status on the report that has been received."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecordStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MessageReportHeader4.mmObject();
			isDerived = false;
			xmlTag = "RcrdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordStatus";
			definition = "Provides per record status on the report that has been received.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatusReportRecord3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageReportHeader4
	 * MessageReportHeader4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MessageReportHeader4.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MessageReportHeader4.mmMessageReportIdentifier, MessageReportHeader4.mmMessageStatus, MessageReportHeader4.mmRecordStatus, MessageReportHeader4.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingStatusAdviceV01.mmStatusAdvice);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageReportHeader4";
				definition = "Provides details of many status advice reports where many received reports are reported at once.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgRptIdr")
	public Max140Text getMessageReportIdentifier() {
		return messageReportIdentifier;
	}

	public void setMessageReportIdentifier(Max140Text messageReportIdentifier) {
		this.messageReportIdentifier = messageReportIdentifier;
	}

	@XmlElement(name = "MsgSts")
	public StatusAdviceReport3 getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(com.tools20022.repository.msg.StatusAdviceReport3 messageStatus) {
		this.messageStatus = messageStatus;
	}

	@XmlElement(name = "RcrdSts")
	public List<StatusReportRecord3> getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(List<com.tools20022.repository.msg.StatusReportRecord3> recordStatus) {
		this.recordStatus = recordStatus;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}