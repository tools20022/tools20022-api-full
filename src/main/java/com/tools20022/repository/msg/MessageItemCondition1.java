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
import com.tools20022.repository.codeset.MessageItemCondition1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Presence condition of a message item.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageItemCondition1#mmItemIdentification
 * MessageItemCondition1.mmItemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageItemCondition1#mmCondition
 * MessageItemCondition1.mmCondition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageItemCondition1#mmValue
 * MessageItemCondition1.mmValue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageItemCondition1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Presence condition of a message item."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MessageItemCondition1", propOrder = {"itemIdentification", "condition", "value"})
public class MessageItemCondition1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ItmId", required = true)
	protected Max140Text itemIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.MessageItemCondition1
	 * MessageItemCondition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the message and the message item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageItemCondition1, Max140Text> mmItemIdentification = new MMMessageAttribute<MessageItemCondition1, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageItemCondition1.mmObject();
			isDerived = false;
			xmlTag = "ItmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemIdentification";
			definition = "Unique identification of the message and the message item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(MessageItemCondition1 obj) {
			return obj.getItemIdentification();
		}

		@Override
		public void setValue(MessageItemCondition1 obj, Max140Text value) {
			obj.setItemIdentification(value);
		}
	};
	@XmlElement(name = "Cond", required = true)
	protected MessageItemCondition1Code condition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code
	 * MessageItemCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageItemCondition1
	 * MessageItemCondition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cond"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition of presence of the message item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageItemCondition1, MessageItemCondition1Code> mmCondition = new MMMessageAttribute<MessageItemCondition1, MessageItemCondition1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageItemCondition1.mmObject();
			isDerived = false;
			xmlTag = "Cond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition";
			definition = "Condition of presence of the message item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MessageItemCondition1Code.mmObject();
		}

		@Override
		public MessageItemCondition1Code getValue(MessageItemCondition1 obj) {
			return obj.getCondition();
		}

		@Override
		public void setValue(MessageItemCondition1 obj, MessageItemCondition1Code value) {
			obj.setCondition(value);
		}
	};
	@XmlElement(name = "Val")
	protected List<Max140Text> value;
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
	 * {@linkplain com.tools20022.repository.msg.MessageItemCondition1
	 * MessageItemCondition1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Val"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value to be used for the message item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageItemCondition1, List<Max140Text>> mmValue = new MMMessageAttribute<MessageItemCondition1, List<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageItemCondition1.mmObject();
			isDerived = false;
			xmlTag = "Val";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Value to be used for the message item.";
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public List<Max140Text> getValue(MessageItemCondition1 obj) {
			return obj.getValue();
		}

		@Override
		public void setValue(MessageItemCondition1 obj, List<Max140Text> value) {
			obj.setValue(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MessageItemCondition1.mmItemIdentification, com.tools20022.repository.msg.MessageItemCondition1.mmCondition,
						com.tools20022.repository.msg.MessageItemCondition1.mmValue);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageItemCondition1";
				definition = "Presence condition of a message item.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getItemIdentification() {
		return itemIdentification;
	}

	public MessageItemCondition1 setItemIdentification(Max140Text itemIdentification) {
		this.itemIdentification = Objects.requireNonNull(itemIdentification);
		return this;
	}

	public MessageItemCondition1Code getCondition() {
		return condition;
	}

	public MessageItemCondition1 setCondition(MessageItemCondition1Code condition) {
		this.condition = Objects.requireNonNull(condition);
		return this;
	}

	public List<Max140Text> getValue() {
		return value == null ? value = new ArrayList<>() : value;
	}

	public MessageItemCondition1 setValue(List<Max140Text> value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}
}