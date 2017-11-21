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

package com.tools20022.repository.area.tsmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesManagementLatestVersion;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.msg.BusinessLetter1;
import com.tools20022.repository.msg.EncapsulatedBusinessMessage1;
import com.tools20022.repository.msg.EventDescription1;
import com.tools20022.repository.msgset.FactoringServicesISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * The PartyEventAdvice message can be sent by any party to any other party. It
 * is used for business letters containing information for which treatment is
 * not formally defined in order to keep partners informed and to maintain
 * business traces, for example confirmations of information exchanged out-of
 * band such as announcing a postal letter, confirming a telephone call or the
 * exchange of contractual information. It can also be sent to verify the
 * technical interoperability of the communicating IT-systems.<br>
 * The message can reference other message and include data from referenced
 * messages.<br>
 * The message can report several events.<br>
 * The message can carry digital signatures if required by context.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.FactoringServicesISOLatestversion
 * FactoringServicesISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PtyEvtAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.PartyEventAdviceV01#mmHeader
 * PartyEventAdviceV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.PartyEventAdviceV01#mmEventNotice
 * PartyEventAdviceV01.mmEventNotice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.PartyEventAdviceV01#mmEventCount
 * PartyEventAdviceV01.mmEventCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.PartyEventAdviceV01#mmAttachedMessage
 * PartyEventAdviceV01.mmAttachedMessage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.055.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyEventAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The PartyEventAdvice message can be sent by any party to any other party. It is used for business letters containing information for which treatment is not formally defined in order to keep partners informed and to maintain business traces, for example confirmations of information exchanged out-of band such as announcing a postal letter, confirming a telephone call or the exchange of contractual information. It can also be sent to verify the technical interoperability of the communicating IT-systems.\r\nThe message can reference other message and include data from referenced messages.\r\nThe message can report several events.\r\nThe message can carry digital signatures if required by context."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyEventAdviceV01", propOrder = {"header", "eventNotice", "eventCount", "attachedMessage"})
public class PartyEventAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected BusinessLetter1 header;
	/**
	 * Set of characteristics that unambiguously identify the event, common
	 * parameters, documents and identifications.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics that unambiguously identify the event, common parameters, documents and identifications."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Set of characteristics that unambiguously identify the event, common parameters, documents and identifications.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BusinessLetter1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyEventAdviceV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<EventDescription1> eventNotice;
	/**
	 * Description of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EventDescription1
	 * EventDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtNtce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventNotice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEventNotice = new MMMessageBuildingBlock() {
		{
			xmlTag = "EvtNtce";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventNotice";
			definition = "Description of the event.";
			minOccurs = 1;
			complexType_lazy = () -> EventDescription1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyEventAdviceV01.class.getMethod("getEventNotice", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max15NumericText eventCount;
	/**
	 * Number of events as control value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of events as control value."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEventCount = new MMMessageBuildingBlock() {
		{
			xmlTag = "EvtCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventCount";
			definition = "Number of events as control value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyEventAdviceV01.class.getMethod("getEventCount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<EncapsulatedBusinessMessage1> attachedMessage;
	/**
	 * Referenced or related business message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1
	 * EncapsulatedBusinessMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttchdMsg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttachedMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Referenced or related business message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAttachedMessage = new MMMessageBuildingBlock() {
		{
			xmlTag = "AttchdMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedMessage";
			definition = "Referenced or related business message.";
			minOccurs = 0;
			complexType_lazy = () -> EncapsulatedBusinessMessage1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyEventAdviceV01.class.getMethod("getAttachedMessage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyEventAdviceV01";
				definition = "The PartyEventAdvice message can be sent by any party to any other party. It is used for business letters containing information for which treatment is not formally defined in order to keep partners informed and to maintain business traces, for example confirmations of information exchanged out-of band such as announcing a postal letter, confirming a telephone call or the exchange of contractual information. It can also be sent to verify the technical interoperability of the communicating IT-systems.\r\nThe message can reference other message and include data from referenced messages.\r\nThe message can report several events.\r\nThe message can carry digital signatures if required by context.";
				messageSet_lazy = () -> Arrays.asList(FactoringServicesISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "PtyEvtAdvc";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.PartyEventAdviceV01.mmHeader, com.tools20022.repository.area.tsmt.PartyEventAdviceV01.mmEventNotice,
						com.tools20022.repository.area.tsmt.PartyEventAdviceV01.mmEventCount, com.tools20022.repository.area.tsmt.PartyEventAdviceV01.mmAttachedMessage);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "055";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PartyEventAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hdr", required = true)
	public BusinessLetter1 getHeader() {
		return header;
	}

	public void setHeader(BusinessLetter1 header) {
		this.header = header;
	}

	@XmlElement(name = "EvtNtce", required = true)
	public List<EventDescription1> getEventNotice() {
		return eventNotice;
	}

	public void setEventNotice(List<EventDescription1> eventNotice) {
		this.eventNotice = eventNotice;
	}

	@XmlElement(name = "EvtCnt")
	public Max15NumericText getEventCount() {
		return eventCount;
	}

	public void setEventCount(Max15NumericText eventCount) {
		this.eventCount = eventCount;
	}

	@XmlElement(name = "AttchdMsg")
	public List<EncapsulatedBusinessMessage1> getAttachedMessage() {
		return attachedMessage;
	}

	public void setAttachedMessage(List<EncapsulatedBusinessMessage1> attachedMessage) {
		this.attachedMessage = attachedMessage;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.01.01")
	static public class Document {
		@XmlElement(name = "PtyEvtAdvc", required = true)
		public PartyEventAdviceV01 messageBody;
	}
}