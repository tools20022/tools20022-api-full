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
import com.tools20022.repository.codeset.CardDataReading2Code;
import com.tools20022.repository.codeset.CardDataReading3Code;
import com.tools20022.repository.codeset.CardholderVerificationCapability2Code;
import com.tools20022.repository.codeset.OnLineCapability1Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.PointOfInteraction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Capabilities of the terminal performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmCardReadingCapabilities
 * PointOfInteractionCapabilities4.mmCardReadingCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmCardWrittingCapabilities
 * PointOfInteractionCapabilities4.mmCardWrittingCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmCardholderVerificationCapabilities
 * PointOfInteractionCapabilities4.mmCardholderVerificationCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmPINLengthCapabilities
 * PointOfInteractionCapabilities4.mmPINLengthCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmApprovalCodeLength
 * PointOfInteractionCapabilities4.mmApprovalCodeLength}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmMaxScriptLength
 * PointOfInteractionCapabilities4.mmMaxScriptLength}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmCardCaptureCapable
 * PointOfInteractionCapabilities4.mmCardCaptureCapable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmOnLineCapabilities
 * PointOfInteractionCapabilities4.mmOnLineCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmMessageCapabilities
 * PointOfInteractionCapabilities4.mmMessageCapabilities}</li>
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
 * "PointOfInteractionCapabilities4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Capabilities of the terminal performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3
 * PointOfInteractionCapabilities3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PointOfInteractionCapabilities4", propOrder = {"cardReadingCapabilities", "cardWrittingCapabilities", "cardholderVerificationCapabilities", "PINLengthCapabilities", "approvalCodeLength", "maxScriptLength",
		"cardCaptureCapable", "onLineCapabilities", "messageCapabilities"})
