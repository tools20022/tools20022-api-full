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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.*;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RelatedCustodianMessageDetailsSD1", propOrder = {"receivedEventType", "receivedMandatoryVoluntaryEventType", "receivedCorporateActionEventIdentification", "receivedDate", "receivedTime", "inboundISOMessageType",
		"inboundISOMessageReceiverBIC", "receivedRelatedReference", "receivedSenderMessageReference", "inboundISOMessageSenderBIC"})
public class RelatedCustodianMessageDetailsSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RcvdEvtTp", required = true)
	protected Max4AlphaNumericText receivedEventType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Received CAEV Value</li>
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
	public static final MMMessageAttribute<RelatedCustodianMessageDetailsSD1, Max4AlphaNumericText> mmReceivedEventType = new MMMessageAttribute<RelatedCustodianMessageDetailsSD1, Max4AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvdEvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Received CAEV Value"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedEventType";
			definition = "Reference the CAEV value from the received custodian message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(RelatedCustodianMessageDetailsSD1 obj) {
			return obj.getReceivedEventType();
		}

		@Override
		public void setValue(RelatedCustodianMessageDetailsSD1 obj, Max4AlphaNumericText value) {
			obj.setReceivedEventType(value);
		}
	};
	@XmlElement(name = "RcvdMndtryVlntryEvtTp", required = true)
	protected Max4AlphaNumericText receivedMandatoryVoluntaryEventType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Received CAMV Value</li>
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
	public static final MMMessageAttribute<RelatedCustodianMessageDetailsSD1, Max4AlphaNumericText> mmReceivedMandatoryVoluntaryEventType = new MMMessageAttribute<RelatedCustodianMessageDetailsSD1, Max4AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvdMndtryVlntryEvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Received CAMV Value"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedMandatoryVoluntaryEventType";
			definition = "Reference the CAMV value from the received custodian message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(RelatedCustodianMessageDetailsSD1 obj) {
			return obj.getReceivedMandatoryVoluntaryEventType();
		}

		@Override
		public void setValue(RelatedCustodianMessageDetailsSD1 obj, Max4AlphaNumericText value) {
			obj.setReceivedMandatoryVoluntaryEventType(value);
		}
	};
	@XmlElement(name = "RcvdCorpActnEvtId", required = true)
	protected RestrictedFINXMax16Text receivedCorporateActionEventIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Received Corp Number</li>
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
	public static final MMMessageAttribute<RelatedCustodianMessageDetailsSD1, RestrictedFINXMax16Text> mmReceivedCorporateActionEventIdentification = new MMMessageAttribute<RelatedCustodianMessageDetailsSD1, RestrictedFINXMax16Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvdCorpActnEvtId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Received Corp Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedCorporateActionEventIdentification";
			definition = "Reference the CORP value from the received custodian message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public RestrictedFINXMax16Text getValue(RelatedCustodianMessageDetailsSD1 obj) {
			return obj.getReceivedCorporateActionEventIdentification();
		}

		@Override
		public void setValue(RelatedCustodianMessageDetailsSD1 obj, RestrictedFINXMax16Text value) {
			obj.setReceivedCorporateActionEventIdentification(value);
		}
	};
	@XmlElement(name = "RcvdDt", required = true)
	protected ISODate receivedDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Received Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate that the ISO message was received from the custodian. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RelatedCustodianMessageDetailsSD1, ISODate> mmReceivedDate = new MMMessageAttribute<RelatedCustodianMessageDetailsSD1, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Received Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedDate";
			definition = "Rate that the ISO message was received from the custodian. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(RelatedCustodianMessageDetailsSD1 obj) {
			return obj.getReceivedDate();
		}

		@Override
		public void setValue(RelatedCustodianMessageDetailsSD1 obj, ISODate value) {
			obj.setReceivedDate(value);
		}
	};
	@XmlElement(name = "RcvdTm")
	protected ISOTime receivedTime;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Received Time</li>
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
	public static final MMMessageAttribute<RelatedCustodianMessageDetailsSD1, Optional<ISOTime>> mmReceivedTime = new MMMessageAttribute<RelatedCustodianMessageDetailsSD1, Optional<ISOTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvdTm";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Received Time"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedTime";
			definition = "Time of day that the ISO message was received from the custodian. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOTime.mmObject();
		}

		@Override
		public Optional<ISOTime> getValue(RelatedCustodianMessageDetailsSD1 obj) {
			return obj.getReceivedTime();
		}

		@Override
		public void setValue(RelatedCustodianMessageDetailsSD1 obj, Optional<ISOTime> value) {
			obj.setReceivedTime(value.orElse(null));
		}
	};
	@XmlElement(name = "InbndISOMT", required = true)
	protected Exact3NumericText inboundISOMessageType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Inbound ISO Message Type</li>
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
	public static final MMMessageAttribute<RelatedCustodianMessageDetailsSD1, Exact3NumericText> mmInboundISOMessageType = new MMMessageAttribute<RelatedCustodianMessageDetailsSD1, Exact3NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "InbndISOMT";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Inbound ISO Message Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InboundISOMessageType";
			definition = "Reference of the ISO15022 MT message type received from the custodian message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Exact3NumericText getValue(RelatedCustodianMessageDetailsSD1 obj) {
			return obj.getInboundISOMessageType();
		}

		@Override
		public void setValue(RelatedCustodianMessageDetailsSD1 obj, Exact3NumericText value) {
			obj.setInboundISOMessageType(value);
		}
	};
	@XmlElement(name = "InbndISOMsgRcvrBIC", required = true)
	protected AnyBICIdentifier inboundISOMessageReceiverBIC;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Inbound ISO Message Receiver BIC</li>
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
	public static final MMMessageAttribute<RelatedCustodianMessageDetailsSD1, AnyBICIdentifier> mmInboundISOMessageReceiverBIC = new MMMessageAttribute<RelatedCustodianMessageDetailsSD1, AnyBICIdentifier>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "InbndISOMsgRcvrBIC";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Inbound ISO Message Receiver BIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InboundISOMessageReceiverBIC";
			definition = "BIC Code of the recipient of the custodian record on a received message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public AnyBICIdentifier getValue(RelatedCustodianMessageDetailsSD1 obj) {
			return obj.getInboundISOMessageReceiverBIC();
		}

		@Override
		public void setValue(RelatedCustodianMessageDetailsSD1 obj, AnyBICIdentifier value) {
			obj.setInboundISOMessageReceiverBIC(value);
		}
	};
	@XmlElement(name = "RcvdRltdRef", required = true)
	protected RestrictedFINXMax16Text receivedRelatedReference;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Received Related Reference</li>
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
	public static final MMMessageAttribute<RelatedCustodianMessageDetailsSD1, RestrictedFINXMax16Text> mmReceivedRelatedReference = new MMMessageAttribute<RelatedCustodianMessageDetailsSD1, RestrictedFINXMax16Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvdRltdRef";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Received Related Reference"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedRelatedReference";
			definition = "Sender related reference from the received custodian message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public RestrictedFINXMax16Text getValue(RelatedCustodianMessageDetailsSD1 obj) {
			return obj.getReceivedRelatedReference();
		}

		@Override
		public void setValue(RelatedCustodianMessageDetailsSD1 obj, RestrictedFINXMax16Text value) {
			obj.setReceivedRelatedReference(value);
		}
	};
	@XmlElement(name = "RcvdSndrMsgRef", required = true)
	protected RestrictedFINXMax16Text receivedSenderMessageReference;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Received SEME</li>
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
	public static final MMMessageAttribute<RelatedCustodianMessageDetailsSD1, RestrictedFINXMax16Text> mmReceivedSenderMessageReference = new MMMessageAttribute<RelatedCustodianMessageDetailsSD1, RestrictedFINXMax16Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvdSndrMsgRef";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Received SEME"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedSenderMessageReference";
			definition = "Sender SEME from received custodian message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public RestrictedFINXMax16Text getValue(RelatedCustodianMessageDetailsSD1 obj) {
			return obj.getReceivedSenderMessageReference();
		}

		@Override
		public void setValue(RelatedCustodianMessageDetailsSD1 obj, RestrictedFINXMax16Text value) {
			obj.setReceivedSenderMessageReference(value);
		}
	};
	@XmlElement(name = "InbndISOMsgSndrBIC", required = true)
	protected AnyBICIdentifier inboundISOMessageSenderBIC;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Inbound ISO Message Sender BIC</li>
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
	public static final MMMessageAttribute<RelatedCustodianMessageDetailsSD1, AnyBICIdentifier> mmInboundISOMessageSenderBIC = new MMMessageAttribute<RelatedCustodianMessageDetailsSD1, AnyBICIdentifier>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "InbndISOMsgSndrBIC";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Inbound ISO Message Sender BIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InboundISOMessageSenderBIC";
			definition = "BIC Code of the sender of the custodian record on a received message. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public AnyBICIdentifier getValue(RelatedCustodianMessageDetailsSD1 obj) {
			return obj.getInboundISOMessageSenderBIC();
		}

		@Override
		public void setValue(RelatedCustodianMessageDetailsSD1 obj, AnyBICIdentifier value) {
			obj.setInboundISOMessageSenderBIC(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmReceivedEventType,
						com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmReceivedMandatoryVoluntaryEventType, com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmReceivedCorporateActionEventIdentification,
						com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmReceivedDate, com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmReceivedTime,
						com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmInboundISOMessageType, com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmInboundISOMessageReceiverBIC,
						com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmReceivedRelatedReference, com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmReceivedSenderMessageReference,
						com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmInboundISOMessageSenderBIC);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RelatedCustodianMessageDetailsSD1";
				definition = "Provides selected corporate action events message details extracted from the related custodian messages received.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max4AlphaNumericText getReceivedEventType() {
		return receivedEventType;
	}

	public RelatedCustodianMessageDetailsSD1 setReceivedEventType(Max4AlphaNumericText receivedEventType) {
		this.receivedEventType = Objects.requireNonNull(receivedEventType);
		return this;
	}

	public Max4AlphaNumericText getReceivedMandatoryVoluntaryEventType() {
		return receivedMandatoryVoluntaryEventType;
	}

	public RelatedCustodianMessageDetailsSD1 setReceivedMandatoryVoluntaryEventType(Max4AlphaNumericText receivedMandatoryVoluntaryEventType) {
		this.receivedMandatoryVoluntaryEventType = Objects.requireNonNull(receivedMandatoryVoluntaryEventType);
		return this;
	}

	public RestrictedFINXMax16Text getReceivedCorporateActionEventIdentification() {
		return receivedCorporateActionEventIdentification;
	}

	public RelatedCustodianMessageDetailsSD1 setReceivedCorporateActionEventIdentification(RestrictedFINXMax16Text receivedCorporateActionEventIdentification) {
		this.receivedCorporateActionEventIdentification = Objects.requireNonNull(receivedCorporateActionEventIdentification);
		return this;
	}

	public ISODate getReceivedDate() {
		return receivedDate;
	}

	public RelatedCustodianMessageDetailsSD1 setReceivedDate(ISODate receivedDate) {
		this.receivedDate = Objects.requireNonNull(receivedDate);
		return this;
	}

	public Optional<ISOTime> getReceivedTime() {
		return receivedTime == null ? Optional.empty() : Optional.of(receivedTime);
	}

	public RelatedCustodianMessageDetailsSD1 setReceivedTime(ISOTime receivedTime) {
		this.receivedTime = receivedTime;
		return this;
	}

	public Exact3NumericText getInboundISOMessageType() {
		return inboundISOMessageType;
	}

	public RelatedCustodianMessageDetailsSD1 setInboundISOMessageType(Exact3NumericText inboundISOMessageType) {
		this.inboundISOMessageType = Objects.requireNonNull(inboundISOMessageType);
		return this;
	}

	public AnyBICIdentifier getInboundISOMessageReceiverBIC() {
		return inboundISOMessageReceiverBIC;
	}

	public RelatedCustodianMessageDetailsSD1 setInboundISOMessageReceiverBIC(AnyBICIdentifier inboundISOMessageReceiverBIC) {
		this.inboundISOMessageReceiverBIC = Objects.requireNonNull(inboundISOMessageReceiverBIC);
		return this;
	}

	public RestrictedFINXMax16Text getReceivedRelatedReference() {
		return receivedRelatedReference;
	}

	public RelatedCustodianMessageDetailsSD1 setReceivedRelatedReference(RestrictedFINXMax16Text receivedRelatedReference) {
		this.receivedRelatedReference = Objects.requireNonNull(receivedRelatedReference);
		return this;
	}

	public RestrictedFINXMax16Text getReceivedSenderMessageReference() {
		return receivedSenderMessageReference;
	}

	public RelatedCustodianMessageDetailsSD1 setReceivedSenderMessageReference(RestrictedFINXMax16Text receivedSenderMessageReference) {
		this.receivedSenderMessageReference = Objects.requireNonNull(receivedSenderMessageReference);
		return this;
	}

	public AnyBICIdentifier getInboundISOMessageSenderBIC() {
		return inboundISOMessageSenderBIC;
	}

	public RelatedCustodianMessageDetailsSD1 setInboundISOMessageSenderBIC(AnyBICIdentifier inboundISOMessageSenderBIC) {
		this.inboundISOMessageSenderBIC = Objects.requireNonNull(inboundISOMessageSenderBIC);
		return this;
	}
}