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
import com.tools20022.repository.choice.Party9Choice;
import com.tools20022.repository.codeset.BusinessMessagePriorityCode;
import com.tools20022.repository.codeset.CopyDuplicate1Code;
import com.tools20022.repository.codeset.UnicodeChartsCode;
import com.tools20022.repository.datatype.ISONormalisedDateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.other.SignatureEnvelope;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the Business Application Header of the Business Message.<br>
 * Can be used when replying to a query; can also be used when canceling or
 * amending.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#CharacterSet
 * BusinessApplicationHeader1.CharacterSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#From
 * BusinessApplicationHeader1.From}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#To
 * BusinessApplicationHeader1.To}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#BusinessMessageIdentifier
 * BusinessApplicationHeader1.BusinessMessageIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#MessageDefinitionIdentifier
 * BusinessApplicationHeader1.MessageDefinitionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#BusinessService
 * BusinessApplicationHeader1.BusinessService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#CreationDate
 * BusinessApplicationHeader1.CreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#CopyDuplicate
 * BusinessApplicationHeader1.CopyDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#PossibleDuplicate
 * BusinessApplicationHeader1.PossibleDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#Priority
 * BusinessApplicationHeader1.Priority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1#Signature
 * BusinessApplicationHeader1.Signature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#Related
 * BusinessApplicationHeaderV01.Related}</li>
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
 * "BusinessApplicationHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the Business Application Header of the Business Message.\r\nCan be used when replying to a query;  can also be used when canceling or amending."
 * </li>
 * </ul>
 */
public class BusinessApplicationHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Contains the character set of the text-based elements used in the
	 * Business Message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnicodeChartsCode
	 * UnicodeChartsCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CharSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CharacterSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the character set of the text-based elements used in the Business Message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CharacterSet = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "CharSet";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CharacterSet";
			definition = "Contains the character set of the text-based elements used in the Business Message.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> UnicodeChartsCode.mmObject();
		}
	};
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
	 * type} = {@linkplain com.tools20022.repository.choice.Party9Choice
	 * Party9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
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
	public static final MMMessageAssociationEnd From = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "Fr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "From";
			definition = "The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.\r\n\r\nNote\tthe sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Party9Choice.mmObject();
			isComposite = true;
		}
	};
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
	 * type} = {@linkplain com.tools20022.repository.choice.Party9Choice
	 * Party9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
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
	public static final MMMessageAssociationEnd To = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "To";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "To";
			definition = "The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.\r\n\r\nNote the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Party9Choice.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
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
	public static final MMMessageAttribute BusinessMessageIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "BizMsgIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessMessageIdentifier";
			definition = "Unambiguously identifies the Business Message to the MessagingEndpoint that has created the Business Message.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
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
	public static final MMMessageAttribute MessageDefinitionIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "MsgDefIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageDefinitionIdentifier";
			definition = "Contains the MessageIdentifier that defines the BusinessMessage.\r\nIt must contain a MessageIdentifier published on the ISO 20022 website.\r\n\r\nexample\tcamt.001.001.03";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
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
	public static final MMMessageAttribute BusinessService = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "BizSvc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessService";
			definition = "Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.\r\n To be used when there is a choice of processing services or processing service levels.\r\nExample: E&I";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
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
	public static final MMMessageAttribute CreationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "CreDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDate";
			definition = "Date and time when this Business Message (header) was created.\r\nNote    Times must be normalized, using the \"Z\" annotation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISONormalisedDateTime.mmObject();
		}
	};
	/**
	 * Indicates whether the message is a Copy, a Duplicate or a copy of a
	 * duplicate of a previously sent ISO 20022 Message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
	 * CopyDuplicate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDplct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the message is a Copy, a Duplicate or a copy of a duplicate of a previously sent ISO 20022 Message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CopyDuplicate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "CpyDplct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDuplicate";
			definition = "Indicates whether the message is a Copy, a Duplicate or a copy of a duplicate of a previously sent ISO 20022 Message.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> CopyDuplicate1Code.mmObject();
		}
	};
	/**
	 * Flag indicating if the Business Message exchanged between the
	 * MessagingEndpoints is possibly a duplicate. <br>
	 * If the receiving MessagingEndpoint did not receive the original, then
	 * this Business Message should be processed as if it were the original. <br>
	 * <br>
	 * If the receiving MessagingEndpoint did receive the original, then it
	 * should perform necessary actions to avoid processing this Business
	 * Message again.<br>
	 * <br>
	 * This will guarantee business idempotent behaviour.<br>
	 * <br>
	 * NOTE: this is named "PossResend" in FIX - this is an application level
	 * resend not a network level retransmission
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PssblDplct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Flag indicating if the Business Message exchanged between the MessagingEndpoints is possibly a duplicate. \r\nIf the receiving MessagingEndpoint  did not receive the original, then this Business Message should be processed as if it were the original. \r\n\r\nIf the receiving MessagingEndpoint did receive the original, then it should perform necessary actions to avoid processing this Business Message again.\r\n\r\nThis will guarantee business idempotent behaviour.\r\n\r\nNOTE: this is named \"PossResend\" in FIX - this is an application level resend not a network level retransmission"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PossibleDuplicate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "PssblDplct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicate";
			definition = "Flag indicating if the Business Message exchanged between the MessagingEndpoints is possibly a duplicate. \r\nIf the receiving MessagingEndpoint  did not receive the original, then this Business Message should be processed as if it were the original. \r\n\r\nIf the receiving MessagingEndpoint did receive the original, then it should perform necessary actions to avoid processing this Business Message again.\r\n\r\nThis will guarantee business idempotent behaviour.\r\n\r\nNOTE: this is named \"PossResend\" in FIX - this is an application level resend not a network level retransmission";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Relative indication of the processing precedence of the message over a
	 * (set of) Business Messages with assigned priorities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessMessagePriorityCode
	 * BusinessMessagePriorityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relative indication of the processing precedence of the message over a (set of) Business Messages with assigned priorities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Priority = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Relative indication of the processing precedence of the message over a (set of) Business Messages with assigned priorities.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> BusinessMessagePriorityCode.mmObject();
		}
	};
	/**
	 * Contains the digital signature of the Business Entity authorised to sign
	 * this Business Message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.other.SignatureEnvelope
	 * SignatureEnvelope}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the digital signature of the Business Entity authorised to sign this Business Message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Signature = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BusinessApplicationHeader1.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Contains the digital signature of the Business Entity authorised to sign this Business Message.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SignatureEnvelope.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BusinessApplicationHeader1.CharacterSet, com.tools20022.repository.msg.BusinessApplicationHeader1.From,
						com.tools20022.repository.msg.BusinessApplicationHeader1.To, com.tools20022.repository.msg.BusinessApplicationHeader1.BusinessMessageIdentifier,
						com.tools20022.repository.msg.BusinessApplicationHeader1.MessageDefinitionIdentifier, com.tools20022.repository.msg.BusinessApplicationHeader1.BusinessService,
						com.tools20022.repository.msg.BusinessApplicationHeader1.CreationDate, com.tools20022.repository.msg.BusinessApplicationHeader1.CopyDuplicate,
						com.tools20022.repository.msg.BusinessApplicationHeader1.PossibleDuplicate, com.tools20022.repository.msg.BusinessApplicationHeader1.Priority, com.tools20022.repository.msg.BusinessApplicationHeader1.Signature);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.head.BusinessApplicationHeaderV01.Related);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BusinessApplicationHeader1";
				definition = "Specifies the Business Application Header of the Business Message.\r\nCan be used when replying to a query;  can also be used when canceling or amending.";
			}
		});
		return mmObject_lazy.get();
	}
}