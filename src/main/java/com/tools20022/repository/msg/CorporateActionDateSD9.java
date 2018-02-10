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
import com.tools20022.repository.choice.DateFormat49Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action options date
 * details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmPlaceAndName
 * CorporateActionDateSD9.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmActualEarlyExpirationDate
 * CorporateActionDateSD9.mmActualEarlyExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmActualProtectExpirationDate
 * CorporateActionDateSD9.mmActualProtectExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmActualEarlyProtectExpirationDate
 * CorporateActionDateSD9.mmActualEarlyProtectExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmDTCEarlyProtectExpirationDate
 * CorporateActionDateSD9.mmDTCEarlyProtectExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmActualEarlyCoverProtectExpirationDate
 * CorporateActionDateSD9.mmActualEarlyCoverProtectExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmDTCEarlyCoverProtectExpirationDate
 * CorporateActionDateSD9.mmDTCEarlyCoverProtectExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmProcessToDate
 * CorporateActionDateSD9.mmProcessToDate}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionDateSD9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action options date details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
 * CorporateActionDateSD7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionDateSD9", propOrder = {"placeAndName", "actualEarlyExpirationDate", "actualProtectExpirationDate", "actualEarlyProtectExpirationDate", "dTCEarlyProtectExpirationDate",
		"actualEarlyCoverProtectExpirationDate", "dTCEarlyCoverProtectExpirationDate", "processToDate"})
