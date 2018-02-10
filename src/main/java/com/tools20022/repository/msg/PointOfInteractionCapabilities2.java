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
import com.tools20022.repository.codeset.ISO2ALanguageCode;
import com.tools20022.repository.codeset.OnLineCapability1Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.PointOfInteraction;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2#mmCardReadingCapabilities
 * PointOfInteractionCapabilities2.mmCardReadingCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2#mmCardholderVerificationCapabilities
 * PointOfInteractionCapabilities2.mmCardholderVerificationCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2#mmOnLineCapabilities
 * PointOfInteractionCapabilities2.mmOnLineCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2#mmDisplayCapabilities
 * PointOfInteractionCapabilities2.mmDisplayCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2#mmPrintLineWidth
 * PointOfInteractionCapabilities2.mmPrintLineWidth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2#mmAvailableLanguage
 * PointOfInteractionCapabilities2.mmAvailableLanguage}</li>
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
 * "PointOfInteractionCapabilities2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Capabilities of the POI (Point Of Interaction) performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3
 * PointOfInteractionCapabilities3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1
 * PointOfInteractionCapabilities1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PointOfInteractionCapabilities2", propOrder = {"cardReadingCapabilities", "cardholderVerificationCapabilities", "onLineCapabilities", "displayCapabilities", "printLineWidth", "availableLanguage"})
