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

package com.tools20022.repository.area.head;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.BusinessApplicationHeaderLatestVersion;
import com.tools20022.repository.choice.Party9Choice;
import com.tools20022.repository.codeset.BusinessMessagePriorityCode;
import com.tools20022.repository.codeset.CopyDuplicate1Code;
import com.tools20022.repository.codeset.UnicodeChartsCode;
import com.tools20022.repository.datatype.ISONormalisedDateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.BusinessApplicationHeader1;
import com.tools20022.repository.other.SignatureEnvelope;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The Business Layer deals with Business Messages. The behaviour of the
 * Business Messages is fully described by the Business Transaction and the
 * structure of the Business Messages is fully described by the Message
 * Definitions and related Message Rules, Rules and Market Practices. All of
 * which are registered in the ISO 20022 Repository.<br>
 * A single new Business Message (with its accompagnying business application
 * header) is created - by the sending MessagingEndpoint - for each business
 * event; that is each interaction in a Business Transaction. A Business Message
 * adheres to the following principles:<br>
 * " A Business Message (and its business application header) must not contain
 * information about the Message Transport System or the mechanics or mechanism
 * of message sending, transportation, or receipt. <br>
 * " A Business Message must be comprehensible outside of the context of the
 * Transport Message. That is the Business Message must not require knowledge of
 * the Transport Message to be understood.<br>
 * " A Business Message may contain headers, footers, and envelopes that are
 * meaningful for the business. When present, they are treated as any other
 * message content, which means that they are considered part of the Message
 * Definition of the Business Message and as such will be part of the ISO 20022
 * Repository.<br>
 * " A Business Message refers to Business Actors by their Name. Each instance
 * of a Business Actor has one Name. The Business Actor must not be referred to
 * in the Transport Layer.<br>
 * Specific usage of this BusinessMessageHeader may be defined by the relevant
 * SEG.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.BusinessApplicationHeaderLatestVersion
 * BusinessApplicationHeaderLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AppHdr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#CharacterSet
 * BusinessApplicationHeaderV01.CharacterSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#From
 * BusinessApplicationHeaderV01.From}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#To
 * BusinessApplicationHeaderV01.To}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#BusinessMessageIdentifier
 * BusinessApplicationHeaderV01.BusinessMessageIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#MessageDefinitionIdentifier
 * BusinessApplicationHeaderV01.MessageDefinitionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#BusinessService
 * BusinessApplicationHeaderV01.BusinessService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#CreationDate
 * BusinessApplicationHeaderV01.CreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#CopyDuplicate
 * BusinessApplicationHeaderV01.CopyDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#PossibleDuplicate
 * BusinessApplicationHeaderV01.PossibleDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#Priority
 * BusinessApplicationHeaderV01.Priority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#Signature
 * BusinessApplicationHeaderV01.Signature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#Related
 * BusinessApplicationHeaderV01.Related}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.head.BusinessApplicationHeaderV01#identifier
 * BusinessApplicationHeaderV01.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessApplicationHeaderV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The Business Layer deals with Business Messages. The behaviour of the Business Messages is fully described by the Business Transaction and the structure of the Business Messages is fully described by the Message Definitions and related Message Rules, Rules and Market Practices. All of which are registered in the ISO 20022 Repository.\r\nA single new Business Message (with its accompagnying business application header) is created - by the sending MessagingEndpoint - for each business event; that is each interaction in a Business Transaction. A Business Message adheres to the following principles:\r\n\" A Business Message (and its business application header) must not contain information about the Message Transport System or the mechanics or mechanism of message sending, transportation, or receipt. \r\n\" A Business Message must be comprehensible outside of the context of the Transport Message. That is the Business Message must not require knowledge of the Transport Message to be understood.\r\n\" A Business Message may contain headers, footers, and envelopes that are meaningful for the business. When present, they are treated as any other message content, which means that they are considered part of the Message Definition of the Business Message and as such will be part of the ISO 20022 Repository.\r\n\" A Business Message refers to Business Actors by their Name. Each instance of a Business Actor has one Name. The Business Actor must not be referred to in the Transport Layer.\r\nSpecific usage of this BusinessMessageHeader may be defined by the relevant SEG."
 * </li>
 * </ul>
 */