public class CorporateActionDateSD9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9
	 * CorporateActionDateSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Xpath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmPlaceAndName
	 * CorporateActionDateSD7.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD9.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			previousVersion_lazy = () -> CorporateActionDateSD7.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "ActlEarlyXprtnDt")
	protected DateFormat49Choice actualEarlyExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9
	 * CorporateActionDateSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlEarlyXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualEarlyExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actual early expiration time as set by the issuer/offer/agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmActualEarlyExpirationDate
	 * CorporateActionDateSD7.mmActualEarlyExpirationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmActualEarlyExpirationDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD9.mmObject();
			isDerived = false;
			xmlTag = "ActlEarlyXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualEarlyExpirationDate";
			definition = "Actual early expiration time as set by the issuer/offer/agent.";
			previousVersion_lazy = () -> CorporateActionDateSD7.mmActualEarlyExpirationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}
	};
	@XmlElement(name = "ActlPrtctXprtnDt")
	protected DateFormat49Choice actualProtectExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9
	 * CorporateActionDateSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlPrtctXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day protect instructions can be submitted to the issuer / agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmActualProtectExpirationDate
	 * CorporateActionDateSD7.mmActualProtectExpirationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmActualProtectExpirationDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD9.mmObject();
			isDerived = false;
			xmlTag = "ActlPrtctXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualProtectExpirationDate";
			definition = "Last day protect instructions can be submitted to the issuer / agent.";
			previousVersion_lazy = () -> CorporateActionDateSD7.mmActualProtectExpirationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}
	};
	@XmlElement(name = "ActlEarlyPrtctXprtnDt")
	protected DateFormat49Choice actualEarlyProtectExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9
	 * CorporateActionDateSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlEarlyPrtctXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualEarlyProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day protect instructions can be submitted to the issuer / agent for the early expiration."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmActualEarlyProtectExpirationDate
	 * CorporateActionDateSD7.mmActualEarlyProtectExpirationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmActualEarlyProtectExpirationDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD9.mmObject();
			isDerived = false;
			xmlTag = "ActlEarlyPrtctXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualEarlyProtectExpirationDate";
			definition = "Last day protect instructions can be submitted to the issuer / agent for the early expiration.";
			previousVersion_lazy = () -> CorporateActionDateSD7.mmActualEarlyProtectExpirationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}
	};
	@XmlElement(name = "DTCEarlyPrtctXprtnDt")
	protected DateFormat49Choice dTCEarlyProtectExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9
	 * CorporateActionDateSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCEarlyPrtctXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCEarlyProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day protect instructions can be submitted to DTC for the early expiration."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmDTCEarlyProtectExpirationDate
	 * CorporateActionDateSD7.mmDTCEarlyProtectExpirationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDTCEarlyProtectExpirationDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD9.mmObject();
			isDerived = false;
			xmlTag = "DTCEarlyPrtctXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCEarlyProtectExpirationDate";
			definition = "Last day protect instructions can be submitted to DTC for the early expiration.";
			previousVersion_lazy = () -> CorporateActionDateSD7.mmDTCEarlyProtectExpirationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}
	};
	@XmlElement(name = "ActlEarlyCoverPrtctXprtnDt")
	protected DateFormat49Choice actualEarlyCoverProtectExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9
	 * CorporateActionDateSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlEarlyCoverPrtctXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualEarlyCoverProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day cover early protect instructions can be submitted to the issuer / agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmActualEarlyCoverProtectExpirationDate
	 * CorporateActionDateSD7.mmActualEarlyCoverProtectExpirationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmActualEarlyCoverProtectExpirationDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD9.mmObject();
			isDerived = false;
			xmlTag = "ActlEarlyCoverPrtctXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualEarlyCoverProtectExpirationDate";
			definition = "Last day cover early protect instructions can be submitted to the issuer / agent.";
			previousVersion_lazy = () -> CorporateActionDateSD7.mmActualEarlyCoverProtectExpirationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}
	};
	@XmlElement(name = "DTCEarlyCoverPrtctXprtnDt")
	protected DateFormat49Choice dTCEarlyCoverProtectExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9
	 * CorporateActionDateSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCEarlyCoverPrtctXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCEarlyCoverProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day cover early protect instructions can be submitted to DTC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmDTCEarlyCoverProtectExpirationDate
	 * CorporateActionDateSD7.mmDTCEarlyCoverProtectExpirationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDTCEarlyCoverProtectExpirationDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD9.mmObject();
			isDerived = false;
			xmlTag = "DTCEarlyCoverPrtctXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCEarlyCoverProtectExpirationDate";
			definition = "Last day cover early protect instructions can be submitted to DTC.";
			previousVersion_lazy = () -> CorporateActionDateSD7.mmDTCEarlyCoverProtectExpirationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}
	};
	@XmlElement(name = "PrcToDt")
	protected DateFormat49Choice processToDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat49Choice
	 * DateFormat49Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9
	 * CorporateActionDateSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcToDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessToDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For Reorganization events, date at which instructions will be accepted by agent for payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProcessToDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD9.mmObject();
			isDerived = false;
			xmlTag = "PrcToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessToDate";
			definition = "For Reorganization events, date at which instructions will be accepted by agent for payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat49Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDateSD9.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionDateSD9.mmActualEarlyExpirationDate,
						com.tools20022.repository.msg.CorporateActionDateSD9.mmActualProtectExpirationDate, com.tools20022.repository.msg.CorporateActionDateSD9.mmActualEarlyProtectExpirationDate,
						com.tools20022.repository.msg.CorporateActionDateSD9.mmDTCEarlyProtectExpirationDate, com.tools20022.repository.msg.CorporateActionDateSD9.mmActualEarlyCoverProtectExpirationDate,
						com.tools20022.repository.msg.CorporateActionDateSD9.mmDTCEarlyCoverProtectExpirationDate, com.tools20022.repository.msg.CorporateActionDateSD9.mmProcessToDate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDateSD9";
				definition = "Provides additional information regarding corporate action options date details.";
				previousVersion_lazy = () -> CorporateActionDateSD7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public CorporateActionDateSD9 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<DateFormat49Choice> getActualEarlyExpirationDate() {
		return actualEarlyExpirationDate == null ? Optional.empty() : Optional.of(actualEarlyExpirationDate);
	}

	public CorporateActionDateSD9 setActualEarlyExpirationDate(DateFormat49Choice actualEarlyExpirationDate) {
		this.actualEarlyExpirationDate = actualEarlyExpirationDate;
		return this;
	}

	public Optional<DateFormat49Choice> getActualProtectExpirationDate() {
		return actualProtectExpirationDate == null ? Optional.empty() : Optional.of(actualProtectExpirationDate);
	}

	public CorporateActionDateSD9 setActualProtectExpirationDate(DateFormat49Choice actualProtectExpirationDate) {
		this.actualProtectExpirationDate = actualProtectExpirationDate;
		return this;
	}

	public Optional<DateFormat49Choice> getActualEarlyProtectExpirationDate() {
		return actualEarlyProtectExpirationDate == null ? Optional.empty() : Optional.of(actualEarlyProtectExpirationDate);
	}

	public CorporateActionDateSD9 setActualEarlyProtectExpirationDate(DateFormat49Choice actualEarlyProtectExpirationDate) {
		this.actualEarlyProtectExpirationDate = actualEarlyProtectExpirationDate;
		return this;
	}

	public Optional<DateFormat49Choice> getDTCEarlyProtectExpirationDate() {
		return dTCEarlyProtectExpirationDate == null ? Optional.empty() : Optional.of(dTCEarlyProtectExpirationDate);
	}

	public CorporateActionDateSD9 setDTCEarlyProtectExpirationDate(DateFormat49Choice dTCEarlyProtectExpirationDate) {
		this.dTCEarlyProtectExpirationDate = dTCEarlyProtectExpirationDate;
		return this;
	}

	public Optional<DateFormat49Choice> getActualEarlyCoverProtectExpirationDate() {
		return actualEarlyCoverProtectExpirationDate == null ? Optional.empty() : Optional.of(actualEarlyCoverProtectExpirationDate);
	}

	public CorporateActionDateSD9 setActualEarlyCoverProtectExpirationDate(DateFormat49Choice actualEarlyCoverProtectExpirationDate) {
		this.actualEarlyCoverProtectExpirationDate = actualEarlyCoverProtectExpirationDate;
		return this;
	}

	public Optional<DateFormat49Choice> getDTCEarlyCoverProtectExpirationDate() {
		return dTCEarlyCoverProtectExpirationDate == null ? Optional.empty() : Optional.of(dTCEarlyCoverProtectExpirationDate);
	}

	public CorporateActionDateSD9 setDTCEarlyCoverProtectExpirationDate(DateFormat49Choice dTCEarlyCoverProtectExpirationDate) {
		this.dTCEarlyCoverProtectExpirationDate = dTCEarlyCoverProtectExpirationDate;
		return this;
	}

	public Optional<DateFormat49Choice> getProcessToDate() {
		return processToDate == null ? Optional.empty() : Optional.of(processToDate);
	}

	public CorporateActionDateSD9 setProcessToDate(DateFormat49Choice processToDate) {
		this.processToDate = processToDate;
		return this;
	}
}