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
import com.tools20022.repository.codeset.CardDataReading5Code;
import com.tools20022.repository.codeset.CardholderVerificationCapability4Code;
import com.tools20022.repository.codeset.OnLineCapability1Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.PointOfInteraction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Capabilities of the POI (Point Of Interaction) performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6#mmCardReadingCapabilities
 * PointOfInteractionCapabilities6.mmCardReadingCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6#mmCardholderVerificationCapabilities
 * PointOfInteractionCapabilities6.mmCardholderVerificationCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6#mmPINLengthCapabilities
 * PointOfInteractionCapabilities6.mmPINLengthCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6#mmApprovalCodeLength
 * PointOfInteractionCapabilities6.mmApprovalCodeLength}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6#mmMaxScriptLength
 * PointOfInteractionCapabilities6.mmMaxScriptLength}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6#mmCardCaptureCapable
 * PointOfInteractionCapabilities6.mmCardCaptureCapable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6#mmOnLineCapabilities
 * PointOfInteractionCapabilities6.mmOnLineCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6#mmMessageCapabilities
 * PointOfInteractionCapabilities6.mmMessageCapabilities}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PointOfInteraction
 * PointOfInteraction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PointOfInteractionCapabilities6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Capabilities of the POI (Point Of Interaction) performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3
 * PointOfInteractionCapabilities3}</li>
 * </ul>
 */
