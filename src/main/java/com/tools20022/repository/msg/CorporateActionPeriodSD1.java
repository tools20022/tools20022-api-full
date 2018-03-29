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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Period3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPeriodSD1", propOrder = {"placeAndName", "dTCReorganisationDepositPeriod", "dTCChillPeriodForDepositoryDelivery"})
public class CorporateActionPeriodSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
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
	public static final MMMessageAttribute<CorporateActionPeriodSD1, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionPeriodSD1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriodSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionPeriodSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionPeriodSD1 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "DTCReorgDpstPrd")
	protected Period3 dTCReorganisationDepositPeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC First Day for Reorg Deposits,
	 * DTCCSynonym: DTC Last Day for Reorg Deposits</li>
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
	public static final MMMessageAttribute<CorporateActionPeriodSD1, Optional<Period3>> mmDTCReorganisationDepositPeriod = new MMMessageAttribute<CorporateActionPeriodSD1, Optional<Period3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriodSD1.mmObject();
			isDerived = false;
			xmlTag = "DTCReorgDpstPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC First Day for Reorg Deposits"), new DTCCSynonym(this, "DTC Last Day for Reorg Deposits"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCReorganisationDepositPeriod";
			definition = "Period during which the securities can be submitted to Reorganisation deposit service at DTC (The Depository Trust Corporation). DTC First Day for Reorg Deposit (start date) is the day on which security is eligible for reorganisation deposit service at DTC. DTC Last Day for Reorg Deposit is the last day on which securities are eligible to be submitted for reorganisation deposit service at DTC.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period3.mmObject();
		}

		@Override
		public Optional<Period3> getValue(CorporateActionPeriodSD1 obj) {
			return obj.getDTCReorganisationDepositPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriodSD1 obj, Optional<Period3> value) {
			obj.setDTCReorganisationDepositPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCChillPrdForDpstryDlvry")
	protected Period3 dTCChillPeriodForDepositoryDelivery;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Chill Release Day for Depository
	 * Delivery, DTCCSynonym: DTC Last Day for Depository Delivery</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCChillPeriodForDepositoryDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the co-depositories deliveries are suspended at DTC (The Depository Trust Corporation). DTC Last Day for Depository Delivery (start date) - the last day on which depository deliveries will be accepted. DTC Chill Release Day for Depository Delivery (end date) - day when chill is released and depositories can resume delivery activities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionPeriodSD1, Optional<Period3>> mmDTCChillPeriodForDepositoryDelivery = new MMMessageAttribute<CorporateActionPeriodSD1, Optional<Period3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriodSD1.mmObject();
			isDerived = false;
			xmlTag = "DTCChillPrdForDpstryDlvry";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Chill Release Day for Depository Delivery"), new DTCCSynonym(this, "DTC Last Day for Depository Delivery"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCChillPeriodForDepositoryDelivery";
			definition = "Period during which the co-depositories deliveries are suspended at DTC (The Depository Trust Corporation). DTC Last Day for Depository Delivery (start date) - the last day on which depository deliveries will be accepted. DTC Chill Release Day for Depository Delivery (end date) - day when chill is released and depositories can resume delivery activities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period3.mmObject();
		}

		@Override
		public Optional<Period3> getValue(CorporateActionPeriodSD1 obj) {
			return obj.getDTCChillPeriodForDepositoryDelivery();
		}

		@Override
		public void setValue(CorporateActionPeriodSD1 obj, Optional<Period3> value) {
			obj.setDTCChillPeriodForDepositoryDelivery(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriodSD1.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionPeriodSD1.mmDTCReorganisationDepositPeriod,
						com.tools20022.repository.msg.CorporateActionPeriodSD1.mmDTCChillPeriodForDepositoryDelivery);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionPeriodSD1";
				definition = "Provides additional information regarding corporate action details periods details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionPeriodSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<Period3> getDTCReorganisationDepositPeriod() {
		return dTCReorganisationDepositPeriod == null ? Optional.empty() : Optional.of(dTCReorganisationDepositPeriod);
	}

	public CorporateActionPeriodSD1 setDTCReorganisationDepositPeriod(Period3 dTCReorganisationDepositPeriod) {
		this.dTCReorganisationDepositPeriod = dTCReorganisationDepositPeriod;
		return this;
	}

	public Optional<Period3> getDTCChillPeriodForDepositoryDelivery() {
		return dTCChillPeriodForDepositoryDelivery == null ? Optional.empty() : Optional.of(dTCChillPeriodForDepositoryDelivery);
	}

	public CorporateActionPeriodSD1 setDTCChillPeriodForDepositoryDelivery(Period3 dTCChillPeriodForDepositoryDelivery) {
		this.dTCChillPeriodForDepositoryDelivery = dTCChillPeriodForDepositoryDelivery;
		return this;
	}
}