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
import com.tools20022.repository.codeset.CardDataReading1Code;
import com.tools20022.repository.codeset.CardholderVerificationCapability1Code;
import com.tools20022.repository.codeset.LanguageCode;
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
 * Capabilities of the POI (Point Of Interaction) performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmCardReadingCapabilities
 * PointOfInteractionCapabilities3.mmCardReadingCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmCardholderVerificationCapabilities
 * PointOfInteractionCapabilities3.mmCardholderVerificationCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmPINLengthCapabilities
 * PointOfInteractionCapabilities3.mmPINLengthCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmApprovalCodeLength
 * PointOfInteractionCapabilities3.mmApprovalCodeLength}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmCardCaptureCapable
 * PointOfInteractionCapabilities3.mmCardCaptureCapable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmOnLineCapabilities
 * PointOfInteractionCapabilities3.mmOnLineCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmDisplayCapabilities
 * PointOfInteractionCapabilities3.mmDisplayCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmPrintLineWidth
 * PointOfInteractionCapabilities3.mmPrintLineWidth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmAvailableLanguage
 * PointOfInteractionCapabilities3.mmAvailableLanguage}</li>
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
 * "PointOfInteractionCapabilities3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Capabilities of the POI (Point Of Interaction) performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4
 * PointOfInteractionCapabilities4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5
 * PointOfInteractionCapabilities5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6
 * PointOfInteractionCapabilities6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2
 * PointOfInteractionCapabilities2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PointOfInteractionCapabilities3", propOrder = {"cardReadingCapabilities", "cardholderVerificationCapabilities", "PINLengthCapabilities", "approvalCodeLength", "cardCaptureCapable", "onLineCapabilities",
		"displayCapabilities", "printLineWidth", "availableLanguage"})
