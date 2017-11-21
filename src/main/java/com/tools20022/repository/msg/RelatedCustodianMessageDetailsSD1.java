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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides selected corporate action events message details extracted from the
 * related custodian messages received.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1#mmReceivedEventType
 * RelatedCustodianMessageDetailsSD1.mmReceivedEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1#mmReceivedMandatoryVoluntaryEventType
 * RelatedCustodianMessageDetailsSD1.mmReceivedMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1#mmReceivedCorporateActionEventIdentification
 * RelatedCustodianMessageDetailsSD1.
 * mmReceivedCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1#mmReceivedDate
 * RelatedCustodianMessageDetailsSD1.mmReceivedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1#mmReceivedTime
 * RelatedCustodianMessageDetailsSD1.mmReceivedTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1#mmInboundISOMessageType
 * RelatedCustodianMessageDetailsSD1.mmInboundISOMessageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1#mmInboundISOMessageReceiverBIC
 * RelatedCustodianMessageDetailsSD1.mmInboundISOMessageReceiverBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1#mmReceivedRelatedReference
 * RelatedCustodianMessageDetailsSD1.mmReceivedRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1#mmReceivedSenderMessageReference
 * RelatedCustodianMessageDetailsSD1.mmReceivedSenderMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1#mmInboundISOMessageSenderBIC
 * RelatedCustodianMessageDetailsSD1.mmInboundISOMessageSenderBIC}</li>
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
 * "RelatedCustodianMessageDetailsSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides selected corporate action events message details extracted from the related custodian messages received."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RelatedCustodianMessageDetailsSD1", propOrder = {"receivedEventType", "receivedMandatoryVoluntaryEventType", "receivedCorporateActionEventIdentification", "receivedDate", "receivedTime", "inboundISOMessageType",
		"inboundISOMessageReceiverBIC", "receivedRelatedReference", "receivedSenderMessageReference", "inboundISOMessageSenderBIC"})
public class RelatedCustodianMessageDetailsSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max4AlphaNumericText receivedEventType;
	/**
	 * Reference the CAEV value from the received custodian message. Applicable
	 * to custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1
	 * RelatedCustodianMessageDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvdEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference the CAEV value from the received custodian message. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceivedEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvdEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedEventType";
			definition = "Reference the CAEV value from the received custodian message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected Max4AlphaNumericText receivedMandatoryVoluntaryEventType;
	/**
	 * Reference the CAMV value from the received custodian message. Applicable
	 * to custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1
	 * RelatedCustodianMessageDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvdMndtryVlntryEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedMandatoryVoluntaryEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference the CAMV value from the received custodian message. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceivedMandatoryVoluntaryEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvdMndtryVlntryEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedMandatoryVoluntaryEventType";
			definition = "Reference the CAMV value from the received custodian message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected RestrictedFINXMax16Text receivedCorporateActionEventIdentification;
	/**
	 * Reference the CORP value from the received custodian message. Applicable
	 * to custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1
	 * RelatedCustodianMessageDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvdCorpActnEvtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedCorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference the CORP value from the received custodian message. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceivedCorporateActionEventIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvdCorpActnEvtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedCorporateActionEventIdentification";
			definition = "Reference the CORP value from the received custodian message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected ISODate receivedDate;
	/**
	 * Rate that the ISO message was received from the custodian. Applicable to
	 * custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1
	 * RelatedCustodianMessageDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate that the  ISO message was received from the custodian. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceivedDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedDate";
			definition = "Rate that the  ISO message was received from the custodian. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISOTime receivedTime;
	/**
	 * Time of day that the ISO message was received from the custodian.
	 * Applicable to custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1
	 * RelatedCustodianMessageDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvdTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time of day that the ISO message was received from the custodian. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceivedTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvdTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedTime";
			definition = "Time of day that the ISO message was received from the custodian. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};
	protected Exact3NumericText inboundISOMessageType;
	/**
	 * Reference of the ISO15022 MT message type received from the custodian
	 * message. Applicable to custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1
	 * RelatedCustodianMessageDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InbndISOMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InboundISOMessageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the ISO15022 MT message type received from the custodian message. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInboundISOMessageType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "InbndISOMT";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InboundISOMessageType";
			definition = "Reference of the ISO15022 MT message type received from the custodian message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected AnyBICIdentifier inboundISOMessageReceiverBIC;
	/**
	 * BIC Code of the recipient of the custodian record on a received message.
	 * Applicable to custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1
	 * RelatedCustodianMessageDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InbndISOMsgRcvrBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InboundISOMessageReceiverBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BIC Code of the recipient of the custodian record on a received message. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInboundISOMessageReceiverBIC = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "InbndISOMsgRcvrBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InboundISOMessageReceiverBIC";
			definition = "BIC Code of the recipient of the custodian record on a received message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	protected RestrictedFINXMax16Text receivedRelatedReference;
	/**
	 * Sender related reference from the received custodian message. Applicable
	 * to custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1
	 * RelatedCustodianMessageDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvdRltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedRelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sender related reference from the received custodian message. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceivedRelatedReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvdRltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedRelatedReference";
			definition = "Sender related reference from the received custodian message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text receivedSenderMessageReference;
	/**
	 * Sender SEME from received custodian message. Applicable to custodian
	 * service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1
	 * RelatedCustodianMessageDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvdSndrMsgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedSenderMessageReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sender SEME from received custodian message. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceivedSenderMessageReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvdSndrMsgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedSenderMessageReference";
			definition = "Sender SEME from received custodian message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected AnyBICIdentifier inboundISOMessageSenderBIC;
	/**
	 * BIC Code of the sender of the custodian record on a received message.
	 * Applicable to custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1
	 * RelatedCustodianMessageDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InbndISOMsgSndrBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InboundISOMessageSenderBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BIC Code of the sender of the custodian record on a received message. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInboundISOMessageSenderBIC = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "InbndISOMsgSndrBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InboundISOMessageSenderBIC";
			definition = "BIC Code of the sender of the custodian record on a received message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RelatedCustodianMessageDetailsSD1.mmReceivedEventType, RelatedCustodianMessageDetailsSD1.mmReceivedMandatoryVoluntaryEventType,
						RelatedCustodianMessageDetailsSD1.mmReceivedCorporateActionEventIdentification, RelatedCustodianMessageDetailsSD1.mmReceivedDate, RelatedCustodianMessageDetailsSD1.mmReceivedTime,
						RelatedCustodianMessageDetailsSD1.mmInboundISOMessageType, RelatedCustodianMessageDetailsSD1.mmInboundISOMessageReceiverBIC, RelatedCustodianMessageDetailsSD1.mmReceivedRelatedReference,
						RelatedCustodianMessageDetailsSD1.mmReceivedSenderMessageReference, RelatedCustodianMessageDetailsSD1.mmInboundISOMessageSenderBIC);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RelatedCustodianMessageDetailsSD1";
				definition = "Provides selected corporate action events message details extracted from the related custodian messages received.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RcvdEvtTp", required = true)
	public Max4AlphaNumericText getReceivedEventType() {
		return receivedEventType;
	}

	public void setReceivedEventType(Max4AlphaNumericText receivedEventType) {
		this.receivedEventType = receivedEventType;
	}

	@XmlElement(name = "RcvdMndtryVlntryEvtTp", required = true)
	public Max4AlphaNumericText getReceivedMandatoryVoluntaryEventType() {
		return receivedMandatoryVoluntaryEventType;
	}

	public void setReceivedMandatoryVoluntaryEventType(Max4AlphaNumericText receivedMandatoryVoluntaryEventType) {
		this.receivedMandatoryVoluntaryEventType = receivedMandatoryVoluntaryEventType;
	}

	@XmlElement(name = "RcvdCorpActnEvtId", required = true)
	public RestrictedFINXMax16Text getReceivedCorporateActionEventIdentification() {
		return receivedCorporateActionEventIdentification;
	}

	public void setReceivedCorporateActionEventIdentification(RestrictedFINXMax16Text receivedCorporateActionEventIdentification) {
		this.receivedCorporateActionEventIdentification = receivedCorporateActionEventIdentification;
	}

	@XmlElement(name = "RcvdDt", required = true)
	public ISODate getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(ISODate receivedDate) {
		this.receivedDate = receivedDate;
	}

	@XmlElement(name = "RcvdTm")
	public ISOTime getReceivedTime() {
		return receivedTime;
	}

	public void setReceivedTime(ISOTime receivedTime) {
		this.receivedTime = receivedTime;
	}

	@XmlElement(name = "InbndISOMT", required = true)
	public Exact3NumericText getInboundISOMessageType() {
		return inboundISOMessageType;
	}

	public void setInboundISOMessageType(Exact3NumericText inboundISOMessageType) {
		this.inboundISOMessageType = inboundISOMessageType;
	}

	@XmlElement(name = "InbndISOMsgRcvrBIC", required = true)
	public AnyBICIdentifier getInboundISOMessageReceiverBIC() {
		return inboundISOMessageReceiverBIC;
	}

	public void setInboundISOMessageReceiverBIC(AnyBICIdentifier inboundISOMessageReceiverBIC) {
		this.inboundISOMessageReceiverBIC = inboundISOMessageReceiverBIC;
	}

	@XmlElement(name = "RcvdRltdRef", required = true)
	public RestrictedFINXMax16Text getReceivedRelatedReference() {
		return receivedRelatedReference;
	}

	public void setReceivedRelatedReference(RestrictedFINXMax16Text receivedRelatedReference) {
		this.receivedRelatedReference = receivedRelatedReference;
	}

	@XmlElement(name = "RcvdSndrMsgRef", required = true)
	public RestrictedFINXMax16Text getReceivedSenderMessageReference() {
		return receivedSenderMessageReference;
	}

	public void setReceivedSenderMessageReference(RestrictedFINXMax16Text receivedSenderMessageReference) {
		this.receivedSenderMessageReference = receivedSenderMessageReference;
	}

	@XmlElement(name = "InbndISOMsgSndrBIC", required = true)
	public AnyBICIdentifier getInboundISOMessageSenderBIC() {
		return inboundISOMessageSenderBIC;
	}

	public void setInboundISOMessageSenderBIC(AnyBICIdentifier inboundISOMessageSenderBIC) {
		this.inboundISOMessageSenderBIC = inboundISOMessageSenderBIC;
	}
}