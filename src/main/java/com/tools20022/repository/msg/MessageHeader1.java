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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics, such as the identification or the creation date and
 * time, specific to the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageHeader1#mmMessageIdentification
 * MessageHeader1.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageHeader1#mmCreationDateTime
 * MessageHeader1.mmCreationDateTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyMemberV03#mmMessageHeader
 * ModifyMemberV03.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DeleteLimitV06#mmMessageHeader
 * DeleteLimitV06.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.LiquidityDebitTransferV04#mmMessageHeader
 * LiquidityDebitTransferV04.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyLimitV06#mmMessageHeader
 * ModifyLimitV06.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetGeneralBusinessInformationV03#mmMessageHeader
 * GetGeneralBusinessInformationV03.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BackupPaymentV06#mmMessageHeader
 * BackupPaymentV06.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BackupPaymentV06#mmOriginalMessageIdentification
 * BackupPaymentV06.mmOriginalMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DeleteReservationV04#mmMessageHeader
 * DeleteReservationV04.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyReservationV04#mmMessageHeader
 * ModifyReservationV04.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.LiquidityCreditTransferV04#mmMessageHeader
 * LiquidityCreditTransferV04.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetCurrencyExchangeRateV03#mmMessageHeader
 * GetCurrencyExchangeRateV03.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyTransactionV07#mmMessageHeader
 * ModifyTransactionV07.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyStandingOrderV05#mmMessageHeader
 * ModifyStandingOrderV05.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DeleteStandingOrderV02#mmMessageHeader
 * DeleteStandingOrderV02.mmMessageHeader}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics, such as the identification or the creation date and time, specific to the message."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MessageHeader1", propOrder = {"messageIdentification", "creationDateTime"})
public class MessageHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected Max35Text messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageHeader1 MessageHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference, as assigned by the sender, to unambiguously identify the message.\r\nUsage: The sender has to make sure that MessageIdentification is unique for a pre-agreed period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageHeader1, Max35Text> mmMessageIdentification = new MMMessageAttribute<MessageHeader1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader1.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the sender, to unambiguously identify the message.\r\nUsage: The sender has to make sure that MessageIdentification is unique for a pre-agreed period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(MessageHeader1 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(MessageHeader1 obj, Max35Text value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "CreDtTm")
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageHeader1 MessageHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the message was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageHeader1, Optional<ISODateTime>> mmCreationDateTime = new MMMessageAttribute<MessageHeader1, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageHeader1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(MessageHeader1 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(MessageHeader1 obj, Optional<ISODateTime> value) {
			obj.setCreationDateTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MessageHeader1.mmMessageIdentification, com.tools20022.repository.msg.MessageHeader1.mmCreationDateTime);
				messageBuildingBlock_lazy = () -> Arrays.asList(ModifyMemberV03.mmMessageHeader, DeleteLimitV06.mmMessageHeader, LiquidityDebitTransferV04.mmMessageHeader, ModifyLimitV06.mmMessageHeader,
						GetGeneralBusinessInformationV03.mmMessageHeader, BackupPaymentV06.mmMessageHeader, BackupPaymentV06.mmOriginalMessageIdentification, DeleteReservationV04.mmMessageHeader, ModifyReservationV04.mmMessageHeader,
						LiquidityCreditTransferV04.mmMessageHeader, GetCurrencyExchangeRateV03.mmMessageHeader, ModifyTransactionV07.mmMessageHeader, ModifyStandingOrderV05.mmMessageHeader, DeleteStandingOrderV02.mmMessageHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageHeader1";
				definition = "Set of characteristics, such as the identification or the creation date and time, specific to the message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public MessageHeader1 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<ISODateTime> getCreationDateTime() {
		return creationDateTime == null ? Optional.empty() : Optional.of(creationDateTime);
	}

	public MessageHeader1 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
		return this;
	}
}