public class PointOfInteractionCapabilities3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<CardDataReading1Code> cardReadingCapabilities;
	/**
	 * Card reading capabilities of the POI (Point Of Interaction) performing
	 * the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardReadingCapabilities
	 * PointOfInteraction.mmCardReadingCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3
	 * PointOfInteractionCapabilities3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmCardReadingCapabilities
	 * PointOfInteractionCapabilities4.mmCardReadingCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5#mmCardReadData
	 * PointOfInteractionCapabilities5.mmCardReadData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6#mmCardReadingCapabilities
	 * PointOfInteractionCapabilities6.mmCardReadingCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2#mmCardReadingCapabilities
	 * PointOfInteractionCapabilities2.mmCardReadingCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardReadingCapabilities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmCardReadingCapabilities;
			componentContext_lazy = () -> PointOfInteractionCapabilities3.mmObject();
			isDerived = false;
			xmlTag = "CardRdngCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardReadingCapabilities";
			definition = "Card reading capabilities of the POI (Point Of Interaction) performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionCapabilities4.mmCardReadingCapabilities, PointOfInteractionCapabilities5.mmCardReadData, PointOfInteractionCapabilities6.mmCardReadingCapabilities);
			previousVersion_lazy = () -> PointOfInteractionCapabilities2.mmCardReadingCapabilities;
			minOccurs = 0;
			simpleType_lazy = () -> CardDataReading1Code.mmObject();
		}
	};
	protected List<CardholderVerificationCapability1Code> cardholderVerificationCapabilities;
	/**
	 * Cardholder verification capabilities of the POI (Point Of Interaction)
	 * performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderVerificationCapability1Code
	 * CardholderVerificationCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardholderVerificationCapabilities
	 * PointOfInteraction.mmCardholderVerificationCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3
	 * PointOfInteractionCapabilities3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmCardholderVerificationCapabilities
	 * PointOfInteractionCapabilities4.mmCardholderVerificationCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5#mmAuthentication
	 * PointOfInteractionCapabilities5.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6#mmCardholderVerificationCapabilities
	 * PointOfInteractionCapabilities6.mmCardholderVerificationCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2#mmCardholderVerificationCapabilities
	 * PointOfInteractionCapabilities2.mmCardholderVerificationCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardholderVerificationCapabilities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmCardholderVerificationCapabilities;
			componentContext_lazy = () -> PointOfInteractionCapabilities3.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrVrfctnCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderVerificationCapabilities";
			definition = "Cardholder verification capabilities of the POI (Point Of Interaction) performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionCapabilities4.mmCardholderVerificationCapabilities, PointOfInteractionCapabilities5.mmAuthentication,
					PointOfInteractionCapabilities6.mmCardholderVerificationCapabilities);
			previousVersion_lazy = () -> PointOfInteractionCapabilities2.mmCardholderVerificationCapabilities;
			minOccurs = 0;
			simpleType_lazy = () -> CardholderVerificationCapability1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3
	 * PointOfInteractionCapabilities3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmPINLengthCapabilities
	 * PointOfInteractionCapabilities4.mmPINLengthCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5#mmPINLengthCapabilities
	 * PointOfInteractionCapabilities5.mmPINLengthCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6#mmPINLengthCapabilities
	 * PointOfInteractionCapabilities6.mmPINLengthCapabilities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPINLengthCapabilities = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionCapabilities3.mmObject();
			isDerived = false;
			xmlTag = "PINLngthCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINLengthCapabilities";
			definition = "Maximum number of digits the POI is able to accept when the cardholder enters its PIN.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionCapabilities4.mmPINLengthCapabilities, PointOfInteractionCapabilities5.mmPINLengthCapabilities, PointOfInteractionCapabilities6.mmPINLengthCapabilities);
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3
	 * PointOfInteractionCapabilities3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmApprovalCodeLength
	 * PointOfInteractionCapabilities4.mmApprovalCodeLength}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5#mmApprovalCodeLength
	 * PointOfInteractionCapabilities5.mmApprovalCodeLength}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6#mmApprovalCodeLength
	 * PointOfInteractionCapabilities6.mmApprovalCodeLength}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApprovalCodeLength = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionCapabilities3.mmObject();
			isDerived = false;
			xmlTag = "ApprvlCdLngth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovalCodeLength";
			definition = "Maximum number of characters of the approval code the POI is able to manage.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionCapabilities4.mmApprovalCodeLength, PointOfInteractionCapabilities5.mmApprovalCodeLength, PointOfInteractionCapabilities6.mmApprovalCodeLength);
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3
	 * PointOfInteractionCapabilities3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmCardCaptureCapable
	 * PointOfInteractionCapabilities4.mmCardCaptureCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5#mmCardCaptureCapable
	 * PointOfInteractionCapabilities5.mmCardCaptureCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6#mmCardCaptureCapable
	 * PointOfInteractionCapabilities6.mmCardCaptureCapable}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardCaptureCapable = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionCapabilities3.mmObject();
			isDerived = false;
			xmlTag = "CardCaptrCpbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCaptureCapable";
			definition = "True if the POI is able to capture card.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionCapabilities4.mmCardCaptureCapable, PointOfInteractionCapabilities5.mmCardCaptureCapable, PointOfInteractionCapabilities6.mmCardCaptureCapable);
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3
	 * PointOfInteractionCapabilities3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities4#mmOnLineCapabilities
	 * PointOfInteractionCapabilities4.mmOnLineCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6#mmOnLineCapabilities
	 * PointOfInteractionCapabilities6.mmOnLineCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2#mmOnLineCapabilities
	 * PointOfInteractionCapabilities2.mmOnLineCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOnLineCapabilities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmOnLineCapabilities;
			componentContext_lazy = () -> PointOfInteractionCapabilities3.mmObject();
			isDerived = false;
			xmlTag = "OnLineCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineCapabilities";
			definition = "On-line and off-line capabilities of the POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionCapabilities4.mmOnLineCapabilities, PointOfInteractionCapabilities6.mmOnLineCapabilities);
			previousVersion_lazy = () -> PointOfInteractionCapabilities2.mmOnLineCapabilities;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OnLineCapability1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DisplayCapabilities2> displayCapabilities;
	/**
	 * Capabilities of the display components performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities2
	 * DisplayCapabilities2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmDisplayCapabilities
	 * PointOfInteraction.mmDisplayCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3
	 * PointOfInteractionCapabilities3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DispCpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capabilities of the display components performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2#mmDisplayCapabilities
	 * PointOfInteractionCapabilities2.mmDisplayCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDisplayCapabilities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmDisplayCapabilities;
			componentContext_lazy = () -> PointOfInteractionCapabilities3.mmObject();
			isDerived = false;
			xmlTag = "DispCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisplayCapabilities";
			definition = "Capabilities of the display components performing the transaction.";
			previousVersion_lazy = () -> PointOfInteractionCapabilities2.mmDisplayCapabilities;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities2.mmObject();
		}
	};
	protected Number printLineWidth;
	/**
	 * Number of columns of the printer component.
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3
	 * PointOfInteractionCapabilities3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtLineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrintLineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of columns of the printer component."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2#mmPrintLineWidth
	 * PointOfInteractionCapabilities2.mmPrintLineWidth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrintLineWidth = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionCapabilities3.mmObject();
			isDerived = false;
			xmlTag = "PrtLineWidth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrintLineWidth";
			definition = "Number of columns of the printer component.";
			previousVersion_lazy = () -> PointOfInteractionCapabilities2.mmPrintLineWidth;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected List<LanguageCode> availableLanguage;
	/**
	 * Available language in the display and printer interface.<br>
	 * Reference ISO 639-1 (alpha-2) et ISO 639-2 (alpha-3).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3
	 * PointOfInteractionCapabilities3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblLang"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableLanguage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Available language in the display and printer interface.\r\nReference ISO 639-1 (alpha-2) et ISO 639-2 (alpha-3)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2#mmAvailableLanguage
	 * PointOfInteractionCapabilities2.mmAvailableLanguage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAvailableLanguage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionCapabilities3.mmObject();
			isDerived = false;
			xmlTag = "AvlblLang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableLanguage";
			definition = "Available language in the display and printer interface.\r\nReference ISO 639-1 (alpha-2) et ISO 639-2 (alpha-3).";
			previousVersion_lazy = () -> PointOfInteractionCapabilities2.mmAvailableLanguage;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PointOfInteractionCapabilities3.mmCardReadingCapabilities, PointOfInteractionCapabilities3.mmCardholderVerificationCapabilities,
						PointOfInteractionCapabilities3.mmPINLengthCapabilities, PointOfInteractionCapabilities3.mmApprovalCodeLength, PointOfInteractionCapabilities3.mmCardCaptureCapable,
						PointOfInteractionCapabilities3.mmOnLineCapabilities, PointOfInteractionCapabilities3.mmDisplayCapabilities, PointOfInteractionCapabilities3.mmPrintLineWidth, PointOfInteractionCapabilities3.mmAvailableLanguage);
				trace_lazy = () -> PointOfInteraction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionCapabilities3";
				definition = "Capabilities of the POI (Point Of Interaction) performing the transaction.";
				nextVersions_lazy = () -> Arrays.asList(PointOfInteractionCapabilities4.mmObject(), PointOfInteractionCapabilities5.mmObject(), PointOfInteractionCapabilities6.mmObject());
				previousVersion_lazy = () -> PointOfInteractionCapabilities2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CardRdngCpblties")
	public List<CardDataReading1Code> getCardReadingCapabilities() {
		return cardReadingCapabilities;
	}

	public void setCardReadingCapabilities(List<CardDataReading1Code> cardReadingCapabilities) {
		this.cardReadingCapabilities = cardReadingCapabilities;
	}

	@XmlElement(name = "CrdhldrVrfctnCpblties")
	public List<CardholderVerificationCapability1Code> getCardholderVerificationCapabilities() {
		return cardholderVerificationCapabilities;
	}

	public void setCardholderVerificationCapabilities(List<CardholderVerificationCapability1Code> cardholderVerificationCapabilities) {
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

	@XmlElement(name = "DispCpblties")
	public List<DisplayCapabilities2> getDisplayCapabilities() {
		return displayCapabilities;
	}

	public void setDisplayCapabilities(List<com.tools20022.repository.msg.DisplayCapabilities2> displayCapabilities) {
		this.displayCapabilities = displayCapabilities;
	}

	@XmlElement(name = "PrtLineWidth")
	public Number getPrintLineWidth() {
		return printLineWidth;
	}

	public void setPrintLineWidth(Number printLineWidth) {
		this.printLineWidth = printLineWidth;
	}

	@XmlElement(name = "AvlblLang")
	public List<LanguageCode> getAvailableLanguage() {
		return availableLanguage;
	}

	public void setAvailableLanguage(List<LanguageCode> availableLanguage) {
		this.availableLanguage = availableLanguage;
	}
}