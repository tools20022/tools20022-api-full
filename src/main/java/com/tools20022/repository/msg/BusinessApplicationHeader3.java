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
import com.tools20022.repository.choice.Party29Choice;
import com.tools20022.repository.datatype.ISONormalisedDateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies specific data from the Business Application Header of the Business
 * Message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader3#mmFrom
 * BusinessApplicationHeader3.mmFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader3#mmTo
 * BusinessApplicationHeader3.mmTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader3#mmBusinessMessageIdentifier
 * BusinessApplicationHeader3.mmBusinessMessageIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader3#mmMessageDefinitionIdentifier
 * BusinessApplicationHeader3.mmMessageDefinitionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader3#mmBusinessService
 * BusinessApplicationHeader3.mmBusinessService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader3#mmCreationDate
 * BusinessApplicationHeader3.mmCreationDate}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessApplicationHeader3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies specific data from the Business Application Header of the Business Message."
 * </li>
 * </ul>
 */
public class BusinessApplicationHeader3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Party29Choice from;
	/**
	 * The sending MessagingEndpoint that has created this Business Message for
	 * the receiving MessagingEndpoint that will process this Business Message.<br>
	 * <br>
	 * Note the sending MessagingEndpoint might be different from the sending
	 * address potentially contained in the transport header (as defined in the
	 * transport layer).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party29Choice
	 * Party29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader3
	 * BusinessApplicationHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "From"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.\r\n\r\nNote\tthe sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFrom = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader3.mmObject();
			isDerived = false;
			xmlTag = "Fr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "From";
			definition = "The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.\r\n\r\nNote\tthe sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party29Choice.mmObject();
		}
	};
	protected Party29Choice to;
	/**
	 * The MessagingEndpoint designated by the sending MessagingEndpoint to be
	 * the recipient who will ultimately process this Business Message.<br>
	 * <br>
	 * Note the receiving MessagingEndpoint might be different from the
	 * receiving address potentially contained in the transport header (as
	 * defined in the transport layer).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party29Choice
	 * Party29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader3
	 * BusinessApplicationHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "To"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "To"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.\r\n\r\nNote the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTo = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader3.mmObject();
			isDerived = false;
			xmlTag = "To";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "To";
			definition = "The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.\r\n\r\nNote the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party29Choice.mmObject();
		}
	};
	protected Max35Text businessMessageIdentifier;
	/**
	 * Unambiguously identifies the Business Message to the MessagingEndpoint
	 * that has created the Business Message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader3
	 * BusinessApplicationHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizMsgIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessMessageIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguously identifies the Business Message to the MessagingEndpoint that has created the Business Message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBusinessMessageIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader3.mmObject();
			isDerived = false;
			xmlTag = "BizMsgIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessMessageIdentifier";
			definition = "Unambiguously identifies the Business Message to the MessagingEndpoint that has created the Business Message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text messageDefinitionIdentifier;
	/**
	 * Contains the MessageIdentifier that defines the BusinessMessage.<br>
	 * It must contain a MessageIdentifier published on the ISO 20022 website.<br>
	 * <br>
	 * example camt.001.001.03
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader3
	 * BusinessApplicationHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgDefIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageDefinitionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the MessageIdentifier that defines the BusinessMessage.\r\nIt must contain a MessageIdentifier published on the ISO 20022 website.\r\n\r\nexample\tcamt.001.001.03"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageDefinitionIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader3.mmObject();
			isDerived = false;
			xmlTag = "MsgDefIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageDefinitionIdentifier";
			definition = "Contains the MessageIdentifier that defines the BusinessMessage.\r\nIt must contain a MessageIdentifier published on the ISO 20022 website.\r\n\r\nexample\tcamt.001.001.03";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text businessService;
	/**
	 * Specifies the business service agreed between the two MessagingEndpoints
	 * under which rules this Business Message is exchanged.<br>
	 * To be used when there is a choice of processing services or processing
	 * service levels.<br>
	 * Example: E&amp;I
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader3
	 * BusinessApplicationHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizSvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.\r\n To be used when there is a choice of processing services or processing service levels.\r\nExample: E&amp;I"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBusinessService = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader3.mmObject();
			isDerived = false;
			xmlTag = "BizSvc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessService";
			definition = "Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.\r\n To be used when there is a choice of processing services or processing service levels.\r\nExample: E&I";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISONormalisedDateTime creationDate;
	/**
	 * Date and time when this Business Message (header) was created.<br>
	 * Note Times must be normalized, using the "Z" annotation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISONormalisedDateTime
	 * ISONormalisedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader3
	 * BusinessApplicationHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when this Business Message (header) was created.\r\nNote    Times must be normalized, using the \"Z\" annotation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader3.mmObject();
			isDerived = false;
			xmlTag = "CreDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDate";
			definition = "Date and time when this Business Message (header) was created.\r\nNote    Times must be normalized, using the \"Z\" annotation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISONormalisedDateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BusinessApplicationHeader3.mmFrom, com.tools20022.repository.msg.BusinessApplicationHeader3.mmTo,
						com.tools20022.repository.msg.BusinessApplicationHeader3.mmBusinessMessageIdentifier, com.tools20022.repository.msg.BusinessApplicationHeader3.mmMessageDefinitionIdentifier,
						com.tools20022.repository.msg.BusinessApplicationHeader3.mmBusinessService, com.tools20022.repository.msg.BusinessApplicationHeader3.mmCreationDate);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BusinessApplicationHeader3";
				definition = "Specifies specific data from the Business Application Header of the Business Message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Party29Choice getFrom() {
		return from;
	}

	public void setFrom(Party29Choice from) {
		this.from = from;
	}

	public Party29Choice getTo() {
		return to;
	}

	public void setTo(Party29Choice to) {
		this.to = to;
	}

	public Max35Text getBusinessMessageIdentifier() {
		return businessMessageIdentifier;
	}

	public void setBusinessMessageIdentifier(Max35Text businessMessageIdentifier) {
		this.businessMessageIdentifier = businessMessageIdentifier;
	}

	public Max35Text getMessageDefinitionIdentifier() {
		return messageDefinitionIdentifier;
	}

	public void setMessageDefinitionIdentifier(Max35Text messageDefinitionIdentifier) {
		this.messageDefinitionIdentifier = messageDefinitionIdentifier;
	}

	public Max35Text getBusinessService() {
		return businessService;
	}

	public void setBusinessService(Max35Text businessService) {
		this.businessService = businessService;
	}

	public ISONormalisedDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(ISONormalisedDateTime creationDate) {
		this.creationDate = creationDate;
	}
}