public class PointOfInteractionCapabilities6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<CardDataReading5Code> cardReadingCapabilities;
	/**
	 * Card reading capabilities of the POI (Point Of Interaction) performing
	 * the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code
	 * CardDataReading5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardReadingCapabilities
	 * PointOfInteraction.mmCardReadingCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6
	 * PointOfInteractionCapabilities6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardRdngCpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardReadingCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card reading capabilities of the POI (Point Of Interaction) performing the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmCardReadingCapabilities
	 * PointOfInteractionCapabilities3.mmCardReadingCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardReadingCapabilities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmCardReadingCapabilities;
			componentContext_lazy = () -> PointOfInteractionCapabilities6.mmObject();
			isDerived = false;
			xmlTag = "CardRdngCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardReadingCapabilities";
			definition = "Card reading capabilities of the POI (Point Of Interaction) performing the transaction.";
			previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmCardReadingCapabilities;
			minOccurs = 0;
			simpleType_lazy = () -> CardDataReading5Code.mmObject();
		}
	};
	protected List<CardholderVerificationCapability4Code> cardholderVerificationCapabilities;
	/**
	 * Cardholder verification capabilities of the POI (Point Of Interaction)
	 * performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability4Code
	 * CardholderVerificationCapability4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardholderVerificationCapabilities
	 * PointOfInteraction.mmCardholderVerificationCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6
	 * PointOfInteractionCapabilities6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrVrfctnCpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderVerificationCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cardholder verification capabilities of the POI (Point Of Interaction) performing the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmCardholderVerificationCapabilities
	 * PointOfInteractionCapabilities3.mmCardholderVerificationCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardholderVerificationCapabilities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmCardholderVerificationCapabilities;
			componentContext_lazy = () -> PointOfInteractionCapabilities6.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrVrfctnCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderVerificationCapabilities";
			definition = "Cardholder verification capabilities of the POI (Point Of Interaction) performing the transaction.";
			previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmCardholderVerificationCapabilities;
			minOccurs = 0;
			simpleType_lazy = () -> CardholderVerificationCapability4Code.mmObject();
		}
	};
	protected Number pINLengthCapabilities;
	/**
	 * Maximum number of digits the POI is able to accept when the cardholder
	 * enters its PIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6
	 * PointOfInteractionCapabilities6}</li>
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
	 * "Maximum number of digits the POI is able to accept when the cardholder enters its PIN."
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
			componentContext_lazy = () -> PointOfInteractionCapabilities6.mmObject();
			isDerived = false;
			xmlTag = "PINLngthCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINLengthCapabilities";
			definition = "Maximum number of digits the POI is able to accept when the cardholder enters its PIN.";
			previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmPINLengthCapabilities;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number approvalCodeLength;
	/**
	 * Maximum number of characters of the approval code the POI is able to
	 * manage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6
	 * PointOfInteractionCapabilities6}</li>
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
	 * "Maximum number of characters of the approval code the POI is able to manage."
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
			componentContext_lazy = () -> PointOfInteractionCapabilities6.mmObject();
			isDerived = false;
			xmlTag = "ApprvlCdLngth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovalCodeLength";
			definition = "Maximum number of characters of the approval code the POI is able to manage.";
			previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmApprovalCodeLength;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number maxScriptLength;
	/**
	 * Maximum data length in bytes that a card issuer can return to the ICC at
	 * the terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6
	 * PointOfInteractionCapabilities6}</li>
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
			componentContext_lazy = () -> PointOfInteractionCapabilities6.mmObject();
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
	protected TrueFalseIndicator cardCaptureCapable;
	/**
	 * True if the POI is able to capture card.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6
	 * PointOfInteractionCapabilities6}</li>
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
	 * definition} = "True if the POI is able to capture card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmCardCaptureCapable
	 * PointOfInteractionCapabilities3.mmCardCaptureCapable}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardCaptureCapable = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionCapabilities6.mmObject();
			isDerived = false;
			xmlTag = "CardCaptrCpbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCaptureCapable";
			definition = "True if the POI is able to capture card.";
			previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmCardCaptureCapable;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected OnLineCapability1Code onLineCapabilities;
	/**
	 * On-line and off-line capabilities of the POI (Point Of Interaction).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineCapability1Code
	 * OnLineCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmOnLineCapabilities
	 * PointOfInteraction.mmOnLineCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6
	 * PointOfInteractionCapabilities6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLineCpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "On-line and off-line capabilities of the POI (Point Of Interaction)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmOnLineCapabilities
	 * PointOfInteractionCapabilities3.mmOnLineCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOnLineCapabilities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmOnLineCapabilities;
			componentContext_lazy = () -> PointOfInteractionCapabilities6.mmObject();
			isDerived = false;
			xmlTag = "OnLineCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineCapabilities";
			definition = "On-line and off-line capabilities of the POI (Point Of Interaction).";
			previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmOnLineCapabilities;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OnLineCapability1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DisplayCapabilities4> messageCapabilities;
	/**
	 * Capabilities of the terminal to display or print message to the
	 * cardholder and the merchant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DisplayCapabilities4
	 * DisplayCapabilities4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6
	 * PointOfInteractionCapabilities6}</li>
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
	public static final MMMessageAssociationEnd mmMessageCapabilities = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PointOfInteractionCapabilities6.mmObject();
			isDerived = false;
			xmlTag = "MsgCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageCapabilities";
			definition = "Capabilities of the terminal to display or print message to the cardholder and the merchant.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PointOfInteractionCapabilities6.mmCardReadingCapabilities, PointOfInteractionCapabilities6.mmCardholderVerificationCapabilities,
						PointOfInteractionCapabilities6.mmPINLengthCapabilities, PointOfInteractionCapabilities6.mmApprovalCodeLength, PointOfInteractionCapabilities6.mmMaxScriptLength, PointOfInteractionCapabilities6.mmCardCaptureCapable,
						PointOfInteractionCapabilities6.mmOnLineCapabilities, PointOfInteractionCapabilities6.mmMessageCapabilities);
				trace_lazy = () -> PointOfInteraction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionCapabilities6";
				definition = "Capabilities of the POI (Point Of Interaction) performing the transaction.";
				previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<CardDataReading5Code> getCardReadingCapabilities() {
		return cardReadingCapabilities;
	}

	public void setCardReadingCapabilities(List<CardDataReading5Code> cardReadingCapabilities) {
		this.cardReadingCapabilities = cardReadingCapabilities;
	}

	public List<CardholderVerificationCapability4Code> getCardholderVerificationCapabilities() {
		return cardholderVerificationCapabilities;
	}

	public void setCardholderVerificationCapabilities(List<CardholderVerificationCapability4Code> cardholderVerificationCapabilities) {
		this.cardholderVerificationCapabilities = cardholderVerificationCapabilities;
	}

	public Number getPINLengthCapabilities() {
		return pINLengthCapabilities;
	}

	public void setPINLengthCapabilities(Number pINLengthCapabilities) {
		this.pINLengthCapabilities = pINLengthCapabilities;
	}

	public Number getApprovalCodeLength() {
		return approvalCodeLength;
	}

	public void setApprovalCodeLength(Number approvalCodeLength) {
		this.approvalCodeLength = approvalCodeLength;
	}

	public Number getMaxScriptLength() {
		return maxScriptLength;
	}

	public void setMaxScriptLength(Number maxScriptLength) {
		this.maxScriptLength = maxScriptLength;
	}

	public TrueFalseIndicator getCardCaptureCapable() {
		return cardCaptureCapable;
	}

	public void setCardCaptureCapable(TrueFalseIndicator cardCaptureCapable) {
		this.cardCaptureCapable = cardCaptureCapable;
	}

	public OnLineCapability1Code getOnLineCapabilities() {
		return onLineCapabilities;
	}

	public void setOnLineCapabilities(OnLineCapability1Code onLineCapabilities) {
		this.onLineCapabilities = onLineCapabilities;
	}

	public List<DisplayCapabilities4> getMessageCapabilities() {
		return messageCapabilities;
	}

	public void setMessageCapabilities(List<com.tools20022.repository.msg.DisplayCapabilities4> messageCapabilities) {
		this.messageCapabilities = messageCapabilities;
	}
}