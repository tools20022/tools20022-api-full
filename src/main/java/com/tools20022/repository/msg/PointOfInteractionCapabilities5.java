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
import com.tools20022.repository.codeset.CardDataReading4Code;
import com.tools20022.repository.codeset.CardholderVerificationCapability3Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.PointOfInteraction;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5#mmCardReadData
 * PointOfInteractionCapabilities5.mmCardReadData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5#mmCardWriteData
 * PointOfInteractionCapabilities5.mmCardWriteData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5#mmAuthentication
 * PointOfInteractionCapabilities5.mmAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5#mmPINLengthCapabilities
 * PointOfInteractionCapabilities5.mmPINLengthCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5#mmApprovalCodeLength
 * PointOfInteractionCapabilities5.mmApprovalCodeLength}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5#mmMaxScriptLength
 * PointOfInteractionCapabilities5.mmMaxScriptLength}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5#mmCardCaptureCapable
 * PointOfInteractionCapabilities5.mmCardCaptureCapable}</li>
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
 * "PointOfInteractionCapabilities5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Capabilities of the ATM terminal."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3
 * PointOfInteractionCapabilities3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PointOfInteractionCapabilities5", propOrder = {"cardReadData", "cardWriteData", "authentication", "pINLengthCapabilities", "approvalCodeLength", "maxScriptLength", "cardCaptureCapable"})
public class PointOfInteractionCapabilities5 {

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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5
	 * PointOfInteractionCapabilities5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmCardReadingCapabilities
	 * PointOfInteractionCapabilities3.mmCardReadingCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardReadData = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmCardReadingCapabilities;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities5.mmObject();
			isDerived = false;
			xmlTag = "CardRdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardReadData";
			definition = "Card reading capabilities of the ATM performing the transaction.";
			previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmCardReadingCapabilities;
			minOccurs = 0;
			simpleType_lazy = () -> CardDataReading4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5
	 * PointOfInteractionCapabilities5}</li>
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
	public static final MMMessageAttribute mmCardWriteData = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmCardReadingCapabilities;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities5.mmObject();
			isDerived = false;
			xmlTag = "CardWrtData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardWriteData";
			definition = "Card writing capabilities of the terminal performing the transaction.";
			minOccurs = 0;
			simpleType_lazy = () -> CardDataReading4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5
	 * PointOfInteractionCapabilities5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmCardholderVerificationCapabilities
	 * PointOfInteractionCapabilities3.mmCardholderVerificationCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthentication = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmCardholderVerificationCapabilities;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities5.mmObject();
			isDerived = false;
			xmlTag = "Authntcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authentication";
			definition = "Customer and card authentication capabilities available at the ATM.";
			previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmCardholderVerificationCapabilities;
			minOccurs = 0;
			simpleType_lazy = () -> CardholderVerificationCapability3Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5
	 * PointOfInteractionCapabilities5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmPINLengthCapabilities
	 * PointOfInteractionCapabilities3.mmPINLengthCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPINLengthCapabilities = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities5.mmObject();
			isDerived = false;
			xmlTag = "PINLngthCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINLengthCapabilities";
			definition = "Maximum number of digits the ATM is able to accept when the cardholder enters its PIN.";
			previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmPINLengthCapabilities;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5
	 * PointOfInteractionCapabilities5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmApprovalCodeLength
	 * PointOfInteractionCapabilities3.mmApprovalCodeLength}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApprovalCodeLength = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities5.mmObject();
			isDerived = false;
			xmlTag = "ApprvlCdLngth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovalCodeLength";
			definition = "Maximum number of characters of the approval code the ATM is able to manage.";
			previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmApprovalCodeLength;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5
	 * PointOfInteractionCapabilities5}</li>
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
	public static final MMMessageAttribute mmMaxScriptLength = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities5.mmObject();
			isDerived = false;
			xmlTag = "MxScrptLngth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaxScriptLength";
			definition = "Maximum data length in bytes that a card issuer can return to the ICC at the terminal.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5
	 * PointOfInteractionCapabilities5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmCardCaptureCapable
	 * PointOfInteractionCapabilities3.mmCardCaptureCapable}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardCaptureCapable = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities5.mmObject();
			isDerived = false;
			xmlTag = "CardCaptrCpbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCaptureCapable";
			definition = "True if the ATM is able to capture card.";
			previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmCardCaptureCapable;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionCapabilities5.mmCardReadData, com.tools20022.repository.msg.PointOfInteractionCapabilities5.mmCardWriteData,
						com.tools20022.repository.msg.PointOfInteractionCapabilities5.mmAuthentication, com.tools20022.repository.msg.PointOfInteractionCapabilities5.mmPINLengthCapabilities,
						com.tools20022.repository.msg.PointOfInteractionCapabilities5.mmApprovalCodeLength, com.tools20022.repository.msg.PointOfInteractionCapabilities5.mmMaxScriptLength,
						com.tools20022.repository.msg.PointOfInteractionCapabilities5.mmCardCaptureCapable);
				trace_lazy = () -> PointOfInteraction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionCapabilities5";
				definition = "Capabilities of the ATM terminal.";
				previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<CardDataReading4Code> getCardReadData() {
		return cardReadData == null ? cardReadData = new ArrayList<>() : cardReadData;
	}

	public PointOfInteractionCapabilities5 setCardReadData(List<CardDataReading4Code> cardReadData) {
		this.cardReadData = Objects.requireNonNull(cardReadData);
		return this;
	}

	public List<CardDataReading4Code> getCardWriteData() {
		return cardWriteData == null ? cardWriteData = new ArrayList<>() : cardWriteData;
	}

	public PointOfInteractionCapabilities5 setCardWriteData(List<CardDataReading4Code> cardWriteData) {
		this.cardWriteData = Objects.requireNonNull(cardWriteData);
		return this;
	}

	public List<CardholderVerificationCapability3Code> getAuthentication() {
		return authentication == null ? authentication = new ArrayList<>() : authentication;
	}

	public PointOfInteractionCapabilities5 setAuthentication(List<CardholderVerificationCapability3Code> authentication) {
		this.authentication = Objects.requireNonNull(authentication);
		return this;
	}

	public Optional<Number> getPINLengthCapabilities() {
		return pINLengthCapabilities == null ? Optional.empty() : Optional.of(pINLengthCapabilities);
	}

	public PointOfInteractionCapabilities5 setPINLengthCapabilities(Number pINLengthCapabilities) {
		this.pINLengthCapabilities = pINLengthCapabilities;
		return this;
	}

	public Optional<Number> getApprovalCodeLength() {
		return approvalCodeLength == null ? Optional.empty() : Optional.of(approvalCodeLength);
	}

	public PointOfInteractionCapabilities5 setApprovalCodeLength(Number approvalCodeLength) {
		this.approvalCodeLength = approvalCodeLength;
		return this;
	}

	public Optional<Number> getMaxScriptLength() {
		return maxScriptLength == null ? Optional.empty() : Optional.of(maxScriptLength);
	}

	public PointOfInteractionCapabilities5 setMaxScriptLength(Number maxScriptLength) {
		this.maxScriptLength = maxScriptLength;
		return this;
	}

	public Optional<TrueFalseIndicator> getCardCaptureCapable() {
		return cardCaptureCapable == null ? Optional.empty() : Optional.of(cardCaptureCapable);
	}

	public PointOfInteractionCapabilities5 setCardCaptureCapable(TrueFalseIndicator cardCaptureCapable) {
		this.cardCaptureCapable = cardCaptureCapable;
		return this;
	}
}