public class PointOfInteractionCapabilities2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CardRdngCpblties")
	protected List<CardDataReading1Code> cardReadingCapabilities;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2
	 * PointOfInteractionCapabilities2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmCardReadingCapabilities
	 * PointOfInteractionCapabilities3.mmCardReadingCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#mmCardReadingCapabilities
	 * PointOfInteractionCapabilities1.mmCardReadingCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardReadingCapabilities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmCardReadingCapabilities;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities2.mmObject();
			isDerived = false;
			xmlTag = "CardRdngCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardReadingCapabilities";
			definition = "Card reading capabilities of the POI (Point Of Interaction) performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionCapabilities3.mmCardReadingCapabilities);
			previousVersion_lazy = () -> PointOfInteractionCapabilities1.mmCardReadingCapabilities;
			minOccurs = 0;
			simpleType_lazy = () -> CardDataReading1Code.mmObject();
		}
	};
	@XmlElement(name = "CrdhldrVrfctnCpblties")
	protected List<CardholderVerificationCapability1Code> cardholderVerificationCapabilities;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2
	 * PointOfInteractionCapabilities2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmCardholderVerificationCapabilities
	 * PointOfInteractionCapabilities3.mmCardholderVerificationCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#mmCardholderVerificationCapabilities
	 * PointOfInteractionCapabilities1.mmCardholderVerificationCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardholderVerificationCapabilities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmCardholderVerificationCapabilities;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities2.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrVrfctnCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderVerificationCapabilities";
			definition = "Cardholder verification capabilities of the POI (Point Of Interaction) performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionCapabilities3.mmCardholderVerificationCapabilities);
			previousVersion_lazy = () -> PointOfInteractionCapabilities1.mmCardholderVerificationCapabilities;
			minOccurs = 0;
			simpleType_lazy = () -> CardholderVerificationCapability1Code.mmObject();
		}
	};
	@XmlElement(name = "OnLineCpblties")
	protected OnLineCapability1Code onLineCapabilities;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2
	 * PointOfInteractionCapabilities2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmOnLineCapabilities
	 * PointOfInteractionCapabilities3.mmOnLineCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#mmOnLineCapabilities
	 * PointOfInteractionCapabilities1.mmOnLineCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOnLineCapabilities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmOnLineCapabilities;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities2.mmObject();
			isDerived = false;
			xmlTag = "OnLineCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineCapabilities";
			definition = "On-line and off-line capabilities of the POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionCapabilities3.mmOnLineCapabilities);
			previousVersion_lazy = () -> PointOfInteractionCapabilities1.mmOnLineCapabilities;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OnLineCapability1Code.mmObject();
		}
	};
	@XmlElement(name = "DispCpblties")
	protected List<com.tools20022.repository.msg.DisplayCapabilities2> displayCapabilities;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2
	 * PointOfInteractionCapabilities2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmDisplayCapabilities
	 * PointOfInteractionCapabilities3.mmDisplayCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#mmDisplayCapabilities
	 * PointOfInteractionCapabilities1.mmDisplayCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDisplayCapabilities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmDisplayCapabilities;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities2.mmObject();
			isDerived = false;
			xmlTag = "DispCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisplayCapabilities";
			definition = "Capabilities of the display components performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionCapabilities3.mmDisplayCapabilities);
			previousVersion_lazy = () -> PointOfInteractionCapabilities1.mmDisplayCapabilities;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities2.mmObject();
		}
	};
	@XmlElement(name = "PrtLineWidth")
	protected Number printLineWidth;
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2
	 * PointOfInteractionCapabilities2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmPrintLineWidth
	 * PointOfInteractionCapabilities3.mmPrintLineWidth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities1#mmPrintLineWidth
	 * PointOfInteractionCapabilities1.mmPrintLineWidth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrintLineWidth = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities2.mmObject();
			isDerived = false;
			xmlTag = "PrtLineWidth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrintLineWidth";
			definition = "Number of columns of the printer component.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionCapabilities3.mmPrintLineWidth);
			previousVersion_lazy = () -> PointOfInteractionCapabilities1.mmPrintLineWidth;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "AvlblLang")
	protected List<ISO2ALanguageCode> availableLanguage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ISO2ALanguageCode
	 * ISO2ALanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities2
	 * PointOfInteractionCapabilities2}</li>
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
	 * definition} = "Available language in the display and printer interface."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities3#mmAvailableLanguage
	 * PointOfInteractionCapabilities3.mmAvailableLanguage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAvailableLanguage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities2.mmObject();
			isDerived = false;
			xmlTag = "AvlblLang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableLanguage";
			definition = "Available language in the display and printer interface.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionCapabilities3.mmAvailableLanguage);
			minOccurs = 0;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionCapabilities2.mmCardReadingCapabilities,
						com.tools20022.repository.msg.PointOfInteractionCapabilities2.mmCardholderVerificationCapabilities, com.tools20022.repository.msg.PointOfInteractionCapabilities2.mmOnLineCapabilities,
						com.tools20022.repository.msg.PointOfInteractionCapabilities2.mmDisplayCapabilities, com.tools20022.repository.msg.PointOfInteractionCapabilities2.mmPrintLineWidth,
						com.tools20022.repository.msg.PointOfInteractionCapabilities2.mmAvailableLanguage);
				trace_lazy = () -> PointOfInteraction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionCapabilities2";
				definition = "Capabilities of the POI (Point Of Interaction) performing the transaction.";
				nextVersions_lazy = () -> Arrays.asList(PointOfInteractionCapabilities3.mmObject());
				previousVersion_lazy = () -> PointOfInteractionCapabilities1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<CardDataReading1Code> getCardReadingCapabilities() {
		return cardReadingCapabilities == null ? cardReadingCapabilities = new ArrayList<>() : cardReadingCapabilities;
	}

	public PointOfInteractionCapabilities2 setCardReadingCapabilities(List<CardDataReading1Code> cardReadingCapabilities) {
		this.cardReadingCapabilities = Objects.requireNonNull(cardReadingCapabilities);
		return this;
	}

	public List<CardholderVerificationCapability1Code> getCardholderVerificationCapabilities() {
		return cardholderVerificationCapabilities == null ? cardholderVerificationCapabilities = new ArrayList<>() : cardholderVerificationCapabilities;
	}

	public PointOfInteractionCapabilities2 setCardholderVerificationCapabilities(List<CardholderVerificationCapability1Code> cardholderVerificationCapabilities) {
		this.cardholderVerificationCapabilities = Objects.requireNonNull(cardholderVerificationCapabilities);
		return this;
	}

	public Optional<OnLineCapability1Code> getOnLineCapabilities() {
		return onLineCapabilities == null ? Optional.empty() : Optional.of(onLineCapabilities);
	}

	public PointOfInteractionCapabilities2 setOnLineCapabilities(OnLineCapability1Code onLineCapabilities) {
		this.onLineCapabilities = onLineCapabilities;
		return this;
	}

	public List<DisplayCapabilities2> getDisplayCapabilities() {
		return displayCapabilities == null ? displayCapabilities = new ArrayList<>() : displayCapabilities;
	}

	public PointOfInteractionCapabilities2 setDisplayCapabilities(List<com.tools20022.repository.msg.DisplayCapabilities2> displayCapabilities) {
		this.displayCapabilities = Objects.requireNonNull(displayCapabilities);
		return this;
	}

	public Optional<Number> getPrintLineWidth() {
		return printLineWidth == null ? Optional.empty() : Optional.of(printLineWidth);
	}

	public PointOfInteractionCapabilities2 setPrintLineWidth(Number printLineWidth) {
		this.printLineWidth = printLineWidth;
		return this;
	}

	public List<ISO2ALanguageCode> getAvailableLanguage() {
		return availableLanguage == null ? availableLanguage = new ArrayList<>() : availableLanguage;
	}

	public PointOfInteractionCapabilities2 setAvailableLanguage(List<ISO2ALanguageCode> availableLanguage) {
		this.availableLanguage = Objects.requireNonNull(availableLanguage);
		return this;
	}
}