public class PointOfInteractionCapabilities4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<CardDataReading2Code> cardReadingCapabilities;
	/**
	 * Card reading capabilities of the terminal performing the transaction. <br>
	 * It correspond to the ISO 8583 field number 22-2 for the version 93, and
	 * field number 27-1 for the version 2003.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code
	 * CardDataReading2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardReadingCapabilities
	 * PointOfInteraction.mmCardReadingCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4
	 * PointOfInteractionCapabilities4}</li>
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
	 * "Card reading capabilities of the terminal performing the transaction. \r\nIt correspond to the ISO 8583 field number 22-2 for the version 93, and field number 27-1 for the version 2003."
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
			componentContext_lazy = () -> PointOfInteractionCapabilities4.mmObject();
			isDerived = false;
			xmlTag = "CardRdngCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardReadingCapabilities";
			definition = "Card reading capabilities of the terminal performing the transaction. \r\nIt correspond to the ISO 8583 field number 22-2 for the version 93, and field number 27-1 for the version 2003.";
			previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmCardReadingCapabilities;
			minOccurs = 1;
			simpleType_lazy = () -> CardDataReading2Code.mmObject();
		}
	};
	protected List<CardDataReading3Code> cardWrittingCapabilities;
	/**
	 * Card writting capabilities of the terminal performing the transaction. <br>
	 * It correspond to the ISO 8583 field number 22-10 for the version 93, and
	 * field number 27-8_9 for the version 2003.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading3Code
	 * CardDataReading3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardReadingCapabilities
	 * PointOfInteraction.mmCardReadingCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4
	 * PointOfInteractionCapabilities4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardWrttgCpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardWrittingCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card writting capabilities of the terminal performing the transaction. \r\nIt correspond to the ISO 8583 field number 22-10 for the version 93, and field number 27-8_9 for the version 2003."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardWrittingCapabilities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmCardReadingCapabilities;
			componentContext_lazy = () -> PointOfInteractionCapabilities4.mmObject();
			isDerived = false;
			xmlTag = "CardWrttgCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardWrittingCapabilities";
			definition = "Card writting capabilities of the terminal performing the transaction. \r\nIt correspond to the ISO 8583 field number 22-10 for the version 93, and field number 27-8_9 for the version 2003.";
			minOccurs = 0;
			simpleType_lazy = () -> CardDataReading3Code.mmObject();
		}
	};
	protected List<CardholderVerificationCapability2Code> cardholderVerificationCapabilities;
	/**
	 * Cardholder verification capabilities by the terminal. <br>
	 * It correspond to the ISO 8583 field number 22-2 for the versions 87 and
	 * 93, and field number 27-2 for the version 2003.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability2Code
	 * CardholderVerificationCapability2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardholderVerificationCapabilities
	 * PointOfInteraction.mmCardholderVerificationCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4
	 * PointOfInteractionCapabilities4}</li>
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
	 * "Cardholder verification capabilities by the terminal. \r\nIt correspond to the ISO 8583 field number 22-2 for the versions 87 and 93, and field number 27-2 for the version 2003."
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
			componentContext_lazy = () -> PointOfInteractionCapabilities4.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrVrfctnCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderVerificationCapabilities";
			definition = "Cardholder verification capabilities by the terminal. \r\nIt correspond to the ISO 8583 field number 22-2 for the versions 87 and 93, and field number 27-2 for the version 2003.";
			previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmCardholderVerificationCapabilities;
			minOccurs = 0;
			simpleType_lazy = () -> CardholderVerificationCapability2Code.mmObject();
		}
	};
	protected Number pINLengthCapabilities;
	/**
	 * Maximum number of digits the POI is able to accept when the cardholder
	 * enters its PIN. <br>
	 * It correspond to the ISO 8583, field number 25 for the version 87, 22-12
	 * for the version 93, and field number 27-11 for the version 2003.
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4
	 * PointOfInteractionCapabilities4}</li>
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
	 * "Maximum number of digits the POI is able to accept when the cardholder enters its PIN. \r\nIt correspond to the ISO 8583, field number 25 for the version 87, 22-12 for the version 93, and field number 27-11 for the version 2003."
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
			componentContext_lazy = () -> PointOfInteractionCapabilities4.mmObject();
			isDerived = false;
			xmlTag = "PINLngthCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINLengthCapabilities";
			definition = "Maximum number of digits the POI is able to accept when the cardholder enters its PIN. \r\nIt correspond to the ISO 8583, field number 25 for the version 87, 22-12 for the version 93, and field number 27-11 for the version 2003.";
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4
	 * PointOfInteractionCapabilities4}</li>
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
			componentContext_lazy = () -> PointOfInteractionCapabilities4.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4
	 * PointOfInteractionCapabilities4}</li>
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
			componentContext_lazy = () -> PointOfInteractionCapabilities4.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4
	 * PointOfInteractionCapabilities4}</li>
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
			componentContext_lazy = () -> PointOfInteractionCapabilities4.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4
	 * PointOfInteractionCapabilities4}</li>
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
			componentContext_lazy = () -> PointOfInteractionCapabilities4.mmObject();
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
	protected List<com.tools20022.repository.msg.DisplayCapabilities3> messageCapabilities;
	/**
	 * Capabilities of the terminal to display or print message to the
	 * cardholder and the merchant. <br>
	 * It correspond to the ISO 8583 field number 22-11 for the version 93, and
	 * field number 27-6 for the version 2003.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DisplayCapabilities3
	 * DisplayCapabilities3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4
	 * PointOfInteractionCapabilities4}</li>
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
	 * "Capabilities of the terminal to display or print message to the cardholder and the merchant. \r\nIt correspond to the ISO 8583 field number 22-11 for the version 93, and field number 27-6 for the version 2003."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageCapabilities = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PointOfInteractionCapabilities4.mmObject();
			isDerived = false;
			xmlTag = "MsgCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageCapabilities";
			definition = "Capabilities of the terminal to display or print message to the cardholder and the merchant. \r\nIt correspond to the ISO 8583 field number 22-11 for the version 93, and field number 27-6 for the version 2003.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PointOfInteractionCapabilities4.mmCardReadingCapabilities, PointOfInteractionCapabilities4.mmCardWrittingCapabilities,
						PointOfInteractionCapabilities4.mmCardholderVerificationCapabilities, PointOfInteractionCapabilities4.mmPINLengthCapabilities, PointOfInteractionCapabilities4.mmApprovalCodeLength,
						PointOfInteractionCapabilities4.mmMaxScriptLength, PointOfInteractionCapabilities4.mmCardCaptureCapable, PointOfInteractionCapabilities4.mmOnLineCapabilities, PointOfInteractionCapabilities4.mmMessageCapabilities);
				trace_lazy = () -> PointOfInteraction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionCapabilities4";
				definition = "Capabilities of the terminal performing the transaction.";
				previousVersion_lazy = () -> PointOfInteractionCapabilities3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CardRdngCpblties", required = true)
	public List<CardDataReading2Code> getCardReadingCapabilities() {
		return cardReadingCapabilities;
	}

	public void setCardReadingCapabilities(List<CardDataReading2Code> cardReadingCapabilities) {
		this.cardReadingCapabilities = cardReadingCapabilities;
	}

	@XmlElement(name = "CardWrttgCpblties")
	public List<CardDataReading3Code> getCardWrittingCapabilities() {
		return cardWrittingCapabilities;
	}

	public void setCardWrittingCapabilities(List<CardDataReading3Code> cardWrittingCapabilities) {
		this.cardWrittingCapabilities = cardWrittingCapabilities;
	}

	@XmlElement(name = "CrdhldrVrfctnCpblties")
	public List<CardholderVerificationCapability2Code> getCardholderVerificationCapabilities() {
		return cardholderVerificationCapabilities;
	}

	public void setCardholderVerificationCapabilities(List<CardholderVerificationCapability2Code> cardholderVerificationCapabilities) {
		this.cardholderVerificationCapabilities = cardholderVerificationCapabilities;
	}

	@XmlElement(name = "PINLngthCpblties")
	public Number getPINLengthCapabilities() {
		return pINLengthCapabilities;
	}

	public void setPINLengthCapabilities(Number pINLengthCapabilities) {
		this.pINLengthCapabilities = pINLengthCapabilities;
	}

	@XmlElement(name = "ApprvlCdLngth")
	public Number getApprovalCodeLength() {
		return approvalCodeLength;
	}

	public void setApprovalCodeLength(Number approvalCodeLength) {
		this.approvalCodeLength = approvalCodeLength;
	}

	@XmlElement(name = "MxScrptLngth")
	public Number getMaxScriptLength() {
		return maxScriptLength;
	}

	public void setMaxScriptLength(Number maxScriptLength) {
		this.maxScriptLength = maxScriptLength;
	}

	@XmlElement(name = "CardCaptrCpbl")
	public TrueFalseIndicator getCardCaptureCapable() {
		return cardCaptureCapable;
	}

	public void setCardCaptureCapable(TrueFalseIndicator cardCaptureCapable) {
		this.cardCaptureCapable = cardCaptureCapable;
	}

	@XmlElement(name = "OnLineCpblties")
	public OnLineCapability1Code getOnLineCapabilities() {
		return onLineCapabilities;
	}

	public void setOnLineCapabilities(OnLineCapability1Code onLineCapabilities) {
		this.onLineCapabilities = onLineCapabilities;
	}

	@XmlElement(name = "MsgCpblties")
	public List<DisplayCapabilities3> getMessageCapabilities() {
		return messageCapabilities;
	}

	public void setMessageCapabilities(List<com.tools20022.repository.msg.DisplayCapabilities3> messageCapabilities) {
		this.messageCapabilities = messageCapabilities;
	}
}