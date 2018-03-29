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
import com.tools20022.repository.codeset.ATMMediaType1Code;
import com.tools20022.repository.codeset.ATMMediaType2Code;
import com.tools20022.repository.codeset.CardDataReading4Code;
import com.tools20022.repository.codeset.CardholderVerificationCapability3Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.PointOfInteraction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DisplayCapabilities5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Capabilities of the ATM terminal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7#mmCardReadData
 * PointOfInteractionCapabilities7.mmCardReadData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7#mmCardWriteData
 * PointOfInteractionCapabilities7.mmCardWriteData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7#mmAuthentication
 * PointOfInteractionCapabilities7.mmAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7#mmPINLengthCapabilities
 * PointOfInteractionCapabilities7.mmPINLengthCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7#mmApprovalCodeLength
 * PointOfInteractionCapabilities7.mmApprovalCodeLength}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7#mmMaxScriptLength
 * PointOfInteractionCapabilities7.mmMaxScriptLength}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7#mmCardCaptureCapable
 * PointOfInteractionCapabilities7.mmCardCaptureCapable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7#mmWithdrawalMedia
 * PointOfInteractionCapabilities7.mmWithdrawalMedia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7#mmDepositedMedia
 * PointOfInteractionCapabilities7.mmDepositedMedia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7#mmMessageCapabilities
 * PointOfInteractionCapabilities7.mmMessageCapabilities}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PointOfInteraction
 * PointOfInteraction}</li>
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
 * "PointOfInteractionCapabilities7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Capabilities of the ATM terminal."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PointOfInteractionCapabilities7", propOrder = {"cardReadData", "cardWriteData", "authentication", "pINLengthCapabilities", "approvalCodeLength", "maxScriptLength", "cardCaptureCapable", "withdrawalMedia", "depositedMedia",
		"messageCapabilities"})
