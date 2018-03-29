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
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecurityIdentification15;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Customer security identification reference information.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD1#mmPlaceAndName
 * CorporateActionNotificationSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD1#mmCustomerInternalSecurityIdentification
 * CorporateActionNotificationSD1.mmCustomerInternalSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD1#mmSecurityOfInterestMatchingSecurity
 * CorporateActionNotificationSD1.mmSecurityOfInterestMatchingSecurity}</li>
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
 * "CorporateActionNotificationSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Customer security identification reference information.\r\n"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD10
 * CorporateActionNotificationSD10}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNotificationSD1", propOrder = {"placeAndName", "customerInternalSecurityIdentification", "securityOfInterestMatchingSecurity"})
public class CorporateActionNotificationSD1 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD1
	 * CorporateActionNotificationSD1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD10#mmPlaceAndName
	 * CorporateActionNotificationSD10.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD1, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionNotificationSD1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationSD10.mmPlaceAndName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionNotificationSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionNotificationSD1 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "CstmrIntlSctyId")
	protected Max16Text customerInternalSecurityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD1
	 * CorporateActionNotificationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrIntlSctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Customer Internal Security ID</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerInternalSecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Internal security identification as provided by the customer for the given security on the security of interest (SOI) import file."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD10#mmCustomerInternalSecurityIdentification
	 * CorporateActionNotificationSD10.mmCustomerInternalSecurityIdentification}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD1, Optional<Max16Text>> mmCustomerInternalSecurityIdentification = new MMMessageAttribute<CorporateActionNotificationSD1, Optional<Max16Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD1.mmObject();
			isDerived = false;
			xmlTag = "CstmrIntlSctyId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Customer Internal Security ID"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerInternalSecurityIdentification";
			definition = "Internal security identification as provided by the customer for the given security on the security of interest (SOI) import file.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationSD10.mmCustomerInternalSecurityIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Optional<Max16Text> getValue(CorporateActionNotificationSD1 obj) {
			return obj.getCustomerInternalSecurityIdentification();
		}

		@Override
		public void setValue(CorporateActionNotificationSD1 obj, Optional<Max16Text> value) {
			obj.setCustomerInternalSecurityIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyOfIntrstMtchgScty")
	protected SecurityIdentification15 securityOfInterestMatchingSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15
	 * SecurityIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD1
	 * CorporateActionNotificationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyOfIntrstMtchgScty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: SOI Matching Security ID, DTCCSynonym: SOI
	 * Matching Security ID Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityOfInterestMatchingSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security identifier that is used to match the customer's SOI (Security of Interest) to the GCA VS Security Cross Reference."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD10#mmSecurityOfInterestMatchingSecurity
	 * CorporateActionNotificationSD10.mmSecurityOfInterestMatchingSecurity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD1, Optional<SecurityIdentification15>> mmSecurityOfInterestMatchingSecurity = new MMMessageAttribute<CorporateActionNotificationSD1, Optional<SecurityIdentification15>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD1.mmObject();
			isDerived = false;
			xmlTag = "SctyOfIntrstMtchgScty";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "SOI Matching Security ID"), new DTCCSynonym(this, "SOI Matching Security ID Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityOfInterestMatchingSecurity";
			definition = "Security identifier that is used to match the customer's SOI (Security of Interest) to the GCA VS Security Cross Reference.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationSD10.mmSecurityOfInterestMatchingSecurity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityIdentification15.mmObject();
		}

		@Override
		public Optional<SecurityIdentification15> getValue(CorporateActionNotificationSD1 obj) {
			return obj.getSecurityOfInterestMatchingSecurity();
		}

		@Override
		public void setValue(CorporateActionNotificationSD1 obj, Optional<SecurityIdentification15> value) {
			obj.setSecurityOfInterestMatchingSecurity(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNotificationSD1.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionNotificationSD1.mmCustomerInternalSecurityIdentification,
						com.tools20022.repository.msg.CorporateActionNotificationSD1.mmSecurityOfInterestMatchingSecurity);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotificationSD1";
				definition = "Customer security identification reference information.\r\n";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionNotificationSD10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionNotificationSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<Max16Text> getCustomerInternalSecurityIdentification() {
		return customerInternalSecurityIdentification == null ? Optional.empty() : Optional.of(customerInternalSecurityIdentification);
	}

	public CorporateActionNotificationSD1 setCustomerInternalSecurityIdentification(Max16Text customerInternalSecurityIdentification) {
		this.customerInternalSecurityIdentification = customerInternalSecurityIdentification;
		return this;
	}

	public Optional<SecurityIdentification15> getSecurityOfInterestMatchingSecurity() {
		return securityOfInterestMatchingSecurity == null ? Optional.empty() : Optional.of(securityOfInterestMatchingSecurity);
	}

	public CorporateActionNotificationSD1 setSecurityOfInterestMatchingSecurity(SecurityIdentification15 securityOfInterestMatchingSecurity) {
		this.securityOfInterestMatchingSecurity = securityOfInterestMatchingSecurity;
		return this;
	}
}