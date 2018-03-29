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
import com.tools20022.repository.codeset.ActionType6Code;
import com.tools20022.repository.codeset.MessageFunction7Code;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ActionMessage4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of actions to be performed by the card acceptor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Action5#mmActionType
 * Action5.mmActionType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Action5#mmMessageToPresent
 * Action5.mmMessageToPresent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Action5#mmRequestToPerform
 * Action5.mmRequestToPerform}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
 * CardPaymentAcquiring}</li>
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
 * "Action5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of actions to be performed by the card acceptor."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Action4 Action4}
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Action5", propOrder = {"actionType", "messageToPresent", "requestToPerform"})
public class Action5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActnTp", required = true)
	protected ActionType6Code actionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType6Code
	 * ActionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmActionType
	 * CardPaymentAcquiring.mmActionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Action5
	 * Action5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of action to be performed by the card acceptor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Action4#mmActionType
	 * Action4.mmActionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Action5, ActionType6Code> mmActionType = new MMMessageAttribute<Action5, ActionType6Code>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmActionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Action5.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Type of action to be performed by the card acceptor.";
			previousVersion_lazy = () -> Action4.mmActionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActionType6Code.mmObject();
		}

		@Override
		public ActionType6Code getValue(Action5 obj) {
			return obj.getActionType();
		}

		@Override
		public void setValue(Action5 obj, ActionType6Code value) {
			obj.setActionType(value);
		}
	};
	@XmlElement(name = "MsgToPres")
	protected ActionMessage4 messageToPresent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ActionMessage4
	 * ActionMessage4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmActionMessage
	 * CardPaymentAcquiring.mmActionMessage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Action5
	 * Action5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgToPres"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageToPresent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information to display, print or log."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Action4#mmMessageToPresent
	 * Action4.mmMessageToPresent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Action5, Optional<ActionMessage4>> mmMessageToPresent = new MMMessageAssociationEnd<Action5, Optional<ActionMessage4>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmActionMessage;
			componentContext_lazy = () -> com.tools20022.repository.msg.Action5.mmObject();
			isDerived = false;
			xmlTag = "MsgToPres";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageToPresent";
			definition = "Information to display, print or log.";
			previousVersion_lazy = () -> Action4.mmMessageToPresent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ActionMessage4.mmObject();
		}

		@Override
		public Optional<ActionMessage4> getValue(Action5 obj) {
			return obj.getMessageToPresent();
		}

		@Override
		public void setValue(Action5 obj, Optional<ActionMessage4> value) {
			obj.setMessageToPresent(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqToPrfrm")
	protected MessageFunction7Code requestToPerform;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Action5
	 * Action5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqToPrfrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestToPerform"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message to send before the completion of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Action5, Optional<MessageFunction7Code>> mmRequestToPerform = new MMMessageAttribute<Action5, Optional<MessageFunction7Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Action5.mmObject();
			isDerived = false;
			xmlTag = "ReqToPrfrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestToPerform";
			definition = "Message to send before the completion of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MessageFunction7Code.mmObject();
		}

		@Override
		public Optional<MessageFunction7Code> getValue(Action5 obj) {
			return obj.getRequestToPerform();
		}

		@Override
		public void setValue(Action5 obj, Optional<MessageFunction7Code> value) {
			obj.setRequestToPerform(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Action5.mmActionType, com.tools20022.repository.msg.Action5.mmMessageToPresent, com.tools20022.repository.msg.Action5.mmRequestToPerform);
				trace_lazy = () -> CardPaymentAcquiring.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Action5";
				definition = "Set of actions to be performed by the card acceptor.";
				previousVersion_lazy = () -> Action4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ActionType6Code getActionType() {
		return actionType;
	}

	public Action5 setActionType(ActionType6Code actionType) {
		this.actionType = Objects.requireNonNull(actionType);
		return this;
	}

	public Optional<ActionMessage4> getMessageToPresent() {
		return messageToPresent == null ? Optional.empty() : Optional.of(messageToPresent);
	}

	public Action5 setMessageToPresent(ActionMessage4 messageToPresent) {
		this.messageToPresent = messageToPresent;
		return this;
	}

	public Optional<MessageFunction7Code> getRequestToPerform() {
		return requestToPerform == null ? Optional.empty() : Optional.of(requestToPerform);
	}

	public Action5 setRequestToPerform(MessageFunction7Code requestToPerform) {
		this.requestToPerform = requestToPerform;
		return this;
	}
}