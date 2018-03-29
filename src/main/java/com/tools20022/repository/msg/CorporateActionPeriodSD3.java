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
import com.tools20022.repository.msg.Period13;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriodSD3#mmPlaceAndName
 * CorporateActionPeriodSD3.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriodSD3#mmDTCReorganisationDepositPeriod
 * CorporateActionPeriodSD3.mmDTCReorganisationDepositPeriod}</li>
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
 * "CorporateActionPeriodSD3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action details periods details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriodSD2
 * CorporateActionPeriodSD2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPeriodSD3", propOrder = {"placeAndName", "dTCReorganisationDepositPeriod"})
public class CorporateActionPeriodSD3 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriodSD3
	 * CorporateActionPeriodSD3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriodSD2#mmPlaceAndName
	 * CorporateActionPeriodSD2.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionPeriodSD3, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<CorporateActionPeriodSD3, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriodSD3.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			previousVersion_lazy = () -> CorporateActionPeriodSD2.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(CorporateActionPeriodSD3 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionPeriodSD3 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCReorgDpstPrd")
	protected Period13 dTCReorganisationDepositPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period13
	 * Period13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriodSD3
	 * CorporateActionPeriodSD3}</li>
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
	 * "Period during which the securities can be submitted to reorganisation deposit service at DTC (The Depository Trust Corporation). DTC \"first day for reorganisation deposit\" (start date) is the day on which security is eligible for reorganisation deposit service at DTC. DTC \"last day for reorganisation deposit\" is the last day on which securities are eligible to be submitted for reorganisation deposit service at DTC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriodSD2#mmDTCReorganisationDepositPeriod
	 * CorporateActionPeriodSD2.mmDTCReorganisationDepositPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionPeriodSD3, Optional<Period13>> mmDTCReorganisationDepositPeriod = new MMMessageAttribute<CorporateActionPeriodSD3, Optional<Period13>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriodSD3.mmObject();
			isDerived = false;
			xmlTag = "DTCReorgDpstPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC First Day for Reorg Deposits"), new DTCCSynonym(this, "DTC Last Day for Reorg Deposits"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCReorganisationDepositPeriod";
			definition = "Period during which the securities can be submitted to reorganisation deposit service at DTC (The Depository Trust Corporation). DTC \"first day for reorganisation deposit\" (start date) is the day on which security is eligible for reorganisation deposit service at DTC. DTC \"last day for reorganisation deposit\" is the last day on which securities are eligible to be submitted for reorganisation deposit service at DTC.";
			previousVersion_lazy = () -> CorporateActionPeriodSD2.mmDTCReorganisationDepositPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period13.mmObject();
		}

		@Override
		public Optional<Period13> getValue(CorporateActionPeriodSD3 obj) {
			return obj.getDTCReorganisationDepositPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriodSD3 obj, Optional<Period13> value) {
			obj.setDTCReorganisationDepositPeriod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriodSD3.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionPeriodSD3.mmDTCReorganisationDepositPeriod);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPeriodSD3";
				definition = "Provides additional information regarding corporate action details periods details.";
				previousVersion_lazy = () -> CorporateActionPeriodSD2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public CorporateActionPeriodSD3 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<Period13> getDTCReorganisationDepositPeriod() {
		return dTCReorganisationDepositPeriod == null ? Optional.empty() : Optional.of(dTCReorganisationDepositPeriod);
	}

	public CorporateActionPeriodSD3 setDTCReorganisationDepositPeriod(Period13 dTCReorganisationDepositPeriod) {
		this.dTCReorganisationDepositPeriod = dTCReorganisationDepositPeriod;
		return this;
	}
}