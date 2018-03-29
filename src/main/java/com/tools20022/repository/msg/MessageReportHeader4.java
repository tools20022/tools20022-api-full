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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.StatusAdviceReport3;
import com.tools20022.repository.msg.StatusReportRecord3;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.area.other.FinancialInstrumentReportingStatusAdviceV01#mmStatusAdvice
 * FinancialInstrumentReportingStatusAdviceV01.mmStatusAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingStatusAdviceV01#mmStatusAdvice
 * FinancialInstrumentReportingStatusAdviceV01.mmStatusAdvice}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageReportHeader4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details of many status advice reports where many received reports are reported at once."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MessageReportHeader4", propOrder = {"messageReportIdentifier", "messageStatus", "recordStatus", "supplementaryData"})
public class MessageReportHeader4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgRptIdr")
	protected Max140Text messageReportIdentifier;
	/**
	 * 
	 <p>
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
	 * "Provide detail on previously received message reports that are being reported as part of this status advice.\r\n\r\nUsage:\r\nWhen required, this field will be populated with the BAH Business Message Identifier field. Where only a single message report header is used, this field is not used and relies solely on the BAH Business Message Identifier field."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageReportHeader4, Optional<Max140Text>> mmMessageReportIdentifier = new MMMessageAttribute<MessageReportHeader4, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageReportHeader4.mmObject();
			isDerived = false;
			xmlTag = "MsgRptIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReportIdentifier";
			definition = "Provide detail on previously received message reports that are being reported as part of this status advice.\r\n\r\nUsage:\r\nWhen required, this field will be populated with the BAH Business Message Identifier field. Where only a single message report header is used, this field is not used and relies solely on the BAH Business Message Identifier field.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(MessageReportHeader4 obj) {
			return obj.getMessageReportIdentifier();
		}

		@Override
		public void setValue(MessageReportHeader4 obj, Optional<Max140Text> value) {
			obj.setMessageReportIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgSts")
	protected StatusAdviceReport3 messageStatus;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<MessageReportHeader4, Optional<StatusAdviceReport3>> mmMessageStatus = new MMMessageAssociationEnd<MessageReportHeader4, Optional<StatusAdviceReport3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageReportHeader4.mmObject();
			isDerived = false;
			xmlTag = "MsgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageStatus";
			definition = "Details the status of the whole message that has been received.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StatusAdviceReport3.mmObject();
		}

		@Override
		public Optional<StatusAdviceReport3> getValue(MessageReportHeader4 obj) {
			return obj.getMessageStatus();
		}

		@Override
		public void setValue(MessageReportHeader4 obj, Optional<StatusAdviceReport3> value) {
			obj.setMessageStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "RcrdSts")
	protected List<StatusReportRecord3> recordStatus;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<MessageReportHeader4, List<StatusReportRecord3>> mmRecordStatus = new MMMessageAssociationEnd<MessageReportHeader4, List<StatusReportRecord3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageReportHeader4.mmObject();
			isDerived = false;
			xmlTag = "RcrdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordStatus";
			definition = "Provides per record status on the report that has been received.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StatusReportRecord3.mmObject();
		}

		@Override
		public List<StatusReportRecord3> getValue(MessageReportHeader4 obj) {
			return obj.getRecordStatus();
		}

		@Override
		public void setValue(MessageReportHeader4 obj, List<StatusReportRecord3> value) {
			obj.setRecordStatus(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<MessageReportHeader4, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<MessageReportHeader4, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageReportHeader4.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MessageReportHeader4 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MessageReportHeader4 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MessageReportHeader4.mmMessageReportIdentifier, com.tools20022.repository.msg.MessageReportHeader4.mmMessageStatus,
						com.tools20022.repository.msg.MessageReportHeader4.mmRecordStatus, com.tools20022.repository.msg.MessageReportHeader4.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.other.FinancialInstrumentReportingStatusAdviceV01.mmStatusAdvice,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingStatusAdviceV01.mmStatusAdvice);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageReportHeader4";
				definition = "Provides details of many status advice reports where many received reports are reported at once.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max140Text> getMessageReportIdentifier() {
		return messageReportIdentifier == null ? Optional.empty() : Optional.of(messageReportIdentifier);
	}

	public MessageReportHeader4 setMessageReportIdentifier(Max140Text messageReportIdentifier) {
		this.messageReportIdentifier = messageReportIdentifier;
		return this;
	}

	public Optional<StatusAdviceReport3> getMessageStatus() {
		return messageStatus == null ? Optional.empty() : Optional.of(messageStatus);
	}

	public MessageReportHeader4 setMessageStatus(StatusAdviceReport3 messageStatus) {
		this.messageStatus = messageStatus;
		return this;
	}

	public List<StatusReportRecord3> getRecordStatus() {
		return recordStatus == null ? recordStatus = new ArrayList<>() : recordStatus;
	}

	public MessageReportHeader4 setRecordStatus(List<StatusReportRecord3> recordStatus) {
		this.recordStatus = Objects.requireNonNull(recordStatus);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MessageReportHeader4 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}