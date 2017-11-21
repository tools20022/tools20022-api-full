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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action details periods
 * details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriodSD1#mmPlaceAndName
 * CorporateActionPeriodSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriodSD1#mmDTCReorganisationDepositPeriod
 * CorporateActionPeriodSD1.mmDTCReorganisationDepositPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriodSD1#mmDTCChillPeriodForDepositoryDelivery
 * CorporateActionPeriodSD1.mmDTCChillPeriodForDepositoryDelivery}</li>
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
 * "CorporateActionPeriodSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action details periods details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionPeriodSD1", propOrder = {"placeAndName", "DTCReorganisationDepositPeriod", "DTCChillPeriodForDepositoryDelivery"})
public class CorporateActionPeriodSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriodSD1
	 * CorporateActionPeriodSD1}</li>
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
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPeriodSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Period3 dTCReorganisationDepositPeriod;
	/**
	 * Period during which the securities can be submitted to Reorganisation
	 * deposit service at DTC (The Depository Trust Corporation). DTC First Day
	 * for Reorg Deposit (start date) is the day on which security is eligible
	 * for reorganisation deposit service at DTC. DTC Last Day for Reorg Deposit
	 * is the last day on which securities are eligible to be submitted for
	 * reorganisation deposit service at DTC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period3 Period3}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriodSD1
	 * CorporateActionPeriodSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCReorgDpstPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCReorganisationDepositPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the securities can be submitted to Reorganisation deposit service at DTC (The Depository Trust Corporation). DTC First Day for Reorg Deposit (start date) is the day on which security is eligible for reorganisation deposit service at DTC. DTC Last Day for Reorg Deposit is the last day on which securities are eligible to be submitted for reorganisation deposit service at DTC."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCReorganisationDepositPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPeriodSD1.mmObject();
			isDerived = false;
			xmlTag = "DTCReorgDpstPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCReorganisationDepositPeriod";
			definition = "Period during which the securities can be submitted to Reorganisation deposit service at DTC (The Depository Trust Corporation). DTC First Day for Reorg Deposit (start date) is the day on which security is eligible for reorganisation deposit service at DTC. DTC Last Day for Reorg Deposit is the last day on which securities are eligible to be submitted for reorganisation deposit service at DTC.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period3.mmObject();
		}
	};
	protected Period3 dTCChillPeriodForDepositoryDelivery;
	/**
	 * Period during which the co-depositories deliveries are suspended at DTC
	 * (The Depository Trust Corporation). DTC Last Day for Depository Delivery
	 * (start date) - the last day on which depository deliveries will be
	 * accepted. DTC Chill Release Day for Depository Delivery (end date) - day
	 * when chill is released and depositories can resume delivery activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period3 Period3}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriodSD1
	 * CorporateActionPeriodSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCChillPrdForDpstryDlvry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCChillPeriodForDepositoryDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the co-depositories deliveries are suspended at DTC (The Depository Trust Corporation). DTC Last Day for Depository Delivery (start date) - the last day on which depository deliveries will be accepted. DTC Chill Release Day  for Depository Delivery (end date) - day when chill is released and depositories can resume delivery activities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCChillPeriodForDepositoryDelivery = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPeriodSD1.mmObject();
			isDerived = false;
			xmlTag = "DTCChillPrdForDpstryDlvry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCChillPeriodForDepositoryDelivery";
			definition = "Period during which the co-depositories deliveries are suspended at DTC (The Depository Trust Corporation). DTC Last Day for Depository Delivery (start date) - the last day on which depository deliveries will be accepted. DTC Chill Release Day  for Depository Delivery (end date) - day when chill is released and depositories can resume delivery activities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionPeriodSD1.mmPlaceAndName, CorporateActionPeriodSD1.mmDTCReorganisationDepositPeriod, CorporateActionPeriodSD1.mmDTCChillPeriodForDepositoryDelivery);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionPeriodSD1";
				definition = "Provides additional information regarding corporate action details periods details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm", required = true)
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "DTCReorgDpstPrd")
	public Period3 getDTCReorganisationDepositPeriod() {
		return dTCReorganisationDepositPeriod;
	}

	public void setDTCReorganisationDepositPeriod(com.tools20022.repository.msg.Period3 dTCReorganisationDepositPeriod) {
		this.dTCReorganisationDepositPeriod = dTCReorganisationDepositPeriod;
	}

	@XmlElement(name = "DTCChillPrdForDpstryDlvry")
	public Period3 getDTCChillPeriodForDepositoryDelivery() {
		return dTCChillPeriodForDepositoryDelivery;
	}

	public void setDTCChillPeriodForDepositoryDelivery(com.tools20022.repository.msg.Period3 dTCChillPeriodForDepositoryDelivery) {
		this.dTCChillPeriodForDepositoryDelivery = dTCChillPeriodForDepositoryDelivery;
	}
}