public class BusinessApplicationHeaderV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Contains the character set of the text-based elements used in the
	 * Business Message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnicodeChartsCode
	 * UnicodeChartsCode}</li>
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
	public static final MMMessageBuildingBlock CharacterSet = new MMMessageBuildingBlock() {
		{
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.choice.Party9Choice
	 * Party9Choice}</li>
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
	public static final MMMessageBuildingBlock From = new MMMessageBuildingBlock() {
		{
			xmlTag = "Fr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "From";
			definition = "The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.\r\n\r\nNote\tthe sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer).";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> Party9Choice.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.choice.Party9Choice
	 * Party9Choice}</li>
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
	public static final MMMessageBuildingBlock To = new MMMessageBuildingBlock() {
		{
			xmlTag = "To";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "To";
			definition = "The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.\r\n\r\nNote the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer).";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> Party9Choice.mmObject();
		}
	};
	/**
	 * Unambiguously identifies the Business Message to the MessagingEndpoint
	 * that has created the Business Message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
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
	public static final MMMessageBuildingBlock BusinessMessageIdentifier = new MMMessageBuildingBlock() {
		{
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
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
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
	public static final MMMessageBuildingBlock MessageDefinitionIdentifier = new MMMessageBuildingBlock() {
		{
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
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
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
	public static final MMMessageBuildingBlock BusinessService = new MMMessageBuildingBlock() {
		{
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
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISONormalisedDateTime
	 * ISONormalisedDateTime}</li>
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
	public static final MMMessageBuildingBlock CreationDate = new MMMessageBuildingBlock() {
		{
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
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
	 * CopyDuplicate1Code}</li>
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
	public static final MMMessageBuildingBlock CopyDuplicate = new MMMessageBuildingBlock() {
		{
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
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
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
	public static final MMMessageBuildingBlock PossibleDuplicate = new MMMessageBuildingBlock() {
		{
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
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessMessagePriorityCode
	 * BusinessMessagePriorityCode}</li>
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
	public static final MMMessageBuildingBlock Priority = new MMMessageBuildingBlock() {
		{
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.other.SignatureEnvelope
	 * SignatureEnvelope}</li>
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
	public static final MMMessageBuildingBlock Signature = new MMMessageBuildingBlock() {
		{
			xmlTag = "Sgntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Contains the digital signature of the Business Entity authorised to sign this Business Message.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> SignatureEnvelope.mmObject();
		}
	};
	/**
	 * Specifies the Business Application Header of the Business Message to
	 * which this Business Message relates.<br>
	 * Can be used when replying to a query; can also be used when canceling or
	 * amending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BusinessApplicationHeader1
	 * BusinessApplicationHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rltd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Related"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the Business Application Header of the Business Message to which this Business Message relates.\r\nCan be used when replying to a query;  can also be used when canceling or amending."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Related = new MMMessageBuildingBlock() {
		{
			xmlTag = "Rltd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Related";
			definition = "Specifies the Business Application Header of the Business Message to which this Business Message relates.\r\nCan be used when replying to a query;  can also be used when canceling or amending.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> BusinessApplicationHeader1.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "head"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "001"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "head";
			messageFunctionality = "001";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BusinessApplicationHeaderV01";
				definition = "The Business Layer deals with Business Messages. The behaviour of the Business Messages is fully described by the Business Transaction and the structure of the Business Messages is fully described by the Message Definitions and related Message Rules, Rules and Market Practices. All of which are registered in the ISO 20022 Repository.\r\nA single new Business Message (with its accompagnying business application header) is created - by the sending MessagingEndpoint - for each business event; that is each interaction in a Business Transaction. A Business Message adheres to the following principles:\r\n\" A Business Message (and its business application header) must not contain information about the Message Transport System or the mechanics or mechanism of message sending, transportation, or receipt. \r\n\" A Business Message must be comprehensible outside of the context of the Transport Message. That is the Business Message must not require knowledge of the Transport Message to be understood.\r\n\" A Business Message may contain headers, footers, and envelopes that are meaningful for the business. When present, they are treated as any other message content, which means that they are considered part of the Message Definition of the Business Message and as such will be part of the ISO 20022 Repository.\r\n\" A Business Message refers to Business Actors by their Name. Each instance of a Business Actor has one Name. The Business Actor must not be referred to in the Transport Layer.\r\nSpecific usage of this BusinessMessageHeader may be defined by the relevant SEG.";
				rootElement = "Document";
				xmlTag = "AppHdr";
				businessArea_lazy = () -> BusinessApplicationHeaderLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.head.BusinessApplicationHeaderV01.CharacterSet, com.tools20022.repository.area.head.BusinessApplicationHeaderV01.From,
						com.tools20022.repository.area.head.BusinessApplicationHeaderV01.To, com.tools20022.repository.area.head.BusinessApplicationHeaderV01.BusinessMessageIdentifier,
						com.tools20022.repository.area.head.BusinessApplicationHeaderV01.MessageDefinitionIdentifier, com.tools20022.repository.area.head.BusinessApplicationHeaderV01.BusinessService,
						com.tools20022.repository.area.head.BusinessApplicationHeaderV01.CreationDate, com.tools20022.repository.area.head.BusinessApplicationHeaderV01.CopyDuplicate,
						com.tools20022.repository.area.head.BusinessApplicationHeaderV01.PossibleDuplicate, com.tools20022.repository.area.head.BusinessApplicationHeaderV01.Priority,
						com.tools20022.repository.area.head.BusinessApplicationHeaderV01.Signature, com.tools20022.repository.area.head.BusinessApplicationHeaderV01.Related);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.head.BusinessApplicationHeaderV01.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}