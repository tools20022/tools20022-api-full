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
import com.tools20022.repository.area.pacs.*;
import com.tools20022.repository.area.pain.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentReversalReason7;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the original group, to which the message refers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#mmOriginalMessageIdentification
 * OriginalGroupHeader3.mmOriginalMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#mmOriginalMessageNameIdentification
 * OriginalGroupHeader3.mmOriginalMessageNameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#mmOriginalCreationDateTime
 * OriginalGroupHeader3.mmOriginalCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#mmReversalReasonInformation
 * OriginalGroupHeader3.mmReversalReasonInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentExecution
 * PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV03#mmOriginalGroupInformation
 * CustomerPaymentReversalV03.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV04#mmOriginalGroupInformation
 * CustomerPaymentReversalV04.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV03#mmOriginalGroupInformation
 * FIToFIPaymentReversalV03.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV04#mmOriginalGroupInformation
 * FIToFIPaymentReversalV04.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV05#mmOriginalGroupInformation
 * CustomerPaymentReversalV05.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV05#mmOriginalGroupInformation
 * FIToFIPaymentReversalV05.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV06#mmOriginalGroupInformation
 * FIToFIPaymentReversalV06.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV06#mmOriginalGroupInformation
 * CustomerPaymentReversalV06.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07#mmOriginalGroupInformation
 * FIToFIPaymentReversalV07.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07#mmOriginalGroupInformation
 * CustomerPaymentReversalV07.mmOriginalGroupInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginalGroupHeader3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the original group, to which the message refers."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader11
 * OriginalGroupHeader11}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalGroupHeader3", propOrder = {"originalMessageIdentification", "originalMessageNameIdentification", "originalCreationDateTime", "reversalReasonInformation"})
public class OriginalGroupHeader3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMsgId", required = true)
	protected Max35Text originalMessageIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3
	 * OriginalGroupHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference, as assigned by the original instructing party, to unambiguously identify the original message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader11#mmOriginalMessageIdentification
	 * OriginalGroupHeader11.mmOriginalMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupHeader3, Max35Text> mmOriginalMessageIdentification = new MMMessageAttribute<OriginalGroupHeader3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Point to point reference, as assigned by the original instructing party, to unambiguously identify the original message.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupHeader11.mmOriginalMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalGroupHeader3 obj) {
			return obj.getOriginalMessageIdentification();
		}

		@Override
		public void setValue(OriginalGroupHeader3 obj, Max35Text value) {
			obj.setOriginalMessageIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlMsgNmId", required = true)
	protected Max35Text originalMessageNameIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3
	 * OriginalGroupHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgNmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageNameIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the original message name identifier to which the message refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader11#mmOriginalMessageNameIdentification
	 * OriginalGroupHeader11.mmOriginalMessageNameIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupHeader3, Max35Text> mmOriginalMessageNameIdentification = new MMMessageAttribute<OriginalGroupHeader3, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgNmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageNameIdentification";
			definition = "Specifies the original message name identifier to which the message refers.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupHeader11.mmOriginalMessageNameIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalGroupHeader3 obj) {
			return obj.getOriginalMessageNameIdentification();
		}

		@Override
		public void setValue(OriginalGroupHeader3 obj, Max35Text value) {
			obj.setOriginalMessageNameIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlCreDtTm")
	protected ISODateTime originalCreationDateTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreationDate
	 * PaymentExecution.mmCreationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3
	 * OriginalGroupHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCreDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the original message was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader11#mmOriginalCreationDateTime
	 * OriginalGroupHeader11.mmOriginalCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupHeader3, Optional<ISODateTime>> mmOriginalCreationDateTime = new MMMessageAttribute<OriginalGroupHeader3, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreationDateTime";
			definition = "Date and time at which the original message was created.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupHeader11.mmOriginalCreationDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(OriginalGroupHeader3 obj) {
			return obj.getOriginalCreationDateTime();
		}

		@Override
		public void setValue(OriginalGroupHeader3 obj, Optional<ISODateTime> value) {
			obj.setOriginalCreationDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "RvslRsnInf")
	protected List<PaymentReversalReason7> reversalReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentReversalReason7
	 * PaymentReversalReason7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3
	 * OriginalGroupHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslRsnInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides detailed information on the reversal reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader11#mmReversalReasonInformation
	 * OriginalGroupHeader11.mmReversalReasonInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalGroupHeader3, List<PaymentReversalReason7>> mmReversalReasonInformation = new MMMessageAssociationEnd<OriginalGroupHeader3, List<PaymentReversalReason7>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader3.mmObject();
			isDerived = false;
			xmlTag = "RvslRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalReasonInformation";
			definition = "Provides detailed information on the reversal reason.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupHeader11.mmReversalReasonInformation);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentReversalReason7.mmObject();
		}

		@Override
		public List<PaymentReversalReason7> getValue(OriginalGroupHeader3 obj) {
			return obj.getReversalReasonInformation();
		}

		@Override
		public void setValue(OriginalGroupHeader3 obj, List<PaymentReversalReason7> value) {
			obj.setReversalReasonInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupHeader3.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupHeader3.mmOriginalMessageNameIdentification,
						com.tools20022.repository.msg.OriginalGroupHeader3.mmOriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupHeader3.mmReversalReasonInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustomerPaymentReversalV03.mmOriginalGroupInformation, CustomerPaymentReversalV04.mmOriginalGroupInformation, FIToFIPaymentReversalV03.mmOriginalGroupInformation,
						FIToFIPaymentReversalV04.mmOriginalGroupInformation, CustomerPaymentReversalV05.mmOriginalGroupInformation, FIToFIPaymentReversalV05.mmOriginalGroupInformation, FIToFIPaymentReversalV06.mmOriginalGroupInformation,
						CustomerPaymentReversalV06.mmOriginalGroupInformation, FIToFIPaymentReversalV07.mmOriginalGroupInformation, CustomerPaymentReversalV07.mmOriginalGroupInformation);
				trace_lazy = () -> PaymentExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalGroupHeader3";
				definition = "Provides details on the original group, to which the message refers.";
				nextVersions_lazy = () -> Arrays.asList(OriginalGroupHeader11.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalMessageIdentification() {
		return originalMessageIdentification;
	}

	public OriginalGroupHeader3 setOriginalMessageIdentification(Max35Text originalMessageIdentification) {
		this.originalMessageIdentification = Objects.requireNonNull(originalMessageIdentification);
		return this;
	}

	public Max35Text getOriginalMessageNameIdentification() {
		return originalMessageNameIdentification;
	}

	public OriginalGroupHeader3 setOriginalMessageNameIdentification(Max35Text originalMessageNameIdentification) {
		this.originalMessageNameIdentification = Objects.requireNonNull(originalMessageNameIdentification);
		return this;
	}

	public Optional<ISODateTime> getOriginalCreationDateTime() {
		return originalCreationDateTime == null ? Optional.empty() : Optional.of(originalCreationDateTime);
	}

	public OriginalGroupHeader3 setOriginalCreationDateTime(ISODateTime originalCreationDateTime) {
		this.originalCreationDateTime = originalCreationDateTime;
		return this;
	}

	public List<PaymentReversalReason7> getReversalReasonInformation() {
		return reversalReasonInformation == null ? reversalReasonInformation = new ArrayList<>() : reversalReasonInformation;
	}

	public OriginalGroupHeader3 setReversalReasonInformation(List<PaymentReversalReason7> reversalReasonInformation) {
		this.reversalReasonInformation = Objects.requireNonNull(reversalReasonInformation);
		return this;
	}
}