public class PointOfInteractionCapabilities7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CardRdData")
	protected List<CardDataReading4Code> cardReadData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading4Code
	 * CardDataReading4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardReadingCapabilities
	 * PointOfInteraction.mmCardReadingCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7
	 * PointOfInteractionCapabilities7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardRdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardReadData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card reading capabilities of the ATM performing the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionCapabilities7, List<CardDataReading4Code>> mmCardReadData = new MMMessageAttribute<PointOfInteractionCapabilities7, List<CardDataReading4Code>>() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmCardReadingCapabilities;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmObject();
			isDerived = false;
			xmlTag = "CardRdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardReadData";
			definition = "Card reading capabilities of the ATM performing the transaction.";
			minOccurs = 0;
			simpleType_lazy = () -> CardDataReading4Code.mmObject();
		}

		@Override
		public List<CardDataReading4Code> getValue(PointOfInteractionCapabilities7 obj) {
			return obj.getCardReadData();
		}

		@Override
		public void setValue(PointOfInteractionCapabilities7 obj, List<CardDataReading4Code> value) {
			obj.setCardReadData(value);
		}
	};
	@XmlElement(name = "CardWrtData")
	protected List<CardDataReading4Code> cardWriteData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading4Code
	 * CardDataReading4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardReadingCapabilities
	 * PointOfInteraction.mmCardReadingCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7
	 * PointOfInteractionCapabilities7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardWrtData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardWriteData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card writing capabilities of the terminal performing the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionCapabilities7, List<CardDataReading4Code>> mmCardWriteData = new MMMessageAttribute<PointOfInteractionCapabilities7, List<CardDataReading4Code>>() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmCardReadingCapabilities;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmObject();
			isDerived = false;
			xmlTag = "CardWrtData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardWriteData";
			definition = "Card writing capabilities of the terminal performing the transaction.";
			minOccurs = 0;
			simpleType_lazy = () -> CardDataReading4Code.mmObject();
		}

		@Override
		public List<CardDataReading4Code> getValue(PointOfInteractionCapabilities7 obj) {
			return obj.getCardWriteData();
		}

		@Override
		public void setValue(PointOfInteractionCapabilities7 obj, List<CardDataReading4Code> value) {
			obj.setCardWriteData(value);
		}
	};
	@XmlElement(name = "Authntcn")
	protected List<CardholderVerificationCapability3Code> authentication;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability3Code
	 * CardholderVerificationCapability3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardholderVerificationCapabilities
	 * PointOfInteraction.mmCardholderVerificationCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7
	 * PointOfInteractionCapabilities7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Authntcn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer and card authentication capabilities available at the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionCapabilities7, List<CardholderVerificationCapability3Code>> mmAuthentication = new MMMessageAttribute<PointOfInteractionCapabilities7, List<CardholderVerificationCapability3Code>>() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmCardholderVerificationCapabilities;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmObject();
			isDerived = false;
			xmlTag = "Authntcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authentication";
			definition = "Customer and card authentication capabilities available at the ATM.";
			minOccurs = 0;
			simpleType_lazy = () -> CardholderVerificationCapability3Code.mmObject();
		}

		@Override
		public List<CardholderVerificationCapability3Code> getValue(PointOfInteractionCapabilities7 obj) {
			return obj.getAuthentication();
		}

		@Override
		public void setValue(PointOfInteractionCapabilities7 obj, List<CardholderVerificationCapability3Code> value) {
			obj.setAuthentication(value);
		}
	};
	@XmlElement(name = "PINLngthCpblties")
	protected Number pINLengthCapabilities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7
	 * PointOfInteractionCapabilities7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PINLngthCpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINLengthCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of digits the ATM is able to accept when the cardholder enters its PIN."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionCapabilities7, Optional<Number>> mmPINLengthCapabilities = new MMMessageAttribute<PointOfInteractionCapabilities7, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmObject();
			isDerived = false;
			xmlTag = "PINLngthCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINLengthCapabilities";
			definition = "Maximum number of digits the ATM is able to accept when the cardholder enters its PIN.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(PointOfInteractionCapabilities7 obj) {
			return obj.getPINLengthCapabilities();
		}

		@Override
		public void setValue(PointOfInteractionCapabilities7 obj, Optional<Number> value) {
			obj.setPINLengthCapabilities(value.orElse(null));
		}
	};
	@XmlElement(name = "ApprvlCdLngth")
	protected Number approvalCodeLength;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7
	 * PointOfInteractionCapabilities7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApprvlCdLngth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovalCodeLength"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of characters of the approval code the ATM is able to manage."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionCapabilities7, Optional<Number>> mmApprovalCodeLength = new MMMessageAttribute<PointOfInteractionCapabilities7, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmObject();
			isDerived = false;
			xmlTag = "ApprvlCdLngth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovalCodeLength";
			definition = "Maximum number of characters of the approval code the ATM is able to manage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(PointOfInteractionCapabilities7 obj) {
			return obj.getApprovalCodeLength();
		}

		@Override
		public void setValue(PointOfInteractionCapabilities7 obj, Optional<Number> value) {
			obj.setApprovalCodeLength(value.orElse(null));
		}
	};
	@XmlElement(name = "MxScrptLngth")
	protected Number maxScriptLength;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7
	 * PointOfInteractionCapabilities7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MxScrptLngth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaxScriptLength"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum data length in bytes that a card issuer can return to the ICC at the terminal."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionCapabilities7, Optional<Number>> mmMaxScriptLength = new MMMessageAttribute<PointOfInteractionCapabilities7, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmObject();
			isDerived = false;
			xmlTag = "MxScrptLngth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaxScriptLength";
			definition = "Maximum data length in bytes that a card issuer can return to the ICC at the terminal.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(PointOfInteractionCapabilities7 obj) {
			return obj.getMaxScriptLength();
		}

		@Override
		public void setValue(PointOfInteractionCapabilities7 obj, Optional<Number> value) {
			obj.setMaxScriptLength(value.orElse(null));
		}
	};
	@XmlElement(name = "CardCaptrCpbl")
	protected TrueFalseIndicator cardCaptureCapable;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7
	 * PointOfInteractionCapabilities7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardCaptrCpbl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCaptureCapable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "True if the ATM is able to capture card."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionCapabilities7, Optional<TrueFalseIndicator>> mmCardCaptureCapable = new MMMessageAttribute<PointOfInteractionCapabilities7, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmObject();
			isDerived = false;
			xmlTag = "CardCaptrCpbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCaptureCapable";
			definition = "True if the ATM is able to capture card.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PointOfInteractionCapabilities7 obj) {
			return obj.getCardCaptureCapable();
		}

		@Override
		public void setValue(PointOfInteractionCapabilities7 obj, Optional<TrueFalseIndicator> value) {
			obj.setCardCaptureCapable(value.orElse(null));
		}
	};
	@XmlElement(name = "WdrwlMdia")
	protected List<ATMMediaType1Code> withdrawalMedia;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7
	 * PointOfInteractionCapabilities7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WdrwlMdia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalMedia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of media the ATM is able to dispense."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionCapabilities7, List<ATMMediaType1Code>> mmWithdrawalMedia = new MMMessageAttribute<PointOfInteractionCapabilities7, List<ATMMediaType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmObject();
			isDerived = false;
			xmlTag = "WdrwlMdia";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalMedia";
			definition = "Type of media the ATM is able to dispense.";
			minOccurs = 0;
			simpleType_lazy = () -> ATMMediaType1Code.mmObject();
		}

		@Override
		public List<ATMMediaType1Code> getValue(PointOfInteractionCapabilities7 obj) {
			return obj.getWithdrawalMedia();
		}

		@Override
		public void setValue(PointOfInteractionCapabilities7 obj, List<ATMMediaType1Code> value) {
			obj.setWithdrawalMedia(value);
		}
	};
	@XmlElement(name = "DpstdMdia")
	protected List<ATMMediaType2Code> depositedMedia;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code
	 * ATMMediaType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7
	 * PointOfInteractionCapabilities7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstdMdia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositedMedia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of media the customer is able to deposit in the ATM."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionCapabilities7, List<ATMMediaType2Code>> mmDepositedMedia = new MMMessageAttribute<PointOfInteractionCapabilities7, List<ATMMediaType2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmObject();
			isDerived = false;
			xmlTag = "DpstdMdia";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositedMedia";
			definition = "Type of media the customer is able to deposit in the ATM.";
			minOccurs = 0;
			simpleType_lazy = () -> ATMMediaType2Code.mmObject();
		}

		@Override
		public List<ATMMediaType2Code> getValue(PointOfInteractionCapabilities7 obj) {
			return obj.getDepositedMedia();
		}

		@Override
		public void setValue(PointOfInteractionCapabilities7 obj, List<ATMMediaType2Code> value) {
			obj.setDepositedMedia(value);
		}
	};
	@XmlElement(name = "MsgCpblties")
	protected List<DisplayCapabilities5> messageCapabilities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DisplayCapabilities5
	 * DisplayCapabilities5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities7
	 * PointOfInteractionCapabilities7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgCpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capabilities of the terminal to display or print message to the cardholder and the merchant."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PointOfInteractionCapabilities7, List<DisplayCapabilities5>> mmMessageCapabilities = new MMMessageAssociationEnd<PointOfInteractionCapabilities7, List<DisplayCapabilities5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmObject();
			isDerived = false;
			xmlTag = "MsgCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageCapabilities";
			definition = "Capabilities of the terminal to display or print message to the cardholder and the merchant.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DisplayCapabilities5.mmObject();
		}

		@Override
		public List<DisplayCapabilities5> getValue(PointOfInteractionCapabilities7 obj) {
			return obj.getMessageCapabilities();
		}

		@Override
		public void setValue(PointOfInteractionCapabilities7 obj, List<DisplayCapabilities5> value) {
			obj.setMessageCapabilities(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmCardReadData, com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmCardWriteData,
						com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmAuthentication, com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmPINLengthCapabilities,
						com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmApprovalCodeLength, com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmMaxScriptLength,
						com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmCardCaptureCapable, com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmWithdrawalMedia,
						com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmDepositedMedia, com.tools20022.repository.msg.PointOfInteractionCapabilities7.mmMessageCapabilities);
				trace_lazy = () -> PointOfInteraction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionCapabilities7";
				definition = "Capabilities of the ATM terminal.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<CardDataReading4Code> getCardReadData() {
		return cardReadData == null ? cardReadData = new ArrayList<>() : cardReadData;
	}

	public PointOfInteractionCapabilities7 setCardReadData(List<CardDataReading4Code> cardReadData) {
		this.cardReadData = Objects.requireNonNull(cardReadData);
		return this;
	}

	public List<CardDataReading4Code> getCardWriteData() {
		return cardWriteData == null ? cardWriteData = new ArrayList<>() : cardWriteData;
	}

	public PointOfInteractionCapabilities7 setCardWriteData(List<CardDataReading4Code> cardWriteData) {
		this.cardWriteData = Objects.requireNonNull(cardWriteData);
		return this;
	}

	public List<CardholderVerificationCapability3Code> getAuthentication() {
		return authentication == null ? authentication = new ArrayList<>() : authentication;
	}

	public PointOfInteractionCapabilities7 setAuthentication(List<CardholderVerificationCapability3Code> authentication) {
		this.authentication = Objects.requireNonNull(authentication);
		return this;
	}

	public Optional<Number> getPINLengthCapabilities() {
		return pINLengthCapabilities == null ? Optional.empty() : Optional.of(pINLengthCapabilities);
	}

	public PointOfInteractionCapabilities7 setPINLengthCapabilities(Number pINLengthCapabilities) {
		this.pINLengthCapabilities = pINLengthCapabilities;
		return this;
	}

	public Optional<Number> getApprovalCodeLength() {
		return approvalCodeLength == null ? Optional.empty() : Optional.of(approvalCodeLength);
	}

	public PointOfInteractionCapabilities7 setApprovalCodeLength(Number approvalCodeLength) {
		this.approvalCodeLength = approvalCodeLength;
		return this;
	}

	public Optional<Number> getMaxScriptLength() {
		return maxScriptLength == null ? Optional.empty() : Optional.of(maxScriptLength);
	}

	public PointOfInteractionCapabilities7 setMaxScriptLength(Number maxScriptLength) {
		this.maxScriptLength = maxScriptLength;
		return this;
	}

	public Optional<TrueFalseIndicator> getCardCaptureCapable() {
		return cardCaptureCapable == null ? Optional.empty() : Optional.of(cardCaptureCapable);
	}

	public PointOfInteractionCapabilities7 setCardCaptureCapable(TrueFalseIndicator cardCaptureCapable) {
		this.cardCaptureCapable = cardCaptureCapable;
		return this;
	}

	public List<ATMMediaType1Code> getWithdrawalMedia() {
		return withdrawalMedia == null ? withdrawalMedia = new ArrayList<>() : withdrawalMedia;
	}

	public PointOfInteractionCapabilities7 setWithdrawalMedia(List<ATMMediaType1Code> withdrawalMedia) {
		this.withdrawalMedia = Objects.requireNonNull(withdrawalMedia);
		return this;
	}

	public List<ATMMediaType2Code> getDepositedMedia() {
		return depositedMedia == null ? depositedMedia = new ArrayList<>() : depositedMedia;
	}

	public PointOfInteractionCapabilities7 setDepositedMedia(List<ATMMediaType2Code> depositedMedia) {
		this.depositedMedia = Objects.requireNonNull(depositedMedia);
		return this;
	}

	public List<DisplayCapabilities5> getMessageCapabilities() {
		return messageCapabilities == null ? messageCapabilities = new ArrayList<>() : messageCapabilities;
	}

	public PointOfInteractionCapabilities7 setMessageCapabilities(List<DisplayCapabilities5> messageCapabilities) {
		this.messageCapabilities = Objects.requireNonNull(messageCapabilities);
		return this;
	}
}